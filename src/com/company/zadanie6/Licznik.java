package com.company.zadanie6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Utwórz program liczący kliknięcia przyciskiem plus, a przyciskiem minus zmniejszający wynik. Utwórz klasę `Licznik` dziedziczącą po `JFrame` oraz implementującą `ActionListener`. Klasa ma prywatne pole `label` typu `JLabel`. W konstruktorze dodaj tytuł `Licznik`, przycisk `+`, przycisk `-` , etykietę `0`. Utwórz panel z siatką typu `Grid`. Do panelu dodaj przyciski. Okno ma mieć wielkość 250 na 70. Przyciski mają mieć podłączoną odpowiednie metodę, która zwiększa licznik dla przycisku `+` oraz zmniejsza licznik dla przycisku `-`. Formatkę uruchom w `main`.
 */

public class Licznik extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private final JLabel label;

    public Licznik() {
        super("Licznik");
        JButton btnInc = new JButton("+");
        btnInc.addActionListener(this);
        JButton btnDec = new JButton("-");
        btnDec.addActionListener(this);
        label = new JLabel("0");

        JPanel p = new JPanel(new GridLayout(1, 3));
        p.add(btnInc);
        p.add(btnDec);
        p.add(label);

        setContentPane(p);
        setSize(250, 70);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("+")) {
            int n = Integer.parseInt(label.getText()) + 1;
            label.setText(Integer.toString(n));
        } else if (e.getActionCommand().equals("-")) {
            int n = Integer.parseInt(label.getText()) - 1;
            label.setText(Integer.toString(n));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Licznik::new);
    }

}