public class Raubtier extends Tier {
    
    String fellfarbe;

    public Raubtier(String name, int groesse, boolean essbar, String fellfarbe){
        super(name, groesse, essbar);
        setFellfarbe(fellfarbe);
    }

    public void setFellfarbe(String fellfarbe) {
        this.fellfarbe = fellfarbe;
    }
    public String getFellfarbe() {
        return fellfarbe;
    }
    
    public void werBinIch(){
        System.out.println(getName() + " " + getGroesse() + " " +  getEssbar() + " " + getFellfarbe());
    }

}
