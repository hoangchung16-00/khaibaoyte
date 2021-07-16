package com.example.KhaiBaoYTe.controllers;

import com.example.KhaiBaoYTe.forms.KhaiBaoDiChuyeNoiDiaForm;
import com.example.KhaiBaoYTe.forms.KhaiBaoYTeToanDanForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class KhaiBaoDiChuyenNoiDiaController {
    @GetMapping("/khaibaodichuyennoidia")
    public String getKhaiBaoDiChuyenNoiDia(Model model){
        model.addAttribute("khaiBaoDiChuyenNoiDiaForm",new KhaiBaoDiChuyeNoiDiaForm());
        return "khaibaodichuyennoidia";
    }
    @PostMapping("/khaibaodichuyennoidia")
    private String postKhaiBaoDiChuyenNoiDia(@Valid @ModelAttribute("khaiBaoYTeToanDanForm") KhaiBaoYTeToanDanForm khaiBaoYTeToanDanForm, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "khaibaodichuyennoidia";
        }
        return "redirect:/login";
    }
}
