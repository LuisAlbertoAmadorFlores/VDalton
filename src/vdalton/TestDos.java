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
public class TestDos extends javax.swing.JFrame {

    Inicio vd = new Inicio();
    Evaluacion configuracion = new Evaluacion();

    /**
     * Creates new form test2
     */
    public TestDos() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(vd.imageicon.getImage());
        this.jButton2.setToolTipText("Cerrar");
        this.jButton1.setToolTipText("Minimizar");
        this.regresar.setToolTipText("Regresar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorFinal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        color6 = new javax.swing.JLabel();
        color5 = new javax.swing.JLabel();
        color4 = new javax.swing.JLabel();
        color3 = new javax.swing.JLabel();
        color2 = new javax.swing.JLabel();
        color1 = new javax.swing.JLabel();
        colorInicial = new javax.swing.JLabel();
        Base4 = new javax.swing.JLabel();
        Base1 = new javax.swing.JLabel();
        Base5 = new javax.swing.JLabel();
        Base2 = new javax.swing.JLabel();
        Base6 = new javax.swing.JLabel();
        Base3 = new javax.swing.JLabel();
        Listo = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        fondoSecundario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VDalton Beta 1.0");
        setUndecorated(true);

        colorFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/9.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/titulo_colores.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/instrucciones1.png"))); // NOI18N

        color6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/7.png"))); // NOI18N
        color6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                color6MouseDragged(evt);
            }
        });

        color5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/5.png"))); // NOI18N
        color5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                color5MouseDragged(evt);
            }
        });

        color4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/2.png"))); // NOI18N
        color4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                color4MouseDragged(evt);
            }
        });

        color3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/6.png"))); // NOI18N
        color3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                color3MouseDragged(evt);
            }
        });

        color2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/8.png"))); // NOI18N
        color2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                color2MouseDragged(evt);
            }
        });

        color1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/4.png"))); // NOI18N
        color1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                color1MouseDragged(evt);
            }
        });

        colorInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/1.png"))); // NOI18N

        Base4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/cuadro_vacio_b.png"))); // NOI18N

        Base1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/cuadro_vacio_b.png"))); // NOI18N

        Base5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/cuadro_vacio_b.png"))); // NOI18N

        Base2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/cuadro_vacio_b.png"))); // NOI18N

        Base6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/cuadro_vacio_b.png"))); // NOI18N

        Base3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/cuadro_vacio_b.png"))); // NOI18N

        Listo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_listo.png"))); // NOI18N
        Listo.setBorder(null);
        Listo.setBorderPainted(false);
        Listo.setContentAreaFilled(false);
        Listo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_listo_press.png"))); // NOI18N
        Listo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_listo_press.png"))); // NOI18N
        Listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListoActionPerformed(evt);
            }
        });

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_atras.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setBorderPainted(false);
        regresar.setContentAreaFilled(false);
        regresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_atras_press.png"))); // NOI18N
        regresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_atras_press.png"))); // NOI18N
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regresarMousePressed(evt);
            }
        });

        fondoSecundario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/cuadro_traslucido.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/instrucciones3.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/instrucciones2.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_cerrar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_cerrar_press.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_cerrar_press.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_minimize.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_minimize_press.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_minimize_press.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/fondo_sinbotones.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(750, 750, 750)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(color4)
                .addGap(27, 27, 27)
                .addComponent(color5))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(Base2)
                .addGap(27, 27, 27)
                .addComponent(Base3)
                .addGap(107, 107, 107)
                .addComponent(Base5))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(Listo))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(color1))
            .addGroup(layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(color6))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(Base4))
            .addGroup(layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(Base6))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(color2))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(fondoSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(colorInicial))
            .addGroup(layout.createSequentialGroup()
                .addGap(660, 660, 660)
                .addComponent(colorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(color3))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(Base1))
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(color4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Base2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Base3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Base5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Listo))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(color1))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(color6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(Base4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(Base6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(color2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(fondoSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(colorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(colorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(color3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(Base1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(fondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void ListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListoActionPerformed
        // TODO add your handling code here:
        configuracion.setVisible(true);
        dispose();
    }//GEN-LAST:event_ListoActionPerformed

    private void color1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseDragged
        // TODO add your handling code here:
        color1.setLocation(color1.getLocation().x + evt.getX() - color1.getWidth() / 2, color1.getLocation().y + evt.getY() - color1.getHeight() / 2);
        if(color1.getLocation().y==Base1.getLocation().y){
            if(color1.getLocation().x==Base1.getLocation().x){
       
            }
        }        
    }//GEN-LAST:event_color1MouseDragged

    private void color2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseDragged
        // TODO add your handling code here:
        color2.setLocation(color2.getLocation().x + evt.getX() - color2.getWidth() / 2, color2.getLocation().y + evt.getY() - color2.getHeight() / 2);
         
    }//GEN-LAST:event_color2MouseDragged

    private void color3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseDragged
        // TODO add your handling code here:
        color3.setLocation(color3.getLocation().x + evt.getX() - color3.getWidth() / 2, color3.getLocation().y + evt.getY() - color3.getHeight() / 2);
    }//GEN-LAST:event_color3MouseDragged

    private void color4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseDragged
        // TODO add your handling code here:
        color4.setLocation(color4.getLocation().x + evt.getX() - color4.getWidth() / 2, color4.getLocation().y + evt.getY() - color4.getHeight() / 2);
    }//GEN-LAST:event_color4MouseDragged

    private void color5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseDragged
        // TODO add your handling code here:
        color5.setLocation(color5.getLocation().x + evt.getX() - color5.getWidth() / 2, color5.getLocation().y + evt.getY() - color5.getHeight() / 2);
    }//GEN-LAST:event_color5MouseDragged

    private void color6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color6MouseDragged
        // TODO add your handling code here:
        color6.setLocation(color6.getLocation().x + evt.getX() - color6.getWidth() / 2, color6.getLocation().y + evt.getY() - color6.getHeight() / 2);
    }//GEN-LAST:event_color6MouseDragged

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2MousePressed

    private void regresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMousePressed
        // TODO add your handling code here:
        Seleccion obj = new Seleccion();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarMousePressed

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
            java.util.logging.Logger.getLogger(TestDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestDos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Base1;
    private javax.swing.JLabel Base2;
    private javax.swing.JLabel Base3;
    private javax.swing.JLabel Base4;
    private javax.swing.JLabel Base5;
    private javax.swing.JLabel Base6;
    private javax.swing.JButton Listo;
    private javax.swing.JLabel color1;
    private javax.swing.JLabel color2;
    private javax.swing.JLabel color3;
    private javax.swing.JLabel color4;
    private javax.swing.JLabel color5;
    private javax.swing.JLabel color6;
    private javax.swing.JLabel colorFinal;
    private javax.swing.JLabel colorInicial;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoSecundario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

}