/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdalton;



/**
 *
 * @author Beto
 */
public class Seleccion extends javax.swing.JFrame {
    Inicio vd= new Inicio();
    
    public Seleccion() {
        initComponents();
        nombre.setText(vd.usuario);
        setLocationRelativeTo(null);
        setIconImage(vd.imageicon.getImage());
         this.jButton1.setToolTipText("Minimizar");
         this.jButton2.setToolTipText("Cerrar");
         this.jButton3.setToolTipText("Regresar");
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        indicacion = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        test1 = new javax.swing.JButton();
        test2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VDalton Beta 1.0");
        setUndecorated(true);
        setResizable(false);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/fondo_sinbotones.png"))); // NOI18N

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla_Principal/icono_usuario.png"))); // NOI18N

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        indicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/titulo_escogetest.png"))); // NOI18N

        t1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/titulo_test1.png"))); // NOI18N

        t2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/titulo_test2.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_minimize.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_minimize_press.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        test1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_queves.png"))); // NOI18N
        test1.setBorder(null);
        test1.setBorderPainted(false);
        test1.setContentAreaFilled(false);
        test1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        test1.setFocusPainted(false);
        test1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_queves_press.png"))); // NOI18N
        test1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_queves_press.png"))); // NOI18N
        test1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                test1MousePressed(evt);
            }
        });

        test2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_color.png"))); // NOI18N
        test2.setBorder(null);
        test2.setBorderPainted(false);
        test2.setContentAreaFilled(false);
        test2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        test2.setFocusPainted(false);
        test2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_color_press.png"))); // NOI18N
        test2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_color_press.png"))); // NOI18N
        test2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                test2MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/barra_separadora.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/cuadro_traslucido.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_cerrar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_cerrar_press.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_cerrar_press.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_atras.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_atras_press.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/boton_atras_press.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(test2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(700, 700, 700)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(test1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(t1))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(indicacion))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(t2))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(760, 760, 760)
                .addComponent(jButton2))
            .addComponent(fondo)
            .addGroup(layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(test2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(test1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(t1))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(indicacion))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(t2))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(fondo)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        // TODO add your handling code here:
        vd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
        Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton1MousePressed

    private void test1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_test1MousePressed
        // TODO add your handling code here:
        TestUno obj = new TestUno();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_test1MousePressed

    private void test2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_test2MousePressed
        // TODO add your handling code here:
        TestDos vinculo = new TestDos();
        vinculo.setVisible(true);
        dispose();
    }//GEN-LAST:event_test2MousePressed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel indicacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JButton test1;
    private javax.swing.JButton test2;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

}