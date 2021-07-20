package com.example.KhaiBaoYTe.forms;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KhaiBaoDiChuyeNoiDiaForm {
    @NotNull
    private String hoten;
    @NotNull
    private String matinhtp;
    @NotNull
    private String maquanhuyen;
    @NotNull
    private String maphuongxa;
    @NotNull
    private int namsinh;
    @NotNull
    private String email;
    @NotNull
    private String diachi;
    @NotNull
    private String gioitinh;
    @NotNull
    private String quoctich;
    @NotNull
    private String SDT;
    @NotNull
    private Boolean denVungDich;
    @NotNull
    private Boolean tiepXucNguoiBenh;
    @NotNull
    private Boolean sot;
    @NotNull
    private Boolean ho;
    @NotNull
    private Boolean khoTho;
    @NotNull
    private Boolean dauHong;
    @NotNull
    private Boolean moiCo;
    @NotNull
    private Boolean hatHoi;
    @NotNull
    private String cccd;
    @NotNull
    private String phuongtien;
    @NotNull
    private String noiditinhtp;
    @NotNull
    private String noidiquanhuyen;
    @NotNull
    private String noidiphuongxa;
    @NotNull
    private String noidentinhtp;
    @NotNull
    private String noidenquanhuyen;
    @NotNull
    private String noidenphuongxa;
    @NotNull
    private String sophuongtien;
    @NotNull
    private String ngaydi;
    private String ngayden;
    private String soghe;
}
