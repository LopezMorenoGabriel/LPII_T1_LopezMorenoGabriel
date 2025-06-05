package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name = "tbl_dentista")
@DynamicInsert
public class DentistaGabrielLM {
	@Id
	@Column(name = "id_dentista")
	private int idDentista;
	
	@Column(name = "cop",nullable = false)
	private int cop;
	
	@Column(name = "nombre_completo",nullable = false)
	private String nomCompleto;
	
	@Column(name = "fecha_inicio_contrato",nullable = false)
	private LocalDate fchInicioContrato;
	
	@Column(name = "turno",nullable = false)
	private String turno;
	
	@Column(name = "correo",nullable = false)
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_especialidad",nullable = false)
	private EspecialidadGabrielLM especialidad;
	
	@Override
	public String toString() {
		return nomCompleto;
	}
}
