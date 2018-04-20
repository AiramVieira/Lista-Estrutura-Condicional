import javax.swing.JOptionPane;

public class Exercicio20{

    public static void main(String[] args){

        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga sua altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso"));
        
        double imc = peso/(altura*altura);
        
        if(imc < 10){
            JOptionPane.showMessageDialog(null, "seu IMC é: "+imc+" você está com Desnutrição Grau V");
        }else if(imc <= 12.9){
            JOptionPane.showMessageDialog(null, "seu IMC é: %.2f"+imc+" você está com Desnutrição Grau IV");
        }else if(imc <= 15.9){
            JOptionPane.showMessageDialog(null, "seu IMC é: %.2f"+imc+" você está com Desnutrição Grau III");
        }else if(imc <= 16.9){
            JOptionPane.showMessageDialog(null, "seu IMC é: %.2f"+imc+" você está com Desnutrição Grau II");
        }else if(imc <= 18.4){
            JOptionPane.showMessageDialog(null, "seu IMC é: %.2f"+imc+" você está com Desnutrição Grau I");
        }else if(imc <= 24.9){
            JOptionPane.showMessageDialog(null, "seu IMC é: %.2f"+imc+" você está com Normal");
        }else if(imc <= 29.9){
            JOptionPane.showMessageDialog(null, "seu IMC é: %.2f"+imc+" você está com Pré-obesidade");
        }else if(imc <= 34.5){
            JOptionPane.showMessageDialog(null, "seu IMC é: %.2f"+imc+" você está com Obesidade Grau I");
        }else if(imc <= 39.9){
            JOptionPane.showMessageDialog(null, "seu IMC é: %.2f"+imc+" você está com Obesidade Grau II");
        }else if(imc > 39.9){
            JOptionPane.showMessageDialog(null, "seu IMC é: "+imc+" você está com Obesidade Grau III");
        }
    }
}