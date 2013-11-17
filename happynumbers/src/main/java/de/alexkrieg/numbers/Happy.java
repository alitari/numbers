package de.alexkrieg.numbers;

import java.util.ArrayList;

public class Happy {

	public static boolean check(int number) {
		int sqz = sumQuadDigits(number);
		ArrayList<Integer> resultPath = new ArrayList<Integer>();
		resultPath.add(sqz);
		while( sqz != 1 && resultPath.indexOf(sqz)== resultPath.size()-1) {
			sqz = sumQuadDigits(sqz);
			resultPath.add(sqz);
		}
		return sqz == 1; 
		
	}

	private static int sumQuadDigits(int zahl) {
		int[] digits = digits(zahl);
		int[] quadDigits = quadriere(digits);
		return summe(quadDigits);
	}

	static int summe(int[] quadrierteZiffern) {
		int summe = 0;
		for ( int i = 0; i < quadrierteZiffern.length;i++ ) {
			summe +=quadrierteZiffern[i];
		}
		return summe;
	}

	static int[] quadriere(int[] ziffern) {
		int[] result = new int[ziffern.length];
		for ( int i = 0; i < ziffern.length;i++) {
			result[i] = ziffern[i]*ziffern[i];
		}
		return result;
	}

	static int[] digits(int zahl) {
		String zs = String.valueOf(zahl);
		int[] ziffern = new int[zs.length()];
		for ( int i=0; i < zs.length();i++) {
			ziffern[i] = Integer.valueOf(new Character(zs.charAt(i)).toString());
		}
		return ziffern;
	}

}
