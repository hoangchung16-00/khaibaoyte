package com.example.KhaiBaoYTe.controllers;

import com.example.KhaiBaoYTe.entities.DiaChi;
import com.example.KhaiBaoYTe.entities.PhuongXa;
import com.example.KhaiBaoYTe.entities.QuanHuyen;
import com.example.KhaiBaoYTe.entities.TaiKhoan;
import com.example.KhaiBaoYTe.forms.KhaiBaoDiChuyeNoiDiaForm;
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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class KhaiBaoDiChuyenNoiDiaController extends BaseController{
    @Autowired
    private TinhTPService tinhTPService;
    @Autowired
    private QuanHuyenService quanHuyenService;
    @Autowired
    private PhuongXaService phuongXaService;
    @Autowired
    private TaiKhoanService taiKhoanService;
    @Autowired
    private DiaChiService diaChiService;
    @Autowired
    private LoaiNguoiDungService loaiNguoiDungService;
    @Autowired
    private PhieuKhaiBaoService phieuKhaiBaoService;

    @GetMapping("khaibaodichuyennoidia")
    public String getKhaiBaoDiChuyenNoiDia(Model model){
        model.addAttribute("khaiBaoDiChuyenNoiDiaForm",new KhaiBaoDiChuyeNoiDiaForm());
        return "khaibaodichuyennoidia";
    }
    @PostMapping("khaibaodichuyennoidia")
    private String postKhaiBaoDiChuyenNoiDia(@Valid @ModelAttribute("khaiBaoDiChuyenNoiDiaForm") KhaiBaoDiChuyeNoiDiaForm khaiBaoDiChuyeNoiDiaForm, BindingResult bindingResult) throws ParseException {
        if (bindingResult.hasErrors()){

            return "khaibaodichuyennoidia";
        }
        TaiKhoan taiKhoan= taiKhoanService.findTaiKhoanByCccd(khaiBaoDiChuyeNoiDiaForm.getCccd());
        if(taiKhoan==null){
            DiaChi diaChi = diaChiService.findDiaChiByCccd(khaiBaoDiChuyeNoiDiaForm.getCccd());
            if(diaChi==null)
                diaChiService.addDiaChi(khaiBaoDiChuyeNoiDiaForm.getDiachi(),khaiBaoDiChuyeNoiDiaForm.getCccd(),phuongXaService.findPhuongXaByMaPhuongXa(khaiBaoDiChuyeNoiDiaForm.getMaphuongxa()));
            taiKhoanService.addTaiKhoanUser(khaiBaoDiChuyeNoiDiaForm.getCccd(),khaiBaoDiChuyeNoiDiaForm.getHoten(),
                    khaiBaoDiChuyeNoiDiaForm.getNamsinh(),khaiBaoDiChuyeNoiDiaForm.getSDT(),
                    khaiBaoDiChuyeNoiDiaForm.getEmail(),khaiBaoDiChuyeNoiDiaForm.getGioitinh(),
                    loaiNguoiDungService.findLoaiNguoiDungByTenloainguoidung("user"),diaChiService.findDiaChiByCccd(khaiBaoDiChuyeNoiDiaForm.getCccd()));
        }
        TaiKhoan taiKhoan1 = taiKhoanService.findTaiKhoanByCccd(khaiBaoDiChuyeNoiDiaForm.getCccd());
        String diachi = tinhTPService.findTinhTPByMaTinhTp(khaiBaoDiChuyeNoiDiaForm.getMatinhtp()).getTentinhtp()+", "+
                quanHuyenService.findQuanHuyenByMaQuanHuyen(khaiBaoDiChuyeNoiDiaForm.getMaquanhuyen()).getTenquanhuyen()+", "+
                phuongXaService.findPhuongXaByMaPhuongXa(khaiBaoDiChuyeNoiDiaForm.getMaphuongxa()).getTenphuongxa()+", "+
                khaiBaoDiChuyeNoiDiaForm.getDiachi();
        String noiDi =phuongXaService.findPhuongXaByMaPhuongXa(khaiBaoDiChuyeNoiDiaForm.getNoidiphuongxa()).getTenphuongxa()+", "+
                quanHuyenService.findQuanHuyenByMaQuanHuyen(khaiBaoDiChuyeNoiDiaForm.getNoidiquanhuyen()).getTenquanhuyen()+", "+
                tinhTPService.findTinhTPByMaTinhTp(khaiBaoDiChuyeNoiDiaForm.getNoiditinhtp()).getMatinhtp();
        String noiDen = phuongXaService.findPhuongXaByMaPhuongXa(khaiBaoDiChuyeNoiDiaForm.getNoidenphuongxa()).getTenphuongxa()+", "+
                quanHuyenService.findQuanHuyenByMaQuanHuyen(khaiBaoDiChuyeNoiDiaForm.getNoidenquanhuyen()).getTenquanhuyen()+", "+
                tinhTPService.findTinhTPByMaTinhTp(khaiBaoDiChuyeNoiDiaForm.getNoidentinhtp()).getTentinhtp();
        phieuKhaiBaoService.addPhieuKhaiBaoDiChuyenNoiDia(khaiBaoDiChuyeNoiDiaForm.getHoten(),diachi,khaiBaoDiChuyeNoiDiaForm.getNamsinh(),
                khaiBaoDiChuyeNoiDiaForm.getEmail(),khaiBaoDiChuyeNoiDiaForm.getQuoctich(),
                khaiBaoDiChuyeNoiDiaForm.getGioitinh(),noiDi,noiDen,khaiBaoDiChuyeNoiDiaForm.getPhuongtien(),
                khaiBaoDiChuyeNoiDiaForm.getSophuongtien(),khaiBaoDiChuyeNoiDiaForm.getSoghe(),
                khaiBaoDiChuyeNoiDiaForm.getNgaydi(),khaiBaoDiChuyeNoiDiaForm.getNgayden(),
                khaiBaoDiChuyeNoiDiaForm.getSDT(),khaiBaoDiChuyeNoiDiaForm.getDenVungDich(),
                khaiBaoDiChuyeNoiDiaForm.getTiepXucNguoiBenh(),khaiBaoDiChuyeNoiDiaForm.getSot(),
                khaiBaoDiChuyeNoiDiaForm.getHo(),khaiBaoDiChuyeNoiDiaForm.getKhoTho(),khaiBaoDiChuyeNoiDiaForm.getDauHong(),
                khaiBaoDiChuyeNoiDiaForm.getMoiCo(),khaiBaoDiChuyeNoiDiaForm.getHatHoi(),taiKhoan1);
        return "redirect:/";
    }

}
