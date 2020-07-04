package com.mstadtlober.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mstadtlober.algamoneyapi.model.Lancamento;
import com.mstadtlober.algamoneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
