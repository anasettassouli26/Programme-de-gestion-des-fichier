package gestionDesFichiers;

import java.io.*;
import java.util.Scanner;

public class Services {
    private static String dossier = "C:\\Users\\hm\\3D Objects\\Desktop\\Gestion des fichier\\src\\gestionDesFichiers\\FOLDER";
    private static String file;
    private static Scanner sc = new Scanner(System.in);

    public static void creation() {
        try{
            System.out.print("Entrez le nom de fichier : ");
            String name = sc.nextLine();

            file = dossier + "\\" +  name;
            File f = new File(file);
            boolean ex = f.createNewFile();
            if (ex) {
                System.out.println("File created");
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void Ecriture() {
        try{
            System.out.print("Entrez le nom de fichier : ");
            String name = sc.nextLine();

            file = dossier + "\\" +  name;

            System.out.print("Entrez le texte : ");
            String texte = sc.nextLine();

            FileWriter fw = new FileWriter(file, true);
            fw.write(texte + "\n");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void Lecture() {
        System.out.print("Entrez le nom de fichier : ");
        String name = sc.nextLine();

        file = dossier + "\\" +  name;

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ( (line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void supprimer() {
        try{
            System.out.print("Entrez le nom de fichier : ");
            String name = sc.nextLine();

            file = dossier + "\\" +  name;

            File f = new File(file);
            boolean i = f.delete();
            if (i) {
                System.out.println("File deleted");
            }else {
                System.out.println("File not deleted");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
