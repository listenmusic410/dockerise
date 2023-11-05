package com.dockerise.dockerise.model;

import java.io.Serializable;




public class personBean implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String surname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 * @param name
	 * @param surname
	 */
	public personBean(int id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	public personBean() {}
	@Override
	public String toString() {
		return "personBean [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
	

}
