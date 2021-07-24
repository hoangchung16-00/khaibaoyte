package com.example.KhaiBaoYTe.forms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchForm {
    @NotBlank(message = "cccd/cmnd không hợp lệ")
    private String cccd;
}
