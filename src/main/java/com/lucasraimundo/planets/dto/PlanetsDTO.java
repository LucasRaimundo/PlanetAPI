package com.lucasraimundo.planets.dto;

import com.lucasraimundo.planets.model.Planets;



public class PlanetsDTO {
	
	private Integer id;
	
	private String nome;
	private Double eixo;
	private Double distanciaSol;
	private Double periodoSideral;
	private Double velOrbital;
	private Double excentricidade;
	private Double inclinacaoOrbita;
	
	public PlanetsDTO() {
		
	}
	
	public PlanetsDTO(Planets obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.eixo = obj.getEixo();
		this.distanciaSol = obj.getDistanciaSol();
		this.periodoSideral = obj.getPeriodoSideral();
		this.velOrbital = obj.getVelOrbital();
		this.excentricidade = obj.getExcentricidade();
		this.inclinacaoOrbita = obj.getInclinacaoOrbita();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
