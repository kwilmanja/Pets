public class Tester{
	public static void main(String[] args){
		Dog billy = new Dog("billy");
		Cat john = new Cat("john");
		PetOwner fred = new PetOwner("fred", billy, john);
		fred.feedCat();
		fred.feedDog();
		fred.walkDog();
		fred.petDog();

		System.out.println(fred.dogBark());
		System.out.println(fred.catMeow());
		System.out.println(fred.getHappyness());
	}
}