package com.example.KhaiBaoYTe.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhaiBaoYTeToanDanForm {
    @NotBlank(message = "Bắt buộc")
    @NotNull
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
    @NotBlank(message = "Bắt buộc")
    private String diachi;
    @NotNull(message = "Bắt buộc")
    private String gioitinh;
    @NotNull(message = "Bắt buộc")
    @NotBlank(message = "Bắt buộc")
    private String quoctich;
    @NotBlank(message ="Bắt buộc")
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
    @NotBlank(message ="Bắt buộc")
    private String cccd;
}
