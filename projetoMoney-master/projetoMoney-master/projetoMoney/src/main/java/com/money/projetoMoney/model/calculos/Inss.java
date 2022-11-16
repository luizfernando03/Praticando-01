package com.money.projetoMoney.model.calculos;

import com.money.projetoMoney.model.Orcamento;

import java.math.BigDecimal;

public class Inss implements Imposto{
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.06"));
    }
}
