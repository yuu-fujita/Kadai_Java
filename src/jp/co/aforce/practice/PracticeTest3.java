package jp.co.aforce.practice;

import java.util.LinkedList;

public class PracticeTest3 {
	public static void main(String[] args) {
		
		// 練習問題１
		
		String[]statis = {"シャープペンシル","ボールペン","リングノート","クリップ","消しゴム"};
		
		
		// 練習問題２
		
		System.out.println(statis[4]);
		
		
		// 練習問題３
		
		LinkedList<String> members = new LinkedList<>();
		
		members.add("山田太郎");
		members.add("鈴木花子");
		members.add("佐藤二郎");
		members.add("山田太郎");
		members.add("高橋三郎");
		
		
		// 練習問題４
		
		System.out.println(members.get(2));

	}

}
