package com.exercicioSpring.gerenciamentoDecontasBancarias.model.calclulosConta;

public class ContaFactory {
    public CalculoConta getStatusConta(String status) {
        if (status.equalsIgnoreCase ("deposito")) {
            return new Calculodeposito ();
        } else if (status.equalsIgnoreCase ("saque")) {
            return new CalculoSaque ();
        } else {
            return null;
        }
    }
}
