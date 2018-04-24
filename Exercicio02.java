import javax.swing.JOptionPane;

    public class Exercicio2{

        public static void main(String[] args) {
          
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));

            if(numero < 0){
                System.out.println("O número "+numero+ " é negativo");
            }else if(numero == 0){
                System.out.println("O número "+numero+" é neutro");
            }else if(numero > 0){
                System.out.println("O número "+numero+ " é positivo");
            }
        }
    }