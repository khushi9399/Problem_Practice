class First extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            try{
                System.out.println(Thread.currentThread().getName());   //Thread.currentThread()-->Get the name of the thread which is currently executing this code.
                    //currentThread() → gives you the thread object executing right now.
                    //getName() → gives you that thread’s name
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
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(550);
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
    t1.setName("thread1");
    t1.start();
    Second t2 = new Second();
    t2.setName("thread2");
    t2.start();
    }
}