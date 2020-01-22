public class Tester{
	public static void main(String[] args){

		PetOwner fred = new PetOwner("fred", "billy", "john");
		fred.feedCat();
		fred.feedDog();
		fred.walkDog();
		fred.petDog();

		System.out.println(fred.dogBark());
		System.out.println(fred.catMeow());
		System.out.println(fred.getHappyness());
	}
}