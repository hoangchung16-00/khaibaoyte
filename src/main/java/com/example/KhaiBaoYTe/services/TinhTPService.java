package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.TinhTP;
import com.example.KhaiBaoYTe.repositories.TinhTPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class TinhTPService {
    @Autowired
    private TinhTPRepository tinhTPRepository;

    @Transactional
    public List<TinhTP> findAll(){
        return tinhTPRepository.findAll();
    }

    @Transactional
    public TinhTP findTinhTPByMaTinhTp(int matinhtp){
        return tinhTPRepository.findTinhTPByMatinhtp(matinhtp);
    }
}
