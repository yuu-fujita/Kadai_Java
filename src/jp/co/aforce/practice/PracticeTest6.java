package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {
		
		//練習問題１
		
		Random random = new Random();
		int fortune = random.nextInt(4);
		
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		
		//練習問題２
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 7 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println(" ");
		
		
		//練習問題３
		
		System.out.println(" ");
		
		for(int n = 1; n <= 9; n++) {
			for(int m = 1; m <= 9; m++) {
				int kuku = n * m;
				System.out.print(kuku + " ");
			}
		System.out.println(" ");
			
		}
	}
}
