package com.example.KhaiBaoYTe.repositories;

import com.example.KhaiBaoYTe.entities.PhieuKhaiBao;
import com.example.KhaiBaoYTe.entities.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PhieuKhaiBaoRepository extends JpaRepository<PhieuKhaiBao,Long> {
    List<PhieuKhaiBao> findAllByTaiKhoan(TaiKhoan takhoan);
}
