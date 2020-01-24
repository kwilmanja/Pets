public class PetOwner{
	private String name;
	private Pet[] pets;
	private boolean happy;
	
	public PetOwner(String name, Pet[] pets){
		this.name = name;
		this.pets = pets;
	}

	public boolean getHappyness(){
		for (int i = 0; i<pets.length; i++){
			if(!pets[i].isHappy()){
				this.happy = true;
				return false;
			}
		}
		this.happy = false;
		return true;

	}

	public void petPet(int x){
		pets[x].pet();
	}
	public void walkPet(int x){
		pets[x].walk();
	}
	public void feedPet(int x){
		pets[x].feed();
	}
	public boolean getPetHappyness(int x){
		return pets[x].isHappy();
	}
	public String talk(int x){
		return pets[x].talk();
	}



}