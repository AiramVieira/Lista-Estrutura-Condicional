import javax.swing.JOptionPane;

    public class Exercicio6{

        public static void main(String[] args){

            double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite seu numero"));

            if(numero != 1){
                JOptionPane.showMessageDialog(null, "Seu número é diferente de 1");
            }else{
                JOptionPane.showMessageDialog(null, "Seu número é 1");
            }
        }
    }