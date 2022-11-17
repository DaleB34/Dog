

public class Dog
{
    //instance variables
    private final String name;
    private int age;
    private final String breed;
    private int weight; // in pounds
    private static int count;


    //Constructors
    public Dog (String name, int age, String breed, int weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        count++;
    }//end full constructor

    public Dog()
    {
        name = "";
        age = 0;
        breed = "";
        weight = 0;
    }//end default constructor


    //Brain method
    public int inKg()
    {
        return (int) ( weight / 2.205);
    }

    //Static Variable
    public static int getCount()
    {
        return count;
    }

    //Getters
    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getAge()
    {
        return age;
    }

    public int getWeight()
    {
        return weight;
    }

    //Setters
    public void setAge(int myAge)
    {
        age = myAge;
    }

    public void setWeight(int myWeight)
    {
        weight = myWeight;
    }

    //ToString
    public String toString()
    {
        return name + "'s information \n"
                    + "Age: " + age + " years old \n"
                    + "Breed: " + breed + "\n"
                    + "Weight (in pounds): " + weight;
    }
}
