package csc325.moduletenassignment;

/**
 * Generates party clothing.
 * @author Jonathan Crain
 */
public class PartyOutfitFactory implements OutfitFactory{
    @Override
    public PartyTop makeTop(){
        return new PartyTop();
    }
    
    @Override
    public PartyPants makePants(){
        return new PartyPants();
    }
    
    @Override
    public PartyShoes makeShoes(){
        return new PartyShoes();
    }
}
