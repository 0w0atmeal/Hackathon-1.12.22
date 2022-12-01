public abstract class Tier {
 
    String name;
    int groesse;
    boolean essbar;

    public Tier(String name, int groesse, boolean essbar){
        setName(name);
        setGroesse(groesse);
        setEssbar(essbar);
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEssbar(boolean essbar) {
        this.essbar = essbar;
    }
    public int getGroesse() {
        return groesse;
    }
    public String getName() {
        return name;
    }
    public boolean getEssbar(){
        return essbar;
    }

    public abstract void werBinIch();


}
