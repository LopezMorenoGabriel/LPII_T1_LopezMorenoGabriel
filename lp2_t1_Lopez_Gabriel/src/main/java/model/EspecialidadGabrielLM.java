package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_especialidad")
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EspecialidadGabrielLM {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_especialidad")
	@EqualsAndHashCode.Include
	private int idEspecialidad;
	
	@Column(name = "titulo")
	private String desTitulo;
	
	@Override
	public String toString() {
		return desTitulo;
	}
}
