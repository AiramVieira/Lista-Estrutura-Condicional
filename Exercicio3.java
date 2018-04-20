import javax.swing.JOptionPane;

    public class Exercicio3{

        public static void main(String[] args) {
            
            double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));

            double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
            
            int valorTabela = Integer.parseInt(JOptionPane.showInputDialog(
            "_______________" +
           "\n|          Menu              |"+
           "\n|1           |Somar        |"+
           "\n|2           |Subtrair     |"+
           "\n|3           |Multiplicar |"+
           "\n|4           |Dividir         |"));
            
            if(valorTabela == 1){
                JOptionPane.showMessageDialog(null, "Resultado: "+(numero1 + numero2));
            }else if(valorTabela == 2){
                JOptionPane.showMessageDialog(null, "Resultado: "+ (numero1 - numero2));
            }else if(valorTabela == 3){
                JOptionPane.showMessageDialog(null, ("Resultado: "+(numero1 * numero2)));
            }else if(valorTabela == 4){
                JOptionPane.showMessageDialog(null, ("Resultado: "+(numero1 / numero2)));
            }else{
                JOptionPane.showMessageDialog(null, ("COOPERA SEU CORNO"));
            }
        }
    }