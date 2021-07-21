package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.DiaChi;
import com.example.KhaiBaoYTe.entities.PhuongXa;
import com.example.KhaiBaoYTe.repositories.DiaChiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DiaChiService {
    @Autowired
    private DiaChiRepository diaChiRepository;

    @Transactional
    public void addDiaChi(String diachi,String cccd, PhuongXa phuongXa){
        diaChiRepository.save(new DiaChi(diachi,cccd,phuongXa));
    }
    @Transactional
    public DiaChi findDiaChiByCccd(String cccd){
        final DiaChi diaChi = diaChiRepository.findDiaChiByCccd(cccd);
        if(diaChi==null)
            return null;
        return diaChi;
    }
}
