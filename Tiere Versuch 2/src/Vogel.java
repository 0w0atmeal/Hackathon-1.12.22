public class Vogel extends Tier {
    
    String federfarbe;

    public Vogel(String name, int groesse, Boolean essbar, String federfarbe){
        super(name, groesse, essbar);
        setFederfarbe(federfarbe);
    }

    public void setFederfarbe(String federfarbe) {
        this.federfarbe = federfarbe;
    }
    public String getFederfarbe() {
        return federfarbe;
    }

    public void werBinIch(){
        System.out.println(getName() + " " + getGroesse() + " " + getEssbar() + " " + getFederfarbe());
    }
   
}
