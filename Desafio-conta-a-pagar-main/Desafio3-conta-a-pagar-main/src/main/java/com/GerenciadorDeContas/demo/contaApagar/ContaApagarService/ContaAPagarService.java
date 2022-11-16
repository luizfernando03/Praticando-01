package com.GerenciadorDeContas.demo.contaApagar.ContaApagarService;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.ContaAPagarModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarRepository.ContaAPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ContaAPagarService {

    @Autowired
    private ContaAPagarRepository contaAPagarRepository;

    public List<ContaAPagarModel> buscaTodos() {
        return contaAPagarRepository.findAll();
    }

    public Optional<ContaAPagarModel> buscarId(Long id) {
        return contaAPagarRepository.findById(id);
    }

    public ContaAPagarModel registrarConta(ContaAPagarModel contaAPagarModel) {

        contaAPagarModel.getId();
        contaAPagarModel.getNome();
        contaAPagarModel.getValor();
        contaAPagarModel.getStatus();
        contaAPagarModel.getDataDeVencimento();
        contaAPagarModel.getDataDePagamento();
        contaAPagarModel.getTipo();


        return contaAPagarRepository.save(contaAPagarModel);
    }

    public ContaAPagarModel alterarStatusConta(ContaAPagarModel contaAPagarModel) {

        contaAPagarModel.getId();
        contaAPagarModel.getStatus();
        contaAPagarModel.getValor();
        contaAPagarModel.getDataDePagamento();
        contaAPagarModel.getTipo();

        return contaAPagarRepository.save(contaAPagarModel);
    }

    public void deleteId(Long id) {
        contaAPagarRepository.deleteById(id);
    }
}
