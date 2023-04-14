package com.itavil.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itavil.food.model.Cliente;
import com.itavil.food.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroControle {

	@Autowired
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroControle(AtivacaoClienteService at ) {
		this.ativacaoClienteService = at;
		
		System.out.println("MeuPrimeiroControle: "+ativacaoClienteService); 
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente c1 = new Cliente("Joao", "joao@gmail.com", "88 99089889");
		Cliente c2 = new Cliente("Maria", "maria@gmail.com", "62 99089889");
		ativacaoClienteService.ativar(c1);
		ativacaoClienteService.ativar(c2);
		
		return "Olá!";
	}
}
