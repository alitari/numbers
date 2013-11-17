package de.alexkrieg.numbers;

import java.util.ArrayList;

public class Happy {

	public static boolean check(int zahl) {
		int sqz = summerQuadrierteZiffern(zahl);
		ArrayList<Integer> ergebnisPfad = new ArrayList<Integer>();
		ergebnisPfad.add(sqz);
		while( sqz != 1 && ergebnisPfad.indexOf(sqz)== ergebnisPfad.size()-1) {
			sqz = summerQuadrierteZiffern(sqz);
			ergebnisPfad.add(sqz);
		}
		return sqz == 1; 
		
	}

	private static int summerQuadrierteZiffern(int zahl) {
		int[] ziffern = ziffern(zahl);
		int[] quadrierteZiffern = quadriere(ziffern);
		return summe(quadrierteZiffern);
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

	static int[] ziffern(int zahl) {
		String zs = String.valueOf(zahl);
		int[] ziffern = new int[zs.length()];
		for ( int i=0; i < zs.length();i++) {
			ziffern[i] = Integer.valueOf(new Character(zs.charAt(i)).toString());
		}
		return ziffern;
	}

}
