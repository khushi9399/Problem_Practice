class Parent{
    int x;

    public void scope(){
        System.out.println("4");
    }
}

class Child extends Parent{
    public void scope2(){
        System.out.println("5");
    }
}