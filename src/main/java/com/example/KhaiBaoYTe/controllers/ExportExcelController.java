package com.example.KhaiBaoYTe.controllers;

import com.example.KhaiBaoYTe.entities.PhieuKhaiBao;
import com.example.KhaiBaoYTe.services.PhieuKhaiBaoService;
import com.example.KhaiBaoYTe.services.TaiKhoanService;
import com.example.KhaiBaoYTe.services.UserExcelExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ExportExcelController {
    @Autowired
    private PhieuKhaiBaoService phieuKhaiBaoService;
    @Autowired
    private TaiKhoanService taiKhoanService;
    @GetMapping("/exportReport/{cccd}")
    public void exportToExcel(HttpServletResponse response, @PathVariable("cccd") String cccd) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
        List<PhieuKhaiBao> phieuKhaiBaos = phieuKhaiBaoService.findAllByTaiKhoan(taiKhoanService.findTaiKhoanByCccd(cccd));
        UserExcelExporter excelExporter = new UserExcelExporter(phieuKhaiBaos);
        excelExporter.export(response);
    }
}
