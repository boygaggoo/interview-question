package Recursion.codingbat;

public class RecursionCodingBat {
	public static void main(String[] args) {
		System.out.println(bunnyEars2(2));
	}

	/**
	 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
	 * (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
	 * have 3 ears, because they each have a raised foot. Recursively return the
	 * number of "ears" in the bunny line 1, 2, ... n (without loops or
	 * multiplication).
	 * 
	 * bunnyEars2(0) → 0 bunnyEars2(1) → 2 bunnyEars2(2) → 5
	 * 
	 * @param
	 * @return
	 */
	private static int bunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		if (bunnies % 2 == 0) {
			return 3 + bunnyEars2(bunnies - 1);

		} else {
			return 2 + bunnyEars2(bunnies - 1);
		}
	}

	/**
	 * 
	 * We have triangle made of blocks. The topmost row has 1 block, the next
	 * row down has 2 blocks, the next row has 3 blocks, and so on. Compute
	 * recursively (no loops or multiplication) the total number of blocks in
	 * such a triangle with the given number of rows.
	 * 
	 * triangle(0) → 0 triangle(1) → 1 triangle(2) → 3 triangle(3)->6
	 * triangle(4)->10
	 * 
	 * @param rows
	 * @return
	 */
	public static int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}
		if (rows == 1) {
			return 1;
		}
		return rows + triangle(rows - 1);
	}

	/**
	 * Given a non-negative int n, return the sum of its digits recursively (no
	 * loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is
	 * 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 * 
	 * sumDigits(126) → 9 sumDigits(49) → 13 sumDigits(12) → 3
	 * 
	 * @param n
	 * @return
	 */

	public int sumDigits(int n) {
		if (n == 0) {
			return 0;
		}
		if (n < 10) {
			return n;
		}
		return sumDigits(n / 10) + sumDigits(n % 10);
	}

	/**
	 * 
	 * Given a non-negative int n, return the count of the occurrences of 7 as a
	 * digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
	 * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
	 * removes the rightmost digit (126 / 10 is 12).
	 * 
	 * count7(717) → 2 count7(7) → 1 count7(123) → 0
	 * 
	 * @param n
	 * @return
	 */
	public int count7(int n) {
		if (n == 7) {
			return 1;
		} else if (n < 10) {
			return 0;
		}
		return count7(n / 10) + count7(n % 10);
	}

}
