import javax.swing.JOptionPane;
public class Exercicio01{
    public static void main(String[] args){
        //Solicite nomes ao usuário até que o mesmo digite fim para o nome.
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        
        while(!nome.equalsIgnoreCase("Sair")){
            nome = JOptionPane.showInputDialog(null, "Digite seu nome novamente: " + "" + "\"\n Se deseja sair digite \"Sair\"");
        }
        
    }
}