package com.example.KhaiBaoYTe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "TaiKhoan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CCCD;
    private String ten;
    private Date ngaySinh;
    private String SDT;
    private String email;
    private String gioiTinh;
    private int soNguoiThan;
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
}
