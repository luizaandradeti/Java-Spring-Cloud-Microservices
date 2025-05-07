package com.andrade.core.regrasdenegocios.implement;

import com.andrade.core.domain.Cliente;
import com.andrade.core.provider.FindRegiaoByCep;
import com.andrade.core.provider.InsertCliente;
import com.andrade.core.regrasdenegocios.InsertClienteRegrasNegocios;

public class InsertClienteRegrasNegociosImplements implements InsertClienteRegrasNegocios {

    private final FindRegiaoByCep findRegiaoByCep;
    private final InsertCliente insertCliente;

    public InsertClienteRegrasNegociosImplements(
            FindRegiaoByCep findRegiaoByCep,
            InsertCliente insertCliente

    ) {
        this.findRegiaoByCep = findRegiaoByCep;
        this.insertCliente = insertCliente;
    }

    @Override
    public void insert(Cliente cliente, String cep) {
        var regiao = findRegiaoByCep.find(cep);
        cliente.setRegiao(regiao);
        insertCliente.insert(cliente);
    }
}
