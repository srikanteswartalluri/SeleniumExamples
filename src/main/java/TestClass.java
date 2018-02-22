public class TestClass {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Snake s = new Snake();

        //<ClassName> <objectname> = new <ClassName>();
        Animal.describe();
        Dog.describe();

        String cstring = a.combineStrings("Simion", "Abobi");


        //String dstring = a.combineStrings("Simion", "Ab", "obi");

        a.makeSound();
        a.move();
        a.showLove();

        System.out.println("calling through dog's object");

        d.makeSound();
        d.move();
        d.showLove();

        System.out.println("calling through Snake's object");
        s.makeSound();
        s.move();
        s.showLove();
    }
}
