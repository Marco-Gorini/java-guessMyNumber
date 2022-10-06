package com.soprasteria;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int numberToCheck = r.nextInt(40);
		
		System.out.println("Ho generato un numero casuale.");
		while(true) {
			System.out.println("Prova ad indovinare il numero");
			int numberSelectedByUser = in.nextInt();
			
			if(numberSelectedByUser > numberToCheck) {
				System.out.println("Hai scritto un numero maggiore di quello che ho scelto io");
			}
			else if(numberSelectedByUser < numberToCheck) {
				System.out.println("Hai scritto un numero minore di quello che ho scelto io");
			}
			else {
				System.out.println("Complimenti! Hai indovinato il numero.");
				break;
			}
		}
	}
}
