public class Dog extends Pet{


	public Dog(String name){
		super(name);
		
	}



	public boolean getHappyness(){
		if (this.hasBeenWalked() && this.hasBeenFed() && this.hasBeenPetted()){
			makeHappy();
		}
		else{
			makeUnhappy();
		}
		return isHappy();
	}

	public String talk(){
		if (getHappyness()){
			return "WOOF!";
		}
		else{
			return "woof";
		}
	}
}