public class Yorkie extends Dog{

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
}