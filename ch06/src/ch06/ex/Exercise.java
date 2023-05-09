package ch06.ex;

public class Exercise {

	public static void main(String[] args) {
		
		// 01. 
		// 클래스 내부 4가지 :
		// 클래스 외부 3가지 :
		
		// 02
		class A {
			int m;
			void method() {
				System.out.println("A의 메서드");
			}
		}
		
		// 2-1
		
		A a = new A();
		
		// 2-2
		a.m = 5;
		System.out.println(a.m);
		
		// 2-3
		a.method();
		
		
		// 2-4

	}

}
