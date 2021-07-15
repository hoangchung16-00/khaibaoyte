package com.example.KhaiBaoYTe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "phieukhaibao")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhieuKhaiBao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPhieu;
    private String hoten;
    private String diachi;
    private Date ngayKhaiBao;
    private int namsinh;
    private String email;
    private String quoctich;
    private String gioitinh;
    private String noiKhaiBao;
    private String noiDi;
    private String noiDen;
    private String phuongTien;
    private String ngayDi;
    private String ngayDen;
    private String SDT;
    private Boolean denVungDich;
    private Boolean tiepXucNguoiBenh;
    private Boolean sot;
    private Boolean ho;
    private Boolean khoTho;
    private Boolean dauHong;
    private Boolean moiCo;
    private Boolean hatHoi;
    @ManyToOne
    @JoinColumn(name = "cccd")
    private TaiKhoan taiKhoan;

    public PhieuKhaiBao(String hoten, String diachi, Date ngayKhaiBao, int namsinh, String email, String quoctich, String gioitinh, String noiKhaiBao, String noiDi, String noiDen, String phuongTien, String ngayDi, String ngayDen, String SDT, Boolean denVungDich, Boolean tiepXucNguoiBenh, Boolean sot, Boolean ho, Boolean khoTho, Boolean dauHong, Boolean moiCo, Boolean hatHoi, TaiKhoan taiKhoan) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngayKhaiBao = ngayKhaiBao;
        this.namsinh = namsinh;
        this.email = email;
        this.quoctich = quoctich;
        this.gioitinh = gioitinh;
        this.noiKhaiBao = noiKhaiBao;
        this.noiDi = noiDi;
        this.noiDen = noiDen;
        this.phuongTien = phuongTien;
        this.ngayDi = ngayDi;
        this.ngayDen = ngayDen;
        this.SDT = SDT;
        this.denVungDich = denVungDich;
        this.tiepXucNguoiBenh = tiepXucNguoiBenh;
        this.sot = sot;
        this.ho = ho;
        this.khoTho = khoTho;
        this.dauHong = dauHong;
        this.moiCo = moiCo;
        this.hatHoi = hatHoi;
        this.taiKhoan = taiKhoan;
    }
}
