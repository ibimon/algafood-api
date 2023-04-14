package com.itavil.food.notificacao;

import org.springframework.stereotype.Component;

import com.itavil.food.model.Cliente;
import com.itavil.food.service.Notificador;

@Component
public class NotificadorSMS implements Notificador{
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do SMS Telefone %s : %s \n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
