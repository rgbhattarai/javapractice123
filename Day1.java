package project1;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Revision

//		int x= 9;
//		int y = 10;
		Cal();
		Mult(5, 8);
		int v= Mod(10,5);
		System.out.println(v);
//		
//		System.out.println(x+y);
//		System.out.println(x-y);
//		System.out.println(x*y);
//		System.out.println(x/y);
//		System.out.println(x%y);
//		
//		// relational operator
//		System.out.println(10 > 12); // false
//		System.out.println(9 < 6); // false
//		System.out.println(9 == 8); // false
//		System.out.println(8 != 9); // true
//		System.out.println(5 <= 5); // true
//		System.out.println(10 >= 8); // true
//		
//		// AND &&
//				// true  && true ====> true
//				// true && false ====> false
//				// false && true ====> false
//				// false && false ====> false
//		System.out.println(9== 9 && 8 != 6);
//		System.out.println(9 == 9 && 8 == 6);
//		System.out.println(9 != 9 && 7 != 6);
//		System.out.println(8 != 8 && 7 == 6);
//	
//		// OR
//				// true  || true ====> true
//				// false || true ====> true
//				// true ||  false ====> true
//				// false || false====> false
//				
//				System.out.println(8 == 8 || 7 != 6); // true
//				System.out.println(8 == 8 || 7 == 6); // true 
//				System.out.println(8 != 8 || 7 != 6); // true
//				System.out.println(8 != 8 || 7 == 6); // false
//				
//				// NOT !
//				// True  False 
//				// False True
//				System.out.println(!(9 != 8));
//				System.out.println(!(9 == 8));
//				
//				// conditional statements
//				
//				//int Apple =5;
//				//int Apple =10;
//				int Apple =12;
//				
//				if (Apple >0 && Apple<=5 ) {
//					System.out.println("20% discount");
//					
//				}	
//				if  (Apple >5 && Apple <=10) {
//					System.out.println("30% discount");
//				}
//				else if (Apple >10)  {
//					System.out.println("40% discount");
//					
//				}
//		
//			if (x>=10) {
//				System.out.println("you are beautiful");
//			}
//			else {
//				System.out.println("you are gorgeous");
//			}
//				
//				
//			
//		// 5 table	
//			
//			for (int i= 5; i<=50; i= i+5) {
//				System.out.println(i);
//				
//			}
//			
//			// reverse table
//			for (int m= 50; m>=5; m= m-5) {
//				System.out.println(m);
//			}
//	
//	// Switch
//	int days =5;
//	int days1=8;
//	
//	switch (days) {
//	case 1:
//		System.out.println("Sunday");
//	case 2:
//		System.out.println("Monday");
//	case 3:
//		System.out.println("Tuesday");
//	case 4:
//		System.out.println("Wednesday");
//	case 5:
//		System.out.println("Thursday");
//	case 6:
//		System.out.println("Friday");
//	case 7:
//		System.out.println("Saturday");
//	}
//	
//	
//	switch (days1) {
//	case 1:
//		System.out.println("Sunday");
//		break;
//	case 2:
//		System.out.println("Monday");
//		break;
//	case 3:
//		System.out.println("Tuesday");
//		break;
//	case 4:
//		System.out.println("Wednesday");
//		break;
//	case 5:
//		System.out.println("Thursday");
//		break;
//	case 6:
//		System.out.println("Friday");
//		break;
//	case 7:
//		System.out.println("Saturday");
//		
//		default:
//		System.out.println("please enter correct input");
//	}
//		String City = "Louville";
//		switch (City) {
//		case ("Charlotte"):
//		case ("marion"):
//		System.out.println("North Carolina");
//		break;
//		
//		case ("Lexington"):
//		case ("Louville"):
//		System.out.println("Kentucky");
//		break;
//		
//		case ("sunnyville"):
//		case ("Ureka"):
//		System.out.println("California");
//		}
	}

	// Function with no Parameter with not return type
	static void Cal() {
		System.out.println(2 + 2);
	}

	// Function with parameter and with no return type
	static void Mult(int m, int n) {
		System.out.println(m * n);
	}

	// Function with parameter and with no return type
	static int Mod(int a,int b) {
     return (a%b);
	}

}
