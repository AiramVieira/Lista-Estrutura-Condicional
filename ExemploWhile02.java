import javax.swing.JOptionPane;

public class ExemploWhile02{

    public static void main(String[] args) {
        
        int numero = 9;
        int coluna = 8;
            while (numero > 0){
                System.out.print(numero + " ");
                    numero = numero - 1;
            }while (coluna > 0){
                System.out.print("\n"+coluna);
                    coluna = coluna - 1;
            }
    }
}