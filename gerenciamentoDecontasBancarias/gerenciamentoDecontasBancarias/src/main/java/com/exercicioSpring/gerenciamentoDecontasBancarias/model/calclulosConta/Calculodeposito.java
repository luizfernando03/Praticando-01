package com.exercicioSpring.gerenciamentoDecontasBancarias.model.calclulosConta;

import java.math.BigDecimal;

public class Calculodeposito implements CalculoConta{
    @Override
    public BigDecimal calcular(BigDecimal valorAtualDaConta, BigDecimal valorFornecidoParaSaqueOuDeposito) {
        BigDecimal resultado = valorAtualDaConta.add(valorFornecidoParaSaqueOuDeposito);
        return resultado;
    }
}
