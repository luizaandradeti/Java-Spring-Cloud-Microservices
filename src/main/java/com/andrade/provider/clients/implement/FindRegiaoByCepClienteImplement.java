package com.andrade.provider.clients.implement;

import com.andrade.core.domain.Regiao;
import com.andrade.provider.clients.FindRegiaoByCepCliente;
import com.andrade.provider.clients.RegiaoResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindRegiaoByCepClienteImplement implements FindRegiaoByCepCliente {

    @Autowired
    private FindRegiaoByCepCliente client;

    @Autowired
    private RegiaoResponseMapper regiaoResponseMapper;

    @Override
    public Regiao find(String cep) {
        var regiaoResponse = client.find(cep);
        return regiaoResponseMapper.toAddress(regiaoResponse);
    }

}