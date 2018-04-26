import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Questao04{
    public static void main(String[] args) {

        /*Solicite para o usuário dois números. Apresente o seguinte menu e de acordo com a
escolha deve ser apresentado a operação aritmética, isto deve ocorrer até que o
mesmo escolha a opção de sair:  (1-soma / 2-subtrair / 3-multiplicar / 4-dividir / 5- sair) */
        
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero:  "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro numero:  "));
        int tabela = 5;
        int aux = 0;
       
    while(aux <= tabela){
        int opcao =Integer.parseInt(JOptionPane.showInputDialog(null," 1-SOMA " + "\n2-SUBTRAIR" + 
        "\n3-MULTIPLICAR" + "\n4-DIVIDIR" + "\n5-SAIR"));
        aux = aux +1;
        if(opcao == 1 ){
            int soma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "A soma dos valores: " + soma);
        }else if(opcao == 2){
            int subtrair = numero1 - numero2;
            JOptionPane.showMessageDialog(null, "A Subtração dos valores é: " + subtrair);
        }else if(opcao == 3){
            int multiplicar = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "A Multiplcação dos valores é:  " + multiplicar);
        }else if(opcao == 4){
            int dividir = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "A Divisao dos valores:  " + dividir);
        }
        
    }
    JOptionPane.showMessageDialog(null, "OBRIGADA POR BRINCAR COMIGO!", null, JOptionPane.WARNING_MESSAGE, new ImageIcon(Questao04.class.getResource
    ("/imagens/foto2.png")));
    
    }
}