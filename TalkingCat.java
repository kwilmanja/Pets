import java.util.Random;
public class TalkingCat extends Pet{

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
		Random rand = new Random();
		if (isHappy()){
			int i = rand.nextInt(2);
			switch(x){
				case 1: return "You're looking cute today!";
						break;
				case 2: return "You're awesome!";
						break;
			}
		}
		else{
			int i = rand.nextInt(2);
			switch(x){
				case 1: return "You're stupid!";
						break;
				case 2: return "I hate you!";
						break;
			}
		}
	}
}