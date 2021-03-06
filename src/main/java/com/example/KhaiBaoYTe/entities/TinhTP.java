package com.example.KhaiBaoYTe.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "tinhtp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TinhTP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matinhtp;
    private String tentinhtp;
    @JsonIgnore
    @OneToMany(mappedBy = "tinhTP",fetch = FetchType.LAZY)
    private List<QuanHuyen> quanHuyens;
}
