/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vdalton;


import java.io.File;
import javax.swing.*;


/**
 *
 * @author Beto
 */
public class Inicio extends javax.swing.JFrame{
 
    
    public  String usuario;

    /**
     *
     */
    public ImageIcon imageicon;

    /**
     * Creates new form Inicio
     */
    
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        user.setText(System.getProperty("user.name"));
        imageicon = new ImageIcon(getClass().getResource("/Test1/logo_blanco.png"));
        setIconImage(imageicon.getImage());  
        usuario=user.getText();
        this.salir.setToolTipText("Cerrar");
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        comenzar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VDalton Beta 1.0");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_cerrar.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/boton_cerrar_press.png"))); // NOI18N
        salir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_cerrar_press.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        comenzar.setForeground(new java.awt.Color(255, 255, 255));
        comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla_Principal/boton_comenzar.png"))); // NOI18N
        comenzar.setToolTipText("");
        comenzar.setBorder(null);
        comenzar.setBorderPainted(false);
        comenzar.setContentAreaFilled(false);
        comenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comenzar.setFocusPainted(false);
        comenzar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla_Principal/boton_comenzar_press.png"))); // NOI18N
        comenzar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla_Principal/boton_comenzar_press.png"))); // NOI18N
        comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comenzarMousePressed(evt);
            }
        });
        getContentPane().add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla_Principal/icono_usuario.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 70, 70));

        user.setBackground(new java.awt.Color(41, 39, 39));
        user.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(null);
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla_Principal/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comenzarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comenzarMousePressed
        // TODO add your handling code here:
        seleccion_test obj = new seleccion_test();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_comenzarMousePressed

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_salirMousePressed
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        resultado iniciado =new resultado();
        File consulta =new File("C:/VDalton");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new resultado().setVisible(true);
            }
        });
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comenzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton salir;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
