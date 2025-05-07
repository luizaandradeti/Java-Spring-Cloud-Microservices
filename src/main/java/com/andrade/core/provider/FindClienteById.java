package com.andrade.core.provider;
import com.andrade.core.domain.Cliente;
import java.util.Optional;

public interface FindClienteById {

    Optional<Cliente> find(final String id);

}