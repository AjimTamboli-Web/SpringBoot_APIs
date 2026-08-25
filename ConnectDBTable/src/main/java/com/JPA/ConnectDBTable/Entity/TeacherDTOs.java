package com.JPA.ConnectDBTable.Entity;

// create in separate package and use it 
// this is POJO plain old java object
public class TeacherDTOs {
	
	private int id;
	private String name;
	private String mail;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public static TeacherDTOs converter(Teacher teach) {
		TeacherDTOs dto = new TeacherDTOs();
		dto.setId(teach.getId());
		dto.setName(teach.getName());
		dto.setMail(teach.getMail());
		return dto;
	}
	
}
