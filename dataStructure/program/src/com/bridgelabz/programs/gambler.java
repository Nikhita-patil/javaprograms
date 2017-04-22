package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class gambler {
	public static void main(String[] args) {
		 Utility u1=new Utility();
		System.out.println("enter the stake u have bet for");
		Scanner sc = new Scanner(System.in);
		int stake = sc.nextInt();

		System.out.println("enter the goal u have set\n");
		int goal = sc.nextInt();

		System.out.println("enter the number of trials\n");
		int trials = sc.nextInt();
		int loss = 0;
		int win = 0;
		int bets = 0;
		for (int t = 0; t < trials; t++) {

			if (stake > 0 || stake < goal) {

				if (Math.random() < 0.5) {
					loss++;
					stake--;
					System.out.println("display the stack if we win" + stake);
				} else {
					win++;
					stake++;
					System.out.println("display the stack if we loss" + stake);
				}
			}
			u1.stake1(stake,goal,trials);

		}}}

