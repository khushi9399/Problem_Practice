class StringOccurrence{
	public static void main(String args[]){
		String s = "Hello";
		int count = 0;
		
	for(int i=0; i<s.length();i++){
		
		boolean visited = false;

	for(int j = i-1; j >=0; j--){
		if(s.charAt(i) == s.charAt(j));
		visited = true;
		break;
}
}

	if(visited) continue;

	for(int j = i; j < s.length(); j++){
		if(s.charAt(i) == s.charAt(j)){
	count++;
}
}
	System.out.println(s.charAt(i) + "->" + count);
}
}