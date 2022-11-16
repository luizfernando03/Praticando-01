package com.exercicioSpring.gerenciamentoDecontasBancarias.model.calclulosConta;

import java.math.BigDecimal;

public class CalculoSaque implements CalculoConta {

    @Override
    public BigDecimal calcular(BigDecimal valorAtualDaConta, BigDecimal valorFornecidoParaSaqueOuDeposito) {
        BigDecimal resultado = valorAtualDaConta.subtract(valorFornecidoParaSaqueOuDeposito);
        return resultado;
    }
}
