/**
 * Snake class that implements attributes of Animal parent class
 */
public class Snakes extends Animal {

    /**
     * each snake has a
     * @param name snake name
     * @param age snake age
     * @param charOne color
     * @param charTwo breed
     */
    public Snakes(String name, int age, String charOne, String charTwo){
        super(name, age, "snake" ,"reptile", "mice", "HSSSSS", charOne, charTwo);
    }
}
