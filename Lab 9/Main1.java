class Student {

    private String name;
    private String id;
    private double cgpa;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Fahim");
        s1.setId("123");
        s1.setCgpa(3.85);

        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("CGPA: " + s1.getCgpa());
    }
}
