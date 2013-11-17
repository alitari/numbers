package de.alexkrieg.numbers;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void check() {
		int[] happyNumbers = {1,7,10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 
		91,94,97,100};
		for ( int i = 0; i <101;i++ ) {
			assertEquals("Error with number "+i,Arrays.binarySearch( happyNumbers, i ) > -1, Happy.check(i)); 
		}

	}

	@Test
	public void ziffern() throws Exception {
		for (int i = 0; i < 10; i++) {
			assertEquals(i, Happy.digits(i)[0]);
			assertEquals(1, Happy.digits(0).length);
		}
		
		int example = 12;
		assertEquals(1, Happy.digits(example)[0]);
		assertEquals(2, Happy.digits(example)[1]);
		assertEquals(2, Happy.digits(example).length);
		
		example = 73834;
		assertEquals(7, Happy.digits(example)[0]);
		assertEquals(3, Happy.digits(example)[1]);
		assertEquals(8, Happy.digits(example)[2]);
		assertEquals(3, Happy.digits(example)[3]);
		assertEquals(4, Happy.digits(example)[4]);
		
		assertEquals(5, Happy.digits(example).length);
		
	}
	
	@Test
	public void quadriere() throws Exception {
		int[] ziffern = new int[] {1,2,3,4,5,6,7};
		int[] quadriert = Happy.quadriere(ziffern);
		assertEquals(1,quadriert[0]);
		assertEquals(4,quadriert[1]);
		assertEquals(9,quadriert[2]);
		assertEquals(16,quadriert[3]);
		assertEquals(25,quadriert[4]);
		assertEquals(36,quadriert[5]);
		assertEquals(49,quadriert[6]);
	}
	
	@Test
	public void summe() throws Exception {
		int[] ziffern = new int[] {1,2,3,4,5,6,7};
		int summe = Happy.summe(ziffern);
		assertEquals(28, summe);
		
		ziffern = new int[] {19,3,7};
		summe = Happy.summe(ziffern);
		assertEquals(29, summe);
		
		
		
		
	}

}
