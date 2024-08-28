import  src.Royaume;
import src.Unite;
import src.Guerrier;
import src.Mage;


public class Main {
    public static void main(String[] args){
        Royaume royaume=new Royaume("Royaumme  Fantastique",100f);
        Unite guerrier=new Guerrier("Guerrier A");
        Unite mage=new Mage("Mage A");

        royaume.recruterUnite(guerrier);
        royaume.recruterUnite(mage);

        royaume.listeUnite();

        Royaume royaume2=new Royaume("Royaumme  Fantastique",89f);
        Unite guerrier2=new Guerrier("Guerrier B");
        Unite mage2=new Mage("Mage B");

        royaume2.recruterUnite(guerrier2);
        royaume2.recruterUnite(mage2);

        royaume2.listeUnite();

        royaume.attaquer(royaume2);

        System.out.println("RESULTAT APRES CONQUETE:");

        royaume2.listeUnite();


        
    }
}