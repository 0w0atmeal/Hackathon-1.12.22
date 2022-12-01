import java.util.ArrayList;

public class App {
    
    static ArrayList<Tier> tiere;
    public static void main(String[] args) throws Exception {
        setTiere(new ArrayList<Tier>());
        createAnimals();
        aendereEssbar(true);
        zeigeDaten();   
        aendereEssbar(false);
        zeigeDaten();
    }

    public static void zeigeDaten(){
        int i = 1; // eine Methodenvariable i vom Typ Integer wird deklariert und mit dem Wert 1 initialisiert
        for(Tier tiere : getTiere()){
            System.out.print(i + ". ");
            tiere.werBinIch();
            i++;
        }
    }

    public static void createAnimals(){
        tiere.add(new Insekt("Mehlwurm", 1 , true, 0));
        tiere.add(new Raubtier("Wolf", 70, false, "grau"));
        tiere.add(new Vogel("Huhn", 25, true, "braun"));

    }

    public static void setTiere(ArrayList<Tier> tiere) {
        App.tiere = tiere;
    }

    public static ArrayList<Tier> getTiere() {
        return tiere;
    }

    public static void aendereEssbar(boolean Wert){ //einer Methode wird ein booleanischer Wert mitgegeben
        for(Tier tiere : getTiere()){
            tiere.setEssbar(Wert);
        }
    }
}
