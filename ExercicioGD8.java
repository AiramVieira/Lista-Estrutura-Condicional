import javax.swing.JOptionPane;

    public class ExercicioGD8{

       public static void main(String[] args){

           double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
           double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digit eo segundo valor"));

           valor1 = valor1 + valor2;
           valor2 = valor1 - valor2;
           valor1 = valor1 - valor2;

           JOptionPane.showMessageDialog(null, "Valor 1: "+valor1+
                                               "\nValor 2: "+valor2);
   }
}