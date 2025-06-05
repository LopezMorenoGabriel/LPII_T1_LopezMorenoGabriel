package model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_equipo_dental")
@DynamicInsert
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class EquipoGabrielLM {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_equipo")
	private int nroEquipo;
	
	@Column(name = "nombre",nullable = false)
	private String nomEquipo;
	
	@Column(name = "costo",nullable = false)
	private double precio;
	
	@Column(name = "fecha_adquisicion")
	private LocalDate fchAdquisicion;
	
	@Column(name = "estado",nullable = false)
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dentista",nullable = false)
	private DentistaGabrielLM dentista;
	
	@Override
	public String toString() {
		return nomEquipo;
	}
	
	public EquipoGabrielLM(String nomEquipo, int precio, DentistaGabrielLM dentista, String estado) {
	    this.nroEquipo = 0;
	    this.fchAdquisicion = null;
	    this.nomEquipo = nomEquipo;
	    this.precio = precio;
	    this.dentista = dentista;
	    this.estado = estado;
	}
}
