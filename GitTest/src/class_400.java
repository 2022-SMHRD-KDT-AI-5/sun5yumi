
public class class_400 {

	public static void main(String[] args) {
		System.out.println("������ ��ŷ Ȯ���ϱ�");
		String id = sc.next();
		
		mem_dto  dto = new mem_dto(id);
		dto = Controller.select(dto);
		System.out.println(dto.getPw() + " / "+ dto.getName());
	
		
	}
	
}
