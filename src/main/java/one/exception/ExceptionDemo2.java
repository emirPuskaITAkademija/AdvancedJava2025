package one.exception;

import java.io.*;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        System.out.println("Unesi ime fajla");
        try(Scanner scanner = new Scanner(System.in)) {
            String nazivFajla = scanner.nextLine();
//            String pročitaniSadržajFajla = procitajFajl(nazivFajla);
            String sadržajFajla = procitatiFajl(nazivFajla);
//            System.out.println(pročitaniSadržajFajla);
            System.out.println(sadržajFajla);
            System.out.println("Pročitan FAJL");
        }
    }

    public static String procitatiFajl(String nazivFajla) {
        String result = "";
        try(FileReader fileReader = new FileReader(nazivFajla); BufferedReader br = new BufferedReader(fileReader)){
           while (true){
               String line = br.readLine();
               if(line == null){
                   break;
               }
               //akumulacija ->
               result += line;//result = result + line;
           }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        return result;
    }

    //try-catch-finally prije Jave 1.7
    //1.7 try with resource catch
    //UNNAPRIJEDITI ČITANJE FAJLA
    static String procitajFajl(String imeFajla) {
        //int -> char ili -1 ako je do kraja fajla stigla
        String resultat = "";
//        OurReader ourReader = new OurReader();
        try(OurReader ourReader = new OurReader()){

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        try (FileReader fileReader = new FileReader(imeFajla)) {
            while (true) {
                int pročitaniKarakter = fileReader.read();//IOException
                if (pročitaniKarakter == -1) {
                    break;
                }
                char slovo = (char) pročitaniKarakter;
                resultat = resultat + slovo;
            }
        } catch (IOException e) {
            System.err.println("Poruka od Java platforme: " + e.getMessage());
        }
        return resultat;
    }
}
