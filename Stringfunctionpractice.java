package project1;

public class Stringfunctionpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create String
		String Revision = "Package 2 Revision";
		System.out.println(Revision);

		String Subject = "Creating a String";
		System.out.println(Subject);

		// Get the length of string- length()
		String Length = "TO GET STRING LENGTH WITH FUNCTION LENGTH()LINE 16";
		System.out.println(Length);
		String Name = "Rushie Bhattarai";
		System.out.println(Name.length());

		// Join two java string- concat ()
		String Together1 = "JOIN TWO STRINGS TOGETHER WITH FUNCTION CONCAT()LINE 22";
		System.out.println(Together1);
		String Name1 = "Rushie";
		String Lastname = " Bhattarai";
		System.out.println(Name1.concat(Lastname));

		// Compare Two Strings - equals()
		String Equal = "COMPARE TWO STRING TOGETHER WITH FUNCTION EQUALS()AND BOOLEAN RESULT LINE 29";
		System.out.println(Equal);
		String one = "java";
		String Two = "Python";
		String Three = "java";

		boolean result1 = one.equals(Two);
		System.out.println(result1);

		boolean result2 = one.equals(Three);
		System.out.println(result2);

		if (result2) {
			System.out.println("java is great");
		} else {
			System.out.println("Python is great");
		}

		// Ternary Operator to compare
		String Ternary = "USING TERNARY OPEARTOR TO COMPARE LINE 48";
		System.out.println(Ternary);
		String ternary1 = one.equals(Three) ? "its equal" : "its not equal";
		System.out.println(ternary1);

		// Escape character - \
		String Escape = "INCLUDE SEMICOLON IN STRING USING FUNCTION ESCAPE WITH LEFT TILTED HASH SIGN LINE 54";
		System.out.println(Escape);
		String Sub = "I love Java";
		String Subs = ("\"I love\"Java\"\"");
		System.out.println(Sub);
		System.out.println(Subs);

		// Contain () // it takes a single parameters // sequence of character

		String Contains = "TO CHECK IF THE STRING CONTAINS CHRACTER OR NOT USING FUNCTION CONTAINS()LINE 63";
		System.out.println(Contains);
		String Four = "Java string contains apple";

		boolean result3 = Four.contains("gun");
		System.out.println(result3);

		// Substring ()
		String Substring = "TO PRINT CHARCTER IN STRING AT GIVEN SUBSTRING USING FUNCTION SUBSTRING () LINE 71";
		System.out.println(Substring);
		String Five = "Java apple";

		System.out.println(Five.substring(5, 10));

		// Join
		String Join = "TO JOIN THREE OR MORE STRINGS TOGETHER USING FUNCTION JOIN()LINE 78";
		System.out.println(Join);
		String I1 = "I";
		String I2 = "Like";
		String I3 = "Java";
		String Together = String.join(" ", I1, I2, I3);
		System.out.println(Together);

		// Replace()
		String Replace = "TO REPLACE CHARACTER OR WORD WITH ANOTHER USING FUNCTION REPLACE(),REPLACEALL,REPLACEFIRST LINE 87";
		System.out.println(Replace);
		String BB1 = " Ball Ball CAT CAT";

		System.out.println(BB1.replace("Ball", "MATT"));
		System.out.println(BB1.replace('B', 'C'));
		System.out.println(BB1.replaceAll("Ball", "Cat"));
		System.out.println(BB1.replaceFirst("Ball", "Mall"));

		// new string
		String New = "TO GET NEW STRING";
		System.out.println(New);
		String City = new String("Kathmandu");
		System.out.println(City);

		// Function uppercase, lowercase and length

		String Case1 = "TO CONVERT STRING INTO UPPERCASE USING FUNCTION TOUPPERCASE LINE 102";
		System.out.println(Case1);

		String Nepal = "Nepal is beautiful country";
		System.out.println(Nepal.toUpperCase());
		String Case2 = "TO CONVERT STRING INTO LOWERCASE USING FUNCTION TOLOWERCASE LINE 107";
		System.out.println(Case2);
		String Nepal1 = "BUDDHA WAS BORN IN NEPAL";
		System.out.println(Nepal1.toLowerCase());
		// int R = (Nepal.toUpperCase().toLowerCase().length());
		// System.out.println(R);

		// Use the function startswith using boolean result
		String startswith = "USING FUNCTION STARTWITH() ENDSWITH AND GETING RESULTS IN BOOLEAN LINE 115";
		System.out.println(startswith);
		String City1 = "POKHARA";
		String City2 = "Birgunj";
		String City3 = "Butwal";
		boolean R2 = City1.startsWith("POK");
		System.out.println(R2);
		boolean R3 = City2.endsWith("k");
		System.out.println(R3);

		// get the character at the index

		String cha = "GET CHARACTER OF STRING USING FUNCTION CHARAT() LINE 131";
		System.out.println(cha);

		String City5 = "CHARLOTTE";

		// 0 1 2 3 4 5 6 7 8
		// C H A R L O T T E
		System.out.println(City5.length());
		System.out.println(City5.charAt(6));

		// Print the character of string
		String R4 = "PRINT CHARATCER ON THE STRING USING FOR LOOP LINE 142";
		System.out.println(R4);

		for (int i = 0; i < City5.length(); i++) {
			// System.out.println(i);
			System.out.println(City5.charAt(i));
		}

		// Print the character of string in reverse order
		String R5 = "PRINT CHARATCER ON THE STRING USING FOR LOOP IN REVERSE ORDER LINE 151";

		String Rev = " ";

		for (int j = City5.length() - 1; j >= 0; j--) {
			System.out.println(City5.charAt(j));
			Rev = City5.charAt(j) + Rev;
			System.out.println(Rev);
		}
		System.out.println(Rev);

		String Name2 = "DEETYA";

		String REV = " ";

		for (int k = Name2.length() - 1; k >= 0; k--) {
			System.out.println(Name2.charAt(k));

			REV = Name2.charAt(k) + REV;

		}
		System.out.println(REV);

		// count number of a
		String R6 = "PRINTING CHARACTER AT INDEX AND COUNTING NUMBER OF CHARACTER ";
		System.out.println(R6);

		String Apple = "apple a day keeps doctor away";
		int count = 0;
		for (int i = 0; i < Apple.length(); i++) {
			if (Apple.charAt(i) == 'a') {
				System.out.println(i);

				count = count + 1;
			}
		}
		String R7 = "COUNT OF a ";
		System.out.println(R7);
		System.out.println(count);

		// Finding the vowels in a word

		String R8 = " COUNTING THE VOWELS line 191";
		System.out.println(R8);
		String Fname = "Rushie Ghimire Bhattarai";
		int count1 = 0;

		for (int i = 0; i < Fname.length(); i++) {
			if (Fname.charAt(i) == 'a' || Fname.charAt(i) == 'e' || Fname.charAt(i) == 'i' || Fname.charAt(i) == 'o'
					|| Fname.charAt(i) == 'u') {

				count1 = count1 + 1;
			}
		}
		
		System.out.println(count1);

	}

}
