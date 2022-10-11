abstract class animals{
   String Name;
   abstract void animalSound();
   abstract void eat();
   abstract void sleep();
}
class Lion extends animals{
    void animalSound(){
        System.out.println("Lion sound :"+"roars");

    }
    void eat(){
        System.out.println("Liom eats flesh ");
    
    }
    void sleep(){
        System.out.println("Male lions sleep on average 20 hours a day while lionesses sleep around 13-15");

    }
    void animalname(){
        System.out.println(Name);

    }
    

}
public class inheritance{
    public static void main(String[] args) {
        animals Animal=new Lion();
        Animal.Name="Lion";
        Animal.animalSound();
        Animal.eat();
        Animal.sleep();
    }
}
