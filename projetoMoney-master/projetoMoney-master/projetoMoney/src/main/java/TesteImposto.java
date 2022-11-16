import com.money.projetoMoney.model.calculos.CalculadoraDeImpostos;
import com.money.projetoMoney.model.Orcamento;
import com.money.projetoMoney.model.calculos.Icms;
import com.money.projetoMoney.model.calculos.Inss;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcularImpostos(orcamento, new Icms()));
        System.out.println(calculadora.calcularImpostos(orcamento, new Inss()));
    }
}