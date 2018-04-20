import javax.swing.JOptionPane;

    public class Exercicio14{

        public static void main(String[] args){

            double num1 = Double.parseDouble(JOptionPane.showInputDialog( "Digite o primeiro número"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog( "Digite o segundo número"));
            double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));

            if((num1 <= num2) && (num2 <= num3)){//123
                JOptionPane.showMessageDialog(null, "Ordem Crescente "+
                       "\n1: " +num1+
                       "\n2: "+num2+
                       "\n3: "+num3);
            }else if((num1 <= num3) && (num2 >= num3)){//132
                JOptionPane.showMessageDialog(null, "Ordem Crescente"+
                       "\n1: "+num1+
                       "\n2: "+num3+
                       "\n3: "+num2);
            }else if((num2 <= num1) && (num1 <= num3)){//213
                JOptionPane.showMessageDialog(null, "Ordem Crescente"+
                       "\n1: "+num2+
                       "\n2: "+num1+
                       "\n3: "+num3);
            }else if((num3 <= num1) && (num1 <= num2)){//231
                JOptionPane.showMessageDialog(null, "Ordem Crescente"+
                       "\n1: "+num3+
                       "\n2: "+num1+
                       "\n3: "+num2);
            }else if((num2 <= num3) && (num1 >= num3)){//312
                JOptionPane.showMessageDialog(null, "Ordem Crescente"+
                       "\n1: "+num2+
                       "\n2: "+num3+
                       "\n3: "+num1);
            }else if((num3 <= num2) && (num3 <= num2)){//321
                JOptionPane.showMessageDialog(null, "Ordem Crescente"+
                       "\n1: "+num3+
                       "\n2: "+num2+
                       "\n3: "+num1);
            }
        }
    }