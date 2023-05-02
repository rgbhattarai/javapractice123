package project1;

public class Day5Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//0	1 2 3 4	5
//		//a p p l e p
//		
//		
//		String fruit = "applep";
//		int a = fruit.indexOf('p', 3);
//		System.out.println(a);
//		
//		// c a n a d a 
//		// 0 1 2 3 4 5 			   
//		
//		String Country = "Canada";
//		int X1 = Country.indexOf('a', 2);
//		System.out.println(X1);
//		int count = 0;
//		
//		for (int i=0; i< Country.length();i++) {
//			if (Country.charAt(i)== 'a') {
//				System.out.println(i);
//				count = count+1;
//			}
//		}
//		
//		System.out.println(count);

		// ARRAY

		int Apple[] = new int[6];
		Apple[0] = 100;
		Apple[1] = 200;
		Apple[2] = 300;
		Apple[3] = 400;
		Apple[4] = 500;
		Apple[5] = 600;

//		System.out.println(Apple[0]);
//		System.out.println(Apple[1]);
//		System.out.println(Apple[2]);
//		System.out.println(Apple[3]);
//		System.out.println(Apple[4]);
//		System.out.println(Apple[5]);

		for (int i = 0; i < Apple.length; i++) {
			System.out.println(Apple[i]);

		}

		String Subject[] = new String[4];

		Subject[0] = "MATH";
		Subject[1] = "SCIENCE";
		Subject[2] = "HISTORY";
		Subject[3] = "ENGLISH";

		for (int i = 0; i < Subject.length; i++) {
			System.out.println(Subject[i]);
			if (Subject[i]=="MATH"){
				
				System.out.println("MATH IS FUN");
			}
			
			else if (Subject[i]=="SCIENCE") {
				System.out.println("SCIENCE IS FANTASTIC");
				
			}
			
			else if (Subject[i]=="HISTORY") {
				System.out.println("HISTORY IS BORING");
			}
			
			else {
				System.out.println("ENGLISH IS OK");
			}
		}
	

		int ID[] = { 10, 25, 67, 90, 34 };

		for (int i = 0; i < ID.length; i++) {
			System.out.println(ID[i]);
		}

		String Candy[] = { "Hersheys", "KITKAT", "REESES", "MILKYWAY" };

	for (int i = 0; i < Candy.length; i++) {
			System.out.println(Candy[i]);
		}

		char Snacks[] = { 'm', 'u', 'f', 'f', 'i', 'n' };
		for (int i = 0; i < Snacks.length; i++) {
			//System.out.println(i);
			System.out.println(Snacks[i]);
		}

	String Name = "RUSHIE";
		char[] X = Name.toCharArray();
		for (int i = 0; i < X.length; i++) {
			System.out.println(i);
		System.out.println(X[i]);
		}

	String Quote = "If you dont like something change it";
	String Comma[] = Quote.split(" ");
	String Comma1[]= Quote.split("o");
	System.out.println(Comma);
	for (int i = 0; i < Comma.length; i++) {
		System.out.println(Comma[i]);
	}
	for (int i = 0; i < Comma1.length; i++) {
		System.out.println(Comma1[i]);
	}
	}
}
