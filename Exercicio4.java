import javax.swing.JOptionPane;

    public class Exercicio4{

        public static void main(String[] args) {
            
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número"));

            if(numero %2 == 0 && numero != 0){
                JOptionPane.showMessageDialog(null, "seu número é par");
            }else{
                JOptionPane.showMessageDialog(null, "Seu número não é par");
            }
        }
    }