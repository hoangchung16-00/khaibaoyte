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
    private Long maphieu;
    private String hoten;
    private String diachi;
    private Date ngaykhaibao;
    private int namsinh;
    private String email;
    private String quoctich;
    private String gioitinh;
    private String noikhaibao;
    private String noidi;
    private String noiden;
    private String phuongtien;
    private String sophuongtien;
    private String soghe;
    private Date ngaydi;
    private Date ngayden;
    private String sdt;
    private byte denvungdich;
    private byte tiepxucnguoibenh;
    private byte sot;
    private byte ho;
    private byte khotho;
    private byte dauhong;
    private byte moico;
    private byte hathoi;
    @ManyToOne
    @JoinColumn(name = "cccd")
    private TaiKhoan taiKhoan;

    public PhieuKhaiBao(String hoten, String diachi, Date ngaykhaibao, int namsinh, String email, String quoctich, String gioitinh, String noikhaibao, String noidi, String noiden, String phuongtien, Date ngaydi, Date ngayden, String sdt, byte denvungdich, byte tiepxucnguoibenh, byte sot, byte ho, byte khotho, byte dauhong, byte moico, byte hathoi, TaiKhoan taiKhoan) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaykhaibao = ngaykhaibao;
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

    public PhieuKhaiBao(String hoten, String diachi, Date ngaykhaibao, int namsinh, String email, String quoctich, String gioitinh, String sdt, byte denvungdich, byte tiepxucnguoibenh, byte sot, byte ho, byte  khotho, byte dauhong, byte moico, byte hathoi, TaiKhoan taiKhoan) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaykhaibao = ngaykhaibao;
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

    public PhieuKhaiBao(String hoten, String diachi, Date ngaykhaibao, int namsinh, String email, String quoctich, String gioitinh, String noidi, String noiden, String phuongtien,String sophuongtien,String soghe, Date ngaydi, Date ngayden, String sdt, byte denvungdich, byte tiepxucnguoibenh, byte sot, byte ho, byte khotho, byte dauhong, byte moico, byte hathoi, TaiKhoan taiKhoan) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.ngaykhaibao = ngaykhaibao;
        this.namsinh = namsinh;
        this.email = email;
        this.quoctich = quoctich;
        this.gioitinh = gioitinh;
        this.noidi = noidi;
        this.noiden = noiden;
        this.phuongtien = phuongtien;
        this.sophuongtien = sophuongtien;
        this.soghe = soghe;
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
}
