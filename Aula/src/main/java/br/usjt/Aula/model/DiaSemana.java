package br.usjt.Aula.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_diaSemana")
public class DiaSemana {
	@Id
	@GeneratedValue
	private Long dia;
	private String nome;
	public Long getDia() {
		return dia;
	}
	public void setDia(Long dia) {
		this.dia = dia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dia == null) ? 0 : dia.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiaSemana other = (DiaSemana) obj;
		if (dia == null) {
			if (other.dia != null)
				return false;
		} else if (!dia.equals(other.dia))
			return false;
		return true;
	}

}