package exec.ex01;

public class Ex02 {

	public static void main(String[] args) {
		
		int score = 72;
		
		switch (score / 10) {
		case 10 :
		case 9 :
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
				System.out.println("F");
		
		}
		

	}

}
