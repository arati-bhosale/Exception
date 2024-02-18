package com.pro.exception;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = sc.nextInt();

		try {
			if (age < 18) {
				throw new YoungerAgeException("You are not eligible for voting");
			} else {
				System.out.println("you can vote successfully");
			}
		} catch (YoungerAgeException e) {
			e.printStackTrace();
		}
	}

}

class YoungerAgeException extends RuntimeException {

	YoungerAgeException(String msg) {

		super(msg);
	}

}