package com.mstadtlober.algamoneyapi.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mstadtlober.algamoneyapi.model.Lancamento;
import com.mstadtlober.algamoneyapi.repository.filter.LancamentoFilter;
import com.mstadtlober.algamoneyapi.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
