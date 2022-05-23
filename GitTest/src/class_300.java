
public class class_300 {

	// 고양이 상태를 파악하기 위한 설계도
	private String name;
	private String species;
	private int lv;
	private int love;
	private int hp;
	private int sat;
	private int clean;
	
	// 1. 고양이 상태 표시에 필요한 컬럼 이름 정하기
	// -> 테이블 명세서 
	
	// 2. 해당 내용들 필드로 지정
	
	// 3. 해당 내용들도 생성자 메소드 만들기


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
