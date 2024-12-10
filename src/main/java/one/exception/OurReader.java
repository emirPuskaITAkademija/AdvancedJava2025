package one.exception;

import java.io.Closeable;
import java.io.IOException;

public class OurReader implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Zatvaramo radnje nedeljom..Više ne radimo nedeljom, ali zato se još puši u zatvorenim prostorijama..");
    }
}
