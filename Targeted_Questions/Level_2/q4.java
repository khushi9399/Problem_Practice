/*4.WAP to create employee class with attribute id,name,salary,address. 
create 5 objects of this class and store them in array and display them.
*/

class Employee{
    private int id;
    private String name;
    private String salary;
    private String address;

    public Employee(int id,String name,String salary,String address){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void display(){
        System.out.println(id+ ", " + name+", "+salary+", "+address+", ");
    }
}

class Test{
    public static void main(String args[]){
        Employee arr[] = {
            new Employee(1,"Khushi","2000","indore"),
            new Employee(2,"Anisha","20000","indore")
        };

        for(int i = 0; i<arr.length; i++){
            arr[i].display();
        }
    }
}