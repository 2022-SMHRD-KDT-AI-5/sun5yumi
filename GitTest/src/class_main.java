import java.util.Scanner;

public class class_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		controller con = new controller();
		
		while(true) {
			System.out.print("[1]ȸ������ [2]�α��� [3]����");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.println("==ȸ������==");
				System.out.println("ID�� �Է����ּ��� >> ");
				String id = sc.next();
				System.out.println("PW�� �Է����ּ��� >> ");
				String pw = sc.next();
				System.out.println("cat name�� �Է����ּ��� >> ");
				String cat_name = sc.next();
				System.out.println("cat ������ �Է����ּ��� >>");
				String cat_species = sc.next();
				
				con.insert(id, pw, cat_name, cat_species);
				
				
			}
			
			if(num==2) {
				System.out.println("==�α���==");
//				System.out.println("ID�� �Է����ּ��� >> ");
//				String id = sc.next();
//				System.out.println("PW�� �Է����ּ��� >> ");
//				String pw = sc.next();
			
				class_300 c3 = new class_300(null, null, num, num, num, num, num);
			}
			
			if(num==3) {
				System.out.println("����Ǿ����ϴ�.");
			}
			
			
		}
		
		
	}

}
