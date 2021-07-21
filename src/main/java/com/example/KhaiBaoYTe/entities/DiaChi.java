package com.example.KhaiBaoYTe.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "diachi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int madiachi;
    private String diachi;
    private String cccd;
    @ManyToOne
    @JoinColumn(name = "maphuongxa")
    private PhuongXa phuongXa;
    @OneToMany(mappedBy = "diaChi")
    private List<TaiKhoan> taiKhoans;
    @OneToMany(mappedBy = "diaChi")
    private List<NguoiThan> nguoiThans;

    public DiaChi(String diachi, String cccd, PhuongXa phuongXa) {
        this.diachi = diachi;
        this.cccd = cccd;
        this.phuongXa = phuongXa;
    }
}
