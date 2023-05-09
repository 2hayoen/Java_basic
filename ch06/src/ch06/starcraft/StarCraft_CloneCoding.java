package ch06.starcraft;

import javax.swing.DebugGraphics;

public class StarCraft_CloneCoding {

	public static void main(String[] args) {
		
		// 1. 마린 유닛의 정보 출력하기
		// 그냥 선언
//		int marineHp = 40;
//		int marineAtk = 6;
//		int marineDef = 0;
//		String marineWeapon = "가우스 소총";
//		
//		System.out.println("마린#1");
//		System.out.println("  마린 생명력: " + marineHp);
//		System.out.println("  마린 공격력: " + marineAtk);
//		System.out.println("  마린 방어력: " + marineDef);
//		System.out.println("  마린 사용 무기: " + marineWeapon);
		
		// 여러마리 생성하려면 ~ 배열로 만들기
		
		//  마린 1~5 생성
//		int [] marineHps = new int [5] ;
//		int [] marineAtks = new int [5];
//		int []marineDefs = new int[5];
//		String marineWeapon = "가우스 소총";
		
		int numofmarines = 5;
		int [] marineHps = new int [numofmarines] ;
		int [] marineAtks = new int [numofmarines];
		int []marineDefs = new int[numofmarines];
		String marineWeapon = "가우스 소총";
		
		// 마린 정보
		initUnits(marineHps, 40, marineAtks, 6, marineDefs, 0);
		
		// 배열로 만들기
		
//		for (int i = 0; i < marineHps.length ; i++ ) {
//			marineHps[i] = 40;
//			marineAtks[i] = 6;
//			marineDefs[i] = 0;
		
		
		reportUnits("마린", marineHps, marineAtks, marineDefs, marineWeapon);
//		for (int i =0; i < marineAtks.length ; i++ ) {
//			System.out.println("마린#" + (i+1) + "\n" );
//			System.out.println("  마린 생명력: " + marineHps[i]);
//			System.out.println("  마린 공격력: " + marineAtks[i]);
//			System.out.println("  마린 방어력: " + marineDefs[i]);
//			System.out.println("  마린 사용 무기: " + marineWeapon + "\n");
		
		
		// 저글링 만들기...!!!!!!
		int numofZergling = 1;
		int [] ZerglingHps = new int [numofZergling] ;
		int [] ZerglingAtks = new int [numofZergling];
		int []ZerglingDefs = new int[numofZergling];
		String ZerglingWeapon = "발톱";
		
		initUnits(ZerglingHps, 35, ZerglingAtks, 5, ZerglingDefs, 0);
		
		reportUnits( "저글링", ZerglingHps, ZerglingAtks, ZerglingDefs, ZerglingWeapon );
		// 배열로 만들기
		
//		for (int i = 0; i < marineHps.length ; i++ ) {
//			ZerglingHps[i] = 40;
//			ZerglingAtks[i] = 6;
//			ZerglingDefs[i] = 0;
//		}
//		
//		for (int i =0; i < marineAtks.length ; i++ ) {
//			System.out.println("마린#" + (i+1) + "\n" );
//			System.out.println("  마린 생명력: " + ZerglingHps[i]);
//			System.out.println("  마린 공격력: " + ZerglingAtks[i]);
//			System.out.println("  마린 방어력: " + ZerglingDefs[i]);
//			System.out.println("  마린 사용 무기: " + ZerglingWeapon + "\n");
		
	}
		
	public static void initUnits (int[] hps, int hp, int[] atks, int atk, int[] defs, int def) {
		for (int i = 0; i < hps.length ; i++ ) {
			hps[i] = hp;
			atks[i] = atk;
			defs[i] = def;
		
		}
	}
	
	static void reportUnits(String name, int[] hps, int[] atks, int[] defs, String weapon) {
		for (int i =0; i < hps.length ; i++ ) {
			System.out.println(name + "#" + (i+1) + ":" );
			System.out.println("   "+ name +"생명력: " + hps[i]);
			System.out.println("   "+ name +" 공격력: " + atks[i]);
			System.out.println("   "+ name +" 방어력: " + defs[i]);
			System.out.println("   "+ name +" 사용 무기: " + weapon + "\n");
	
		}
	}	
	
	static int attack (int atk, int defHp, int def) {
		return defHp + def - atk ;
	}
	
	static void attack(int[] atks, int attacker, int[] defHps, int[] defs , int defender) {
		defHps[defender] += defs[defender] - atks[attacker];
	}
}


// 공격 받은 후의 변화 보여주는 코드도 작성하기..!!!! +++ 주석처리한 코드들 정리하서 따로 빼고 최종 코드만 또 따로 정리해욥..!


