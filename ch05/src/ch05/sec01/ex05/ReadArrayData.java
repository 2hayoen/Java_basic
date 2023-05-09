package ch05.sec01.ex05;

import java.util.Arrays;

public class ReadArrayData {

	public static void main(String[] args) {
		
		// 배열 선언
		int [] array = new int [] {3, 4, 5, 6, 7};
		
		// 배열의 길이 구하기
		System.out.println(array.length);
		
		// 출력하기 1
		System.out.println(array[0] + " ");
		System.out.println(array[1] + " ");
		System.out.println(array[2] + " ");
		System.out.println(array[3] + " ");
		System.out.println(array[4] + " ");
		System.out.println();
		
		// 출력하기 2
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i] + " ");
		System.out.println();
		
		// 출력하기 3
		// for(꺼낸 하나의 원소를 저장할수있는 변수:집합객체) {} for each 구문
		for ( int k : array ) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 출력하기 4
		System.out.println(Arrays.toString(array));
	}

}
