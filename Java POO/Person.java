package game;

abstract class Person {
	
	protected String pseudo,  race, weapons = "";
	protected boolean heal = false;
	protected int age;
	
	public Person (String pseudo, int age ) {
		this.pseudo = pseudo;
		this.age =  age;
	}
	
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void yield() {
		System.out.println("i'm yeling like a "+this.getRace());
	}
	public void walk() {		
		System.out.println("i'm walking like a "+this.getRace());
	}
	
	public void info () {
		System.out.println("My race is  : "+this.getRace()+""
				+ ", my pseudo: "+this.getPseudo()+""
				+ ", my age : "+this.getAge());
	}
	
	
	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}
	
	
	public void setHeal (Boolean heal) {
		this.heal = heal;
	}
	
	public void fight () {
		System.out.println("I can't fight");
	}
	
	public void heal () {
		System.out.println("I can't heal");
	}
	
	
	

}
