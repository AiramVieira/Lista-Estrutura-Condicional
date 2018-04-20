import javax.swing.JOptionPane;

  public class Exercicio23{

        public static void main(String[] args){

          String opcao = JOptionPane.showInputDialog(null, 
              "Selecione Média geral ou específica",
              "Sistema de médias",
              JOptionPane.QUESTION_MESSAGE,
              null,
              new Object[]{
                  "Selecione uma opção", 
                  "Média geral",
                  "Português",
                  "Matemática ", 
                  "Inglês",
                  "Biologia",
                  "Quimica",
                  "Fisica",
                  "Sociologia",
                  "Filosofia",
                  "Geografia",
                  "História",
                  "Educação Física"
              },
              "Selecione uma opção"
              ).toString();

          double notaPort1 = Double.parseDouble                          
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaPort2 = Double.parseDouble                          
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaPort3 = Double.parseDouble                           
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaPort4 = Double.parseDouble                           
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaMat1 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaMat2 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaMat3 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaMat4 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaIng1 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaIng2 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaIng3 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaIng4 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaBio1 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaBio2 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaBio3 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaBio4 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaQui1 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaQui2 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaQui3 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaQui4 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaFis1 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaFis2 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaFis3 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaFis4 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaSoc1 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaSoc2 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaSoc3 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaSoc4 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaFilo1 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaFilo2 = Double.parseDouble                             
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaFilo3 = Double.parseDouble                           
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaFilo4 = Double.parseDouble                          
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaGeo1 = Double.parseDouble                        
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaGeo2 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaGeo3 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaGeo4 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaHist1 = Double.parseDouble         
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaHist2 = Double.parseDouble        
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaHist3 = Double.parseDouble      
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaHist4 = Double.parseDouble    
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double notaEdF1 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaEdF2 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaEdF3 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));
          double notaEdF4 = Double.parseDouble
            (JOptionPane.showInputDialog("Digite sua nota de português"));

          double mediaPort  = (notaPort1+notaPort2+notaPort3+notaPort4)/4;
          double mediaMat   = (notaMat1+notaMat2+notaMat3+notaMat4)/4;
          double mediaIng   = (notaIng1+notaIng2+notaIng3+notaIng4)/4;
          double mediaBio   = (notaBio1+notaBio2+notaBio3+notaBio4)/4;
          double mediaQui   = (notaQui1+notaQui2+notaQui3+notaQui4)/4;
          double mediaFis   = (notaFis1+notaFis2+notaFis3+notaFis4)/4;
          double mediaSoc   = (notaSoc1+notaSoc2+notaSoc3+notaSoc4)/4;
          double mediaFilo  = (notaFilo1+notaFilo2+notaFilo3+notaFilo4)/4;
          double mediaGeo   = (notaGeo1+notaGeo2+notaGeo3+notaGeo4)/4;;
          double mediaHist  = (notaHist1+notaHist2+notaHist3+notaHist4)/4;;
          double mediaEdF   = (notaEdF1+notaEdF2+notaEdF3+notaEdF4)/4;;
          double mediaGeral = mediaPort+mediaMat+mediaIng+mediaBio+mediaQui+mediaFis+mediaSoc                             +mediaFilo+mediaGeo+mediaHist+mediaEdF;

            if(opcao.equals("Selecione uma opção")){
              JOptionPane.showMessageDialog(null, "Opção inválida");
            }else if(opcao.equals("Média geral")){
              mediaGeral = mediaBio+mediaEdF+mediaFilo+mediaFis+mediaGeo+mediaHist+mediaIng+mediaMat+mediaPort+mediaQui+mediaSoci;
            }
        }
    }