public class Tester{
	public static void main(String[] args){

		Pet[] pets = new Pet[2];
		Dog billy = new Dog("billy");
		Horse john = new Horse("john");
		pets[0] = billy;
		pets[1] = john;

		PetOwner fred = new PetOwner("fred", pets);

		System.out.println(fred.getHappyness());
		System.out.println(fred.getPetHappyness(0));
		fred.petPet(0);
		fred.walkPet(0);
		fred.feedPet(0);
		System.out.println(fred.getPetHappyness(0));
		System.out.println(fred.getHappyness());
		System.out.println(fred.talk(0));

		

		

		// fred.feedCat();
		// fred.feedDog();
		// fred.walkDog();
		// fred.petDog();

		// System.out.println(fred.dogBark());
		// System.out.println(fred.catMeow());
		// System.out.println(fred.getHappyness());
	}
}