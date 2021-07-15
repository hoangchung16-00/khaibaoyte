package com.example.KhaiBaoYTe.repositories;

import com.example.KhaiBaoYTe.entities.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaiKhoanRepository extends JpaRepository<TaiKhoan,String> {
    TaiKhoan findTaiKhoanByCCCD(String cccd);
}
