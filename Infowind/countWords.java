class CountWords{
	public static void main(String args[]){
		String str = "Java   is  very   easy  ";
		int count = 0;
		int words = 0;

		for(int i = 0; i<str.length(); i++){
			
			if(str.charAt(i) != ' '){    //java=4
				count++;
			}
			else if(count>0){         //4>0
				words++;              //1
				count = 0;            //again count=0 so that now it count=0 from "is"
			}
		}
		if(count>0)            //for last word
			words++;
		System.out.print(words);
	}
}


//with the help of method split()
class Test{
	public static void main(String args[]){
		String str = "JAva is very simple kk  ";
		String arr[] = str.split(" ");

		System.out.println(arr.length);
	}
}

