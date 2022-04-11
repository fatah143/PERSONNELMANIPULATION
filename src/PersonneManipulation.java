class Personne {

    /* variable d'instance */
    public String nom;
    public String prenom;
    public int age;
}

public class PersonneManipulation {
    /* vairable statique */

    static int ageModifier;
    public static void main(String[] args) {
        /* Objet */
        Personne personne1 = new Personne();
        personne1.nom = "Haya";
        personne1.prenom = "Michel";
        personne1.age = 45;

        ageModifier = ageDansUnAns(personne1.age);

        System.out.println(" Prenom = " + personne1.prenom + "\n Nom = " + personne1.nom + "\n Age = " + personne1.age + "\n Age modifier = " + ageModifier) ;
    }

    private static int ageDansUnAns(int age) {
        int ageDansUnAns; // variable locale
        ageDansUnAns=age+1;
        return ageDansUnAns;
    }
}


