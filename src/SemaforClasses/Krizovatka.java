package SemaforClasses;

public class Krizovatka {
    private Cesta cestaA;
    private Cesta cestaB;

    private Semafor semafor1;
    private Semafor semafor2;

    private Casovac casovac;

    private int state;
    public Krizovatka() {
        this.cestaA=new Cesta(10,1,1,1);
        this.cestaB=new Cesta(10,1,0,-1);

        this.semafor1=new Semafor(0,0);
        this.semafor2=new Semafor(0,0);

        casovac=new Casovac(this::Tik);
        casovac.start();
    }

    public void Tik(){

        //red green
        //red/yellow yellow
        //green red
        //yellow red/yellow
        switch(state){
            case 0:
                this.semafor1.rozsvietStoj();
                this.semafor2.rozsvietVolno();
                break;
            case 1:
                this.semafor1.rozsvietPripravSa();
                this.semafor2.rozsvietPozor();
                break;
            case 2:
                this.semafor1.rozsvietVolno();
                this.semafor2.rozsvietStoj();
                break;
            case 3:
                this.semafor1.rozsvietPozor();
                this.semafor2.rozsvietPripravSa();
                break;
        }

        state++;
        if(state==4)state=0;
    }
}
