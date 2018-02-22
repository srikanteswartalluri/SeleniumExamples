public class Manager {

    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Constructor
    public Manager(String name, int age, int salary) {
        System.out.println("first method");
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Manager(String name, int age) {
        System.out.println("second method");
        this.name = name;
        this.age = age;
    }



    public Manager() {
        System.out.println("third method");
        this.salary = 5000;
    }



}
