package src;

public  abstract class Unite {
    private String nom;
    private float puissance;
    private float PV;

    public Unite(String nom, float puissance, float PV) {
        this.nom = nom;
        this.PV=PV;
        this.puissance = puissance;
    }



    public float getPV(){
        return this.PV;   
    }
    public String getNom() {
        return this.nom;
    }
    public float getAttaque(){
        return this.puissance;
    }

    public  abstract void attaque(Unite cible);

    public void subirDegat(float degat){
        this.PV-=degat;
        if(this.PV<0) this.PV=0f;
    }

    
}
