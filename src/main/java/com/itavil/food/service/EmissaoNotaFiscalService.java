package com.itavil.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.itavil.food.model.Cliente;
import com.itavil.food.model.Produto;

//@Component
public class EmissaoNotaFiscalService {
	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
			this.notificador = notificador;
	}
	
	@Qualifier("sms")
	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite nota fiscal
		notificador.notificar(cliente, "Nota fiscal do produto "+produto.getNome()+" foi emitida.");
	}
}
