package project1;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String firstName = "Rushie";
//		int count = 0;
//		for(int i = 0  ; i < firstName.length() ; i++) {
//			System.out.println(firstName.charAt(i));
//		if(firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
//			count = count + 1;
//		}
//			
//		
//	}
	
	//System.out.println(count);
	//String Rev = " ";
	String Rev1 = " ";
	
//	for (int i= firstName.length()-1 ; i>=0; i--) {// e u
//		System.out.println(firstName.charAt(i));
//		Rev = firstName.charAt(i)+ Rev;// e, ei, eih, 
//			
//		System.out.println(Rev);
	
	int LEN = firstName.length();
	
    for (int i=0 ;  i< LEN ; i++) {
	System.out.println(firstName.charAt(i));
	Rev1 = firstName.charAt(i)+ Rev1;// e, ei, eih, 
		
	System.out.println(Rev1);
    }
}
}
