package six.i18n;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Prozor {

    static JComboBox<String> languageComboBox = new JComboBox<>();
    static JComboBox<String> countryComboBox = new JComboBox<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Language Settings");

        languageComboBox.addItem("en");
        languageComboBox.addItem("fr");
        languageComboBox.addItem("de");
        languageComboBox.addItem("bs");

        countryComboBox.addItem("US");
        countryComboBox.addItem("GB");
        countryComboBox.addItem("FR");
        countryComboBox.addItem("CA");
        countryComboBox.addItem("DE");
        countryComboBox.addItem("BA");

        JButton button = new JButton("Launch");
        button.addActionListener(Prozor::runApp);

        frame.setLayout(new FlowLayout());
        frame.add(languageComboBox);
        frame.add(countryComboBox);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void runApp(ActionEvent actionEvent) {
        String language = (String) languageComboBox.getSelectedItem();
        String country = (String) countryComboBox.getSelectedItem();
        ResourceBundle resourceBundle = getResource(language, country);

        String yes = resourceBundle.getString("yes");
        String no = resourceBundle.getString("no");
        String noEggsNoHam = resourceBundle.getString("noEggsNoHam");
        String question = resourceBundle.getString("question");
        String sillyQuestion = resourceBundle.getString("sillyQuestion");

        String[] options = {yes, no, noEggsNoHam};
        JOptionPane.showOptionDialog(null,
                question, sillyQuestion,
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);
    }

    private static ResourceBundle getResource(String[] args) {
        String language;
        String country;
        if (args.length != 2) {
            language = "en";
            country = "US";
        } else {
            language = args[0];
            country = args[1];
        }
        return getResource(language, country);
    }


    private static ResourceBundle getResource(String language, String country) {
        Locale currentLocale = new Locale(language, country);
        return ResourceBundle.getBundle("messages", currentLocale);
    }
}
