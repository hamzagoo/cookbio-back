package com.cook.bio.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Evenement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7043356772026379489L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	private String date;

	private String description;

	private String duration;

	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	private List<Participant> participants = new ArrayList<Participant>();

	private String category;

	public Evenement() {

		this.participants = new ArrayList<Participant>();
	}

	public Evenement(Long id, String title, String date, String description, String duration,
			List<Participant> participants, String category) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.description = description;
		this.duration = duration;
		this.participants = participants;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
