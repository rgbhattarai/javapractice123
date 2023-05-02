package project1;

public class Stringday4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Math = "Math is fun";
		String X1 = Math.substring(0,4);
		System.out.println(X1);
		
		String Science = "Science is Fantastic";
		String X2 = Science.substring(0,7);
		System.out.println(X2);
		
		String History = "Boring"; // end index is optional
		String X3 = History.substring(2);
		System.out.println(X3);
		
		String Drama= "Fantastic";
		String X4 = Drama.substring(5, 9);
		System.out.println(X4);
		
		String Name = "Nitya";
		String Emotion = "Love";
		String Country = "Nepal";
		String X5 = String.join(" ",Name,Emotion,Country);
		System.out.println(X5);
		
		String Name1 = "Deetya";
		String Emotion1 = "Love";
		String Country1 = "USA";
		String X6 = String.join("-",Name1,Emotion1,Country1);
		System.out.println(X6);
		
		String City = "Kathmandu";
		
		//   0 1 2 3 4 5 6 7 8
		//   K A T H M A N D U
		
//		int X7= City.indexOf('n');
//		System.out.println(X7);
		
	for (int i= 1; i < City.length(); i++) {
		//System.out.println(i);
	
		if (City.charAt(i)=='a') {
			
			System.out.println(i);
			
			
		}
	}
				
	String Think = " I Think Learning java is fun ";
	String Think1 = Think.trim();
	System.out.println(Think.length());
	System.out.println(Think1.length());
	
	// If want to remove spaces in between
			String Think2 = Think.replace(" ", "");
			System.out.println(Think2);
			
			String Learn = "Learning is Fun";
			String Learn1 = "";
			
			boolean Y1 = Learn.isEmpty();
			System.out.println(Y1);
			
			boolean Y2 = Learn1.isEmpty();
			System.out.println(Y2);
			
	}}
