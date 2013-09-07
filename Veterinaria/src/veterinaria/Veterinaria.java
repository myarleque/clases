package veterinaria;

public class Veterinaria {
    
    public static void main(String[] args) {
       
        // creacion de objeto 
        Mascota mascota01 = new Mascota();
        mascota01.bautizar("boby");
        System.out.println("Mascota"+  mascota01.comer() + "  "+ mascota01.caminar() );
    }
}
