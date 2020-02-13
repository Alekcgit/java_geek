import javax.swing.*;
import java.awt.*;
//Урок 8 задание 1
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Время было очень мало - работал до поздна пока смог сделать только так
public class BorderLayout4 {

    static public class MyWindow extends JFrame {
        public MyWindow() {
            setBounds(600, 300, 600, 600);
            setTitle("GridLayoutDemo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JButton[] jbs = new JButton[1];
            setLayout(new GridLayout(1, 0));
            int i = 0;
            jbs[i] = new JButton("Java уровень 1 пройден");
            add(jbs[i]);

            jbs[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(((JButton)e.getSource()).getText() + " Ура Ура Ура");
                }
            });
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyWindow();
    }

}