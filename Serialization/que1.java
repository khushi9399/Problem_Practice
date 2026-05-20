import java.io.*;

class Employee implements Serializable {
    public int a;
    public String b;

    public Employee(int a, String b) {     //Contructor
        this.a = a;
        this.b = b;
    }
}

 class Test{
    public static void main(String[] args) {
        Employee object = new  Employee(1, "Raja");
        String filename = "sample.txt";

        // Serialization
        try {
            FileOutputStream file1 = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file1);
            out.writeObject(object);
            out.close();
            file1.close();
            System.out.println("Object has been serialized");

        } 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        Employee object1 = null;

        // Deserialization
        try {
            FileInputStream file2 = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file2);
            object1 = (Employee) in.readObject();
            in.close();
            file2.close();
            System.out.println("Object has been deserialized");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);

        } 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}