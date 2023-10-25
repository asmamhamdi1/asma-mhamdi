public class testpersonne {
    public static void main(String[] args) {
        personne p=new personne();
        p.setFirstName("asma");
        System.out.println("votre prenom est: "+p.firstName);
        p.setName("mhamdi");
        System.out.println("votre nom est: "+p.name);
        p.setDateNaiss(06,09,2001);
        System.out.println("votre age est "+p.ageEn2023());
    }
}