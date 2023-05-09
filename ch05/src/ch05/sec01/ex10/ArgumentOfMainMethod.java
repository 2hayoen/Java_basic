package ch05.sec01.ex10;

import java.util.Arrays;

public class ArgumentOfMainMethod {
	public static void main(String[] args) {
		
		// args 배열의 길이 구하기    p.186
		System.out.println(args.length + "\n");
		// System.out.println();    // 윗 줄의 \n 으로 대체 !!
		
		//  Run리본메뉴 + cmd 에서 하는 법 배움!
		
		// 교재 예제 살짝 변형함 ! 
		
		System.out.println(Arrays.toString(args) + "\n");
		
		for ( int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		
		for ( String arg : args ) {
			System.out.print(arg + " - ");
		}
		
		}
		
		
		
		
		
}

