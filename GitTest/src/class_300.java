
public class class_300 {

	// ����� ���¸� �ľ��ϱ� ���� ���赵
	private String name;
	private String species;
	private int lv;
	private int love;
	private int hp;
	private int sat;
	private int clean;
	
	// 1. ����� ���� ǥ�ÿ� �ʿ��� �÷� �̸� ���ϱ�
	// -> ���̺� ���� 
	
	// 2. �ش� ����� �ʵ�� ����
	
	// 3. �ش� ����鵵 ������ �޼ҵ� �����


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSat() {
		return sat;
	}

	public void setSat(int sat) {
		this.sat = sat;
	}

	public int getClean() {
		return clean;
	}

	public void setClean(int clean) {
		this.clean = clean;
	}
	
	
	public class_300(String name, String species, int lv, int love, int hp, int sat, int clean) {
		this.name = name;
		this.species = species;
		this.lv = lv;
		this.love = love;
		this.hp = hp;
		this.sat = sat;
		this.clean = clean;
	}
	
}
