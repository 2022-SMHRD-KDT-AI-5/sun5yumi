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
				System.out.println("������� �̸��� �����ּ���! >> ");
				String cat_name = sc.next();
				System.out.println("cat ������ �������ּ��� >>");
				System.out.println("[1] �ڸ��ȼ�Ʈ �⺻ ������:10 ü��:10 ������:15 û�ᵵ:-20 ");
				System.out.println("[2]�丣�þ� �⺻ ������: 10, ü��:20, ������:20, û�ᵵ:-30");
				String cat_species = sc.next();
				
				con.insert(id, pw, cat_name, cat_species);
			}
		}
		
		
	}

}
