package com.andrade.provider.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindRegionByCepCliente",
        url = "${luiza.cliente.endereco.url}"
)
public interface FindRegiaoByCepCliente {

@GetMapping("/{cep}")
RegiaoResponse find(@PathVariable("cep") String cep);

}