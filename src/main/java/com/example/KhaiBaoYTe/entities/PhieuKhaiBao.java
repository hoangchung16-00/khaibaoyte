package com.example.KhaiBaoYTe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    private Long maPhieu;
    private String hoten;
    private String diachi;
    private Date ngayKhaiBao;
    private int namsinh;
    private String email;
    private String quoctich;
    private String gioitinh;
    private String noikhaibao;
    private String noidi;
    private String noiden;
    private String phuongtien;
    private Date ngaydi;
    private Date ngayden;
    private String sdt;
    private Boolean denvungdich;
    private Boolean tiepxucnguoibenh;
    private Boolean sot;
    private Boolean ho;
    private Boolean khotho;
    private Boolean dauhong;
    private Boolean moico;
    private Boolean hathoi;
    @ManyToOne
    @JoinColumn(name = "cccd")
    private TaiKhoan taiKhoan;

    public PhieuKhaiBao(String hoten, String diachi, Date ngayKhaiBao, int namsinh, String email, String quoctich, String gioitinh, String noikhaibao, String noidi, String noiden, String phuongtien, Date ngaydi, Date ngayden, String sdt, Boolean denvungdich, Boolean tiepxucnguoibenh, Boolean sot, Boolean ho, Boolean khotho, Boolean dauhong, Boolean moico, Boolean hathoi, TaiKhoan taiKhoan) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngayKhaiBao = ngayKhaiBao;
        this.namsinh = namsinh;
        this.email = email;
        this.quoctich = quoctich;
        this.gioitinh = gioitinh;
        this.noikhaibao = noikhaibao;
        this.noidi = noidi;
        this.noiden = noiden;
        this.phuongtien = phuongtien;
        this.ngaydi = ngaydi;
        this.ngayden = ngayden;
        this.sdt = sdt;
        this.denvungdich = denvungdich;
        this.tiepxucnguoibenh = tiepxucnguoibenh;
        this.sot = sot;
        this.ho = ho;
        this.khotho = khotho;
        this.dauhong = dauhong;
        this.moico = moico;
        this.hathoi = hathoi;
        this.taiKhoan = taiKhoan;
    }

    public PhieuKhaiBao(String hoten, String diachi, Date ngayKhaiBao, int namsinh, String email, String quoctich, String gioitinh, String sdt, Boolean denvungdich, Boolean tiepxucnguoibenh, Boolean sot, Boolean ho, Boolean khotho, Boolean dauhong, Boolean moico, Boolean hathoi, TaiKhoan taiKhoan) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngayKhaiBao = ngayKhaiBao;
        this.namsinh = namsinh;
        this.email = email;
        this.quoctich = quoctich;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.denvungdich = denvungdich;
        this.tiepxucnguoibenh = tiepxucnguoibenh;
        this.sot = sot;
        this.ho = ho;
        this.khotho = khotho;
        this.dauhong = dauhong;
        this.moico = moico;
        this.hathoi = hathoi;
        this.taiKhoan = taiKhoan;
    }
}
