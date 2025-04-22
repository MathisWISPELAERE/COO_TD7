import java.util.ArrayList;

public class Telecommande {

    public ArrayList<Object> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<Object>();
    }

    public void ajouterLampe(Lampe a) {
        this.appareils.add(a);
    }

    public void ajouterHifi(Hifi h) {
        this.appareils.add(h);
    }


    public void activer(int n) {
        if (this.appareils.get(n) instanceof Hifi) {
            Hifi h = (Hifi) this.appareils.get(n);
            h.allumer();
        } else {
            Lampe h = (Lampe) this.appareils.get(n);
            h.allumer();
        }
    }

    public void desactiver(int n) {
        if (!(n > this.appareils.size())) {
            if (this.appareils.get(n) instanceof Hifi) {
                Hifi h = (Hifi) this.appareils.get(n);
                h.eteindre();
            } else {
                Lampe h = (Lampe) this.appareils.get(n);
                h.eteindre();
            }
        }
    }

    public void activerTout() {
        if (!this.appareils.isEmpty()) {
            for (int i = 0; i < this.appareils.size(); i++) {
                if (this.appareils.get(i) instanceof Hifi) {
                    Hifi h = (Hifi) this.appareils.get(i);
                    h.allumer();
                } else {
                    Lampe h = (Lampe) this.appareils.get(i);
                    h.allumer();
                }
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
