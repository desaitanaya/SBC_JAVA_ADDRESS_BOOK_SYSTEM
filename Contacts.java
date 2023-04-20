public class Contacts {
	int id;
	String name;
	String address;
	String state;
	long phonenum;
	
	public Contacts(int id, String name, String address, String state, int phonenum) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.state = state;
        this.phonenum = phonenum;
    }

	public String toString() {
		return this.id + "," + this.name + " ," + this.address + "," + this.state + "," + this.phonenum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}

}