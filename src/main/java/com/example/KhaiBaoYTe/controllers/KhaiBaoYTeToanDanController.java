package com.example.KhaiBaoYTe.controllers;

import com.example.KhaiBaoYTe.entities.PhuongXa;
import com.example.KhaiBaoYTe.entities.QuanHuyen;
import com.example.KhaiBaoYTe.forms.KhaiBaoYTeToanDanForm;
import com.example.KhaiBaoYTe.models.PhuongXaModel;
import com.example.KhaiBaoYTe.models.QuanHuyenModel;
import com.example.KhaiBaoYTe.services.PhuongXaService;
import com.example.KhaiBaoYTe.services.QuanHuyenService;
import com.example.KhaiBaoYTe.services.TinhTPService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class KhaiBaoYTeToanDanController {
    @Autowired
    private TinhTPService tinhTPService;
    @Autowired
    private QuanHuyenService quanHuyenService;
    @Autowired
    private PhuongXaService phuongXaService;

    @GetMapping("/khaibaoytetoandan")
    public String getKhaiBaoYTeToan(Model model){
        model.addAttribute("khaiBaoYTeToanDanForm",new KhaiBaoYTeToanDanForm());
        model.addAttribute("tinhtps",tinhTPService.findAll());
        return "khaibaoytetoandan";
    }
    @ResponseBody
    @GetMapping("/loadQuanHuyenByTinhTP")
    public String loadQuanHuyenByTinhTP(@RequestParam("matinhtp") String matinhtp){
        Gson gson = new Gson();
        List<QuanHuyen> quanHuyenList = quanHuyenService.findAllByMaTinhTp(matinhtp);
        List<QuanHuyenModel> quanHuyens = new ArrayList<>();
        for(QuanHuyen quanHuyen : quanHuyenList){
            quanHuyens.add(new QuanHuyenModel(quanHuyen.getMaquanhuyen(),quanHuyen.getTenquanhuyen()));
        }
        return gson.toJson(quanHuyens);
    }
    @ResponseBody
    @GetMapping("/loadPhuongXaByQuanHuyen")
    public String loadPhuongXaByQuanHuyen(@RequestParam("maqh") String maquanhuyen){
        Gson gson1 = new Gson();
        List<PhuongXa> phuongXaList = phuongXaService.findAllByMaQuanHuyen(maquanhuyen);
        List<PhuongXaModel> phuongXas = new ArrayList<>();
        for(PhuongXa phuongXa : phuongXaList){
            phuongXas.add(new PhuongXaModel(phuongXa.getMaphuongxa(),phuongXa.getTenphuongxa()));
        }
        return gson1.toJson(phuongXas);
    }
    @PostMapping("/khaibaoytetoandan")
    public String postKhaiBaoYTeToan(@Valid @ModelAttribute("khaiBaoYTeToanDanForm") KhaiBaoYTeToanDanForm khaiBaoYTeToanDanForm){

        return "";
    }
}
