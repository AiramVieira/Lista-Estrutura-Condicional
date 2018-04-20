import javax.swing.JOptionPane;

public class Exercicio21{

        public static void main(String[] args) {
            
            double valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro lado do triângulo"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo lado do triângulo"));
            double valor3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro lado do triângulo"));

                if((valor1 == valor2) && valor3 == valor1){
                    JOptionPane.showMessageDialog(null, "Seu triangulo é equilátero");
                }else if((valor1 == valor2) && valor3 != valor1){
                    JOptionPane.showMessageDialog(null, "Seu triângulo é isóceles");
                }else if((valor2 == valor3) && valor2 != valor1){
                    JOptionPane.showMessageDialog(null, "Seu triângulo é isóceles");
                }else if((valor1 == valor3) && valor2 != valor1){
                    JOptionPane.showMessageDialog(null, "Seu triângulo é isóceles");
                }else if((valor1 != valor2) && valor3 != valor1){
                    JOptionPane.showMessageDialog(null, "Seu triângulo é escaleno");
                }
        }
    }