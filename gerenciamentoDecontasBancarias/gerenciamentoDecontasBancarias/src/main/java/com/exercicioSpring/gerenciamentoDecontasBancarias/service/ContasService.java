package com.exercicioSpring.gerenciamentoDecontasBancarias.service;

import com.exercicioSpring.gerenciamentoDecontasBancarias.model.ContasModel;
import com.exercicioSpring.gerenciamentoDecontasBancarias.model.calclulosConta.ContaFactory;
import com.exercicioSpring.gerenciamentoDecontasBancarias.repository.ContasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContasService {

    @Autowired
    private ContasRepository contasrepository;
    private Object contasModel;

    public List<ContasModel>buscartodasAsContas(){
        return contasrepository.findAll ();
    }
    public Optional<ContasModel> buscarPorId(Long codigo){
        return contasrepository.findById (codigo);
    }
    public ContasModel cadastrar(ContasModel contasModel, ContaFactory contaFactory){
        BigDecimal resultado =  contaFactory.getStatusConta (contasModel.getTipoDeServico()).calcular(contasModel.getValorAtualDaConta(), contasModel.getValorFornecidoParaSaqueOuDeposito());
        contasModel.getCodigo();
        contasModel.getNumerodaconta ();
        contasModel.getAgencia();
        contasModel.getNomeDoUsuario();
        contasModel.getValorFornecidoParaSaqueOuDeposito();
        contasModel.getTipoDeServico();
        contasModel.setValorFinal(resultado);
        return contasrepository.save(contasModel);

    }
    public void deletar(Long codigo) {
        contasrepository.deleteById (codigo);
    }
}
