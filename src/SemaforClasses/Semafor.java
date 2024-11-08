package SemaforClasses;

public class Semafor {
    private Svetlo cerveneSvetlo;
    private Svetlo zlteSvetlo;
    private Svetlo zeleneSvetlo;
    private Obdlznik pozadie;

    private int polohaX;
    private int polohaY;

    public Semafor(int polohaX, int polohaY){
        this.polohaX=polohaX;
        this.polohaY=polohaY;

        this.cerveneSvetlo=new Svetlo(polohaX,polohaY,"red");
        this.zlteSvetlo=new Svetlo(polohaX,polohaY,"yellow");
        this.zeleneSvetlo=new Svetlo(polohaX,polohaY,"green");
    }
    public void rozsvietStoj(){
        zhasniVsetko();
        cerveneSvetlo.rozsviet();
    }
    public void rozsvietPripravSa(){
        zhasniVsetko();
        zlteSvetlo.rozsviet();
        cerveneSvetlo.rozsviet();
    }
    public void rozsvietVolno(){
        zhasniVsetko();
        zeleneSvetlo.rozsviet();
    }
    public void rozsvietPozor(){
        zhasniVsetko();
        zlteSvetlo.rozsviet();
    }
    public void rozsvietVsetko(){
        cerveneSvetlo.rozsviet();
        zlteSvetlo.rozsviet();
        zeleneSvetlo.rozsviet();
    }

    private void zhasniVsetko(){
        this.cerveneSvetlo.zhasni();
        this.zlteSvetlo.zhasni();
        this.zeleneSvetlo.zhasni();
    }
}
