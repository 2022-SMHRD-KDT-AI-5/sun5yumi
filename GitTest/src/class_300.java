import java.util.Scanner;

public class class_300 {
	controller Controller = new controller();
	Scanner sc = new Scanner(System.in);
	info in = new info();
	
	public void menu() {
		System.out.println("�޴�: [1]����� ���� Ȯ�� [2]���� ����� ������ Ȯ�� [3]���� ����");
		int num = sc.nextInt();
//���� Ȯ��
		if(num == 1) {
		System.out.println("=== ���� Ȯ���ϱ� ===");
		System.out.println("����� �̸�: "+in.getId()+"("+in.getLv()+") ����:"+in.getSpecies() );
		System.out.println("������: "+in.getLove()+"ü��: "+in.getHp()+"û�ᵵ: "+in.getClean()+"������: "+ in.getSat());}
//��ŷ Ȯ��
		else if(num==2) {
		System.out.println("=== ��ŷ Ȯ���ϱ� ===");
		System.out.println("���� ����� ��ŷ"+"");
		System.out.println("����� �̸�: "+in.getId()+"("+in.getLv()+") ����:"+in.getSpecies()+"������: "+in.getLove());}
//���� ����
		else if(num==3) {
		System.out.println("����� �ȳ�");
		}
	}
}