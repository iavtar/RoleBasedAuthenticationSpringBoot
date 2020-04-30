package com.iavtar.authservice.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

	@GetMapping("/")
	private String echo(Principal principal) {
		return principal.getName();
	}

}
