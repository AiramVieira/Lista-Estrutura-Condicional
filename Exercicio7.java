import javax.swing.JOptionPane;

    public class Exercicio7{

        public static void main(String[] args){

            double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

            if(numero == 0){
                JOptionPane.showMessageDialog(null, "Seu número é neutro");
            }else if(numero %2 == 0){
                JOptionPane.showMessageDialog(null, "Seu número é par");
            }else if(numero %2 != 0){
                JOptionPane.showMessageDialog(null,"Seu número é impar");
            };

            if(numero > 0){
                JOptionPane.showMessageDialog(null, "Seu número é positivo");
            }else if(numero < 0){
                OptionPane.showMessageDialog(null, "Seu número é negativo");
            }else{
                OptionPane.showMessageDialog(null, "ZERO N É NADA SEU FELA DE PULTA");
            }

            if(numero > 10){
                JOptionPane.showMessageDialog(null,"Seu número é maior que 10");
            }else if(numero <=50){
                JOptionPane.showMessageDialog(null,"Seu número é menor à 51");
            }else if(numero <-10){
                JOptionPane.showMessageDialog(null,"Seu número é menor que -10");
            }else if(numero >= 30){
                JOptionPane.showMessageDialog(null,"Seu número é maior que 29");
            }else if(numero != 1){
                JOptionPane.showMessageDialog(null,"Seu número é diferente de 1");
            }
        }
    }