package ch05.sec02.ex06;

import java.util.Arrays;

public class MethodsOfString_2 {

	public static void main(String[] args) {
		//#5. 문자열 수정
				//@toLowerCase(), toUpperCase()
				String str1 = "Java Study";
				System.out.println(str1.toLowerCase()); //java study
				System.out.println(str1.toUpperCase()); //JAVA STUDY
				
				//@ replace(,)
				System.out.println(str1.replace("Study", "공부")); //
				
				//@ substring(.)
				System.out.println(str1.substring(0,5)); //Java   ;; 0번째부터 5번째 전까지 출력 ,, 출력값 드래그 해보면 공백까지 포함해서 5번째인'S'전까지 출력
				
				//@ split()
				String[] strArray = "abc/def-ghi jkl".split("/|-| ");    // 결과에 안나온다고 했는데 왜 그런지 못들었음.....
				System.out.println(Arrays.toString(strArray)); //[abc, def, ghi, jkl]
				
				//@ trim()
				System.out.println("   abc   ".trim());
				
				System.out.println();
				
				//#6. 문자열의 내용 비교 (equals(), equalsIgnoreCase())
				String str2 = new String("Java");
				String str3 = new String("Java");
				String str4 = new String("java");
				
				
				////////////////////////////////////////////////////////////////
				
				
				//@ stack 메모리 비교 (==)
				System.out.println(str2 == str3); //false
				System.out.println(str3 == str4); //false
				System.out.println(str4 == str2); //false
				
				//@ equals(), equalsIgnoreCase() : 내용비교
				System.out.println(str2.equals(str3)); //true     // 같은 문자열이냐
				System.out.println(str3.equals(str4)); //false	  // 내용은 같은데 객체 비교라 객체는 다름.
				System.out.println(str3.equalsIgnoreCase(str4)); //true		// 대소문자 무시하고 비교해라
			}
	

	}


