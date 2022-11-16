package com.money.projetoMoney.model.calculos;

import com.money.projetoMoney.model.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular (Orcamento orcamento);
}
