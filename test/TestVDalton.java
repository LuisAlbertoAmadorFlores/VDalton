/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import vdalton.*;

/**
 *
 * @author Beto
 */
public class TestVDalton {
    private Inicio nombre; 
    private Evaluacion cargaDatos;
    public TestVDalton() {
        nombre = new Inicio();
        cargaDatos = new Evaluacion();
    }
    @Test
    public void TestNombre(){
    Assert.assertTrue(nombre.usuario.equals(System.getProperty("user.name")));
    }
       

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
