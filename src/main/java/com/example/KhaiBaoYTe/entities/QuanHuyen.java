package com.example.KhaiBaoYTe.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "quanhuyen")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuanHuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maquanhuyen;
    private String tenquanhuyen;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "matinhtp")
    private TinhTP tinhTP;
    @JsonIgnore
    @OneToMany(mappedBy = "quanHuyen",fetch = FetchType.LAZY)
    private List<PhuongXa> phuongXas;
}
