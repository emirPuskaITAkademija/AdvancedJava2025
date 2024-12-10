package one.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int number = 23;
        number = 24;
        System.out.println("Unesi broj:");
        //Hoću sistemski input
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        //Kocene i čeka korisnika koji će u konzoli unijeti neki broj
        int uneseniBroj = scanner.nextInt();

        int divisionResult = number / uneseniBroj;
        System.out.println("Rezultat dijeljenja je " + divisionResult);

        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = number;
        System.out.println(numbers[2]);

        System.out.println("Unesi ime fajla");
        String nazivFajla = new Scanner(System.in).nextLine();
        try {
            String pročitaniSadržajFajla = procitajFajl(nazivFajla);
            System.out.println(pročitaniSadržajFajla);
        } catch (IOException e) {
            String errorMessage = e.getMessage();
            System.err.println("Poruka od Jave : " + errorMessage);
        }
    }

    static String procitajFajl(String imeFajla) throws IOException {
        FileReader fileReader = new FileReader(imeFajla);//FileNotFoundException
        //int -> char ili -1 ako je do kraja fajla stigla
        String resultat = "";
        while(true){
            int pročitaniKarakter = fileReader.read();//IOException
            if(pročitaniKarakter==-1){
                break;
            }
            char slovo = (char) pročitaniKarakter;
            resultat = resultat + slovo;
        }
        return resultat;
    }
}
