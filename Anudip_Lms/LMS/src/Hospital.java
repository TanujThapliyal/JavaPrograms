public class Hospital {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Dr. Smith", 10, "Cardiovascular");
        surgeon.diagnose();
        surgeon.treatPatient();
        surgeon.operate();

        System.out.println();

        Nurse nurse = new Nurse("Nurse Johnson", 5, "Surgical");
        nurse.diagnose();
        nurse.treatPatient();
        nurse.provideCare();

        System.out.println();
    }
}

class Doctor {
    String name;
    int experienceYears;

    public Doctor(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public void diagnose() {
        System.out.println(name + " is diagnosing the patient.");
    }

    public void treatPatient() {
        System.out.println(name + " is treating the patient.");
    }
}
class Surgeon extends Doctor {
    String specialization;

    public Surgeon(String name, int experienceYears, String specialization) {
        super(name, experienceYears);
        this.specialization = specialization;
    }
    public void treatPatient() {
        System.out.println(name + " is performing surgery as a " + specialization + " surgeon.");
    }

    public void operate() {
        System.out.println(name + " is operating on the patient.");
    }
}
// Subclass Nurse (Hierarchical Inheritance)
class Nurse extends Doctor {
    String role;

    public Nurse(String name, int experienceYears, String role) {
        super(name, experienceYears);
        this.role = role;
    }
    public void diagnose() {
        System.out.println(name + " is assisting in patient diagnosis as a " + role + " nurse.");
    }

    public void provideCare() {
        System.out.println(name + " is providing care to the patient.");
    }
}
