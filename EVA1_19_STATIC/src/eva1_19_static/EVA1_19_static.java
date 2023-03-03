/*

 */
package eva1_19_static;

/**

 */
public class EVA1_19_static {

    public static void main(String[] args) {
        Utilerias utileria = new Utilerias();
        
        utileria.Saludo();
        Utilerias.otroSaludo();
        
        Saludo2(); //<----- No existe el método (no es estatico y no se ha creado objeto
 
    }
    
    
        public void Saludo2(){
        System.out.println("hola");
    }
        
     class Utilerias{
        public void Saludo(){
            System.out.println("Saludos");  //Existe hasta que se crea un objeto de la clase
        }
 
   
    }  
     
         public static void otroSaludo(){
        System.out.println("otro saludo");
        }
        
  // no es un objeto: se pone static      
        
        
}
