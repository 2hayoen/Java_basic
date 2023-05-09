package ch05.sec02.ex05;

public class MethodsOfString_1 {

	public static void main(String[] args) {
		//p.99 String 클래스의 주요 메서드 1 실습
		
		String[] str1 =  { "Hello Java"  } ;     // 배열 아님으로 글자 수가 아닌 요소 갯수인 '1'이 출력됨.
		String str2 = "안녕하세요! 반갑습니다." ;
		System.out.println(str1.length);
		System.out.println(str1[0].length());
		System.out.println(str2.length());
		System.out.println();
		
		System.out.println(str1[0].charAt(1));
		System.out.println(str2.charAt(1));
		System.out.println();
		
		System.out.println(str1[0].indexOf('a'));
		System.out.println(str1[0].lastIndexOf('a'));
		System.out.println();
		
		System.out.println(str1[0].indexOf('a', 8));
		System.out.println(str1[0].lastIndexOf('a', 8));
		System.out.println();
		
		System.out.println(str1[0].indexOf("Java"));
		System.out.println(str1[0].indexOf("java"));   // -1 출력. 값안에 없으면 마이너스 값이 나옴
		System.out.println(str1[0].lastIndexOf("Java"));
		System.out.println();
		
		System.out.println(str2.indexOf(("하세요")));
		System.out.println(str2.lastIndexOf("하세요"));
		
		// 31번째 줄까지..
		// 32번째 줄부터 !!
		
		
		
	}

}
