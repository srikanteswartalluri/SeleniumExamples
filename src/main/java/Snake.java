public class Snake extends Animal{
    @Override
    public void move() {
        System.out.println("Snake: i am crawls");
    }

    @Override
    public void makeSound() {
        System.out.println("Snake: hissing");

    }

    public void shedskin(){
        System.out.println("Snake: shed skin");
    }


}
