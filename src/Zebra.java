/**
 * Zebra class that implements attributes of Animal parent class
 */
public class Zebra extends Animal{

    /**
     * each zebra has a
     * @param name zebra name
     * @param age zebra age
     * @param charOne color
     * @param charTwo breed
     */
    public Zebra(String name, int age, String charOne, String charTwo){
        super(name, age,"Zebra","Mammal", "Grass", "HMMMPH",charOne, charTwo);

    }
}
