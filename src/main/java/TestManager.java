public class TestManager {
    public static void main(String[] args) {

        Manager m = new Manager("John", 23, 4000);
        Manager n = new Manager("Natasha", 25);
        Manager o = new Manager();

        Animal a = new Animal();

        int result = a.add(1, 2);
        System.out.println(result);

        String resultString = a.add("Simon", "Abobi");
        System.out.println(resultString);

        //float rf = a.add()


        System.out.println(n.getName());

        System.out.println(m.getName());
        System.out.println(m.getAge());
        System.out.println(m.getSalary());

        m.setAge(25);
        System.out.println(m.getAge());




        //error
       // System.out.println(m.salary);



      //  Manager n = new Manager();


    }
}
