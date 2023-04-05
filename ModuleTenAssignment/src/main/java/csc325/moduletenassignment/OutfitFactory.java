package csc325.moduletenassignment;

/**
 * Basic interface implemented by outfit-type-specific factories.
 * @author Jonathan Crain
 */
public interface OutfitFactory {
    public Top makeTop();
    public Pants makePants();
    public Shoes makeShoes();
}
