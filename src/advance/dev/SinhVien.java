package advance.dev;

public class SinhVien extends ConNguoi {

	public SinhVien(String name, int old, String address) {
		super(name, old, address);
		// TODO Auto-generated constructor stub
	}
	float dtb ;
	public SinhVien(String name, int old, String address, float dtb) {
		super(name, old, address);
		this.dtb = dtb;
	}
	public void getInfo() {
		super.getInfo();
		System.out.println("Diem " + this.dtb);
	}
}