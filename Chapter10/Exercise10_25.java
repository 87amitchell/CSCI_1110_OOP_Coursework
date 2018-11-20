/* (prompt user to enter a character for a delimiter(space keeper), 
 * prompt user to enter a string that uses the entered character as a delimiter,
 * return an array of strings consisting of the substrings split by the matching delimiter, including the matching delimiter,
 * Example:split("ab#12#453", "#") returns ab, #, 12, #, 453 in an array of String.split("ab#12#453#", "#") returns ab, #, 12, #, 453, # in an array of String
 * utilize "public static String[] split(String s, String regex)")
 * (Created by Andrew Mitchell on Nov 19th, 2018)
*/

import java.util.Scanner;

public class Exercise10_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character to use as a delimiter (e.g. #): ");
		String delimiter = input.next();
		System.out.println();
		System.out.print("Enter a string that utilizes " + delimiter + " as the delimiter: ");
 		String s = input.next();
 		System.out.println();
 		input.close();
 		
 		String [] a = split(s, delimiter);
 		for (int i= 0; i < a.length; i++) {
 			System.out.println(a[i]);
 		}
	}
	public static String[] split(String s, String delimiter) {
		//utilize two string type arrays(second array with a length to be determinded later), split() and name.substring
		String [] s1 = s.split(delimiter);
		String [] s2;
		
		if (s.substring(s.length() -1).equals(delimiter)) {
			//check if last character is a delimiter
			s2 = new String[(s1.length * 2)];
		}
		else {
			s2 = new String[((s1.length * 2) -1)];
		}
		//load array to with s1 spaced out with the delimiter characters that are found in the original s string
		int s2CountLocation = 0;
		for (int i = 0; i < s1.length; i++){
			
			if (i >= s1.length || s2CountLocation >= s2.length) {
				break;
			}
			else {
				s2[s2CountLocation] = s1[i];
				s2CountLocation++;
				if (s2CountLocation >= s2.length) {
					break;
				}
				else {
				s2[s2CountLocation] = s.substring((s1[i].length()), (s1[i].length() +1));
				}
			}
			s2CountLocation += 1;
		}
		return s2;
	}
}