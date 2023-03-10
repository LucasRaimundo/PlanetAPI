package com.lucasraimundo.planets.dto;

import java.io.Serializable;

public class PlanetsNewDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double eixo;
	private Double distanciaSol;
	private Double periodoSideral;
	private Double velOrbital;
	private Double excentricidade;
	private Double inclinacaoOrbita;
	
	public PlanetsNewDTO() {
		
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getEixo() {
		return eixo;
	}

	public void setEixo(Double eixo) {
		this.eixo = eixo;
	}

	public Double getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(Double distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public Double getPeriodoSideral() {
		return periodoSideral;
	}

	public void setPeriodoSideral(Double periodoSideral) {
		this.periodoSideral = periodoSideral;
	}

	public Double getVelOrbital() {
		return velOrbital;
	}

	public void setVelOrbital(Double velOrbital) {
		this.velOrbital = velOrbital;
	}

	public Double getExcentricidade() {
		return excentricidade;
	}

	public void setExcentricidade(Double excentricidade) {
		this.excentricidade = excentricidade;
	}

	public Double getInclinacaoOrbita() {
		return inclinacaoOrbita;
	}

	public void setInclinacaoOrbita(Double inclinacaoOrbita) {
		this.inclinacaoOrbita = inclinacaoOrbita;
	}
	
	

}
