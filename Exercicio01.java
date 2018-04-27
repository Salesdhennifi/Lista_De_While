import javax.swing.JOptionPane;

public class Exercicio01{
    public static void main(String[] args){
        //Solicite nomes ao usuário até que o mesmo digite fim para o nome.
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        
        while(!nome.equals("Sair")){
            JOptionPane.showInputDialog(null, "Digite seu nome: ");
            nome = nome + 1;
        }
        
    }
}