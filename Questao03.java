import javax.swing.JOptionPane;
public class Questao03{
    public static void main(String[] args){
        /*Solicite o peso para o usuário até que o peso seja menor que 0 ou maior que
        300,00, apresente ao final a quantidade de pessoas que informaram o peso.*/
        
        int peso = 0;
        while(peso < 0 || peso > 300){
           String quantPessoa = (JOptionPane.showInputDialog(null,"Digite o sua idade: "));
            peso = peso + 1;
        }
        
    }
}