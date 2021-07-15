package com.example.KhaiBaoYTe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "diachi")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int madiachi;
    private String duong;
    private String soNha;
    @ManyToOne
    @JoinColumn(name = "maphuongxa")
    private PhuongXa phuongXa;
    @OneToMany(mappedBy = "diaChi")
    private List<TaiKhoan> taiKhoans;
    @OneToMany(mappedBy = "diaChi")
    private List<NguoiThan> nguoiThans;
}
