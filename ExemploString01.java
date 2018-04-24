import javax.swing.JOptionPane;

public class ExemploString01{

        public static void main(String[] args) {
            
            String nome = "Curso de Java";
            //retorna a quantidade de caracteres da String
            //    System.out.println(nome);
            //    System.out.println("Tamanho da String: " + nome.length());

            String nick = JOptionPane.showInputDialog(null, "Informe o nick do seu pager");
            nick = nick.trim();
                if(nick.equals("")){
                    JOptionPane.showMessageDialog(null, "COÉ FILHOTE TU É ANALFABETO? SABE ESCREVER N COROI?");
                }else{
                    JOptionPane.showMessageDialog(null, "Seu nick é: "+nick);
                }

            String sistemaOperacional = "LiNUX";
                System.out.println(sistemaOperacional);

            //colocar o texto em caixa alta
                sistemaOperacional = sistemaOperacional.toUpperCase();
                System.out.println(sistemaOperacional);
            //colocar o texto em caixa baixa    
                sistemaOperacional = sistemaOperacional.toLowerCase();
                System.out.println(sistemaOperacional);           
            //pegar uma caracter em determinado índice
            char letra = sistemaOperacional.charAt(2);
            System.out.println(letra);
            //
            String nomeCompleto = "Juan Roberto da Rocha";
            System.out.println(nomeCompleto.substring(5,12));
            
            //
            String nome2 = "casaS ".trim().toLowerCase();
            char letra2 = nome2.charAt(nome2.length()-1);
            if(letra2 == 's'){
                //plural
            }else{
                //singular
            }
        }
    }