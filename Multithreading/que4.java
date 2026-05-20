class First extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            try{
                System.out.println("Thread--1");
                Thread.sleep(220);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Second extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            try{
                System.out.println("Thread--2");
                Thread.sleep(550);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Third extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            try{
                Thread.sleep(20);
                System.out.println("Thread--3");
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    } 
}
class Test{
    public static void main(String args[]){
    First t1 = new First();
    Second t2 = new Second();
    Thread t3 = new Third();
   
    t1.setPriority(Thread.MAX_PRIORITY);  //10
    t2.setPriority(Thread.NORM_PRIORITY);  //5
    t3.setPriority(Thread.MIN_PRIORITY);   //1

    System.out.println("Priority of thread-1 : "+t1.getPriority());
    System.out.println("Priority of thread-2 : "+t2.getPriority());
    System.out.println("Priority of thread-3 : "+t3.getPriority());
    
    // t1.start();
    // t2.start();
    // t3.start();
    }
}