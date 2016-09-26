/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp;


public class Autorizacion {
    
    
    Usuario us=new Usuario("Leandro", 1234345345);
    
      public boolean autorizarUsuario(){
        
        if(us.getUsuario().equalsIgnoreCase("Leandro")){
            
            return true;
            
        }else
        
        return false;
        }
    
    
}
