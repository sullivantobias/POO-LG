package game;

 class Thief extends Person {
		
	public Thief (String pseudo, int age) {
		super (pseudo, age);
		this.setRace("Thief");
	}	
	
	public void fight () {
		if (this.weapons.equals("Dagger")) {
			System.out.println("I can use that");
		} 
	}
}
