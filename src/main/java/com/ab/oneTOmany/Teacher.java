package com.ab.oneTOmany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int teacherId;
	private String teacherName;
	private String subject;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int teacherId, String teacherName, String subject) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.subject = subject;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", subject=" + subject + "]";
	}
	
}//Teacher
