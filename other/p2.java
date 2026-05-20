/*8. Hospital Management System
Design a class Hospital with a non-static inner class Patient. Each patient should have a name, age, and illness. The Hospital class should:
•	Admit new patients
•	Discharge patients
•	Display patient records
Add a static nested class HealthStats to:
•	Calculate average age
•	List common illnesses
*/

class Hospital {
    private Patient[] patients; // array of patients
    private int patientCount;

    public Hospital(int maxPatients) {
        patients = new Patient[maxPatients];
        patientCount = 0;
    }
   void admitPatient(String name, int age, String illness) {
        if (patientCount < patients.length) {
            patients[patientCount] = new Patient(name, age, illness);
            patientCount++;
            System.out.println(name + " admitted successfully.");
        } else {
            System.out.println("Hospital is full! Cannot admit more patients.");
        }
    }
    void dischargePatient(String name) {
        boolean found = false;
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].name.equalsIgnoreCase(name)) {
                System.out.println(patients[i].name + " discharged.");
                // shift remaining patients
                for (int j = i; j < patientCount - 1; j++) {
                    patients[j] = patients[j + 1];
                }
                patients[patientCount - 1] = null;
                patientCount--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Patient not found: " + name);
        }
    }

    void displayPatients() {
        if (patientCount == 0) {
            System.out.println("No patients admitted.");
            return;
        }
        System.out.println("=== Patient Records ===");
        for (int i = 0; i < patientCount; i++) {
            patients[i].display();
        }
        System.out.println("=======================");
    }
    Patient[] getPatients() {
        return patients;
    }

    int getPatientCount() {
        return patientCount;
    }

    class Patient {
        String name;
        int age;
        String illness;

        Patient(String name, int age, String illness) {
            this.name = name;
            this.age = age;
            this.illness = illness;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age + ", Illness: " + illness);
        }
    }

    static class HealthStats {
        static void averageAge(Hospital h) {
            if (h.getPatientCount() == 0) {
                System.out.println("No patients to calculate average age.");
                return;
            }
            int sum = 0;
            for (int i = 0; i < h.getPatientCount(); i++) {
                sum += h.getPatients()[i].age;
            }
            double avg = (double) sum / h.getPatientCount();
            System.out.println("Average Age of Patients: " + avg);
        }

        static void listIllnesses(Hospital h) {
            if (h.getPatientCount() == 0) {
                System.out.println("No patients to list illnesses.");
                return;
            }
            System.out.print("Common Illnesses: ");
            for (int i = 0; i < h.getPatientCount(); i++) {
                System.out.print(h.getPatients()[i].illness + " ");
            }
            System.out.println();
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(10); // max 10 patients

        hospital.admitPatient("Alice", 30, "Flu");
        hospital.admitPatient("Bob", 45, "Fever");
        hospital.admitPatient("Charlie", 25, "Flu");

        hospital.displayPatients();

        hospital.dischargePatient("Bob");

        hospital.displayPatients();

        Hospital.HealthStats.averageAge(hospital);
        Hospital.HealthStats.listIllnesses(hospital);
    }
}