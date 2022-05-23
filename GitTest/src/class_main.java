import java.util.Scanner;

public class class_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		controller con = new controller();
		
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.println("==회원가입==");
				System.out.println("ID를 입력해주세요 >> ");
				String id = sc.next();
				System.out.println("PW를 입력해주세요 >> ");
				String pw = sc.next();
				System.out.println("cat name을 입력해주세요 >> ");
				String cat_name = sc.next();
				System.out.println("cat 종류를 입력해주세요 >>");
				String cat_species = sc.next();
				
				con.insert(id, pw, cat_name, cat_species);
				
				
			}
			
			if(num==2) {
				System.out.println("==로그인==");
//				System.out.println("ID를 입력해주세요 >> ");
//				String id = sc.next();
//				System.out.println("PW를 입력해주세요 >> ");
//				String pw = sc.next();
			
				class_300 c3 = new class_300(null, null, num, num, num, num, num);
			}
			
			if(num==3) {
				System.out.println("종료되었습니다.");
			}
			
			
		}
		
		
	}

}
