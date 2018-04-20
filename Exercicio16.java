import javax.swing.JOptionPane;

    public class Exercicio16{

        public static void main(String[] args){

            double tempOrigem = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em º/ que quer converter"));

            int valorTabelaOrigem = Integer.parseInt(JOptionPane.showInputDialog(
                "\n|Tabela Temperatura"+
                "\n|1           |Kelvin"+
                "\n|2           |Celsius"+
                "\n|3           |Fahrenheit"));

            int valorTabelaDestino = Integer.parseInt(JOptionPane.showInputDialog(
                "\n|Tabela Temperatura"+
                "\n|1           |Kelvin"+
                "\n|2           |Celsius"+
                "\n|3           |Fahrenheit"));
            double tempDestino = 1.0;

                if(valorTabelaOrigem == valorTabelaDestino){
                    JOptionPane.showMessageDialog(null, "TA CHAPADO MANO?");
                }else if(valorTabelaOrigem == 1 && valorTabelaDestino == 2){
                    tempDestino = (tempOrigem - 273);
                    JOptionPane.showMessageDialog(null, "a temperatura agora é: "+tempDestino);
                }else if(valorTabelaOrigem == 1 && valorTabelaDestino == 3){
                    tempDestino = (((tempOrigem-273/5)*9)+32);
                    JOptionPane.showMessageDialog(null, "a temperatura agora é: "+tempDestino);
                }else if(valorTabelaOrigem == 2 && valorTabelaDestino == 1){
                    tempDestino = (tempOrigem + 273);
                    JOptionPane.showMessageDialog(null, "a temperatura agora é: "+tempDestino);
                }else if(valorTabelaOrigem == 2 && valorTabelaDestino == 3){
                    tempDestino = ((tempOrigem*1.8)+32);
                    JOptionPane.showMessageDialog(null, "a temperatura agora é: "+tempDestino);
                }else if(valorTabelaOrigem == 3 && valorTabelaDestino == 1){
                    tempDestino = (((tempOrigem-32/9)*5)+273);
                    JOptionPane.showMessageDialog(null, "a temperatura agora é: "+tempDestino);
                }else if(valorTabelaOrigem == 3 && valorTabelaDestino == 2){
                    tempDestino = (tempOrigem-32/1.8);
                    JOptionPane.showMessageDialog(null, "A temperatura agora é: "+tempDestino);
                }
        }
    }