package uipk;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import hellopk.Message;



public class UI {
    Scanner sc = new Scanner(System.in);


    public  String lireCommande() {
        System.out.println("------- COMMANDES ----------");
        System.out.println("creer Forum (F)");
        System.out.println("creer Canal (C)");
        System.out.println("lire messages (l)");
        System.out.println("emettre un nouveau message (e)");
        System.out.println("stop (s)");
        System.out.println("Que voulez-vous faire :");
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : " + str);
        return str;
    }

    public void afficher(String str) {
        System.out.println(str);
    }

    public String getNomDuForum(Set<String> nomsForum) {
       System.out.println("--- Forum disponibles --- ");
       afficheListe(nomsForum);
       System.out.println("==> Nom du Forum ?");
      return sc.nextLine();
    }

    public void afficheListe(Set<String> noms) {
        for (String nom : noms)
                  System.out.println("\t"+ nom);
    }


    public String getNomCanal(Set<String> nomsCanaux) {
        System.out.println("--- Boites disponibles --- ");
        afficheListe(nomsCanaux);
        System.out.println("==> Nom de la boite ?");
         sc.nextLine();
         return sc.nextLine();
    }


    public void afficherMessages(ArrayList<Message> arrayList) {
        int i = 1;
        if (arrayList == null) {
            System.out.println("\t Pas de messages ");
        } else
            for (Message m : arrayList) {
                System.out.println("\t" + i + "-\t" + m);
                i++;
            }
    }




    public String getValeur(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

}

