package com.example.KhaiBaoYTe.forms;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KhaiBaoDiChuyeNoiDiaForm {
    @NotNull(message = "Bắt buộc")
    @NotBlank(message = "Bắt buộc")
    private String hoten;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1,message = "Bắt buộc")
    private int matinhtp;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1,message = "Bắt buộc")
    private int maquanhuyen;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1,message = "Bắt buộc")
    private int maphuongxa;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1000,message = "Năm sinh không hợp lệ")
    @Max(value = 2021,message = "Năm sinh không hợp lệ")
    private int namsinh;
    @Email(message = "Email không hợp lệ")
    private String email;
    @NotNull(message = "Bắt buộc")
    @NotBlank(message = "Bắt buộc")
    private String diachi;
    @NotNull(message = "Bắt buộc")
    private String gioitinh;
    @NotNull(message = "Bắt buộc")
    @NotBlank(message = "Bắt buộc")
    private String quoctich;
    @NotNull(message = "Bắt buộc")
    @NotBlank(message = "Bắt buộc")
    @Size(min=10,max=11,message = "Số điện thoại không hợp lệ")
    private String SDT;
    @NotNull(message = "Bắt buộc")
    private byte denVungDich;
    @NotNull(message = "Bắt buộc")
    private byte tiepXucNguoiBenh;
    @NotNull(message = "Bắt buộc")
    private byte sot;
    @NotNull(message = "Bắt buộc")
    private byte ho;
    @NotNull(message = "Bắt buộc")
    private byte khoTho;
    @NotNull(message = "Bắt buộc")
    private byte dauHong;
    @NotNull(message = "Bắt buộc")
    private byte moiCo;
    @NotNull(message = "Bắt buộc")
    private byte hatHoi;
    @NotBlank(message = "Bắt buộc")
    private String cccd;
    @NotNull(message = "Bắt buộc")
    private String phuongtien;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1,message = "Bắt buộc")
    private int noiditinhtp;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1,message = "Bắt buộc")
    private int noidiquanhuyen;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1,message = "Bắt buộc")
    private int noidiphuongxa;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1,message = "Bắt buộc")
    private int noidentinhtp;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1,message = "Bắt buộc")
    private int noidenquanhuyen;
    @NotNull(message = "Bắt buộc")
    @Min(value = 1,message = "Bắt buộc")
    private int noidenphuongxa;
    @NotNull(message = "Bắt buộc")
    @NotBlank(message = "Bắt buộc")
    private String sophuongtien;
    @NotNull(message = "Bắt buộc")
    @DateTimeFormat(pattern="dd/MM/yyyy")
    @NotBlank(message = "Bắt buộc")
    private String ngaydi;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private String ngayden;
    private String soghe;
}
