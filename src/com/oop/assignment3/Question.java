package com.oop.assignment3;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Question[] trivia = new Question[10];
		mainmenu(trivia);
		System.out.println("Enter Name : Player 1: ");
		String p1 = in.nextLine();
		int scorePlayer1 = player1(trivia, p1);
		System.out.println(p1 + " your score is : " + scorePlayer1);
		System.out.println("Enter Name : Player 2: ");
		String p2 = in.nextLine();
		int scorePlayer2 = player2(trivia, p2);
		System.out.println(p2 + " your score is : " + scorePlayer2);
		int maxScore = findWinner(scorePlayer1, scorePlayer2);
		if (maxScore == scorePlayer1 && maxScore == scorePlayer2) {
			System.out.println("\t\t\t" + ANSI_GREEN + "Draw" + "," + " with score of " + maxScore + ANSI_RESET);
		} else if (maxScore == scorePlayer1) {
			System.out.println("\t\t\t" + ANSI_GREEN + "Winner" + "," + p1 + " with score of " + maxScore + ANSI_RESET);
		} else {
			System.out.println("\t\t\t" + ANSI_GREEN + "Winner" + "," + p2 + " with score of " + maxScore + ANSI_RESET);
		}

	}

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001b[32m";
	public static final String ANSI_RED = "\u001b[31m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public final static Scanner in = new Scanner(System.in);

	String questionName;
	String answerOne;
	String answerTwo;
	String answerThree;
	String answerFour;
	String correctAnswer;

	public Question(String questionName, String answerOne, String answerTwo, String answerThree, String answerFour,
			String correctAnswer) {
		this.questionName = questionName;
		this.answerOne = answerOne;
		this.answerTwo = answerTwo;
		this.answerThree = answerThree;
		this.answerFour = answerFour;
		this.correctAnswer = correctAnswer;

	}

	private static int findWinner(int scorePlayer1, int scorePlayer2) {
		int maxScore = 0;
		if (scorePlayer1 > scorePlayer2) {
			maxScore = scorePlayer1;
		} else {
			maxScore = scorePlayer2;

		}
		return maxScore;

	}

	private static void mainmenu(Question trivia[]) {

		trivia[0] = new Question(
				"Which Set class should be most popular in a multi-threading environment, considering performance constraint?",
				"A.HashSet", "B.ConcurrentSkipListSet", "C.LinkedHashSet", "D.CopyOnWriteArraySet", "B");
		trivia[1] = new Question("Which allows the removal of elements from a collection?", "A.Enumeration",
				"B.Iterator", "C.Both", "D. None of the above", "D");
		trivia[2] = new Question("The Comparator interface contains the method?", "A.compareWith", "B.compareTo()",
				"C.compare()", "D.compareWith", "D");
		trivia[3] = new Question("is array is pass by value or reference in java?", "A.Yes", "B.No", "C.A and B",
				"D.May be", "B");
		trivia[4] = new Question("JVM stand for", "A.Java virtual machine", "B.java visit machine",
				"C.java view machine", "D.java virtual mechanism ", "A");
		trivia[5] = new Question("How do you determine the number of elements in an array?", "A.length", "B.length()",
				"C.size", "D.size()", "A");
		trivia[6] = new Question("How many of the following are legal declarations?", "A.float[] f = new float[10];",
				"B.float[] tiger = new float[1];", "C.float[] bear = new[] float;", "D.float[] cat = new[1] float;",
				"A");
		trivia[7] = new Question(
				"Which type of loop is best known for its boolean condition that controls entry to the loop?",
				"A.do-while loop", "B.for (traditional)", "C.for-each", "D.while", "D");
		trivia[8] = new Question("Which type of loop is best known for using an index or counter?", "A.do-while loop",
				"B.for (traditional)", "C.for-each", "D.while", "B");
		trivia[9] = new Question(
				"What keyword is used to end the current loop iteration and proceed execution with the next iteration of that loop?",
				"A.break", "B.continue", "C.end", "D.skip", "B");

	}

	private static int player1(Question trivia[], String p1) {
		System.out.println("\t\t" + ANSI_PURPLE + "Welcome " + p1 + ANSI_RESET);
		String answerOfPlayer1 = null;
		int scorePlayer1 = 0;
		int i = 0;
		for (i = 0; i < trivia.length / 2; i++) {
			try {

				System.out.println(
						trivia[i].getQuestionName() + "\n" + trivia[i].getAnswerOne() + "\n" + trivia[i].getAnswerTwo()
								+ "\n" + trivia[i].getAnswerThree() + "\n" + trivia[i].getAnswerFour());
				answerOfPlayer1 = in.nextLine();
				if (answerOfPlayer1.equalsIgnoreCase("A") || answerOfPlayer1.equalsIgnoreCase("B")
						|| answerOfPlayer1.equalsIgnoreCase("C") || answerOfPlayer1.equalsIgnoreCase("D")) {
					System.out.println("kk");
					if (answerOfPlayer1.equalsIgnoreCase(trivia[i].getCorrectAnswer())) {
						System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
						scorePlayer1 += 10;
					} else {
						System.out.println(ANSI_RED + "Wrong" + ANSI_RESET);
					}

				} else {
					throw new IllegalArgumentException("Not valid choice");
				}
				i++;
			} catch (IllegalArgumentException e) {
				System.out.println(e);
				continue;
			}
		}
		return scorePlayer1;
	}

	private static int player2(Question trivia[], String p2) {
		System.out.println("\t\t" + ANSI_PURPLE + "Welcome " + p2 + ANSI_RESET);
		String answerOfPlayer2 = null;
		int scorePlayer2 = 0;
		int i = 0;
		for (i = trivia.length / 2; i < trivia.length;) {
			try {

				System.out.println(
						trivia[i].getQuestionName() + "\n" + trivia[i].getAnswerOne() + "\n" + trivia[i].getAnswerTwo()
								+ "\n" + trivia[i].getAnswerThree() + "\n" + trivia[i].getAnswerFour());
				answerOfPlayer2 = in.nextLine();
				if (answerOfPlayer2.equalsIgnoreCase("A") || answerOfPlayer2.equalsIgnoreCase("B")
						|| answerOfPlayer2.equalsIgnoreCase("C") || answerOfPlayer2.equalsIgnoreCase("D")) {
					if (answerOfPlayer2.equalsIgnoreCase(trivia[i].getCorrectAnswer())) {
						System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
						scorePlayer2 += 10;
					} else {
						System.out.println(ANSI_RED + "Wrong" + ANSI_RESET);
					}

				} else {

					throw new IllegalArgumentException("Not valid choice");
				}
				i++;
			} catch (IllegalArgumentException e) {
				System.out.println(e);
			}
		}
		return scorePlayer2;
	}

	private String getQuestionName() {
		return questionName;
	}

	private void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	private String getAnswerOne() {
		return answerOne;
	}

	private void setAnswerOne(String answerOne) {
		this.answerOne = answerOne;
	}

	private String getAnswerTwo() {
		return answerTwo;
	}

	private void setAnswerTwo(String answerTwo) {
		this.answerTwo = answerTwo;
	}

	private String getAnswerThree() {
		return answerThree;
	}

	private void setAnswerThree(String answerThree) {
		this.answerThree = answerThree;
	}

	private String getAnswerFour() {
		return answerFour;
	}

	private void setAnswerFour(String answerFour) {
		this.answerFour = answerFour;
	}

	private String getCorrectAnswer() {
		return correctAnswer;
	}

	private void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

}
