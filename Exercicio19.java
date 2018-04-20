import javax.swing.JOptionPane;

    public class Exercicio19{

        public static void main(String[] args){

            double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu saldo"));
            double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o deposito realizado"));
            double valorParcela = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da parcela"));
            double valorSaques = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque"));

            double saldoFinal = (((saldo+valorDeposito)-valorParcela)-valorSaques);

            if(saldoFinal < 0){
                JOptionPane.showMessageDialog(null, "Com um saldo de: " +saldoFinal+" você n pega ninguém nem fudendo");
            }else if(saldoFinal == 0){
                JOptionPane.showMessageDialog(null, "Com um saldo de: " +saldoFinal+" é bom ter um pau grande, meu amigo");
            }else if(saldoFinal > 0){
                JOptionPane.showMessageDialog(null, "Com um saldo de: "+saldoFinal+
                " você pode até comer alguém");
            }
        }
    }