package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		
		// 練習問題１
		
		final double TAX = 1.1;
		System.out.println(TAX);
		
		
		// 練習問題２
		
		int x = 480;
		double i = x * TAX;
		int price = (int)i;
		System.out.println(price);
		
		
		// 練習問題３
		
		String name = "藤田裕";
		System.out.println(name);
		
		
		// 練習問題４
		
		String text1 = "この商品の値段は";
		String text2 = "円です";
		System.out.println(text1 + price + text2);
	}
}
