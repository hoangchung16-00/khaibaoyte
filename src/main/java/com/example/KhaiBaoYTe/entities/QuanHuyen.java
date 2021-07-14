package com.example.KhaiBaoYTe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "quanhuyen")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuanHuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maQuanHuyen;
    private String tenQuanHuyen;
    @ManyToOne
    @JoinColumn(name = "matinhtp")
    private TinhThanhPho tinhThanhPho;
    @OneToMany(mappedBy = "quanHuyen",fetch = FetchType.LAZY)
    private List<PhuongXa> phuongXas;
}
