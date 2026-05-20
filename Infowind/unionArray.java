--> o/p --  4 6 8 3 7 5 2
class UnionArray{
	public static void main(String args[]){
	int a[] = {4,6,8,3,7};
	int b[] = {5,2,8,7};

	for (int i=0; i<a.length; i++){
		System.out.print(a[i] + " ");
}

	for(int i = 0; i<b.length; i++){
	    boolean found = false;

		for(int j = 0; j<a.length;j++){
			if(b[i] == a[j]){
			   found = true;
			   break;
}
}
	if(!found){
		System.out.print(b[i] + " ");
}
}
}
}