package com.andrade.core.provider;

import com.andrade.core.domain.Regiao;

public interface FindRegiaoByCep {

    Regiao find(final String cep);
}
