package com.example.KhaiBaoYTe.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "phuongxa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PhuongXa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maphuongxa;
    private String tenphuongxa;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "maquanhuyen")
    private QuanHuyen quanHuyen;
    @JsonIgnore
    @OneToMany(mappedBy="phuongXa",fetch = FetchType.LAZY)
    private List<DiaChi> diaChis;
}
