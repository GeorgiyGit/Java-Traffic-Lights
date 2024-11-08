package SemaforClasses;

public class Cesta {
    private Obdlznik cesta;

    private int dlzka;
    private int hrubka;

    private int polohaX;
    private int polohaY;

    public Cesta(int dlzka, int hrubka, int polohaX, int polohaY) {
        this.polohaX = polohaX;
        this.polohaY = polohaY;

        this.dlzka = dlzka;
        this.hrubka = hrubka;

        this.cesta=new Obdlznik();
    }

    public int getPolohaX() {
        return polohaX;
    }
    public int getPolohaY() {
        return polohaY;
    }

    public int getDlzka() {
        return dlzka;
    }
    public int getHrubka() {
        return hrubka;
    }
}
