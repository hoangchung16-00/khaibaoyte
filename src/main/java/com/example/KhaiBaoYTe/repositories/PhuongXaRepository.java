package com.example.KhaiBaoYTe.repositories;

import com.example.KhaiBaoYTe.entities.PhuongXa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PhuongXaRepository extends JpaRepository<PhuongXa,String> {
    @Query("select px from PhuongXa px where px.quanHuyen.maquanhuyen=?1")
    List<PhuongXa> findAllByMaQuanHuyen(int maquanhuyen);
    PhuongXa findPhuongXaByMaphuongxa(int maphuongxa);
}
