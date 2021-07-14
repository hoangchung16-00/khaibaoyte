package com.example.KhaiBaoYTe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "tinhtp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TinhThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maTinhTP;
    private String tenTinhTP;
    @OneToMany(mappedBy = "tinhThanhPho",fetch = FetchType.LAZY)
    private List<QuanHuyen> quanHuyens;
}
