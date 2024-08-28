package src;

public class Mage  extends Unite{
    public Mage(String nom){
        super(nom,80, 25);
    }

    @Override
    public void attaque(Unite cible){
        if(this.getPV()>0){
            cible.subirDegat(this.getAttaque());
        }
      
    }
     
}
