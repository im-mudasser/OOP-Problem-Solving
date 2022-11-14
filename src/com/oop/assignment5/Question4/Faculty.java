package com.oop.assignment5.Question4;

public class Faculty extends Staff {
	private String department;
	private String researchArea;
	private String subjectTaken;

	public Faculty() {
		department = null;
		researchArea = null;
		subjectTaken = null;
	}

	public Faculty(String department, String researchArea, String subjectTaken) {
		this.department = department;
		this.researchArea = researchArea;
		this.subjectTaken = subjectTaken;
	}

	public Faculty(String name, String departement, String researchArea, String subjectTaken) {
		super(name);
		this.department = departement;
		this.researchArea = researchArea;
		this.subjectTaken = subjectTaken;
	}

	public String getDepartement() {
		return department;
	}

	public void setDepartement(String departement) {
		this.department = departement;
	}

	public String getResearchArea() {
		return researchArea;
	}

	public void setResearchArea(String researchArea) {
		this.researchArea = researchArea;
	}

	public String getSubjectTaken() {
		return subjectTaken;
	}

	public void setSubjectTaken(String subjectTaken) {
		this.subjectTaken = subjectTaken;
	}

	@Override
	public String toString() {
		return super.toString() + "department=" + department + ",subjecttaken=" + subjectTaken + ",researchArea="
				+ researchArea;
	}

}
