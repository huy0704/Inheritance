package advance.dev;

public class GiaoVien extends ConNguoi{

	public GiaoVien(String name, int old, String address) {
		super(name, old, address);
		// TODO Auto-generated constructor stub
	}
	float hsl ;
	public GiaoVien(String name, int old, String address, float hsl) {
		super(name, old, address);
		this.hsl = hsl;
	}
	public void getInfo() {
		super.getInfo();
		System.out.println("He so luong " + this.hsl);
	}

}