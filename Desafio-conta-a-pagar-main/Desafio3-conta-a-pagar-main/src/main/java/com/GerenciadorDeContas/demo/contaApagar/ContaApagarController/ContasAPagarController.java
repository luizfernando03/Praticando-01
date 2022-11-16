package com.GerenciadorDeContas.demo.contaApagar.ContaApagarController;

import com.GerenciadorDeContas.demo.contaApagar.ContaApagarModel.ContaAPagarModel;
import com.GerenciadorDeContas.demo.contaApagar.ContaApagarService.ContaAPagarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasAPagarController {

    @Autowired
    private ContaAPagarService contaAPagarService;

    @GetMapping (path = "/contapagar")
    public List <ContaAPagarModel> buscarConta(){
        return contaAPagarService.buscaTodos();
    }

    @GetMapping(path = "/contapagar /{id}")
    public Optional<ContaAPagarModel> buscarContaId(@PathVariable long id){
        return contaAPagarService.buscarId(id);
    }

    @PostMapping(path = "/contapagar")
    public ContaAPagarModel cadastrarConta(@RequestBody ContaAPagarModel contaAPagarModel){
        return contaAPagarService.registrarConta(contaAPagarModel);
    }

    @PutMapping(path = "/contapagar /{id}")
    public ContaAPagarModel alterarStatus (@RequestBody ContaAPagarModel contaAPagarModel){
        return contaAPagarService.alterarStatusConta(contaAPagarModel);

    }
    @DeleteMapping(path = "/contapagar /{id}")
    public  void deletarConta(@PathVariable long id){
        contaAPagarService.deleteId(id);
    }

}
