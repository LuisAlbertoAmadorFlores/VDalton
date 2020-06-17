/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdalton;

import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import javax.swing.JOptionPane;
import ds.desktop.notify.DesktopNotify;
import ds.desktop.notify.NotifyTheme;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Beto
 */
public class Evaluacion extends javax.swing.JFrame {

    public String Test;
    private TrayIcon trayicon;
    private SystemTray systemtray;
    public File archivo;
    public File ruta = new File("C:/VDalton/Configuracion");
    public Inicio vd = new Inicio();

    /**
     * Creates new form resultado
     */
    public Evaluacion() {
        initComponents();
        setLocationRelativeTo(null);
        user.setText(vd.usuario);
        setIconImage(vd.imageicon.getImage());
        instanciatray();
        
    }

    public void instanciatray() {
        trayicon = new TrayIcon(vd.imageicon.getImage(), "VDalton", popup);
        trayicon.setImageAutoSize(true);
        systemtray = SystemTray.getSystemTray();
    }

    public void registro() throws AWTException {
        systemtray.add(trayicon);
        this.setVisible(false);
        DesktopNotify.setDefaultTheme(NotifyTheme.Dark);
        DesktopNotify.showDesktopMessage("VDalton Activo","Los servicios se encuetran activos,puedes volver desde el apartado de Notificaciones.", DesktopNotify.TIP, 9000L);
    }

    public void crearuta() {
        if (!ruta.exists()) {
            if (ruta.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }

    public String cargarDatos() throws FileNotFoundException, IOException {

        FileReader cargar = new FileReader("C:/VDalton/Configuracion/Configuracion.txt");
        BufferedReader lee = new BufferedReader(cargar);
        String linea;
        while ((linea = lee.readLine()) != null) {
            if ("Vision Normal".equals(linea)) {
                this.Leyenda.setVisible(false);
                this.tipo.setText(linea);
                break;
            }

            if ("Deuteranopia".equals(linea)) {
                this.tipo.setText(linea);
                break;
            }

            if ("Protanopia".equals(linea)) {
                this.tipo.setText(linea);
                break;
            }
        }
        return null;
    }

    public void guardarDatos(String Nombre, String TipoD) throws IOException {
        crearuta();
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        FileWriter configuracion;
        BufferedWriter w;
        PrintWriter a;

        try {
            archivo = new File("C:/VDalton/Configuracion/Configuracion.txt");
            configuracion = new FileWriter(archivo);
            w = new BufferedWriter(configuracion);
            a = new PrintWriter(w);

            a.write("Usuario:");
            a.append("\n" + Nombre);
            a.append("\nTipo:" + "\n" + TipoD);
            a.append("\nTest Realizado:" + "\n" + Test);
            a.append("\nFecha:" + "\n" + dateFormat.format(date));
            a.append("\nHora:" + "\n" + hourFormat.format(date));

            a.close();
            w.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha sucedio un error al guardar la configuracion" + e);
        }

    }

    public void tipoDaltonismo(String ResultadoTest, String test) {
        if ("Normal".equals(ResultadoTest)) {
            this.Leyenda.setVisible(false);
            this.tipo.setText("Vision Normal");
        }
        if ("Deuteran".equals(ResultadoTest)) {
            this.tipo.setText("Deuteranopia");
            this.Mensaje.setText("ATENCION:\n" + "Te vez afectado por la falta de tonos rojos-verdes en los colores.\nCambiaremos la interfaz de tu sistema Windows para una mejor comodidad visual solo presiona Aceptar.");
        }
        if ("Protan".equals(ResultadoTest)) {
            this.tipo.setText("Protanopia");
            this.Mensaje.setText("ATENCION:" + "Cambiaremos la interfaz de tu sistema Windows \npara una mejor comodidad visual solo presiona Aceptar.");
        }
        Test = test;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new java.awt.PopupMenu();
        abrir = new java.awt.MenuItem();
        nuevotest = new java.awt.MenuItem();
        salir = new java.awt.MenuItem();
        jLabel3 = new javax.swing.JLabel();
        Leyenda = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();
        ocultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        popup.setLabel("popupMenu1");

        abrir.setLabel("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        popup.add(abrir);

        nuevotest.setLabel("Nuevo TEST");
        nuevotest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevotestActionPerformed(evt);
            }
        });
        popup.add(nuevotest);
        popup.addSeparator();
        salir.setLabel("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        popup.add(salir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/titulo_resultados.png"))); // NOI18N

        Leyenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Leyenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pantalla_Principal/condicion_daltonismo.png"))); // NOI18N
        Leyenda.setToolTipText("");

        user.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/icono_usuario.png"))); // NOI18N

        tipo.setFont(new java.awt.Font("Trebuchet MS", 1, 78)); // NOI18N
        tipo.setForeground(new java.awt.Color(255, 255, 255));
        tipo.setToolTipText("");

        Mensaje.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/cuadro_traslucido.png"))); // NOI18N

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/boton_cerrar.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/boton_cerrar_press.png"))); // NOI18N
        exit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/boton_cerrar_press.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/boton_minimize.png"))); // NOI18N
        minimizar.setBorder(null);
        minimizar.setBorderPainted(false);
        minimizar.setContentAreaFilled(false);
        minimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/boton_minimize_press.png"))); // NOI18N
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/boton_aceptar.png"))); // NOI18N
        ocultar.setBorder(null);
        ocultar.setBorderPainted(false);
        ocultar.setContentAreaFilled(false);
        ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/boton_aceptar_press.png"))); // NOI18N
        ocultar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Resultados/boton_aceptar_press.png"))); // NOI18N
        ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Escoger_test/fondo_sinbotones.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(minimizar)
                .addGap(9, 9, 9)
                .addComponent(exit))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel3)
                .addGap(163, 163, 163)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(Leyenda, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Leyenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
        // TODO add your handling code here:
        evt.getID();
        try {
            if (SystemTray.isSupported()) {
                systemtray.add(trayicon);
                this.setVisible(false);
                DesktopNotify.setDefaultTheme(NotifyTheme.Dark);
                DesktopNotify.showDesktopMessage("VDalton Activo", "Los servicios se encuetran activos,puedes volver desde el apartado de Notificaciones.", DesktopNotify.TIP, 9000L);
                DesktopNotify.showDesktopMessage(this.tipo.getText(), "ACTIVADO", DesktopNotify.TIP, 9000L);
                guardarDatos(vd.usuario, this.tipo.getText());
                
            }
        } catch (AWTException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Evaluacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ocultarActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        // TODO add your handling code here:
        evt.getID();
        systemtray.remove(trayicon);

        //cargarDatos();
        this.setVisible(true);
    }//GEN-LAST:event_abrirActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        evt.getID();
         Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void nuevotestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevotestActionPerformed
        // TODO add your handling code here:
        evt.getID();
        systemtray.remove(trayicon);
        Seleccion nuevo = new Seleccion();
        nuevo.setVisible(true);
    }//GEN-LAST:event_nuevotestActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        evt.getID();
         Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        // TODO add your handling code here:
        evt.getID();
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

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
            Logger.getLogger(Evaluacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Evaluacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Evaluacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Evaluacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Evaluacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Leyenda;
    private javax.swing.JLabel Mensaje;
    private java.awt.MenuItem abrir;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton minimizar;
    private java.awt.MenuItem nuevotest;
    private javax.swing.JButton ocultar;
    private java.awt.PopupMenu popup;
    private java.awt.MenuItem salir;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
