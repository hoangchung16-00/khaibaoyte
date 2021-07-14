package com.example.KhaiBaoYTe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name ="loainguoidung")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoaiNguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String IDLoaiNguoiDung;
    private String LoaiNguoiDung;
    @OneToMany(mappedBy = "loaiNguoiDung")
    private List<TaiKhoan> taiKhoans;
}
