import java.util.Scanner;

public class class_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.println("==회원가입==");
				System.out.println("ID를 입력해주세요 >> ");
				String id = sc.next();
				System.out.println("PW를 입력해주세요 >> ");
				String pw = sc.next();
			}
			
			if(num==2) {
				System.out.println("==로그인==");
				System.out.println("ID를 입력해주세요 >> ");
				String id = sc.next();
				System.out.println("PW를 입력해주세요 >> ");
				String pw = sc.next();
			}
			
			if(num==3) {
				System.out.println("종료되었습니다.");
			}
			
			
		}
		
		
	}

}
