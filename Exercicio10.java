import javax.swing.JOptionPane;

    public class Exercicio10{

        public static void main(String[] args){

            double cima = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da parte superior"));

            double baixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da parte inferior"));

            double esquerda = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da parte lateral esquerda"));

            double direita = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da parte lateral direita"));

            if(cima == baixo && esquerda == direita && cima != direita){
                JOptionPane.showMessageDialog(null, "Da pra fazer um retangulo com esses valores");
            }else{
                JOptionPane.showMessageDialog(null, "Não da pra fazer um retangulo com esses valores");
            }

        }
    }