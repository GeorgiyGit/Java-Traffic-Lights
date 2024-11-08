package SemaforClasses;

public class Svetlo {
    private Kruh svetielko;
    private boolean svieti;

    private int poziciaX;
    private int poziciaY;

    private String farba;

    public Svetlo(int poziciaX, int poziciaY, String farba){
        this.poziciaX = poziciaX;
        this.poziciaY = poziciaY;
        this.farba = farba;

        svetielko=new Kruh();
    }
    public void rozsviet(){
        svieti = true;
    }
    public void zhasni(){
        svieti = false;
    }

    public int getPoziciaX(){
        return poziciaX;
    }
    public int getPoziciaY(){
        return poziciaY;
    }
    public String getFarba(){
        return farba;
    }
}
