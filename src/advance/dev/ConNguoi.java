package advance.dev;

public class ConNguoi {
	String name ;
	int old ;
	String address ;
	
	
	public ConNguoi(String name, int old, String address ) {
		super();
		this.name = name;
		this.old = old;
		this.address = address;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void getInfo() {
		
		System.out.println("Ten " + this.name);
		System.out.println("Tuoi " + this.old);
		System.out.println("Dia chi " + this.address);
		
	}
}