package csc325.moduletenassignment;

/**
 * Generates professional clothing.
 * @author Jonathan Crain
 */
public class ProfessionalOutfitFactory implements OutfitFactory{
    @Override
    public ProfessionalTop makeTop(){
        return new ProfessionalTop();
    }
    
    @Override
    public ProfessionalPants makePants(){
        return new ProfessionalPants();
    }
    
    @Override
    public ProfessionalShoes makeShoes(){
        return new ProfessionalShoes();
    }
}
