import javax.swing.JOptionPane;

public class calculos{
    public static void main(String[] args) throws Exception {
        String menu = "1.Area de un circulo \n 2.Area de un rectangulo \n 3.Area de un triangulo \n 4.salir";
        do {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (op){
            case(1):    
                double pi = 3.1416;
                double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de el circulo: "));
                double perimetro = 2*radio*pi;
                double area = pi * Math.pow(radio, 2);
                JOptionPane.showMessageDialog(null, "Tu area es: " + area);
            break;
            }
        }while (true);
    }
}
