package com.example.KhaiBaoYTe.repositories;

import com.example.KhaiBaoYTe.entities.TinhTP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TinhTPRepository extends JpaRepository<TinhTP, String> {
    TinhTP findTinhTPByMatinhtp(int matinhtp);
}
