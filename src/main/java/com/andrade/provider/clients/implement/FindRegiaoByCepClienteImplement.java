package com.andrade.provider.clients.implement;

import com.andrade.provider.clients.FindRegiaoByCepCliente;
import com.andrade.provider.clients.RegiaoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindRegiaoByCepClienteImplement implements FindRegiaoByCepCliente {

    @Autowired
    private FindRegiaoByCepCliente client;


    @Override
    public RegiaoResponse find(String cep) {
        return null;
        //TODO data provider
    }
}