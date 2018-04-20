import javax.swing.JOptionPane;

    public class Exercicio13{

        public static void main(String[] args){

            double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número"));

            double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número"));

            if(numero1 < numero2){
                JOptionPane.showMessageDialog(null, "O menor número é: "+numero1);
            }else if(numero2 < numero1){
                JOptionPane.showMessageDialog(null, "O menor número é: "+numero2);
            }else if(numero1 == numero2){
                JOptionPane.showMessageDialog(null, "Os dois números são iguais");
            }
        }
    }