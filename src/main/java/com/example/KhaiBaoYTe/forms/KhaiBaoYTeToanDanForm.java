package com.example.KhaiBaoYTe.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhaiBaoYTeToanDanForm {
    private String hoten;
    private String matinhtp;
    private String maquanhuyen;
    private String maphuongxa;
    private int namsinh;
    private String email;
    private String diachi;
    private String gioitinh;
    private String quoctich;
    private String SDT;
    private Boolean denVungDich;
    private Boolean tiepXucNguoiBenh;
    private Boolean sot;
    private Boolean ho;
    private Boolean khoTho;
    private Boolean dauHong;
    private Boolean moiCo;
    private Boolean hatHoi;
    private String cccd;
}
