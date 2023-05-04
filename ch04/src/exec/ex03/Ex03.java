package exec.ex03;

public class Ex03 {

	public static void main(String[] args) {
		
		for ( int i = 0 ; ; i ++ ) {
			if ( i > 10) {
				break;
			}
			if ( i % 2 != 0) {   //  ( i % 2 == 1)  // 둘 다 짝수 나오게 하는 방법
				continue;
			}
			
			System.out.println(i);
		}
	}

}
