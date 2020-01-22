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

	public void petCat(){
		this.cat.pet();
	}
	public void petDog(){
		this.dog.pet();
	}
	public void walkCat(){
		this.cat.walk();
	}
	public void walkDog(){
		this.dog.walk();
	}
	public void feedDog(){
		this.dog.feed();
	}
	public void feedCat(){
		this.cat.feed();
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