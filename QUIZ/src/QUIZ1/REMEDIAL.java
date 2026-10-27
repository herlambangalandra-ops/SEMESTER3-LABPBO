package QUIZ1;

import javax.swing.JOptionPane;

public class REMEDIAL {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Berapa nilai yang mau dihitung?");
        int n = Integer.parseInt(input);

        double total = 0;
        for (int i = 1; i <= n; i++) {
            String nilai = JOptionPane.showInputDialog("Nilai ke-" + i + ":");
            total = total + Double.parseDouble(nilai);
        }

        double rata = total / n;

        JOptionPane.showMessageDialog(null,
            "Total       : " + total +
            "\nBanyak data : " + n +
            "\nRata-rata   : " + rata);
    }
}