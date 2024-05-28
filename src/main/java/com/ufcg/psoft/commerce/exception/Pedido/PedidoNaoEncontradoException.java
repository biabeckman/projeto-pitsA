package com.ufcg.psoft.commerce.exception.Pedido;

import com.ufcg.psoft.commerce.exception.CommerceException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PedidoNaoEncontradoException extends CommerceException {

    public PedidoNaoEncontradoException(){

        super("Pedido Nao Encontrado");
    }

}