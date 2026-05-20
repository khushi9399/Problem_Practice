
class A{
    public void m1(){
        System.out.println("A-m1");
    }
}
class B extends A{
    public void m2(){
        System.out.println("B-m1");
    }
    public void m3(){
        System.out.println("B-m2");
    }
}
class Test{
    public static void main(String args[]){
        //All possibilities check one by one
        A obj = new A();
        A obj = new B();
        B obj = new B();
        B obj = new A();                      //Error: A cannot be converted to B...b'coz A is parent class and B is child class...it is only valid when A was upcasted in past
        obj.m1();
        obj.m2();
        obj.m3();
    }
}