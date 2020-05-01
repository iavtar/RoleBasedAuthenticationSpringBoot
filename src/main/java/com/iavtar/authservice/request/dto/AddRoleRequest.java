package com.iavtar.authservice.request.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddRoleRequest {

	@NotBlank(message = "role name is required")
	private String roleName;
	
}
