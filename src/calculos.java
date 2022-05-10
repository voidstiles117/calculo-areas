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
            case(2):
                float ancho = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el ancho de el rectangulo: "));
                float alto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el alto de el rectangulo:"));
                float resultado = ancho * alto;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
            break;
            case(3):
                float altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la altura de el triangulo: "));
                float base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base de el triangulo: "));
                float areaTriangulo = base * altura / 2;
                JOptionPane.showMessageDialog(null, "El area de el angulo es: " + areaTriangulo + "cm");
            break;
            case(4):
                JOptionPane.showMessageDialog(null, "Saliste del programa");
            break;
            default:
                JOptionPane.showMessageDialog(null, "La opcion que ingresaste no es valida");
            }
        }while (true);
    }
}
