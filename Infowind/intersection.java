class Intersection{
	public static void main(String args[]){
		int a[] = {2,5,4,3,8};
		int b[] = {7,2,4,8};

	for(int i = 0; i<a.length; i++){
		for(int j = 0; j<b.length; j++){
			if(a[i]==b[j]){
				System.out.println(a[i] + " ");
				break;
			}
		}
	}
}
}

