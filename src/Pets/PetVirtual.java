package Pets;

public class PetVirtual {
	private String name;
	private int hungry, energy, clean, energyMax, hungryMax, cleanMax, diamonds, age;
	private boolean alive = true;

	public PetVirtual(String name, int energyMax, int hungryMax, int cleanMax) {
		this.name = name;
		this.energyMax = energyMax;
		this.hungryMax = hungryMax;
		this.cleanMax = cleanMax;
	}
	
	public void checkAlive() {
		if ((getEnergy() < 0) || (getClean() < 0) || (getHungryMax() < this.hungry)) {
			this.alive = false;
			System.out.println("* O " + this.name + " morreu!");
		}
	}
	
	public void play() {
		this.setDiamonds(this.getDiamonds()+1);
		this.setHungry(this.getHungry()+1);
		this.setEnergy(this.getEnergy()-1);
		this.setClean(this.getClean()-1);
		this.setAge(this.getAge()+1);
		
		System.out.println("* O " + this.name + " est� brincando!");
		
	}
	
	public void shower() {
		if (this.alive == true) {
			this.setDiamonds(this.getDiamonds()+1);
			this.setHungry(this.getHungry()+1);
			this.setEnergy(this.getEnergy()-1);
			this.setClean(this.getClean()+1);
			this.setAge(this.getAge()+1);
			
			System.out.println("* O " + this.name + " est� tomando banho!");
		} else {
			System.out.println("* N�o � possivel o " + this.name + " tomar banho,\npois seu pet est� morto :(");
		}
	}
	
	public void eat() {
		if (this.alive == true) {
			this.setDiamonds(this.getDiamonds()+1);
			this.setHungry(this.getHungry()-1);
			this.setEnergy(this.getEnergy()+1);
			this.setClean(this.getClean()-1);
			this.setAge(this.getAge()+1);
			
			System.out.println("* O "+ this.name + " est� comendo!");
			
		} else {
			System.out.println("* N�o � possivel o " + this.name + " comer,\npois seu pet est� morto :(");
		}
		
	}
	
	public void sleep() {
		if (this.alive == true) {	
			this.setDiamonds(this.getDiamonds()+1);
			this.setEnergy(this.getEnergy()+1);
			this.setAge(this.getAge()+1);
			
			System.out.println("* O " + this.name + " est� dormindo!");
		}else {
			System.out.println("* N�o � possivel o " + this.name + " dormir,\npois seu pet est� morto :(");
		}
	}
	
	public void show() {
		System.out.println("--------- PET ---------");
		System.out.println("Nome: " + name);
		System.out.println("Energia: " + energy);
		System.out.println("Diamantes: " + diamonds);
		System.out.println("Fome: " + hungry);
		System.out.println("Limpeza: " + clean);
		System.out.println("Idade: " + age);
		System.out.println("Est� Vivo?: " + alive);
		System.out.println("--------- FIM --------- \n\n");
		
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the hungry
	 */
	public int getHungry() {
		return hungry;
	}


	/**
	 * @return the energy
	 */
	public int getEnergy() {
		return energy;
	}


	/**
	 * @return the clean
	 */
	public int getClean() {
		return clean;
	}


	/**
	 * @return the energyMax
	 */
	public int getEnergyMax() {
		return energyMax;
	}


	/**
	 * @return the hungryMax
	 */
	public int getHungryMax() {
		return hungryMax;
	}


	/**
	 * @return the cleanMax
	 */
	public int getCleanMax() {
		return cleanMax;
	}


	/**
	 * @return the diamonds
	 */
	public int getDiamonds() {
		return diamonds;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @return the alive
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * @param diamonds the diamonds to set
	 */
	private void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}

	/**
	 * @param energy the energy to set
	 */
	private void setEnergy(int energy) {
		this.energy = energy;
	}
	
	/**
	 * @param hungry the hungry to set
	 */
	private void setHungry(int hungry) {
		this.hungry = hungry;
	}
	
	/**
	 * @param clean the clean to set
	 */
	private void setClean(int clean) {
		this.clean = clean;
	}

	/**
	 * @param age the age to set
	 */
	private void setAge(int age) {
		this.age = age;
	}

}
