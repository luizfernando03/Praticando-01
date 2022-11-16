package com.money.projetoMoney.model.calculos;

import com.money.projetoMoney.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcularImpostos(Orcamento orcamento, Imposto imposto) {
        //Pela interface vamos nos metodos
        //O usuario coloca em qual deseja ir
        return imposto.calcular(orcamento);
    }
}
