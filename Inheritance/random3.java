
// class Test{
//     void m1(){
//         System.out.print("a");
//     }
//     public static void main(String args[]){
//         m1();                            //Error--> non-static method m1() cannot be referenced from a static context
//     }
// }

class Main{
    int x = 5;
    public static void main(String args[]){
        Main obj = new Main();
        System.out.println(obj.x);            //5
    }
}