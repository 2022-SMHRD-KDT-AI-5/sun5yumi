import java.util.Scanner;

public class class_300 {
	controller Controller = new controller();
	Scanner sc = new Scanner(System.in);
	info in = new info();
	
	public void menu() {
		System.out.println("메뉴: [1]고양이 상태 확인 [2]나의 고양이 애정도 확인 [3]게임 종료");
		int num = sc.nextInt();
//상태 확인
		if(num == 1) {
		System.out.println("=== 상태 확인하기 ===");
		System.out.println("고양이 이름: "+in.getId()+"("+in.getLv()+") 종류:"+in.getSpecies() );
		System.out.println("애정도: "+in.getLove()+"체력: "+in.getHp()+"청결도: "+in.getClean()+"포만감: "+ in.getSat());}
//랭킹 확인
		else if(num==2) {
		System.out.println("=== 랭킹 확인하기 ===");
		System.out.println("나의 고양이 랭킹"+"");
		System.out.println("고양이 이름: "+in.getId()+"("+in.getLv()+") 종류:"+in.getSpecies()+"애정도: "+in.getLove());}
//게임 종료
		else if(num==3) {
		System.out.println("고양이 안녕");
		}
	}
}