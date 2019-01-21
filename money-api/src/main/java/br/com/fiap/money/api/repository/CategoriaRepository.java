package br.com.fiap.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.money.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}