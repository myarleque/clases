/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author Alumnos
 */
public class Mascota {
    
    private String nombre;
    private String raza ;
    private int    edad ;
   
    
   public void bautizar(String nombre)
   {
       this.nombre = nombre; 
   }
   
   
    
   public String comer()
   {
      return "estoy comiendo";     
   }
   
   public String caminar()
   {
    return "estoy caminando";
   }
    
    
}
