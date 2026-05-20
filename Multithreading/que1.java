class First extends Thread{
    public void run(){
        System.out.println("Thread first program");
    }
}
class Second extends Thread{
    public void run(){
         System.out.println("Thread Second program");
    }
}
class Test{
    public static void main(String args[]){
    First f = new First();
    f.start();
    
    Second s = new Second();
    s.start();
    
    }
}