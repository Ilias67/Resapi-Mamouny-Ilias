package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Table (name = "LIVRE")
@Entity 
@Data
@AllArgsConstructor @NoArgsConstructor


public class Livre {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	
	@Column(name = "TITRE",length = 50,nullable = false)
	private String titreLivre;
	
	@Column(name = "MAISON_EDITION",length = 50,nullable = false,updatable = false)
	private String maisonEditionLivre;
	
	public Livre() {
		// TODO Auto-generated constructor stub
	}
	
	public Livre(Integer id, String titreLivre, String maisonEditionLivre, Date dateSortieLivre, String auteurLivre,
			int nombrePageLivre, String isbnLivre, Date derniereConsultation, boolean disponibilteLivre) {
		super();
		this.id = id;
		this.titreLivre = titreLivre;
		this.maisonEditionLivre = maisonEditionLivre;
		this.dateSortieLivre = dateSortieLivre;
		this.auteurLivre = auteurLivre;
		this.nombrePageLivre = nombrePageLivre;
		this.isbnLivre = isbnLivre;
		this.derniereConsultation = derniereConsultation;
		this.disponibilteLivre = disponibilteLivre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitreLivre() {
		return titreLivre;
	}

	public void setTitreLivre(String titreLivre) {
		this.titreLivre = titreLivre;
	}

	public String getMaisonEditionLivre() {
		return maisonEditionLivre;
	}

	public void setMaisonEditionLivre(String maisonEditionLivre) {
		this.maisonEditionLivre = maisonEditionLivre;
	}

	public Date getDateSortieLivre() {
		return dateSortieLivre;
	}

	public void setDateSortieLivre(Date dateSortieLivre) {
		this.dateSortieLivre = dateSortieLivre;
	}

	public String getAuteurLivre() {
		return auteurLivre;
	}

	public void setAuteurLivre(String auteurLivre) {
		this.auteurLivre = auteurLivre;
	}

	public int getNombrePageLivre() {
		return nombrePageLivre;
	}

	public void setNombrePageLivre(int nombrePageLivre) {
		this.nombrePageLivre = nombrePageLivre;
	}

	public String getIsbnLivre() {
		return isbnLivre;
	}

	public void setIsbnLivre(String isbnLivre) {
		this.isbnLivre = isbnLivre;
	}

	public Date getDerniereConsultation() {
		return derniereConsultation;
	}

	public void setDerniereConsultation(Date derniereConsultation) {
		this.derniereConsultation = derniereConsultation;
	}

	public boolean isDisponibilteLivre() {
		return disponibilteLivre;
	}

	public void setDisponibilteLivre(boolean disponibilteLivre) {
		this.disponibilteLivre = disponibilteLivre;
	}

	@Temporal(TemporalType.DATE)
	private Date dateSortieLivre;
	
	@Column(name = "AUTEUR",length = 50,nullable = false)
	private String auteurLivre;
	
	@Column(name = "NOMBRE_PAGE",nullable = false)
	private int nombrePageLivre;
	
	@Column(name="ISBN",length = 20,nullable = false,unique = true,updatable = false)
	private String isbnLivre;
	
	@Temporal(TemporalType.TIMESTAMP) @CreationTimestamp
	private Date derniereConsultation;
	
	private boolean disponibilteLivre;
	
	
}
