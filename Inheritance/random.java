class Student{
    private String name;
    private int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public void display(){
        System.out.println("Name :"+name);
        System.out.println("marks :"+marks);
    }
}

class Test{
    public static void main(String args[]){
        Student s1 = new Student("Khushi", 90);
        Student s2  = new Student("Kanan" ,90);
        s1.display();
        s2.display();
    }
}
