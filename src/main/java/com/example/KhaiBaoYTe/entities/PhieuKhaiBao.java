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
    private String diachi;
    private Date ngayKhaiBao;
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
    @ManyToOne
    @JoinColumn(name = "cccdnguoithan")
    private NguoiThan nguoiThan;



}
