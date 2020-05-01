package com.iavtar.authservice.controller;

import java.security.Principal;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

	@GetMapping("/")
	@Secured("ROLE_ADMIN")
	private String echo(Principal principal) {
		return principal.getName();
	}

}
