public class Dog{
	private boolean fed;
	private boolean walked;
	private boolean petted;
	private String name;
	private boolean happy;

	public Dog(name){
		this.name = name;
		this.fed = false;
		this.walked = false;
		this.petted = false;
	}

	public walk(){
		this.walked = true;
	}
	public feed(){
		this.fed = true;
	}
	public pet(){
		this.petted = true;
	}

	public getHappyness(){
		if (this.walked && this.fed && this.petted){
			this.happy = true;
		}
		else{
			this.happy = false;
		}
		return this.happy;
	}

	public String bark(){
		if (this.walked && this.fed && this.petted){
			this.happy = true;
			return "WOOF!";
		}
		else{
			this.happy = false;
			return "woof"
		}
	}
}