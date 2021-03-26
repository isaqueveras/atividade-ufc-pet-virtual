package Pets;

public class TestPet {
	public static void main(String[] args) {
		PetVirtual pet = new PetVirtual("Bob", 10, 10, 10);

		pet.shower();
		pet.sleep();
		pet.sleep();
		pet.play();
		pet.eat();
		pet.shower();
		pet.sleep();
		pet.sleep();
		pet.eat();
		pet.shower();
		pet.play();
		pet.eat();
		pet.shower();
		pet.shower();
		pet.sleep();
		pet.sleep();

		pet.checkAlive();
		pet.show();
	
	}
}
