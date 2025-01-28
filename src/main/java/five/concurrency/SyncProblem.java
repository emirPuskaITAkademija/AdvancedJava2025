package five.concurrency;
//Proces promjene varijable
//1. dohvatimo staru vrijednost 23
//2. mijenjamo staru na novu ++ 24 -- 22
//3. vrati nazad u memoriju novu vrijednost 24
public class SyncProblem {
    public static void main(String[] args) {
        //1. Thread interferencija
        // Thread 1  -> ++
        // Thread 2 -> --
        int number = 23;
        //1. Thread 1 -> korak1: uzeo 23
        //2. Thread 2 -> korak1: uzeo 23
        //3. Thread 1 -> korak2: izmjena na 24
        //4. Thread 2 -> korak2: izmjena na 22
        //5. Thread 1 -> korak3: vratiti 24
        //6. Thread 2 -> korak3: vratiti 22 -> ĐABA SI RADIO SVOJ posao


    }
}
