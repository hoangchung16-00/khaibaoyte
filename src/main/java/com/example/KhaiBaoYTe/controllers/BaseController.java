package com.example.KhaiBaoYTe.controllers;

import com.example.KhaiBaoYTe.entities.TinhTP;
import com.example.KhaiBaoYTe.services.TinhTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

public class BaseController {
    @Autowired
    protected TinhTPService tinhTPService;
    @ModelAttribute("tinhtps")
    public List<TinhTP> getAllTinhTP(){
        return tinhTPService.findAll();
    }
}
