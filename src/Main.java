public class Main
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);

        System.out.println("The first dog's name is " + dog1.getName());
        System.out.println(dog1.getName() + "'s weight in pounds" + dog1.inKg());
    }
}
