package com.exercicioSpring.gerenciamentoDecontasBancarias.repository;


import com.exercicioSpring.gerenciamentoDecontasBancarias.model.ContasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasRepository extends JpaRepository<ContasModel, Long> {


}
