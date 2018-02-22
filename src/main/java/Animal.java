public class Animal {
    int age;
    int no_of_limbs;
    String colour;




//behaviours
    public static void describe(){
        System.out.println("I am an animal");
    }


    public int add(int n, int m){
        return n + m;
    }

    public float add(float n, float m){
        return n + m;
    }

    public String add(String n, String m){
        return n + m;
    }

    //exercise :  write a method which take two strings as parameters and return a string combing both
    public String combineStrings(String a, String b){
        String tmp = a + b;
        return tmp;
    }

    //exercise: like the above mentioned method, write a method which takes

    public String combineStrings(String a, String b, String c){
        String tmp = a + b + c;
        return tmp;
    }

    public void makeSound(){
        System.out.println("Animal: making sound");
    }

    public void move(){
        System.out.println("Animal: moving");
    }

    public void showLove(){
        System.out.println("Animal: loving");
    }
}
