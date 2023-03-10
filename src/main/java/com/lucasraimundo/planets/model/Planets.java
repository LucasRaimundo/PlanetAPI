package com.lucasraimundo.planets.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Planets implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double eixo;
	private Double distanciaSol;
	private Double periodoSideral;
	private Double velOrbital;
	private Double excentricidade;
	private Double inclinacaoOrbita;
	
	public Planets() {
		
	}
	
	

	public Planets(Integer id, String nome, Double eixo, Double distanciaSol, Double periodoSideral, Double velOrbital,
			Double excentricidade, Double inclinacaoOrbita) {
		super();
		this.id = id;
		this.nome = nome;
		this.eixo = eixo;
		this.distanciaSol = distanciaSol;
		this.periodoSideral = periodoSideral;
		this.velOrbital = velOrbital;
		this.excentricidade = excentricidade;
		this.inclinacaoOrbita = inclinacaoOrbita;
	}



	public int getId() {
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
