package com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.enums.status;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.enums.tipo;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter nyt
@Setter
@Data
@Entity
@Table(name = "contapagar")
public class ContaAPagarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String nome;

    @Column(length = 10, nullable = false)
    @Enumerated(value = EnumType.STRING)
    private status status;


    @Column(length = 10, nullable = false)
    @Enumerated(value = EnumType .STRING)
    private tipo tipo;

    @Column(length = 10, nullable = false)
    private Double Valor;

    @Column(length = 10, nullable = false)
    private LocalDate dataDeVencimento;

    @Column(length = 10, nullable = false)
    private LocalDateTime dataDePagamento;

}
