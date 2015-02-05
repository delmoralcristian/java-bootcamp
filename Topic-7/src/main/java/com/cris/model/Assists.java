package com.cris.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Assists {
	@Id
	@Column
	private int id_course;
	
	@Id
	@Column
	private int id_student;
	
	@Column
	private int partial;
	
	@Column
	private int recuperatorio;
	
	@Column
	private int preFinal;
	
	@Column
	private int finalNote;
	
	
	
	
	public Assists(int id_course, int id_student, int partial,
			int recuperatorio, int preFinal, int finalNote) {
		super();
		this.id_course = id_course;
		this.id_student = id_student;
		this.partial = partial;
		this.recuperatorio = recuperatorio;
		this.preFinal = preFinal;
		this.finalNote = finalNote;
	}
	
	protected Assists(){}
	
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
	}
	public int getId_student() {
		return id_student;
	}
	public void setId_student(int id_student) {
		this.id_student = id_student;
	}
	public int getPartial() {
		return partial;
	}
	public void setPartial(int partial) {
		this.partial = partial;
	}
	public int getRecuperatorio() {
		return recuperatorio;
	}
	public void setRecuperatorio(int recuperatorio) {
		this.recuperatorio = recuperatorio;
	}
	public int getPreFinal() {
		return preFinal;
	}
	public void setPreFinal(int preFinal) {
		this.preFinal = preFinal;
	}
	public int getFinalNote() {
		return finalNote;
	}
	public void setFinalNote(int finalNote) {
		this.finalNote = finalNote;
	}

}
