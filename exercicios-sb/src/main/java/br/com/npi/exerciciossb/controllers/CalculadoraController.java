package br.com.npi.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{N1}/{N2}")
	public int Somar(@PathVariable int N1, @PathVariable int N2) {
		return N1 + N2;
	}

	@GetMapping("/subtrair")
	public int Subtrair(@RequestParam(name = "a") int N1, @RequestParam(name = "b") int N2) {
		return N1 - N2;
	}

}
