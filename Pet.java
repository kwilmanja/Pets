public class Pet{
    private String name;
    private boolean fed;
	private boolean walked;
	private boolean petted;
    
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

	public boolean hasBeenPetted(){
        return petted;
    }
    public boolean hasBeenWalked(){
        return walked;
    }
    public boolean hasBeenFed(){
        return fed;
    }

    public boolean isHappy(){
    	return true;
    }
    public String talk(){
    	return "";
    }

}