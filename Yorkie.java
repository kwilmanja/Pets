public class Yorkie extends Pet{

	private int petCount;

	public Yorkie(String name){
		super(name);
		petCount = 0;
	}

	public void pet(){
		this.petCount += 1;
	}

	public boolean hasBeenPetted(){
        if(petCount >= 10) return true;
        return false;
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
			return "MEOW";
		}
		else{
			return "HISS";
		}
	}
}