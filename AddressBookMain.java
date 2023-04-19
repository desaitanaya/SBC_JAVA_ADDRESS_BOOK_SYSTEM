public class AddressBookMain{
	public static void main(String[] args) {
		System.out.println();
		System.out.println("WELCOME TO ADDRESS BOOK PROGRAM");
		System.out.println("---------------------------------");
		
		Contacts c = new Contacts("Tanaya", "Desai", "Bhayander", "Mumbai", "Maharashtra", "desaitanaya17@gmail.com", 401105, 123456677);
		System.out.println(c.first_name);
	}
}