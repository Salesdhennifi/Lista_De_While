import javax.swing.JOptionPane;

public class Questao03{
    public static void main(String[] args) {
         /*Faça um programa que solicite a quantidade de carros que o usuário deseja
cadastrar, após isto solicite para o usuário o modelo, valor e ano do carro até que
atinja a quantidade de carros para cadastro.
Apresente ao final:
● Média do ano dos carros;
● Média do valor dos carros;
● Quantidade de carros que começam com a letra G;
● Quantidade de carros que começam com a letra A */

        int qtdCad = 0;
        int atual = 0;
        Double valor = 0.0;
        int ano = 0;
        String modelo = "";
        double somaAno = 0;
        double somaValor = 0;
        int letraG = 0;
        int letraA = 0;
        double mediaAno = 0;
        double mediaValor = 0;

        qtdCad =Integer.parseInt(JOptionPane.showInputDialog(null,"Sistema de Cadastro de Veículos." + "\nQuantos carros deseja Cadastrar: "));
        while (atual <= qtdCad) {
            
            modelo = JOptionPane.showInputDialog(null,"Digite o modelo do carro: ");
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do carro: "));
            ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Ano do carro: "));
            atual = atual + 1;

            somaAno = somaAno + ano;
            somaValor = somaValor + valor;

            mediaAno = somaAno / qtdCad;
            mediaValor = somaValor / qtdCad;

            char letra = modelo.charAt(0);

            if (letra == 'g') {
                letraG = letraG + 1;
            } else if (letra == 'a') {
                letraA = letraA + 1;
            }

        }
        JOptionPane.showMessageDialog(null, "media dos anos: " + mediaAno);
        JOptionPane.showMessageDialog(null, "media dos valores : " + mediaValor);
        JOptionPane.showMessageDialog(null, "quantidade de modelos com letra G: " + letraG);
        JOptionPane.showMessageDialog(null, "quantidade de modelos com letra A: " + letraA);
    }

}
