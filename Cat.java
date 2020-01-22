public class Cat{
	private boolean fed;
	private boolean walked;
	private boolean petted;
	private String name;
	private boolean happy;

	public Cat(String name){
		this.name = name;
		this.fed = false;
		this.walked = false;
		this.petted = false;
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

	public boolean getHappyness(){
		if (!this.walked && this.fed && !this.petted){
			this.happy = true;
		}
		else{
			this.happy = false;
		}
		return this.happy;
	}

	public String meow(){
		if (!this.walked && this.fed && !this.petted){
			this.happy = true;
			return "MEOW!";
		}
		else{
			this.happy = false;
			return "hiss";
		}
	}
}