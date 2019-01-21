package br.com.fiap.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.money.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}