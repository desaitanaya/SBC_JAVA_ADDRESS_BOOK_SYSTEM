import java.util.*;

public class AddressBookMain {
	static ArrayList<Contacts> contactlist = new ArrayList<Contacts>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ADDRESS BOOK PROGRAM");
		System.out.println("-----------------------------------------------");
		System.out.println();
	
		add();
		
		
		
	}
		//Adding the contacts to Address Book
		public static void add() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ADDING CONTACTS TO ADDRESS BOOK");
		System.out.println("-----------------------------------------------");
	
		System.out.println("Enter the number of contacts to add : ");
		int size = sc.nextInt();
		
		for(int i=0; i<size; i++) {
		System.out.println("Enter the Id : ");
		int id = sc.nextInt();
		
		System.out.println("Enter the Name : ");
		String name = sc.next();
		
		System.out.println("Enter the Address : ");
		String address = sc.next();
		
		System.out.println("Enter the State : ");
		String state = sc.next();
		
		System.out.println("Enter the Phone number : ");
		int phonenum = sc.nextInt();
		System.out.println("-----------------------------------------------");
		
		System.out.println("CONTACT DETAILS");
		System.out.println();
		Contacts c = new Contacts(id, name, address, state, phonenum);
		contactlist.add(c);
		}
		
		for(Contacts i : contactlist) {
			System.out.println("Contact Id : " +i.getId() + "\nContact Name : " +i.getName() + "\nContact Address : " +i.getAddress() + "\nContact State : " +i.getState() + "\nContact Number : " +i.getPhonenum());
			System.out.println("------------------------------------------------------------------------------------------");
		}
        
        
		}
	
}
