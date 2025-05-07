package com.andrade.provider.clients;


import com.andrade.core.domain.Regiao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegiaoResponseMapper {

    Regiao toAddress(RegiaoResponse regiaoResponse);

}