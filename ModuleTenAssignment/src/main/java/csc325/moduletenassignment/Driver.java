package csc325.moduletenassignment;

/**
 * Driver class for CSC 325 Module 10 Assignment.
 * @author Jonathan Crain
 */
public class Driver {
    //Enumerate the three possible types of outfits.
    public static enum outfitType {PARTY, CASUAL, PROFESSIONAL;}
    //Use this variable to configure the simulator.
    final static outfitType OUTFIT_TYPE = outfitType.PARTY;
    
    //Sets up the simulator based on the OUTFIT_TYPE chosen by the user.
    private static OutfitSimulatorApplication configureSimulator(){
        OutfitSimulatorApplication sim = switch (OUTFIT_TYPE){
            case PARTY -> {yield new OutfitSimulatorApplication(new PartyOutfitFactory());}
            case CASUAL -> {yield new OutfitSimulatorApplication(new CasualOutfitFactory());}
            case PROFESSIONAL -> {yield new OutfitSimulatorApplication(new ProfessionalOutfitFactory());}
        };
        return sim;
    }
    
    //Main sets up the simulator, then generates and "tries on" the outfit it made.
    public static void main(String[] args) {
        OutfitSimulatorApplication sim = configureSimulator();
        sim.tryOnOutfit();
    }
}
