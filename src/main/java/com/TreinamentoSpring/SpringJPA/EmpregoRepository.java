package com.TreinamentoSpring.SpringJPA;

import org.springframework.data.repository.CrudRepository;

//Comunicador direto com a base de dados
public interface EmpregoRepository extends CrudRepository<Emprego, Long> {

}
