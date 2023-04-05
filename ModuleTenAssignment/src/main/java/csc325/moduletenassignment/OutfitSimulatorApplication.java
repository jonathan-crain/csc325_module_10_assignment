package csc325.moduletenassignment;

/**
 *
 * @author Jonathan Crain
 */
public class OutfitSimulatorApplication {

    private Top top;
    private Pants pants;
    private Shoes shoes;

    /*Simulates an outfit by getting a Top, Pants, and Shoes, all from the same 
    * factory. Since it's a single factory, the outfit be of the same type, and 
    * every garment will match.*/
    public OutfitSimulatorApplication(OutfitFactory factory) {
        top = factory.makeTop();
        pants = factory.makePants();
        shoes = factory.makeShoes();
    }

    //Just a way to demonstrate the outfit components which were made.
    public void tryOnOutfit() {
        top.putOn();
        pants.putOn();
        shoes.putOn();
    }
}
