
class CapitalizeWords{
	public static void main(String args[]){
	String s = "hello world";
	String result = "";

	String words[] = s.split(" ");       						   //words = ["hello", "world"]

	for(int i=0; i<words.length;i++){
		char first = Character.toUpperCase(words[i].charAt(0));    //charAt(0) → gets first character
		result += first + words[i].substring(1) + " ";            //words[i].substring(1)-->Takes the rest of the word (except first letter)
       }
		System.out.println(result.trim());
     }
}


