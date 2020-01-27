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
    public void ride(){
        this.ridden = true;
    }
    public void brush(){
        this.brushed = true;
    }
    public boolean hasBeenRidden(){
        return ridden;
    }
    public boolean hasBeenBrushed(){
        return brushed;
    }
}