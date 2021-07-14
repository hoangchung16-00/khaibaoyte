package com.example.KhaiBaoYTe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "nguoithan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NguoiThan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CCCD;
    private String ten;
    private Date ngaySinh;
    private String SDT;
    private String email;
    private String gioiTinh;
    private String quanHeNguoiThan;
    @ManyToOne
    @JoinColumn(name = "cccdnguoithan")
    private TaiKhoan taiKhoan;
    @ManyToOne
    @JoinColumn(name = "madiachi")
    private DiaChi diaChi;
    @OneToMany(mappedBy = "nguoiThan")
    private List<PhieuKhaiBao> phieuKhaiBaos;

}
