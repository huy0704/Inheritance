package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien("Man" , 18 , "thuan an" , 6.5f) ;
		sv.getInfo();
		GiaoVien gv = new GiaoVien("Dung" , 18 , "Hai An" , 6.0f) ;
		gv.getInfo();
		
		Scanner sc = new Scanner(System.in);
		int[] arrSinhVien = new int[3];
		for (int i = 0; i < arrSinhVien.length; i++) {
			
		}
	}
}