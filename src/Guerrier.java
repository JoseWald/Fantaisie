package src;

public class Guerrier  extends Unite{
    public Guerrier(String nom){
        super(nom, 100,20);
    }
    
    @Override
    public void attaque(Unite cible){
        if(this.getPV()>0){
            cible.subirDegat(this.getAttaque());
        }
      
    }
}
