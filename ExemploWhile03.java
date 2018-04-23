import javax.swing.JOptionPane;

public class ExemploWhile03{

    public static void main(String[] args) {
        
        int quantidadeMaxima = 4, maiorIdade = Integer.MIN_VALUE;
        int atual = 0, menorIdade = Integer.MAX_VALUE;

            while(atual < quantidadeMaxima){
                String nome = JOptionPane.showInputDialog(null, "Digite o seu nome");

                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));

                if(idade > maiorIdade){
                    maiorIdade = idade;
                }
                System.out.println("Atual: "+atual);
                    atual = atual +1;
            }
            JOptionPane.showMessageDialog(null, "A maior idade é: " +maiorIdade);
    }
}