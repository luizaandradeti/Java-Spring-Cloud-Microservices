package com.andrade.core.regrasdenegocios.implement;

import com.andrade.core.domain.Cliente;
import com.andrade.core.provider.FindClienteById;
import com.andrade.core.regrasdenegocios.FindClienteByIdRegrasNegocios;

public class FindClienteByIdRegrasNegociosImplements implements FindClienteByIdRegrasNegocios {


    // provider
    private final FindClienteById findClienteById;



    public FindClienteByIdRegrasNegociosImplements(FindClienteById findClienteById) {
        this.findClienteById = findClienteById;
    }


    @Override
    public Cliente find(String id) {
        return findClienteById.find(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

}