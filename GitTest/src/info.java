
public class info {

		// 회원정보 필드
		private String id;
		private String pw;
		
		public info() {
			
		}
		
		public info(String id, String pw, String species, int love, int hp, int clean, int sat, String name, int lv,
				String p_id, int cook, int snack, int sleep, int play, int shower) {
			super();
			this.id = id;
			this.pw = pw;
			this.species = species;
			this.love = love;
			this.hp = hp;
			this.clean = clean;
			this.sat = sat;
			this.name = name;
			this.lv = lv;
			this.p_id = p_id;
			this.cook = cook;
			this.snack = snack;
			this.sleep = sleep;
			this.play = play;
			this.shower = shower;
		}
		//고양이 초기값 필드
		private String species;
		private int love;
		private int hp;
		private int clean;
		private int sat;
		
		//고양이 정보 필드
		private String name;
		private int lv;
		private String p_id;
		
		//고양이 키우기 필드
		private int cook;
		private int snack;
		private int sleep;
		private int play;
		private int shower;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPw() {
			return pw;
		}
		public void setPw(String pw) {
			this.pw = pw;
		}
		public String getSpecies() {
			return species;
		}
		public void setSpecies(String species) {
			this.species = species;
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
		public int getClean() {
			return clean;
		}
		public void setClean(int clean) {
			this.clean = clean;
		}
		public int getSat() {
			return sat;
		}
		public void setSat(int sat) {
			this.sat = sat;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getLv() {
			return lv;
		}
		public void setLv(int lv) {
			this.lv = lv;
		}
		public String getP_id() {
			return p_id;
		}
		public void setP_id(String p_id) {
			this.p_id = p_id;
		}
		public int getCook() {
			return cook;
		}
		public void setCook(int cook) {
			this.cook = cook;
		}
		public int getSnack() {
			return snack;
		}
		public void setSnack(int snack) {
			this.snack = snack;
		}
		public int getSleep() {
			return sleep;
		}
		public void setSleep(int sleep) {
			this.sleep = sleep;
		}
		public int getPlay() {
			return play;
		}
		public void setPlay(int play) {
			this.play = play;
		}
		public int getShower() {
			return shower;
		}
		public void setShower(int shower) {
			this.shower = shower;
		}
}

