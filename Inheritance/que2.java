// can we change Access modifier while overriding---> it's depends
//(top to down-access higher privilage)-private    
//                                      <default>
//                                      Protected
//                                      Public
//(We can put equal access privilage or can change from lower access to higher..and public have a higher access..there is no one have higher access than public )
class A{
    // protected void m1(){
    public void m1(){  
        System.out.println("A-m1()");
    }
}
class B extends A{
    // protected void m2(){              //This will work fine b'coz while overriding access privilage is same
    // public void m2(){                 // This also will work fine b'coz while overriding access privilage is higher
    protected void m1(){                 //This gives an error b'coz above public is written so we can't override public to protected b'coz no one have higher privilage than public
        System.out.println("B-m1()");     
    }
}
class Test{
    public static void main(String args[]){
       A obj = new A();
       obj.m1();
    }
}