package com.example.KhaiBaoYTe.controllers;

import com.example.KhaiBaoYTe.entities.*;
import com.example.KhaiBaoYTe.forms.KhaiBaoYTeToanDanForm;
import com.example.KhaiBaoYTe.models.PhuongXaModel;
import com.example.KhaiBaoYTe.models.QuanHuyenModel;
import com.example.KhaiBaoYTe.services.*;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class KhaiBaoYTeToanDanController {
    @Autowired
    private TinhTPService tinhTPService;
    @Autowired
    private QuanHuyenService quanHuyenService;
    @Autowired
    private PhuongXaService phuongXaService;
    @Autowired
    private PhieuKhaiBaoService phieuKhaiBaoService;
    @Autowired
    private TaiKhoanService taiKhoanService;
    @Autowired
    private LoaiNguoiDungService loaiNguoiDungService;
    @Autowired
    private DiaChiService diaChiService;

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
    public String postKhaiBaoYTeToan(@Valid @ModelAttribute("khaiBaoYTeToanDanForm") KhaiBaoYTeToanDanForm khaiBaoYTeToanDanForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "khaibaoytetoandan";
        }
        TaiKhoan taiKhoan= taiKhoanService.findTaiKhoanByCccd(khaiBaoYTeToanDanForm.getCccd());
        if(taiKhoan==null){
            DiaChi diaChi = diaChiService.findDiaChiByCccd(khaiBaoYTeToanDanForm.getCccd());
            if(diaChi==null)
                diaChiService.addDiaChi(khaiBaoYTeToanDanForm.getDiachi(),khaiBaoYTeToanDanForm.getCccd(),phuongXaService.findPhuongXaByMaPhuongXa(khaiBaoYTeToanDanForm.getMaphuongxa()));
            taiKhoanService.addTaiKhoanUser(khaiBaoYTeToanDanForm.getCccd(),khaiBaoYTeToanDanForm.getHoten(),
                    khaiBaoYTeToanDanForm.getNamsinh(),khaiBaoYTeToanDanForm.getSDT(),
                    khaiBaoYTeToanDanForm.getEmail(),khaiBaoYTeToanDanForm.getGioitinh(),
                    loaiNguoiDungService.findLoaiNguoiDungByTenloainguoidung("user"),diaChiService.findDiaChiByCccd(khaiBaoYTeToanDanForm.getCccd()));
        }
        String diachi = tinhTPService.findTinhTPByMaTinhTp(khaiBaoYTeToanDanForm.getMatinhtp()).getTentinhtp()+", "+
                quanHuyenService.findQuanHuyenByMaQuanHuyen(khaiBaoYTeToanDanForm.getMaquanhuyen()).getTenquanhuyen()+", "+
                phuongXaService.findPhuongXaByMaPhuongXa(khaiBaoYTeToanDanForm.getMaphuongxa()).getTenphuongxa()+", "+
                khaiBaoYTeToanDanForm.getDiachi();
        phieuKhaiBaoService.addPhieuKhaiBaoToanDan(khaiBaoYTeToanDanForm.getHoten(),khaiBaoYTeToanDanForm.getNamsinh(),
                khaiBaoYTeToanDanForm.getEmail(),diachi,
                khaiBaoYTeToanDanForm.getGioitinh(),khaiBaoYTeToanDanForm.getQuoctich(),
                khaiBaoYTeToanDanForm.getSDT(),khaiBaoYTeToanDanForm.getDenVungDich(),
                khaiBaoYTeToanDanForm.getTiepXucNguoiBenh(),khaiBaoYTeToanDanForm.getSot(),
                khaiBaoYTeToanDanForm.getHo(),khaiBaoYTeToanDanForm.getKhoTho(),
                khaiBaoYTeToanDanForm.getDauHong(),khaiBaoYTeToanDanForm.getMoiCo(),
                khaiBaoYTeToanDanForm.getHatHoi(),khaiBaoYTeToanDanForm.getCccd(),
                taiKhoanService.findTaiKhoanByCccd(khaiBaoYTeToanDanForm.getCccd()));
        return "redirect:/login";
    }
}
