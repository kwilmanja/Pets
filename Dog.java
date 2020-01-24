public class Dog extends Pet{


	public Dog(String name){
		super(name);
		
	}



	public boolean isHappy(){
		if (this.hasBeenWalked() && this.hasBeenFed() && this.hasBeenPetted()){
			return true;
		}
		else{
			return false;
		}
	}

	public String talk(){
		if (isHappy()){
			return "WOOF!";
		}
		else{
			return "woof";
		}
	}
}