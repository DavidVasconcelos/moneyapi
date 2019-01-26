package br.com.fiap.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.money.api.model.Lancamento;
import br.com.fiap.money.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}