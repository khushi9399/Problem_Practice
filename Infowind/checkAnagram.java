// //Anagram--> same length,same frequency

import java.util.Arrays;
class AnagramCheck{
	public static void main(String args[]){
		String s1 = "listen";
		String s2 = "silent";

	if(s1.length() != s2.length())
		System.out.println("Not Anagram");

	char a[] = s1.toCharArray();
	char b[] = s2.toCharArray();

	Arrays.sort(a);
	Arrays.sort(b);

	if(Arrays.equals(a,b))
		System.out.println("Anagram");
}
}

