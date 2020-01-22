public class Tester{
	public static void main(String[] args){

		Pet[] pets = new Pet[2];
		Dog billy = new Dog("billy");
		Cat john = new Cat("john");
		pets[0] = billy;
		pets[1] = john;

		PetOwner fred = new PetOwner("fred", pets);

		// fred.feedCat();
		// fred.feedDog();
		// fred.walkDog();
		// fred.petDog();

		// System.out.println(fred.dogBark());
		// System.out.println(fred.catMeow());
		// System.out.println(fred.getHappyness());
	}
}