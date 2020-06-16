/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdalton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Beto
 */
public class cmd {

    Process shell;

    public void clasificacion(String dato) {
        switch (dato) {
            case "Vision Normal":
                regNormal();
                break;
            case "Protanopia":
                regProtanopia();
                break;
            case "Deuteranopia":
                regDeuteronopia();
                break;
            case "Gris":
                regGris();
                break;
            default:
                break;
        }
    }

    public void regNormal() {
        try {
            shell = Runtime.getRuntime().exec("cmd /HKEY_CURRENT_USER/Control Panel/Colors/VisionNormal.reg");
            BufferedReader br = new BufferedReader(new InputStreamReader(shell.getInputStream()));
            String resultado = null;
            while ((resultado = br.readLine()) != null) {
                System.out.println(resultado);
            }

        } catch (IOException ex) {
            Logger.getLogger(cmd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void regProtanopia() {
        try {
            shell = Runtime.getRuntime().exec("cmd /HKEY_CURRENT_USER/Control Panel/Colors/VisionProtonopia.reg");
            BufferedReader br = new BufferedReader(new InputStreamReader(shell.getInputStream()));
            String resultado = null;
            while ((resultado = br.readLine()) != null) {
                System.out.println(resultado);
            }

        } catch (IOException ex) {
            Logger.getLogger(cmd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void regDeuteronopia() {
        try {
            shell = Runtime.getRuntime().exec("cmd /HKEY_CURRENT_USER/Control Panel/Colors/VisionDeuteronopia.reg");
            BufferedReader br = new BufferedReader(new InputStreamReader(shell.getInputStream()));
            String resultado = null;
            while ((resultado = br.readLine()) != null) {
                System.out.println(resultado);
            }

        } catch (IOException ex) {
            Logger.getLogger(cmd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void regGris() {
        try {
            shell = Runtime.getRuntime().exec("cmd /HKEY_CURRENT_USER/Control Panel/Colors/VisionGris.reg");
            BufferedReader br = new BufferedReader(new InputStreamReader(shell.getInputStream()));
            String resultado = null;
            while ((resultado = br.readLine()) != null) {
                System.out.println(resultado);
            }

        } catch (IOException ex) {
            Logger.getLogger(cmd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
