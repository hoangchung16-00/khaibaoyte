package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.PhieuKhaiBao;
import com.example.KhaiBaoYTe.entities.TaiKhoan;
import com.example.KhaiBaoYTe.repositories.PhieuKhaiBaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

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
}
