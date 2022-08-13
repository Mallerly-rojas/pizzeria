import javax.swing.*;

public class pizza {

    int jamon = 500, pereroni = 900, pollo = 700, tomate = 300, atun = 1200, albaca = 400, champiñones = 800;
    int pizza = 5000;
    int precio=0;
    int pizzas=0;
    String [][] pizzaAcomprar = new String[pizzas][6];

    public pizza() {
        menu();
    }


    public void menu() {
        pizzas = Integer.parseInt(JOptionPane.showInputDialog("¿cuantas pizzas desea llevar?"));

        String entrada = JOptionPane.showInputDialog("Ingredientes\n\n" +
                "1: jamón\n" +
                "2: peperoni\n" +
                "3: pollo\n" +
                "4: tomate\n" +
                "5: atun\n" +
                "6: albaca\n" +
                "7: champiñoness");
        switch (entrada) {
            case "1":
                 precio = pizza + jamon;
                if (JOptionPane.showConfirmDialog(null, "¿vas a agregar más ingrdientes") == 0) {

                } else {

                    menu();
                }
                break;
            case "2":
                precio = pizza + pereroni;

                if (JOptionPane.showConfirmDialog(null, "¿vas a agregar más ingrdientes") == 0) {

                } else {
                    menu();
                }
                break;
            case "3":
                precio = pizza + pollo;

                if (JOptionPane.showConfirmDialog(null, "¿vas a agregar más ingrdientes") == 0) {

                } else {
                    menu();
                }
                break;
            case "4":
                precio = pizza + tomate;

                if (JOptionPane.showConfirmDialog(null, "¿vas a agregar más ingrdientes") == 0) {

                } else {
                    menu();
                }
                break;
            case "5":
                precio = pizza + atun;

                if (JOptionPane.showConfirmDialog(null, "¿vas a agregar más ingrdientes") == 0) {

                } else {
                    menu();
                }
                break;
            case "6":
                precio = pizza + albaca;

                if (JOptionPane.showConfirmDialog(null, "¿vas a agregar más ingrdientes") == 0) {

                } else {
                    menu();
                }
                break;
            case "7":
                precio = pizza + champiñones;

                if (JOptionPane.showConfirmDialog(null, "¿vas a agregar más ingrdientes") == 0) {

                } else {
                    menu();
                }
                break;
        }

    }
    public static void main(String[] args) {
        new pizza();

    }


}
