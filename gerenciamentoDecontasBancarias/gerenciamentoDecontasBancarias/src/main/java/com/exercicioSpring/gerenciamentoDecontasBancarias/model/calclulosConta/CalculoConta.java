package com.exercicioSpring.gerenciamentoDecontasBancarias.model.calclulosConta;

import java.math.BigDecimal;

public interface CalculoConta {
    public BigDecimal calcular(BigDecimal valorAtualDaConta,
                               BigDecimal valorFornecidoParaSaqueOuDeposito);
}
