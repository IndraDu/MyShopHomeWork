package flowers;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    public ArrayList<Peony> peony = new ArrayList<Peony>();

    public String addPeony(Peony peony) {
        this.peony.add(peony);
        return peony.name + "Added to your basket!";
    }

    public ArrayList<Peony> getAllPeonys() { return peony; }

    public Peony getOnePeony(int peonyId) { return this.peony.get(peonyId); }

    public String removePeony(int peonyId){
        try {
            peony.remove(peonyId);
        }catch (Exception ex){
            return "Unable to remove this peony from your basket!";
        }
        return "Peony removed from your basket!";
    }

}
