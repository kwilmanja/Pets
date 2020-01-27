import java.util.Random;
public class TalkingCat extends Pet{

	public TalkingCat(String name){
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
		Random rand = new Random();
		if (isHappy()){
			int i = rand.nextInt(2);
			switch(i){
				case 0: return "You're looking cute today!";
				case 1: return "You're awesome!";
			}
		}
		else{
			int i = rand.nextInt(2);
			switch(i){
				case 0: return "You're stupid!";
				case 1: return "I hate you!";
			}
		}
		return "f";
	}
}