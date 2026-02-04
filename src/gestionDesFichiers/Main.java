package gestionDesFichiers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("-------------Menu--------------");
            System.out.println("0.Quitter.");
            System.out.println("1.Create le fichier.");
            System.out.println("2.Ecrire dans le fichier.");
            System.out.println("3.Lire le fichier.");
            System.out.println("4.Supprimer le fichier.");
            System.out.print("Le choix : ");
            choix =  sc.nextInt();
            switch (choix) {
                case 1:
                    Services.creation();
                    break;
                case 2:
                    Services.Ecriture();
                    break;
                case 3:
                    Services.Lecture();
                    break;
                case 4:
                    Services.supprimer();
                    break;
                default:
                    System.out.println("Wrong choix!");
                    break;
            }
        }while (choix != 0);
    }
}