package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.PhuongXa;
import com.example.KhaiBaoYTe.entities.QuanHuyen;
import com.example.KhaiBaoYTe.repositories.PhuongXaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class PhuongXaService {
    @Autowired
    private PhuongXaRepository phuongXaRepository;

    @Transactional
    public List<PhuongXa> findAll(){
        return phuongXaRepository.findAll();
    }

    @Transactional
    public List<PhuongXa> findAllByMaQuanHuyen(String maquanhuyen){
        return phuongXaRepository.findAllByMaQuanHuyen(maquanhuyen);
    }
    @Transactional
    public PhuongXa findPhuongXaByMaPhuongXa(String maphuongxa){
        return phuongXaRepository.findPhuongXaByMaphuongxa(maphuongxa);
    }
}
