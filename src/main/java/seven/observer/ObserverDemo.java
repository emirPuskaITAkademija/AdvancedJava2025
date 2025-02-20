package seven.observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;

/**
 * GUI
 * <li>1. SWING</li>
 * <li>2. JavaFX </li>
 */
public class ObserverDemo{
    public static void main(String[] args) {
        //Observer/Subscriber - posmatrač
        //Observable - posmatrani
        //Pretplatnik -> Novine

        // 1 - to - many
        //Novine(NewYork Times) - to - many subscribers 100 000
        //Head First Design Pattern
        // MJERNE stanice - WeatherStation
        // Subscriber -> Display1 vlažnost, Display prosječnu temp, Display3 trenutno stanje

        //Kontejner - Prozor ili JFrame
        JFrame frame = new JFrame("Observer Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Kontejner
        JPanel panel = new JPanel();
        //Observable - dugmić na koji će se neko pretplatiti
        JButton newspaperButton = new JButton("Newspaper Publishing");
        Pretplatnik pretplatnik = new Pretplatnik();
        MrzovoljniPretplatnik mrzovoljniPretplatnik = new MrzovoljniPretplatnik();
        OpasniPretplatnik opasniPretplatnik = new OpasniPretplatnik();
        newspaperButton.addActionListener(pretplatnik);
        newspaperButton.addActionListener(mrzovoljniPretplatnik);
        newspaperButton.addActionListener(opasniPretplatnik);
        panel.add(newspaperButton);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    //Observer
    private static class Pretplatnik implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Primio sam novine i baš mi je drago što sam pretplatnik");
        }
    }

    private static class MrzovoljniPretplatnik implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Mrzovoljni pretplatnik je primio novine i nije mu drago..");
        }
    }

    private static class OpasniPretplatnik implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Opasni pretplatnik je primio novine i to je opasno");
        }
    }
}
