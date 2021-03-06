package com.gtp.person.domain;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class UpdateReqDto {
	@NotBlank(message = "password가 입력되지 않았습니다.")
	private String password;
	private String phone;
}
