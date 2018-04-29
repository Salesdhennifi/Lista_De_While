import javax.swing.JOptionPane;
public class testeMenuPadaria{
    public static void main(String[] args){
        
      
        String pedido1 = "";
        String pedido2 = "";
        String pedido3 = "";
        String pedido4 = "";
        int aux = 5;
        

        
        //COMANDO DO MENU PRINCIPAL:
        int menu1 = JOptionPane.showOptionDialog(
            null, "SELECIONE O MENU DESEJADO!", "        MENU    ", 
            0, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
            "BOLOS", "DOCES", "SANDUICHES", "PIZZAS", "Sair"
             },
            "Opcao");
        
            
        while (menu1 <= aux) {
            
            menu1 = menu1 + 1;  
          
        
        //MENU DA OPÇAO BOLO:
        if(menu1 == 1){
            pedido1 = JOptionPane.showInputDialog(null, "TIPOS DE BOLOS,",
            "Escolha Seu PEDIDO: " 
            , JOptionPane.QUESTION_MESSAGE, null, new Object[]{ 
            "Selecione", "Brigadeiro...R$29.50", "Floresta Negra....R$2.00", "Leite com Nutela....R$29.23",
            "Mousse de Chocolate....R$7.10", "Nega Maluca....R$19.33"
            },
            "Selecione" 
            ).toString();
        }else if(menu1 == 2){ //MENU DE DOCES: 
            pedido2 = JOptionPane.showInputDialog(null, "TIPOS DE DOCES,",
            "Escolha Seu PEDIDO: " 
            , JOptionPane.QUESTION_MESSAGE, null, new Object[]{ 
            "Selecione", "Bomba de Creme....R$17.71", "Bomba de Chocolate....R$4.82"
            },
            "Selecione" 
            ).toString();
        }else if(menu1 == 3){ //MENU DOS SANDUICHES:
            pedido3 = JOptionPane.showInputDialog(null, "TIPOS DE SANDUICHES",
            "Escolha Seu PEDIDO: " 
            , JOptionPane.QUESTION_MESSAGE, null, new Object[]{ 
            "Selecione", "File-Mignon com fritas e cheddar....R$ 21.16", "Hamburguer com queijos,champignon e rucula....R$ 12.70",
            "Provolone com salame....R$ 19.70", "Vegetariano de berinjela....R$ 28.22"
            },
            "Selecione" 
            ).toString();
        
        }else if(menu1 == 4){
            //MENU DAS PIZZA
            pedido4 = JOptionPane.showInputDialog(null, "TIPOS DE PIZZAS:",
            "Escolha Seu PEDIDO: " 
            , JOptionPane.QUESTION_MESSAGE, null, new Object[]{ 
            "Selecione", "Calabresa....R$ 8.98", "Napolitana....R$ 0.42",
            "Peruana ....R$ 18.36", "Portuguesa....R$ 27.50"
            },
            "Selecione" 
            ).toString(); 
        }else if(menu1 == 4);
        {
            JOptionPane.showConfirmDialog(null,"deseja Pedir mais? ");
        }
        
        

        //comando para calcular preço do BOLO:
          double preco1 = 0;
        if(pedido1.equalsIgnoreCase("Brigadeiro")){
                 preco1 = 29.50; 
        }else if(pedido1.equalsIgnoreCase("Floresta Negra")){
                 preco1 = 2.00;
        }else if(pedido1.equalsIgnoreCase("Leite com Nutela")){
                 preco1 = 29.23; 
        }else if(pedido1.equalsIgnoreCase("Mousse de chocolate")){
                 preco1 = 7.10;
        }else if(pedido1.equalsIgnoreCase("Nega Maluca")){
                 preco1 = 19.33;
          }
       
        //comando para calcular preço do DOCES:
         double preco2 = 0;
        if(pedido1.equalsIgnoreCase("Bomba de Creme")){
                 preco2  = 17.71;
        }else if(pedido1.equalsIgnoreCase("Bomba de Morango"))
        {
                preco2 = 4.82;
          }
            
        //comando para calcular preço do SANDUICHES:
        double preco3 = 0;
        if(pedido1.equalsIgnoreCase("File-Mignon")){
                 preco3 = 21.16;
        }else if(pedido1.equalsIgnoreCase("Hamburguer")){
                 preco3 = 12.70;
        }else if(pedido1.equalsIgnoreCase("Provolone com salame")){
                 preco3 = 19.70;
        }else if(pedido1.equalsIgnoreCase("Vegetariano de berinjela"))
        {
                 preco3 = 28.22;
          }
            
        //comando para calcular preço para PIZZAS: 
        double preco4 = 0;
        if(pedido1.equalsIgnoreCase("Calabresa")){
                 preco4 = 8.98;
        }else if(pedido1.equalsIgnoreCase("Napolitana")){
                 preco4 = 0.42;
        }else if(pedido1.equalsIgnoreCase("Peruana")){
                 preco4 = 18.36;
        }else if(pedido1.equalsIgnoreCase("Portuguesa"));
        {
                 preco4 = 27.50;
          }  
          Double total = preco1+preco2+preco3+preco4;
       }//chave do while
        
        //MENSAGEM FINAL:
        JOptionPane.showMessageDialog(null,"Seus pedidos: " + "\n" + pedido1 +"\n"+ pedido2 +"\n" + 
                                       pedido3 +"\n" +pedido4 +"\n" + "\nO valor Total da sua compra: R$" + total);
                                          
    
        
                                         
    
        
    }
}