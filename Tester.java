public class Tester{
	public static void main(String[] args){

		Pet[] pets = new Pet[2];
		Horse billy = new Horse("billy");
		TalkingCat john = new TalkingCat("john");
		pets[0] = billy;
		pets[1] = john;

		PetOwner fred = new PetOwner("fred", pets);

		System.out.println(fred.getHappyness());
		System.out.println(fred.getPetHappyness(0));
		for(int i = 0; i<10; i++){
			fred.petPet(0);
		}
		fred.walkPet(0);
		fred.feedPet(0);
		fred.ridePet(0);
		fred.brushPet(0);
		System.out.println(fred.getPetHappyness(0));
		System.out.println(fred.getHappyness());
		System.out.println(fred.talk(0));

		System.out.println(fred.getPetHappyness(1));
		System.out.println(fred.talk(1));
		fred.feedPet(1);
		System.out.println(fred.getPetHappyness(1));
		System.out.println(fred.talk(1));
		System.out.println(fred.getHappyness());


	}
}