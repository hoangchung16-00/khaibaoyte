package com.example.KhaiBaoYTe.controllers;

import com.example.KhaiBaoYTe.entities.TaiKhoan;
import com.example.KhaiBaoYTe.forms.SearchForm;
import com.example.KhaiBaoYTe.services.PhieuKhaiBaoService;
import com.example.KhaiBaoYTe.services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ThongKeLichSuKhaiBaoController {
    @Autowired
    private PhieuKhaiBaoService phieuKhaiBaoService;
    @Autowired
    private TaiKhoanService taiKhoanService;
    @GetMapping("/thongkelichsukhaibao/{cccd}")
    public String getThongKeLichSuKhaiBaoTaiKhoan(Model model, @PathVariable(name = "cccd",required = false) String cccd,@RequestParam(value = "page", defaultValue = "1") int page){
        model.addAttribute("searchForm",new SearchForm());
        TaiKhoan taiKhoan = taiKhoanService.findTaiKhoanByCccd(cccd);
        model.addAttribute("taikhoan",taiKhoan);
        Pageable pageable = PageRequest.of(page-1,8);
        model.addAttribute("pageSize",(phieuKhaiBaoService.getTotalPhieuKhaiBaoByTaiKhoan(taiKhoan)/9)+1);
        model.addAttribute("phieuKhaiBaos",phieuKhaiBaoService.findAllByTaiKhoan(taiKhoan,pageable));
        return "thongkelichsukhaibao";
    }
    @PostMapping("/searchCCCD")
    public String postSearchCCCd(@ModelAttribute("searchForm")SearchForm searchForm){
        return "redirect:/thongkelichsukhaibao/"+searchForm.getCccd();
    }@GetMapping("/thongkelichsukhaibao")
    public String getThongKeLichSuKhaiBao(Model model){
        model.addAttribute("searchForm",new SearchForm());
        return "thongkelichsukhaibao";
    }

}
