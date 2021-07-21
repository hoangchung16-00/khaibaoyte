package com.example.KhaiBaoYTe.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "taikhoan")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaiKhoan {
    @Id
    @Column(name = "cccd",nullable = false)
    private String cccd;
    private String ten;
    private int namsinh;
    private String sdt;
    private String email;
    private String gioitinh;
    private int songuoithan;
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn(name = "idloainguoidung")
    private LoaiNguoiDung loaiNguoiDung;
    @OneToMany(mappedBy = "taiKhoan",fetch = FetchType.LAZY)
    private List<PhieuKhaiBao> phieuKhaiBaos;
    @ManyToOne
    @JoinColumn(name = "madiachi")
    private DiaChi diaChi;
    @OneToMany(mappedBy = "taiKhoan")
    private List<NguoiThan> nguoiThans;

    public TaiKhoan(String cccd, String ten, int namsinh, String sdt, String email, String gioitinh, LoaiNguoiDung loaiNguoiDung,DiaChi diaChi) {
        this.cccd = cccd;
        this.ten = ten;
        this.namsinh = namsinh;
        this.sdt = sdt;
        this.email = email;
        this.gioitinh = gioitinh;
        this.loaiNguoiDung = loaiNguoiDung;
        this.diaChi=diaChi;
    }
}
