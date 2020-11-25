package work1;

public class Cleric {
	String name;
	final static int hpMax=50;
	int hp=50;
	final static int mpMax=10;
	int mp=10;
	
	Cleric(String name,int hp,int mp){
		this.name =name;
		this.hp=hp;
		this.mp=mp;
	}
	
	Cleric(String name,int hp){
		
	}
	
	Cleric(String name){
		
	}
	
	Cleric(){
		
	}
	
	
	
	public void selfAid() {
		if(mp>=5) {
			this.mp=mp-5;
			this.hp=hpMax;
		}
		
	}
	
	public int pray(int sec) {
		int num=new java.util.Random().nextInt(3);
		this.mp=(int) Math.min(mpMax, mp+num+sec);
		return mp;
	}
	
}
