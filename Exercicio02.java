import javax.swing.JOptionPane;
public class Exercicio02{
    public static void main(String[] args){
        //Solicite a idade para o usuário até que ele digite uma idade maior que 128.
        int quantidadeMaxima = 128;
        int idade = 0;
        while(idade < quantidadeMaxima){
            int recebe = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o sua idade: "));
            idade = recebe + 1;
        }
        JOptionPane.showMessageDialog(null, "Você esta Saindo do programa...");

    }


}