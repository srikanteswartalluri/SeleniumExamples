public class Dog extends Animal {


    public void makeSound(){
        System.out.println("Dog: Barking");
    }

    @Override
    public void move() {
        System.out.println("Dog: walks");
    }

    @Override
    public void showLove() {
        System.out.println("Dog: wiggling tail");


    }


    public void beLoyal(){
        System.out.println("Dog: yes master");
    }
}
