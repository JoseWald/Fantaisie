package src;

import java.util.ArrayList;
import java.util.List;
public  class Royaume {
    private String nom;
    private Float or;
    private List<Unite> unites;

    public Royaume(String nom, float i) {
        this.nom = nom;
        this.or = i;
        this.unites=new ArrayList<Unite>();
    }

    public void recruterUnite(Unite unite){
        this.unites.add(unite);
    }

    public void listeUnite(){
        for(Unite u: this.unites){
            System.out.println(u.getNom()+" PV:"+u.getPV()+" Attaque:"+u.getAttaque());
        }
    }

    public void supprimerUnite(Unite unite){
        this.unites.remove(unite);
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return this.nom;
    }

    public float getOr(){
        return this.or;
    }

    public void attaquer(Royaume autreRoyaume){
        if(this.unites.isEmpty()){
            System.out.println(this.nom+" n'a pas d'unite pour attaquer");
            return;
        }

        Unite uniteAttaquante =this.unites.get(0);
        Unite uniteDefensive=autreRoyaume.unites.get(0);

        uniteAttaquante.attaque(uniteDefensive);
        System.out.println(uniteAttaquante.getNom()+" attaque "+uniteDefensive.getNom());

        if (uniteDefensive.getPV()<=0){
            autreRoyaume.supprimerUnite(uniteDefensive);
        }
    }

}
