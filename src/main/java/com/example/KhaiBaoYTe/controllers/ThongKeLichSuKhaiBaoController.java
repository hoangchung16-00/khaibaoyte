package com.example.KhaiBaoYTe.controllers;

import com.example.KhaiBaoYTe.services.PhieuKhaiBaoService;
import com.example.KhaiBaoYTe.services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ThongKeLichSuKhaiBaoController {
    @Autowired
    private PhieuKhaiBaoService phieuKhaiBaoService;
    @Autowired
    private TaiKhoanService taiKhoanService;
    @GetMapping("/thongkelichsukhaibao")
    public String getThongKeLichSuKhaiBao(Model model){
        model.addAttribute("phieuKhaiBaos",phieuKhaiBaoService.findAllByTaiKhoan(taiKhoanService.findTaiKhoanByCccd("197384087")));
        return "thongkelichsukhaibao";
    }
}
