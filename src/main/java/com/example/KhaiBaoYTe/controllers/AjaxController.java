package com.example.KhaiBaoYTe.controllers;

import com.example.KhaiBaoYTe.entities.PhuongXa;
import com.example.KhaiBaoYTe.entities.QuanHuyen;
import com.example.KhaiBaoYTe.models.PhuongXaModel;
import com.example.KhaiBaoYTe.models.QuanHuyenModel;
import com.example.KhaiBaoYTe.services.PhuongXaService;
import com.example.KhaiBaoYTe.services.QuanHuyenService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {
    @Autowired
    private QuanHuyenService quanHuyenService;
    @Autowired
    private PhuongXaService phuongXaService;

    @ResponseBody
    @GetMapping("loadQuanHuyenByTinhTP")
    public String loadQuanHuyenByTinhTP(@RequestParam("matinhtp") int matinhtp){
        Gson gson = new Gson();
        List<QuanHuyen> quanHuyenList = quanHuyenService.findAllByMaTinhTp(matinhtp);
        List<QuanHuyenModel> quanHuyens = new ArrayList<>();
        for(QuanHuyen quanHuyen : quanHuyenList){
            quanHuyens.add(new QuanHuyenModel(quanHuyen.getMaquanhuyen(),quanHuyen.getTenquanhuyen()));
        }
        return gson.toJson(quanHuyens);
    }
    @ResponseBody
    @GetMapping("loadPhuongXaByQuanHuyen")
    public String loadPhuongXaByQuanHuyen(@RequestParam("maqh") int maquanhuyen){
        Gson gson = new Gson();
        List<PhuongXa> phuongXaList = phuongXaService.findAllByMaQuanHuyen(maquanhuyen);
        List<PhuongXaModel> phuongXas = new ArrayList<>();
        for(PhuongXa phuongXa : phuongXaList){
            phuongXas.add(new PhuongXaModel(phuongXa.getMaphuongxa(),phuongXa.getTenphuongxa()));
        }
        return gson.toJson(phuongXas);
    }


}
