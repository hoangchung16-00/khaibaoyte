package com.example.KhaiBaoYTe.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name ="loainguoidung")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoaiNguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String tenloainguoidung;
    @OneToMany(mappedBy = "loaiNguoiDung")
    private List<TaiKhoan> taiKhoans;
}
