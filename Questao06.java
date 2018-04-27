
import javax.swing.JOptionPane;
public class Questao06{
    public static void main(String[] args) {
        /*1-armazenar os pedidos dos seus clientes,
          2-para que o cliente possa solicitar
            estes produtos o cardápio deve ser apresentado para ele.
          4-Apresntar no final o Total dos pedidos e a
           quantidade de produtos consumidos.*/

        int codigo = 1;
        int pedido = 0;
        int totalPedido = 0;
        int produtoConsu = 0;
           while(codigo <= pedido){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "BOLOS" + "\n1-Bolo Brigadeiro R$ 29,50" +
            "\n2-Bolo Floresta Negra R$ 2,00" + "\n3-Bolo Leite com Nutella   R$ 29,23" + 
            "\n4-Bolo Mousse de Chocolate   R$ 7,10" + "\n5-Bolo Nega Maluca   R$ 19,33" + "\nDOCES" + "\n6-Bomba de Creme   R$ 17,71" +
            "\n7-Bomba de Morango   R$ 4,82" + "\nSANDUICHES" + "\n8-Filé-Mignon com fritas e cheddar   R$ 21,16" +
            "\n9-Hambúrguer com queijos, champignon e rúcula   R$ 12,70" + "\n10-Provolone com salame   R$ 19,70" +
            "\n11-Vegetariano de berinjela   R$ 28,22" + "\nPIZZAS" + "\n12-Calabresa   R$ 8,98" + "\n13-Napolitana   R$ 0,42" +
            "\n14-Peruana   R$ 18,36" + "\n15-Portuguesa   R$ 27,50" + "\n16-SAIR"
            ));
              pedido= pedido +1;
               if(codigo == 1){
                   JOptionPane.showMessageDialog(null, "Bolo Brigadeiro R$ 29,50");
               }else if(codigo == 2){
                   JOptionPane.showMessageDialog(null, "Bolo Floresta Negra R$ 2,00");
               }else if(codigo == 3){
                   JOptionPane.showMessageDialog(null, "Bolo Leite com Nutella   R$ 29,23");
               }else if(codigo == 4){
                   JOptionPane.showMessageDialog(null, "Bolo Mousse de Chocolate   R$ 7,10");  
               }else if(codigo ==5){
                   JOptionPane.showMessageDialog(null, "Bolo Nega Maluca   R$ 19,33");
               }else if(codigo == 6){
                   JOptionPane.showMessageDialog(null, "Bomba de Creme   R$ 17,71");
               }else if(codigo ==7){
                   JOptionPane.showMessageDialog(null, "Bomba de Morango   R$ 4,82");
               }else if(codigo == 8){
                   JOptionPane.showMessageDialog(null, "Filé-Mignon com fritas e cheddar   R$ 21,16"); 
               }else if(codigo == 9){
                JOptionPane.showMessageDialog(null, "Hambúrguer com queijos, champignon e rúcula   R$ 12,70");
               }else if(codigo ==10){
                JOptionPane.showMessageDialog(null, "Provolone com salame   R$ 19,70");
               }else if(codigo == 11){
                JOptionPane.showMessageDialog(null, "Vegetariano de berinjela   R$ 28,22");
               }else if(codigo == 12){
                JOptionPane.showMessageDialog(null, "Calabresa   R$ 8,98");
               }else if(codigo == 13){
                JOptionPane.showMessageDialog(null, "Napolitana   R$ 0,42");   
               }else if(codigo ==14){
                JOptionPane.showMessageDialog(null, "Peruana   R$ 18,36");
               }else if(codigo ==15){
                JOptionPane.showMessageDialog(null, "Portuguesa   R$ 27,50");
               }else if(codigo ==16){
                JOptionPane.showMessageDialog(null, "Sair: ");
               }
               totalPedido = totalPedido + pedido;
               produtoConsu = produtoConsu + codigo;
           }
           JOptionPane.showMessageDialog(null, "O total de pedidos feitos: " + totalPedido);
           JOptionPane.showMessageDialog(null, "O total de produtos consumidos: " + produtoConsu);
    }
}