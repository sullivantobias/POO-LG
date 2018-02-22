package game;

class Healer extends Person{

	public Healer (String pseudo, int age) {
		super (pseudo, age);
		this.setRace("Healer");
	}	
	
	public void heal () {
		if (this.heal == true) {
			System.out.println("I'll use this medikit");
		}
	}
	
}
