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
				System.out.println("고양이의 이름을 정해주세요! >> ");
				String cat_name = sc.next();
				System.out.println("cat 종류를 선택해주세요 >>");
				System.out.println("[1] 코리안쇼트 기본 애정도:10 체력:10 포만감:15 청결도:-20 ");
				System.out.println("[2]페르시안 기본 애정도: 10, 체력:20, 포만감:20, 청결도:-30");
				String cat_species = sc.next();
				
				con.insert(id, pw, cat_name, cat_species);
			}
		}
		
		
	}

}
