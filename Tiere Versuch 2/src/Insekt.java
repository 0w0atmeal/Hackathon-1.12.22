public class Insekt extends Tier{
    
    int fluegel;

    public Insekt(String name, int groesse, boolean essbar, int anzahlFluegel){
        super(name, groesse, essbar);
        setFluegel(anzahlFluegel);
    }
    
    public void setFluegel(int fluegel) {
        this.fluegel = fluegel;
    }
    public int getFluegel() {
        return fluegel;
    }

    public void werBinIch(){
        System.out.println(getName() + " " + getGroesse() + " " + getEssbar() + " " + getFluegel());    
    }
}
