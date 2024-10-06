package com.nt.lomBok_Api;

public class LomBokAPI {

	public static void main(String[] args) {
		PLomBok bok = new PLomBok();
		PLomBok bok2 = new PLomBok();

		bok.setId(10);
		bok.setName("Subbarayudu");
		bok.setCode("Sinb1093snd");
		bok.setPhoneNumber(9898989898l);

		bok2.setId(10);
		bok2.setName("Subbarayudu");
		bok2.setCode("Sinb1093snd");
		bok2.setPhoneNumber(9898989898l);

		
		System.out.print("Details" + bok2);
		System.out.print("Details" + bok);
		
		System.out.print(bok == bok2);
		System.out.print(bok.equals(bok2));

		System.out.print(bok.hashCode());
		System.out.print(bok2.hashCode());

		System.out.print(bok == bok2);
		System.out.print(bok.equals(bok2));

	}

}
