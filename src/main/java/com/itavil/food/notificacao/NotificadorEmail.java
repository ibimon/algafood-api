package com.itavil.food.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.itavil.food.model.Cliente;
import com.itavil.food.service.Notificador;

@Qualifier("email")
@Component
public class NotificadorEmail implements Notificador {
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do email %s  SMTP: %s \n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
