

public class Dog
{
    //instance variables
    private String name;
    private int age;
    private String breed;
    private int weight; // in pounds


    //Constructors
    public Dog (String name, int age, String breed, int weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
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
}
