/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp;

/**
 *
 * @author Administrator
 */
public class Usuario {
    
    private String usuario;
    private Long pass;

    public Usuario(String usuario, Long pass) {
        this.usuario = usuario;
        this.pass = pass;
    }
    
    
    public String mostrarUsuario(){
        
        String cadena = "El Usuiario: " + usuario + "Con password:" + pass;
        
        return cadena;
        
    }
    
    public boolean autorizarUsuario(){
        
        if(usuario.equalsIgnoreCase("Leandro")){
            
            return true;
            
        }else
        
        return false;
        
    }
    
    
    
    
    
}
