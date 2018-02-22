package game;

public class Game {

	public static void main(String[] args) {
		
		Person[] people = { new Warrior ("Brosh", 22), new Thief ("BackStabber", 32), new Healer ("Healish", 45)};
		String[] weapons = { "Sword" , "Dagger", "Sword" };
		
		for (int i = 0; i < people.length ; i++) {
			System.out.println("<--------------------------------------->");
			System.out.println("Instance for : "+people[i].getClass().getName());
			
			people[i].yield();
			people[i].walk();
			people[i].info();
			people[i].setWeapons(weapons[i]);
			people[i].fight();
			people[i].setHeal(true);
			people[i].heal();
			
		}
		
	}		

}
