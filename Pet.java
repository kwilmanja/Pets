public class Pet{
    private String name;
    private boolean fed;
	private boolean walked;
    private boolean petted;
    private boolean brushed;
    private boolean ridden;

    
    public Pet(String name){
        this.name = name;
    }
    public void walk(){
		this.walked = true;
	}
	public void feed(){
		this.fed = true;
	}
	public void pet(){
		this.petted = true;
    }
    public void ride(){
        this.ridden = true;
    }
    public void brush(){
        this.brushed = true;
    }

	public boolean hasBeenPetted(){
        return petted;
    }
    public boolean hasBeenWalked(){
        return walked;
    }
    public boolean hasBeenFed(){
        return fed;
    }
    public boolean hasBeenRidden(){
        return ridden;
    }
    public boolean hasBeenBrushed(){
        return brushed;
    }
    
    public boolean isHappy(){
    	return true;
    }
    public String talk(){
    	return "";
    }
   

}