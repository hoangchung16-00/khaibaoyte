package com.example.KhaiBaoYTe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "phuongxa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhuongXa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maPhuongXa;
    private String tenPhuongxa;
    @ManyToOne
    @JoinColumn(name = "MaQuanHuyen")
    private QuanHuyen quanHuyen;
    @OneToMany(mappedBy="phuongXa",fetch = FetchType.LAZY)
    private List<DiaChi> diaChis;
}
