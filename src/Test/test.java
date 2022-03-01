package Test;

import View.QLSVVIew;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new QLSVVIew();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
