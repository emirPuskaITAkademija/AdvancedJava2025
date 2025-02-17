package six.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Hoću pokrenuti svoju app na način da joj
 * setuj ulazne argumente ili parametre.
 * Ti parametri predstavljaju language i country code.
 */
public class I18nSample {
    public static void main(String[] args) {
        String language;
        String country;
        if (args.length != 2) {
            language = "en";
            country = "US";
        } else {
            language = args[0];
            country = args[1];
        }

        Locale currentLocale = new Locale(language, country);
        //messages
        //messages_DE
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", currentLocale);
        System.out.println(resourceBundle.getString("greetings"));
        System.out.println(resourceBundle.getString("introduceMySelf"));
    }
}
