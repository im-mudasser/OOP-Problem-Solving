package com.oop.assignment5.Question4;

public class Officer extends Staff {
	private String rank;
	private String grade;

	public Officer() {
		rank = null;
		grade = null;
	}

	public Officer(String rank, String grade) {
		this.rank = rank;
		this.grade = grade;
	}

	public Officer(String name, String rank, String grade) {
		super(name);
		this.rank = rank;
		this.grade = grade;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String toString() {
		return super.toString() + "rank=" + rank + ",grade=" + grade;
	}

}
