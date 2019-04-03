package br.usjt.Aula.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.usjt.Aula.model.DiaSemana;
@Entity

public class PrevisaoTempo  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private String nome;
	private Double tempMin;
	private Double tempMax;
	private Double humidade;
	private String descricao;
	private String dataHora;
	private Double latitude;
	private Double longitude;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getTempMin() {
		return tempMin;
	}
	public void setTempMin(Double tempMin) {
		this.tempMin = tempMin;
	}
	public Double getTempMax() {
		return tempMax;
	}
	public void setTempMax(Double tempMax) {
		this.tempMax = tempMax;
	}
	public Double getHumidade() {
		return humidade;
	}
	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	@OneToOne (optional = false)
	@JoinColumn (name = "dia_semana")
	private DiaSemana diaSemana;
	public DiaSemana getDiaSemana() {
	return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
	this.diaSemana = diaSemana;
	}
	
}
