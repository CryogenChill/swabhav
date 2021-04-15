package com.techlab.game;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int turns = 1;

	    boolean game = true;
	    boolean isTurn = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to PIG! (r/h)");
		char choice = sc.next().charAt(0);
		Random rand = new Random();
		int roll = rand.nextInt(5) + 1;
		while(game) {
		    int score = 0;
			while(isTurn) {
			    int tempScore = 0;
				while(choice=='r') {
					roll = rand.nextInt(5) + 1;
					if(roll==1) {
						System.out.println("You rolled 1, turn over");
						tempScore=0;
						break;
					} else {
						tempScore=tempScore+roll;
						System.out.println("You rolled "+roll+" roll again? (r/h)");
						choice = sc.next().charAt(0);
					}
				}
				score=score+tempScore;
				turns=turns+1;
				System.out.println("your score till now is "+score);
				if(score>=21) {
					break;
				}
				System.out.println("next turn? y to proceed");
				choice = sc.next().charAt(0);
				isTurn=(choice=='y');
				System.out.println("roll again? (r/h)");
				choice = sc.next().charAt(0);
			}
			System.out.println("You finished in "+ turns +"turns");
			System.out.println("If you want to Continue -> enter y. anything else to exit");
			choice = sc.next().charAt(0);
			game=(choice=='y');
		}
		
	}

}
