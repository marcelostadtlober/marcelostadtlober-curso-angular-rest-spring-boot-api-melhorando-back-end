package com.mstadtlober.algamoneyapi.dto;

import java.math.BigDecimal;

import com.mstadtlober.algamoneyapi.model.Pessoa;
import com.mstadtlober.algamoneyapi.model.TipoLancamento;

public class LancamentoEstatisticaPessoa {
	
	private TipoLancamento tipo;
	
	private Pessoa pessoa;
	
	private BigDecimal toal;

	public LancamentoEstatisticaPessoa(TipoLancamento tipo, Pessoa pessoa, BigDecimal toal) {
		this.tipo = tipo;
		this.pessoa = pessoa;
		this.toal = toal;
	}

	public TipoLancamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public BigDecimal getToal() {
		return toal;
	}

	public void setToal(BigDecimal toal) {
		this.toal = toal;
	}	

}
