import java.util.Scanner;

public class class_500 {
	
	controller con = new controller();
	
		// ����� Ű��� 
	
		info in = new info();
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String condition;
		public void action() {
			while(true) {
		System.out.println("����̱�[1], ����[2], ����[3], ����ֱ�[4], ����[5], �ʱ�ȭ[6]");
		choice = sc.nextInt();
		
		if(choice ==1) {
			Cook();
			System.out.println();
		}else if(choice == 2) {
			Snack();
			System.out.println();
		}else if(choice == 3) {
			Sleep();
			System.out.println();
		}else if(choice == 4) {
			Play();
			System.out.println();
		}else if(choice == 5) {
			Shower();
			System.out.println();
		}else{
			System.out.println("�߸� �Է� �ϼ̽��ϴ�. ");
		}
	}		
}
	public void Cook() {	
		
			in.setLove(15);
			in.setSat(50);
			in.setClean(-10);
			in.setHp(15);
			System.out.println("���� ���ְ� �ȳ� �Ծ����ϴ�!!");
	}	
	public void Snack() {	
			in.setLove(25);
			in.setSat(5);
			in.setClean(-10);
			in.setHp(10);
			System.out.println("������ ���󿡼� ���� ���־��~!");
	}
	public void Sleep() {
			in.setLove(10);
			in.setSat(-10);
			in.setClean(-10);
			in.setHp(30);
			System.out.println();
	}
	public void Play() {
			in.setLove(25);
			in.setSat(-10);
			in.setClean(-10);
			in.setHp(-10);
	}
	public void Shower() {
		
			in.setLove(-10);
			in.setSat(-10);
			in.setClean(30);
			in.setHp(-15);
			
		}
		
			
	
}

