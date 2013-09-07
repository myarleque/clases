package nido;

public class Nido {
    public static void main(String[] args) {

        // asociacion
         Ninho ninho = new Ninho("Carlos");
         Conejo conejo = new Conejo("Colita");
         Ninho ninho2 = new Ninho("Carlos");
         Conejo conejo2 = new Conejo("Colita");
         
         
         //agregacion
         Conejo conejo3 = new Conejo("Colita");
         Ninho ninho4 = new Ninho("Carlos",conejo3);
         
       
         //composicion
         Conejo conejo5 = new Conejo("Colita");
         Ninho ninho6 = new Ninho("Carlos","rabito");
         
       
         
         
         System.out.println("Ninho :  "  +  ninho.tocarOreja(conejo)); 
         System.out.println("Ninho :  "  +  ninho.tocarOreja(conejo)); 
   
    } 
}
