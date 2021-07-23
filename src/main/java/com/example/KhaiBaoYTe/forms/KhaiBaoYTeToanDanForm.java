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
    private String matinhtp;
    @NotNull(message = "Bắt buộc")
    private String maquanhuyen;
    @NotNull(message = "Bắt buộc")
    private String maphuongxa;
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
    private Boolean denVungDich;
    @NotNull(message = "Bắt buộc")
    private Boolean tiepXucNguoiBenh;
    @NotNull(message = "Bắt buộc")
    private Boolean sot;
    @NotNull(message = "Bắt buộc")
    private Boolean ho;
    @NotNull(message = "Bắt buộc")
    private Boolean khoTho;
    @NotNull(message = "Bắt buộc")
    private Boolean dauHong;
    @NotNull(message = "Bắt buộc")
    private Boolean moiCo;
    @NotNull(message = "Bắt buộc")
    private Boolean hatHoi;
    @NotBlank(message ="Bắt buộc")
    private String cccd;
}
