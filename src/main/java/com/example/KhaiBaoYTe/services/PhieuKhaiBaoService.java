package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.PhieuKhaiBao;
import com.example.KhaiBaoYTe.entities.TaiKhoan;
import com.example.KhaiBaoYTe.repositories.PhieuKhaiBaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PhieuKhaiBaoService {
    @Autowired
    private PhieuKhaiBaoRepository phieuKhaiBaoRepository;

    @Transactional
    public void addPhieuKhaiBaoToanDan(String hoTen, int namsinh, String email, String diachi, String gioitinh, String quoctich, String sdt, Boolean denVungDich, Boolean tiepXucNguoiBenh, Boolean sot, Boolean ho, Boolean khoTho, Boolean dauHong, Boolean moiCo, Boolean hatHoi, String cccd, TaiKhoan taiKhoan){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Date now =  java.sql.Timestamp.valueOf(LocalDateTime.now());
        phieuKhaiBaoRepository.save(new PhieuKhaiBao(hoTen,diachi,now,namsinh,email,quoctich,gioitinh,sdt,denVungDich,tiepXucNguoiBenh,sot,ho,khoTho,dauHong,moiCo,hatHoi,taiKhoan));
    }

    @Transactional
    public void addPhieuKhaiBaoDiChuyenNoiDia(String hoten, String diachi, int namsinh, String email, String quoctich, String gioitinh, String noidi, String noiden, String phuongtien,String sophuongtien,String soghe, String ngaydi, String ngayden, String sdt, Boolean denvungdich, Boolean tiepxucnguoibenh, Boolean sot, Boolean ho, Boolean khotho, Boolean dauhong, Boolean moico, Boolean hathoi, TaiKhoan taiKhoan) throws ParseException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Date now =  java.sql.Timestamp.valueOf(LocalDateTime.now());
        Date datengayden;
        if(ngayden=="") {
            datengayden=null;
        } else {
            datengayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        }
        Date datengaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
        phieuKhaiBaoRepository.save(new PhieuKhaiBao(hoten,diachi,now,namsinh,email,quoctich,gioitinh,noidi,noiden,phuongtien,sophuongtien,soghe,datengaydi,datengayden,sdt,denvungdich,tiepxucnguoibenh,sot,ho,khotho,dauhong,moico,hathoi,taiKhoan));
    }
    @Transactional
    public List<PhieuKhaiBao> findAllByTaiKhoan(TaiKhoan taiKhoan){
        return phieuKhaiBaoRepository.findAllByTaiKhoan(taiKhoan);
    }
}
