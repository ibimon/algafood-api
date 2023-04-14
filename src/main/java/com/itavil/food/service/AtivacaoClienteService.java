package com.itavil.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.itavil.food.model.Cliente;

@Component
public class AtivacaoClienteService {

	@Qualifier("email")
	@Autowired
	private Notificador notificador;

//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}
//	
//	public AtivacaoClienteService(String qualquer) {
//		
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

	/*
	 * public void ativar(Cliente cliente) { cliente.ativar();
	 * 
	 * for(Notificador nt : notificador) { nt.notificar(cliente,
	 * "Seu cadastro no sistema está ativo!");
	 * 
	 * }
	 * 
	 * }
	 */

//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}

}
