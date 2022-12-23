/**
 * Lion class that implements attributes of Animal parent class
 */
public class Lion extends Animal{

    /**
     * each lion has a
     * @param name lion name
     * @param age lion age
     * @param charOne color
     * @param charTwo breed
     */
    public Lion(String name, int age, String charOne, String charTwo){
        super(name, age,"lion","mammal", "zebra", "ROAR!",charOne, charTwo);
    }
}
