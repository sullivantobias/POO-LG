package game;

class Warrior extends Person {
	
	public Warrior (String pseudo, int age) {
		super (pseudo,  age);
		this.setRace("Warrior"); 
	}
	
	public void fight () {
		if (this.weapons.equals("Sword")) {
			System.out.println("I can use that");
		} 
	}
	
	
	
}