public class Main
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45);
        Dog dog3 = new Dog("Spencer", 10, "German Shepherd", 57);

        //Fang's information
        System.out.println("The first dog's name is " + dog1.getName());
        System.out.println(dog1.getName() + "'s breed is a " + dog1.getBreed());
        System.out.println(dog1.getName() + "'s weight in pounds is " + dog1.getWeight()
                            + ". And its weight in kilograms is " + dog1.inKg());
        System.out.println(dog1.getName() + " is " + dog1.getAge() + " years old");

        System.out.println();

        //Piper's information
        System.out.println("The second dog's name is " + dog2.getName());
        System.out.println(dog2.getName() + "'s breed is a " + dog2.getBreed());
        System.out.println(dog2.getName() + "'s weight in pounds is " + dog2.getWeight()
                + ". And its weight in kilograms is " + dog2.inKg());
        System.out.println(dog2.getName() + " is " + dog2.getAge() + " years old");

        System.out.println();

        //Spencer's information
        System.out.println("The third dog's name is " + dog3.getName());
        System.out.println(dog3.getName() + "'s breed is a " + dog3.getBreed());
        System.out.println(dog3.getName() + "'s weight in pounds is " + dog3.getWeight()
                + ". And its weight in kilograms is " + dog3.inKg());
        System.out.println(dog3.getName() + " is " + dog3.getAge() + " years old");

        //Spencer grew a year older and gained a few pounds from eating wild birds
        dog3.setWeight(68);
        dog3.setAge(11);

        System.out.println();
        //all of the dogs' information

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println(dog3.toString());
        System.out.println("This was information for the " + Dog.getCount() + " dogs.");




    }
}
