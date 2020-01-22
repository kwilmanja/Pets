public class PetOwner{
	private String name;
	private Pet[] pets;
	private boolean happy;
	
	public PetOwner(String name, Pets[] pets){
		this.name = name;
		this.pets = pets;
	}

	public boolean getHappyness(){
		if (){
			this.happy = true;
		}
		else{
			this.happy = false;
		}
		return this.happy;
	}

	public String dogBark(){
		return this.dog.bark();
	}

	public String catMeow(){
		return this.cat.meow();
	}

}