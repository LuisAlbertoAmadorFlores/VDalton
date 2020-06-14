/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdalton;


import javax.swing.ImageIcon;


/**
 *
 * @author Beto
 */
public class VDalton {
    
    public String usuario;
    public  ImageIcon imageicon;
    
    public VDalton (){
    this.imageicon = new ImageIcon(this.getClass().getResource("../resources/bitmap.png"));
    this.usuario = System.getProperty("user.name");
    }
   
    
  
    
}
