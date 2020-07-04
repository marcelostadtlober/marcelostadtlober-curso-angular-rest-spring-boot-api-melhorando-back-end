package com.mstadtlober.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mstadtlober.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
