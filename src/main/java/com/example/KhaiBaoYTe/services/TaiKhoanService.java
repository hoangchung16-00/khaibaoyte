package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.LoaiNguoiDung;
import com.example.KhaiBaoYTe.entities.TaiKhoan;
import com.example.KhaiBaoYTe.repositories.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class TaiKhoanService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @Transactional
    public TaiKhoan findTaiKhoanByCCCD(String cccd){
        return taiKhoanRepository.findTaiKhoanByCCCD(cccd);
    }
    @Transactional
    public void addTaiKhoanUser(String cccd, String ten, int namsinh, String sdt, String email, String gioitinh, LoaiNguoiDung loaiNguoiDung){
        taiKhoanRepository.save(new TaiKhoan(cccd,ten,namsinh,sdt,email,gioitinh,loaiNguoiDung));
    }
}
