package com.money.projetoMoney.model;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valorOrcamento;

    public Orcamento() {
    }

    public Orcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrçamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }
}
