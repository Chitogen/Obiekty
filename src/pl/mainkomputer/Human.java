package pl.mainkomputer;

public class Human {
    String name;
    String surname;
    int age;
    int height;

    public Human(){
        System.out.println("Człowiek bez informacji");
    }
    public Human(String name,int age){
        System.out.println("Człowiek z imieniem i wiekiem");
        this.name = name;
        this.age = age;
    }
    public Human(String name,String surname,int age,int height){
        System.out.println("Człwiek z imieniem,nazwiskiem,wiekiem i wzrostem");
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }
}
