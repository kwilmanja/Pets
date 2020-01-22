public class Pet{
    private String name;

    private boolean fed;
	private boolean walked;
	private boolean petted;
    private boolean happy;
    
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

    public void makeHappy(){
        this.happy = true;
    }

    public void makeUnhappy(){
        this.happy = false;
    }
    public boolean isHappy(){
        return this.happy;
    }

}