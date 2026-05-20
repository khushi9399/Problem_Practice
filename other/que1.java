class Test{
    public static void main(String args[]){
       int num = 45678;
       int evenCount = 0;


        for(int i = 0; i<=num; i++){
        if(num % i == 0)         //incomplete
        evenCount += num;
       } 
       System.out.println(evenCount);
    }
}