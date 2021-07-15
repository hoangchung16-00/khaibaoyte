package com.example.KhaiBaoYTe.repositories;

import com.example.KhaiBaoYTe.entities.LoaiNguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoaiNguoiDungRepository extends JpaRepository<LoaiNguoiDung,Long> {
    LoaiNguoiDung findLoaiNguoiDungByLoaiNguoiDung(String loainguoidung);
}
