/**
 * Parent animal object class that can be applied to Lion, Zebra, Snake, and Birds
 */
public abstract class Animal {

    /**
     * animal name
     */
    private final String name;

    /**
     * what kind of animal it is
     */
    private final String animal;

    /**
     * animal age
     */
    private final int age;

    /**
     * class of each animal
     */
    private final String type;

    /**
     * prey of each animal
     */
    private final String prey;

    /**
     * noise each animal makes
     */
    private final String noise;

    /**
     * animal characteristic 1 is color
     */
    private final String charOne;

    /**
     * animal characteristic two is breed
     */
    private final String charTwo;

    /**
     * All of the different attributes of each animal
     * @param name each animal has a name
     * @param age each animal has a age
     * @param animal each animal is an animal
     * @param type each animal has a class
     * @param prey each animal has a prey
     * @param noise each animal makes a noise
     * @param charOne each animal has characteristic 1
     * @param charTwo each animal has characteristic 2
     */
    public Animal(String name, int age, String animal, String type, String prey, String noise, String charOne, String charTwo){
        this.name = name;
        this.age = age;
        this.animal = animal;
        this.type = type;
        this.prey = prey;
        this.noise = noise;
        this.charOne = charOne;
        this.charTwo = charTwo;
    }

    /**
     *
     * @return animal characteristic one
     */
    public String getCharOne(){
        return charOne;
    }

    /**
     *
     * @return animal characteristic two
     */
    public String getCharTwo(){
        return charTwo;
    }

    /**
     *
     * @return to String
     */
    public String toString(){
        return ("Name: " + name + " the " + animal + "" +
                "\nClass: " + type +
                "\nPrey: " + prey + "\nColor: " + getCharOne() +"\nBreed: " + getCharTwo());
    }

    /**
     *
     * @return animal name the animal
     */
    public String getName(){
        return (name + " the " + animal);
    }

    /**
     *
     * @return response when an animal is fed
     */
    public String FeedAnimal(){
        return ("Zookeeper feeds " + getName() + " some " + prey +
                ".\n" + getName() + " says " + noise);
    }

}
