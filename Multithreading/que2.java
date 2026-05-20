class First extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
        try{
           System.out.println("Thread first program");
           Thread.sleep(3000);                         //sleep() pauses the execution of the current thread for a specified time
        }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Second extends Thread{
    public void run(){
        for(int i = 0; i<5 ; i++){
        try{
            System.out.println("Thread Second program");
            Thread.sleep(2000);
            }
    }
    catch(InterruptedException e){
            e.printStackTrace();
    }
    }
}
class Test{
    public static void main(String args[])throws InterruptedException{
    First f = new First();
    f.start();
    
    Second s = new Second();
    s.start();
    
    }
}