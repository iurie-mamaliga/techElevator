package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;

	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public int getPossibleMarks() {
		return this.possibleMarks;
	}

	public int getTotalMarks() {
		return this.totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
		if (this.totalMarks > 90) {
			this.letterGrade = "A";
		} else if (this.totalMarks > 80 && this.totalMarks <= 89) {
			this.letterGrade = "B";
		} else if (this.totalMarks > 70 && this.totalMarks <= 79) {
			this.letterGrade = "C";
		} else if (this.totalMarks > 60 && this.totalMarks <= 69) {
			this.letterGrade = "D";
		} else {
			this.letterGrade = "F";
		}
	}

	public String getSubmitterName() {
		return this.submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public String getLetterGrade() {
		return this.letterGrade;
	}
}