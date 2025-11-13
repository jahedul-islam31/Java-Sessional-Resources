class Person {
    void displayInfo() {
        System.out.println("This is a person.");
    }
}

class Doctor extends Person {
    void work() {
        System.out.println("Doctor treats patients.");
    }
}

class Teacher extends Person {
    void work() {
        System.out.println("Teacher teaches students.");
    }
}

class Engineer extends Person {
    void work() {
        System.out.println("Engineer builds and designs things.");
    }
}

public class ProfessionDemo {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Engineer e = new Engineer();

        d.displayInfo();
        d.work();

        t.displayInfo();
        t.work();

        e.displayInfo();
        e.work();
    }
}
