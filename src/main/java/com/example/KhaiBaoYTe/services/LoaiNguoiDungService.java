package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.LoaiNguoiDung;
import com.example.KhaiBaoYTe.repositories.LoaiNguoiDungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiNguoiDungService {
    @Autowired
    private LoaiNguoiDungRepository loaiNguoiDungRepository;

    public LoaiNguoiDung findLoaiNguoiDungByTenloainguoidung(String tenloainguoidung){
        return loaiNguoiDungRepository.findLoaiNguoiDungByTenloainguoidung(tenloainguoidung);
    }
}
