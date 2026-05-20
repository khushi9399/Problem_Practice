/*
transient → skips object’s field.
Fields marked as transient are skipped during serialization.

Reason: maybe they’re sensitive (like passwords) or unnecessary.

When deserialized → they come back with default values (null, 0, false)

---------------------------------------------------------------------------

static → skips class’s field (always skipped, even without transient).
Static fields are never serialized, even without transient.

Why? Because static belongs to the class, not to individual objects.

Serialization is only about saving object state, not class state.
*/

import java.io.*;

class Employee implements Serializable {
    int id;
    transient String password;                                     // skipped
    static String company = "InfoBeans Foundation";                // skipped
    Employee(int id, String password) {
        this.id = id;
        this.password = password;
    }
}

class Test {
    public static void main(String args[]) throws Exception {
        Employee e1 = new Employee(101, "abc");

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat")); //emp.dat is the name of the file & .dat is for generic binary data
        oos.writeObject(e1);
        oos.close();

        // change static field after saving
        Employee.company = "MPIF";

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"));
        Employee e2 = (Employee) ois.readObject();
        ois.close();

        System.out.println("ID: " + e2.id);
        System.out.println("Password: " + e2.password);  // null (transient skipped)
        System.out.println("Company: " + Employee.company); // Microsoft (current class value)
    }
}
