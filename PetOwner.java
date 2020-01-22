public class PetOwner{
	private String name;
	private Dog dog;
	private Cat cat;
	private boolean happy;
	
	public PetOwner(String name, Dog dog, Cat cat){
		this.name = name;
		this.dog = dog;
		this.cat = cat;
	}

	public petCat(){
		this.cat.pet();
	}
	public petDog(){
		this.dog.pet();
	}
	public walkCat(){
		this.cat.walk();
	}
	public walkDog(){
		this.dog.walk();
	}
	public feedDog(){
		this.dog.fed();
	}
	public feedCat(){
		this.cat.fed();
	}

	public boolean getHappyness(){
		if (this.cat.getHappyness() && this.dog.getHappyness()){
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