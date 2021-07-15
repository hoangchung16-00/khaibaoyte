package com.example.KhaiBaoYTe.services;

import com.example.KhaiBaoYTe.entities.QuanHuyen;
import com.example.KhaiBaoYTe.repositories.QuanHuyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class QuanHuyenService {
    @Autowired
    private QuanHuyenRepository quanHuyenRepository;
    @Transactional
    public List<QuanHuyen> findAll(){
        return quanHuyenRepository.findAll();
    }
    @Transactional
    public List<QuanHuyen> findAllByMaTinhTp(String matinhtp){
        return quanHuyenRepository.findAllByMaTinhTP(matinhtp);
    }
}
