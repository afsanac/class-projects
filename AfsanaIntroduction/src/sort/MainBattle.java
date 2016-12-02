package sort;

public class MainBattle {
	
	public static void main (String[] args){
		
		Pokemon raticate = new Pokemon("Raticate",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		raticate.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Raticate is preparing to attack with super fang");
		radicate.attack(bulbasaur, new Attack(){
			
			public void attack(Pokemon target){
				System.out.println("Super Fang is used!");
				int newHP = target.getHP() / 2;
				target.setHP(newHP);
			}
		});
			
		//create a way for raticate and bulbasaur to attack
		raticate.lapse();
		bulbasaur.lapse();
		printScore(raticate, bulbasaur);
	}
}
