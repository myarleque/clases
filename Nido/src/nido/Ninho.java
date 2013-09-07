package nido;


public class Ninho {

    private String nombre;
    private int    edad;
    private Conejo conejo;
    
  // asociacion
    public Ninho(String nombre)
    {
        this.nombre= nombre;
        this.edad = 0;
        
   }
    
    
    // agregacion
    public Ninho(String nombre, Conejo conejo)
    {
        this.nombre= nombre;
        this.edad = 0;
        this.conejo = conejo;
        
        
   }
    
   // composicion
    public Ninho(String nombre, String nombreConejo)
    {
        this.nombre= nombre;
        this.edad = 0;
        this.conejo = new Conejo(nombreConejo);
        
        
   }
    
    public String tocarOreja(Conejo conejo)
    {
        //return conejo.moverColita();
        return "Soy" + nombre+ "estoy moviendo la oreja"+ conejo.moverColita();
        
    }
    // invocar metodos anteriores
    public String mostrarZanahoria(Conejo conejo)
    {
        //return conejo.acercarse();
        return "Soy"+nombre +"muestro una zanahoria"+ conejo.acercarse();
    }
    
}
