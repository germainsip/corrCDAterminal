package org.afpa;

import java.util.Scanner;

public class Main {
    // TODO: factorisons tout ça!
    public static void main(String[] args) {
        //Les variables


        afficheTriangle();

        compteVoyelles();

        compteVoyelles();


        System.out.println("===========================================");
        System.out.println("|            Merci et à bientôt           |");
        System.out.println("===========================================");


    }

    public static void afficheTriangle(){
        Scanner sc = new Scanner(System.in);
        int nbLignes;

        System.out.println("=========================================");
        System.out.println("|      Commençons par un triangle       |");
        System.out.println("=========================================");
        System.out.println("Quel taille?");
        nbLignes = sc.nextInt();
        //affichage du triangle
        for (int i = 1; i < nbLignes+1; i++) {
            System.out.println(" ".repeat(nbLignes - i) +"*".repeat(2 * i - 1));
        }
    }

    public static void compteVoyelles(){
        Scanner sc = new Scanner(System.in);

        String mot;
        int nbVoyelles = 0;
        String VOYELLES = "aeiouy";

        System.out.println("===========================================");
        System.out.println("| Maintenant je vais compter les voyelles |");
        System.out.println("===========================================");
        System.out.println("Entrez un mot: ");
        mot = sc.nextLine().toLowerCase();
        for (char a : mot.toCharArray()) {
            nbVoyelles = (VOYELLES.indexOf(a) >= 0) ? (nbVoyelles+1) : nbVoyelles;
        }
        System.out.printf("Il y a %d voyelle(s) dans %s.\n",nbVoyelles,mot);
    }



}
