/**
 * Bird class that implements attributes of Animal parent class
 */
public class Birds extends Animal{

    /**
     * each bird has a
     * @param name bird name
     * @param age bird age
     * @param charOne color
     * @param charTwo breed
     */
    public Birds(String name, int age, String charOne, String charTwo){
        super(name, age, "bird", "aves", "worms", "Chirp Chirp!", charOne, charTwo);
    }
}
