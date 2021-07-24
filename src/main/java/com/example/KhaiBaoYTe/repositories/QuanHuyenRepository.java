package com.example.KhaiBaoYTe.repositories;

import com.example.KhaiBaoYTe.entities.QuanHuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface QuanHuyenRepository extends JpaRepository<QuanHuyen,String> {

    @Query("select qh from QuanHuyen qh where qh.tinhTP.matinhtp=?1")
    List<QuanHuyen> findAllByMaTinhTP(int matinhtp);
    QuanHuyen findQuanHuyenByMaquanhuyen(int maquanhuyen);
}
