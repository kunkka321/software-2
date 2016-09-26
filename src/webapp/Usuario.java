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
    private int pass;

    public Usuario(String usuario, int pass) {
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
    
    
    
    
    
}
