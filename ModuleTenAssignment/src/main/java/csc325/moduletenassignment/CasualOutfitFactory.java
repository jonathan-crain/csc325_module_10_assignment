package csc325.moduletenassignment;

/**
 * Generates casual clothing.
 * @author Jonathan Crain
 */
public class CasualOutfitFactory implements OutfitFactory{
    @Override
    public CasualTop makeTop(){
        return new CasualTop();
    }
    
    @Override
    public CasualPants makePants(){
        return new CasualPants();
    }
    
    @Override
    public CasualShoes makeShoes(){
        return new CasualShoes();
    }
}
