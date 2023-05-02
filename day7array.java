package project1;

import java.util.Arrays;

public class day7array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int X1[][] = { { 1, 23, 44 }, { 45, 22, 33, 45 }, { 88888 } };
////		System.out.println(X1.length);
////		System.out.println(X1[0][2]);
////		System.out.println(X1[1][2]);	
////		System.out.println(X1[1][3]);
////		System.out.println(X1[2][0]);
//		for (int i = 0; i < X1.length; i++) {
//
//			 //System.out.println(X1[i].length);
//			int X2[] = X1[i];
//
//			for (int j = 0; j < X2.length; j++) {
//				System.out.println(X2[j]);
//			}
//		}
//// Problem 1
//		int X3[][] = { { 24, 32, 56, 77 }, { 23, 24, 55 }, { 66, 77, 88, 99 } };
//
//		for (int i = 0; i < X3.length; i++) {
//
//			int X4[] = X3[i];
//
//			for (int j = 0; j < X4.length; j++) {
//				System.out.println(X4[j]);
//
//			}
//		}
//
//		// Problem 2
//
//		int X5[][] = { { 22, 33, 44, 55 }, { 24, 67, 88, 99 }, { 2, 3, 4, 5, 6 } };
//
//		for (int Y[] : X5) {
//			// System.out.println(Y);
//
//			int Y1[] = Y;
//			for (int Y2 : Y1) {
//				System.out.println(Y2);
//			}
//		}
//
//		// Problem 3
//
//		int X6[][] = { { 12, 33, 44, 55 }, { 78, 99, 34, 66 }, { 2, 33, 90, 89 } };
//
//		for (int Y3[] : X6) {
//
//			// System.out.println(Y3);
//
//			for (int Y4 : Y3) {
//				System.out.println(Y4);
//			}
//		}

		// Problem 4

		int T1[][][] = { { { 11, 22, 33 }, { 44, 55, 66 } },
				{ { 77, 88, 99 }, { 33, 44, 99 } }};

		
		for (int i = 0; i<T1.length; i++) {
			
			int T2[][] = T1[i];
			
			for (int j=0; j<T2.length;j++) {
		
				//System.out.println(T2[j]);
			int T3[]= T2[j];
			
				for (int k = 0; k<T3.length; k++) {
					System.out.println(T3[k]);
					
				
				}
			}
		}

//		System.out.println(T1[0][0][1]);
//		System.out.println(T1[1][1][1]);
//		System.out.println(T1[0][1][2]);

		// problem 5
		int T7[][][] = { { { 10, 2, 33 }, { 4, 51, 65 } },
				{ { 7, 80, 90 }, { 32, 42, 90 } }};
	
		for (int M[][]: T7) {
			
			//System.out.println(M);
			
			int M1[][]= M;
			
			for (int[] M2:M1) {
				
				//System.out.println(M2);
				for (int M3:M2) {
					System.out.println(M3);
					//System.out.println(Arrays.toString(M2));
				}
				
			
					
				
			}
			
		}
//			
//			
//			
			
			
			
		
	}
}
