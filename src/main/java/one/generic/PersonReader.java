package one.generic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class PersonReader {
    private static final String personsFileName = "persons.csv";

    public Collection<Person> readPersons() {
        Collection<Person> persons = new ArrayList<Person>();

        //Želimo od pročitane linije dobiti jedan person objekat
        //Polja u toj liniji će biti prebačena u polja tog objekta


        try(FileReader fileReader = new FileReader(personsFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while(true){
                String line = bufferedReader.readLine(); // tekst te linije ILI null ako nema više
                if(line == null){
                    break;
                }
                Person person = convertLineToPerson(line);
                persons.add(person);
            }

        }catch (IOException e){
            System.err.println("Problem na čitanju persons.csv: " + e.getMessage());
        }
        return persons;
    }
    //Primjer: Tarik;Fejzić;15.6.2006;M
    private Person convertLineToPerson(String line) {
        /**
         * Raščlanio polja linije
         */
        //Tarik;Fejzić;15.6.2006;M
        String[]  lineFields = line.split(";"); // String[] 0 Tarik 1 Fejzić 2 15.6.2006 3 M
        String name = lineFields[0];//Tarik
        String surname = lineFields[1];//Fejzić
        String datum = lineFields[2];//15.6.2006
        String[] poljaDatuma = datum.split("\\.");
        int day = Integer.parseInt(poljaDatuma[0]); // "15" -> 15
        int month = Integer.parseInt(poljaDatuma[1]);// "6" -> 6
        int year = Integer.parseInt(poljaDatuma[2]); //"2006" -> 2006
        LocalDate birthday = LocalDate.of(year, month, day);
        String genderText = lineFields[3];
        Gender gender = genderText.equals("M") ? Gender.MALE : Gender.FEMALE;
        /**
         * Na osnovu raščlanjenih polja kreirao Person objekat pozivajuć konstruktor klase Person
         */
        return new Person(name, surname, birthday, gender);
    }
}
