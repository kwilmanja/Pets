public class Cat extends Pet{
	

	public Cat(String name){
		super(name);
	}



	public boolean isHappy(){
		if (!this.hasBeenWalked() && this.hasBeenFed() && !this.hasBeenPetted()){
			return true;
		}
		else{
			return false;
		}
	}

	public String talk(){
		if (isHappy()){
			return "MEOW";
		}
		else{
			return "HISS";
		}
	}
}