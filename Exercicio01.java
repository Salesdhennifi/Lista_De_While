import javax.swing.JOptionPane;
public class Exercicio01{
    public static void main(String[] args){
        //Solicite nomes ao usuário até que o mesmo digite fim para o nome.
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        
        while(!nome.equalsIgnoreCase("S")){
            nome = JOptionPane.showInputDialog(null,"Se deseja sair digite \"S\"" + "\n" + "\nDigite seu nome novamente: ");
        }
        
    }
}