package work1;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public String getName(){

		return name;
	}
	public void setName(String name) {
		try {
			this.name = name;
			if (name.length()<3) {
				throw new IllegalArgumentException();
			}
			}
			catch(IllegalArgumentException ex) {
				System.out.println("名前は三文字以上のにしてください");
			}
	}
	Wand wand=new Wand();
	void heal(Wizard w) {
		int basePoint=10;
		int recovePoint=(int)(basePoint*this.wand.power());

	}
}
