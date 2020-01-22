public class Cat extends Pet{
	

	public Cat(String name){
		super(name);
	}



	public boolean getHappyness(){
		if (!this.hasBeenWalked() && this.hasBeenFed() && !this.hasBeenPetted()){
			makeHappy();
		}
		else{
			makeUnhappy();
		}
		return isHappy();
	}

	public String talk(){
		if (getHappyness()){
			return "MEOW";
		}
		else{
			return "HISS";
		}
	}
}