package project1;

import java.util.Arrays;

public class Day6Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Names[] = new String[5];

		Names[0] = "Ram";
		Names[1] = "abRam";
		Names[2] = "SaRam";
		Names[3] = "BedRam";
		Names[4] = "KaliRam";

		System.out.println(Names[2]);

		String Cities[] = { "Kathmandu", "Biratnagar", "Pokhara", "Birgunj", "Hetauda" };

		for (int i = 0; i < Cities.length; i++) {

			// will print the index
			System.out.println(i);

			System.out.println(Cities[i]);
		}

		String Drink = "I love Cofee";

		char X1[] = Drink.toCharArray();

		// To reverse and bring together
		String Rev = " ";

		System.out.println(X1);

		for (int i = 0; i < X1.length; i++) {
			System.out.println(X1[i]);

			Rev = Rev + X1[i];
		}

		System.out.println(Rev);
		// Addition of integers in array

		int addition[] = { 5, 10, 15, 20, 25, 30, 35 };
		int SUM = 0;
		float Average = 0;
		System.out.println("for -each loop");

		for (int X2 : addition) {
			System.out.println(X2);

			SUM = SUM + X2;
			Average = (SUM / addition.length);

		}

		System.out.println(SUM);
		System.out.println(Arrays.toString(addition));
		System.out.println(Average);

		String Name[] = { "Neha", "Ketki", "Ram", "Shyam" };

		for (String X3 : Name) {
			System.out.println(X3);

		}

		int matrix [][]  = { { 11, 22, 33 }, { 44, 55, 66, 77 } };

//		matrix ====>  [

//		 	   [11,22,33]
//		 	   [44,55,66]  
//		 
//		 ]
//		

		System.out.println(matrix[0][0]);
		System.out.println(matrix[1][0]);
		System.out.println(matrix[1][3]);

		
		
	}

}
