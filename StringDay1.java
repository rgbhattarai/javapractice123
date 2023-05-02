package project1;

public class StringDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Veda1 = "I am learning Rigved ";
		String Veda2 = "I am learning Yajurved ";
		String Veda3 = "I am learning Atharvaved ";
//		System.out.println(Veda1);
//		System.out.println(Veda2);
//		System.out.println(Veda3);
		
		// String + Integer ===> String
		// Integer + Integer ===> Integer
		// Integer + String ===> String
		// String + String ====> String
		
//		System.out.println("Mello"+5); 
//		System.out.println(5+5); 
//		System.out.println(5+"6"); 
//		System.out.println("20"+"2");

		
		// Length of the string 
		String Ram = ("jai shree ram");
			int Sita= Ram.length();
		System.out.println(Sita);
		System.out.println(Ram.length());
		
		String Hanuman = (" jai shree hanuman");
		String Ramsita= Ram.concat(Hanuman);
		System.out.println(Ramsita.toUpperCase().toLowerCase());
		System.out.println(Ramsita.length());
		
		
		
		
		
	}

}
