import java.awt.image.CropImageFilter;

import javax.swing.JOptionPane;

    public class Exercicio9{

        public static void main(String[] args){

            double cima = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o tamanho da parte superior"));
            double esquerda = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o tamanho da parte esquerda"));
            double direita = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o tamanho da parte direita"));
             double baixo = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o tamanho da parte baixo"));
            if(cima == esquerda && cima == direita && cima == baixo){
                JOptionPane.showMessageDialog(null, "Com esses valores é possivel fazer um quadrado");
            }else{
                JOptionPane.showMessageDialog(null, "Com esses valores n da um quadrado nem fudendo");
            }

        } 
    }