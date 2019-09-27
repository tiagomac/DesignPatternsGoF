package com.tiagomac.structural.decorator.service;

import com.tiagomac.structural.decorator.model.CartaoCredito;
import com.tiagomac.structural.decorator.model.Cliente;

public interface AutorizadorCartaoCredito {

	public void autorizar(Cliente cliente, CartaoCredito cartaoCredito, double valor);

}