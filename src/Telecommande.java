import java.util.ArrayList;

public class Telecommande {

    public ArrayList<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil a) {
        this.appareils.add(a);
    }

    public void activer(int n) {
        Appareil a = this.appareils.get(n);
        a.allumer();
    }

    public void desactiver(int n) {
        Appareil a = this.appareils.get(n);
        a.eteindre();
    }

    public void activerTout() {
        if (!this.appareils.isEmpty()) {
            for (Appareil a : this.appareils) {
                a.allumer();
            }
        }
    }

    public String toString() {
        String mess = "Telecommande(";
        for (int i = 0; i < appareils.size(); i++) {
            if (i == appareils.size() - 1) {
                mess += appareils.get(i).toString();
            } else {
                mess += appareils.get(i).toString() + ",";
            }
        }
        mess += ")";
        return mess;
    }
}
