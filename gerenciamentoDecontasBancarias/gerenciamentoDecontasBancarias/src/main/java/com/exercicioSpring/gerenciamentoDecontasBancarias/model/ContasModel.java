package com.exercicioSpring.gerenciamentoDecontasBancarias.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "conta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(length = 6, nullable = false)
    private String numerodaconta;

    @Column(length = 4, nullable = false)
    private String agencia;

    @Column(length = 35, nullable = false)
    private String nomeDoUsuario;

    @Column(length = 10, nullable = false)
    private BigDecimal valorAtualDaConta;

    @Column(length = 10, nullable = false)
    private BigDecimal valorFornecidoParaSaqueOuDeposito;

    @Column(length = 30, nullable = false)
    private String tipoDeServico;

    @Column(length = 10)
    private BigDecimal valorFinal;

}




