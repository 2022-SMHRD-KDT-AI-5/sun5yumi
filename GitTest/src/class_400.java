
public class class_400 {

	public static void main(String[] args) {
		System.out.println("=== ������ ��ŷ Ȯ���ϱ� ===");
		
		info dto = new info(id);
		dto = Controller.select(dto);
		System.out.println(dto.getPw() + " / "+ dto.getName());
	
		
	}
	
}
