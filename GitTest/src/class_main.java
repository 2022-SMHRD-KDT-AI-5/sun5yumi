import java.util.Scanner;

public class class_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("[1]ȸ������ [2]�α��� [3]����");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.println("==ȸ������==");
				System.out.println("ID�� �Է����ּ��� >> ");
				String id = sc.next();
				System.out.println("PW�� �Է����ּ��� >> ");
				String pw = sc.next();
			}
			
			if(num==2) {
				System.out.println("==�α���==");
				System.out.println("ID�� �Է����ּ��� >> ");
				String id = sc.next();
				System.out.println("PW�� �Է����ּ��� >> ");
				String pw = sc.next();
			}
			
			if(num==3) {
				System.out.println("����Ǿ����ϴ�.");
			}
			
			
		}
		
		
	}

}
