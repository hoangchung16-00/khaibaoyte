package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.PhieuKhaiBao;
import com.example.KhaiBaoYTe.entities.TaiKhoan;
import com.example.KhaiBaoYTe.repositories.PhieuKhaiBaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
    public void addPhieuKhaiBaoToanDan(String hoTen, int namsinh, String email, String diachi, String gioitinh, String quoctich, String sdt, byte denVungDich, byte tiepXucNguoiBenh, byte sot, byte ho, byte khoTho, byte dauHong, byte moiCo, byte hatHoi, String cccd, TaiKhoan taiKhoan){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Date now =  java.sql.Timestamp.valueOf(LocalDateTime.now());
        phieuKhaiBaoRepository.save(new PhieuKhaiBao(hoTen,diachi,now,namsinh,email,quoctich,gioitinh,sdt,denVungDich,tiepXucNguoiBenh,sot,ho,khoTho,dauHong,moiCo,hatHoi,taiKhoan));
    }

    @Transactional
    public void addPhieuKhaiBaoDiChuyenNoiDia(String hoten, String diachi, int namsinh, String email, String quoctich, String gioitinh, String noidi, String noiden, String phuongtien,String sophuongtien,String soghe, String ngaydi, String ngayden, String sdt, byte denvungdich, byte tiepxucnguoibenh, byte sot, byte ho, byte khotho, byte dauhong, byte moico, byte hathoi, TaiKhoan taiKhoan) throws ParseException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Date now =  java.sql.Timestamp.valueOf(LocalDateTime.now());
        Date datengayden;
        if(ngayden=="") {
            datengayden=null;
        } else {
            datengayden = new SimpleDateFormat("yyyy-MM-dd").parse(ngayden);
        }
        Date datengaydi = new SimpleDateFormat("yyyy-MM-dd").parse(ngaydi);
        phieuKhaiBaoRepository.save(new PhieuKhaiBao(hoten,diachi,now,namsinh,email,quoctich,gioitinh,noidi,noiden,phuongtien,sophuongtien,soghe,datengaydi,datengayden,sdt,denvungdich,tiepxucnguoibenh,sot,ho,khotho,dauhong,moico,hathoi,taiKhoan));
    }
    @Transactional
    public List<PhieuKhaiBao> findAllByTaiKhoan(TaiKhoan taiKhoan, Pageable pageable){
        return phieuKhaiBaoRepository.findAllByTaiKhoan(taiKhoan,pageable);
    }
    @Transactional
    public int getTotalPhieuKhaiBaoByTaiKhoan(TaiKhoan taikhoan){
        return phieuKhaiBaoRepository.getTotalPhieuKhaiBaoByTaiKhoan(taikhoan);
    }
}
