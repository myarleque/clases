package nido;

public class Conejo {

    private String nombre;
    
    Conejo(String nombre)
    {
        this.nombre = nombre;
    }
    Conejo()
    {
    }
    
 
    
    public String acercarse(){
    return "Soy"+nombre+ "estoy acercando";
    }
    
    public String moverColita(){
    return "Soy"+nombre+ " estoy moviendo la colita";
    }
    
}
