import javax.swing.JOptionPane;

    public class Exercicio5{

        public static void main(String[] args) {
            
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite seu número"));

            if(numero %2 != 0 && numero != 0){
                JOptionPane.showMessageDialog(null, "Seu número é impar");
            }else{
                JOptionPane.showMessageDialog(null, "Seu número não é impar");
            }
        }
    }

