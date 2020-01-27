public class Horse extends Pet{

    public Horse(String name){
        super(name);
    }


    public boolean isHappy(){
        if(this.hasBeenBrushed() && this.hasBeenRidden() && this.hasBeenFed() && hasBeenWalked() && hasBeenPetted()){
            return true;
        } else{
            return false;
        }
    }
}