package com.example.KhaiBaoYTe.repositories;

import com.example.KhaiBaoYTe.entities.DiaChi;
import com.example.KhaiBaoYTe.entities.PhuongXa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DiaChiRepository extends JpaRepository<DiaChi,Long> {
    DiaChi findDiaChiByCccd(String cccd);
}
