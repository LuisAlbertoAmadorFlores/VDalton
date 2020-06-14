/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdalton;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import javax.swing.Icon;

/**
 *
 * @author Beto
 */
public class test1 extends javax.swing.JFrame {

    private int contador_protan = 0, contador_deuteran = 0, contador_preguntas = 0, contador_pNormal = 0;
    ImageIcon p1, p2, p3, p4, p5, p6, p7,error;
    Inicio vd = new Inicio();
    resultado configuracion = new resultado();
    AudioClip sonido;

    /**
     * Creates new form asda
     */
    public test1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(vd.imageicon.getImage());
        this.scroll.getVerticalScrollBar().setUnitIncrement(15);
        sonido=java.applet.Applet.newAudioClip(getClass().getResource("/Test1/Windows Notify Email.wav"));
        this.exit.setToolTipText("Cerrar");
        this.minimizar.setToolTipText("Minimizar");
        this.regresar.setToolTipText("Regresar");
    }

    public void select() {
         //Evaluacion para pregunta 1
        p1 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/29_2.png"));
        if (n29.isSelected()) {
            jLabel2.setIcon(p1);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a normal");
        } else if (n70.isSelected()) {
            jLabel2.setIcon(p1);
            this.contador_protan++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a protan");
        } else if (nada.isSelected()) {
            jLabel2.setIcon(p1);
            this.contador_protan++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a protan");
        } else {
            p1 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_blanco/29_2.png"));
            jLabel2.setIcon(p1);
        }

        //Evaluacion para pregunta 2
        p2 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/12.png"));
        if (n12.isSelected()) {
            jLabel6.setIcon(p2);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a normal");
        } else if (n10.isSelected()) {
            jLabel6.setIcon(p2);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a normal");
        } else if (nada1.isSelected()) {
            jLabel6.setIcon(p2);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a Normal")
        } else {
            p2 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_blanco/12.png"));
            jLabel6.setIcon(p2);
        }
        //Evaluacion para pregunta 3
        p3 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/8.png"));
        if (n8.isSelected()) {
            jLabel3.setIcon(p3);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a normal");
        } else if (n3.isSelected()) {
            jLabel3.setIcon(p3);
            this.contador_protan++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a protan");
        } else if (nada2.isSelected()) {
            jLabel3.setIcon(p3);
            this.contador_deuteran++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a deuteran");
        } else {
            p3 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_blanco/8.png"));
            jLabel3.setIcon(p3);
        }
        //Evualuacion para pregunta 4
        p4 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/6_2.png"));
        if (n6.isSelected()) {
            jLabel4.setIcon(p4);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a Normal");
        } else if (n5.isSelected()) {
            jLabel4.setIcon(p4);
            this.contador_protan++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a protan");
        } else if (nada3.isSelected()) {
            jLabel4.setIcon(p4);
            this.contador_deuteran++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a deuteran");
        }else {
            p4 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_blanco/6_2.png"));
            jLabel4.setIcon(p4);
        }

        //Evualuacion para pregunta 5
        p5 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/6.png"));
        if (n62.isSelected()) {
            jLabel8.setIcon(p5);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a Normal");
        } 
        else if (option.isSelected()) {
            jLabel8.setIcon(p5);
            this.contador_deuteran++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a protan");
        }else if (nada4.isSelected()) {
            jLabel8.setIcon(p5);
            this.contador_protan++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a protan");
        }
        else {
            p5 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_blanco/6.png"));
            jLabel8.setIcon(p5);
        }
        //Evualuacion para pregunta 6
        p6 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/lineaverde.png"));
        if (linea1.isSelected()) {
            jLabel10.setIcon(p6);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a normal");
        } else if (linea2.isSelected()) {
            jLabel10.setIcon(p6);
            this.contador_protan++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a protan");
        } else if (nada5.isSelected()) {
            jLabel10.setIcon(p6);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a Normal");
        }else {
            p6 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_blanco/lineaverde.png"));
            jLabel10.setIcon(p6);
        }
        //Evualuacion para pregunta 7
        p7 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/linearoja.png"));
        if (linea12.isSelected()) {
            jLabel11.setIcon(p7);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a normal");
        } else if (linea22.isSelected()) {
            jLabel11.setIcon(p7);
            this.contador_protan++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a protan");
        } else if (nada6.isSelected()) {
            jLabel11.setIcon(p7);
            this.contador_pNormal++;
            this.contador_preguntas++;
            //System.out.println("Se sumo 1 a Normal");
        }else {
            p7 = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_blanco/linearoja.png"));
            jLabel11.setIcon(p7);
        }
        System.out.println("\n\ntotal\n" + "Protan:" + this.contador_protan
                + "\nDeterauomalia:" + this.contador_deuteran + "\nNormal:" + this.contador_pNormal + "\nPreguntas:" + this.contador_preguntas
        );

        //Enivia respuesta como vision normal por evaluacion
        if (this.contador_pNormal >= this.contador_protan && this.contador_pNormal >= this.contador_deuteran) {
            configuracion.tipo_Daltonismo("Normal", "Test 1");
        }
        //Ausencia de color verde
        if (this.contador_deuteran >= this.contador_protan && this.contador_deuteran >= this.contador_pNormal) {
            configuracion.tipo_Daltonismo("Deuteran", "Test 1");
        }
        //Ausencia de color rojo
        if (this.contador_protan >= this.contador_pNormal && this.contador_protan >= this.contador_deuteran) {
            configuracion.tipo_Daltonismo("Protan", "Test 1");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P1 = new javax.swing.ButtonGroup();
        P2 = new javax.swing.ButtonGroup();
        P3 = new javax.swing.ButtonGroup();
        P4 = new javax.swing.ButtonGroup();
        P5 = new javax.swing.ButtonGroup();
        P6 = new javax.swing.ButtonGroup();
        P7 = new javax.swing.ButtonGroup();
        scroll = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        n29 = new javax.swing.JRadioButton();
        n70 = new javax.swing.JRadioButton();
        nada = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        listo = new javax.swing.JButton();
        n10 = new javax.swing.JRadioButton();
        n12 = new javax.swing.JRadioButton();
        nada1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        nada2 = new javax.swing.JRadioButton();
        n3 = new javax.swing.JRadioButton();
        n8 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        nada3 = new javax.swing.JRadioButton();
        n5 = new javax.swing.JRadioButton();
        n6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        nada4 = new javax.swing.JRadioButton();
        n62 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        nada5 = new javax.swing.JRadioButton();
        linea2 = new javax.swing.JRadioButton();
        linea1 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nada6 = new javax.swing.JRadioButton();
        linea22 = new javax.swing.JRadioButton();
        linea12 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        option = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VDalton Beta 1.0");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBackground(new java.awt.Color(54, 52, 52));
        scroll.setBorder(null);
        scroll.setForeground(new java.awt.Color(54, 52, 52));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(50, 49, 49));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P1.add(n29);
        n29.setBorder(null);
        n29.setContentAreaFilled(false);
        n29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n29.setFocusPainted(false);
        n29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/29_casilla.png"))); // NOI18N
        n29.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/29_casilla_pressed.png"))); // NOI18N
        n29.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/29_casilla_pressed.png"))); // NOI18N
        jPanel1.add(n29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        P1.add(n70);
        n70.setBorder(null);
        n70.setContentAreaFilled(false);
        n70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/70_casilla.png"))); // NOI18N
        n70.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/70_casilla_pressed.png"))); // NOI18N
        jPanel1.add(n70, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        P1.add(nada);
        nada.setBorder(null);
        nada.setContentAreaFilled(false);
        nada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla.png"))); // NOI18N
        nada.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla_pressed.png"))); // NOI18N
        nada.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla_pressed.png"))); // NOI18N
        jPanel1.add(nada, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/29_2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 160, 160));

        listo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_listo.png"))); // NOI18N
        listo.setBorder(null);
        listo.setBorderPainted(false);
        listo.setContentAreaFilled(false);
        listo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_listo_press.png"))); // NOI18N
        listo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test2/boton_listo_press.png"))); // NOI18N
        listo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listoMousePressed(evt);
            }
        });
        jPanel1.add(listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1580, 160, 50));

        P2.add(n10);
        n10.setBorder(null);
        n10.setContentAreaFilled(false);
        n10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/10_casilla.png"))); // NOI18N
        n10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/10_casilla_pressed.png"))); // NOI18N
        jPanel1.add(n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        P2.add(n12);
        n12.setBorder(null);
        n12.setContentAreaFilled(false);
        n12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n12.setFocusPainted(false);
        n12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/12_casilla.png"))); // NOI18N
        n12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/12_casilla_pressed.png"))); // NOI18N
        n12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/12_casilla_pressed.png"))); // NOI18N
        jPanel1.add(n12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        P2.add(nada1);
        nada1.setBorder(null);
        nada1.setContentAreaFilled(false);
        nada1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla.png"))); // NOI18N
        nada1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla_pressed.png"))); // NOI18N
        jPanel1.add(nada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/12.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 160, 200));

        P3.add(nada2);
        nada2.setBorder(null);
        nada2.setContentAreaFilled(false);
        nada2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla.png"))); // NOI18N
        nada2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla_pressed.png"))); // NOI18N
        jPanel1.add(nada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, -1, -1));

        P3.add(n3);
        n3.setBorder(null);
        n3.setContentAreaFilled(false);
        n3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/3_casilla.png"))); // NOI18N
        n3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/3_casilla_pressed.png"))); // NOI18N
        jPanel1.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        P3.add(n8);
        n8.setBorder(null);
        n8.setContentAreaFilled(false);
        n8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n8.setFocusPainted(false);
        n8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/8_casilla.png"))); // NOI18N
        n8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/8_casilla_pressed.png"))); // NOI18N
        jPanel1.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/8.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 160, 200));

        P4.add(nada3);
        nada3.setBorder(null);
        nada3.setContentAreaFilled(false);
        nada3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla.png"))); // NOI18N
        nada3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla_pressed.png"))); // NOI18N
        jPanel1.add(nada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 800, -1, -1));

        P4.add(n5);
        n5.setBorder(null);
        n5.setContentAreaFilled(false);
        n5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/5_casilla.png"))); // NOI18N
        n5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/5_casilla_pressed.png"))); // NOI18N
        jPanel1.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 750, -1, -1));

        P4.add(n6);
        n6.setBorder(null);
        n6.setContentAreaFilled(false);
        n6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n6.setFocusPainted(false);
        n6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/6_casilla.png"))); // NOI18N
        n6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/6_casilla_pressed.png"))); // NOI18N
        jPanel1.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/6_2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, 160, 200));

        P5.add(nada4);
        nada4.setBorder(null);
        nada4.setContentAreaFilled(false);
        nada4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nada4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla.png"))); // NOI18N
        nada4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla_pressed.png"))); // NOI18N
        jPanel1.add(nada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1020, -1, -1));

        P5.add(n62);
        n62.setBorder(null);
        n62.setContentAreaFilled(false);
        n62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        n62.setFocusPainted(false);
        n62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/6_casilla.png"))); // NOI18N
        n62.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/6_casilla_pressed.png"))); // NOI18N
        jPanel1.add(n62, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 970, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/6.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 890, 170, 200));

        P6.add(nada5);
        nada5.setBorder(null);
        nada5.setContentAreaFilled(false);
        nada5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nada5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla.png"))); // NOI18N
        nada5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla_pressed.png"))); // NOI18N
        jPanel1.add(nada5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1260, -1, -1));

        P6.add(linea2);
        linea2.setBorder(null);
        linea2.setContentAreaFilled(false);
        linea2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linea2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/azulverdemorada_casilla.png"))); // NOI18N
        linea2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/azulcerdemorada_casilla_pressed.png"))); // NOI18N
        jPanel1.add(linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1200, 340, -1));

        P6.add(linea1);
        linea1.setBorder(null);
        linea1.setContentAreaFilled(false);
        linea1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linea1.setFocusPainted(false);
        linea1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/azulverdeamarilla_casilla.png"))); // NOI18N
        linea1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/azulverdeamarilla_casilla_pressed.png"))); // NOI18N
        jPanel1.add(linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1140, 340, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/lineaverde.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1110, 160, 200));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_verde/linearoja.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1340, 160, 200));

        P7.add(nada6);
        nada6.setBorder(null);
        nada6.setContentAreaFilled(false);
        nada6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nada6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla.png"))); // NOI18N
        nada6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/nada_casilla_pressed.png"))); // NOI18N
        jPanel1.add(nada6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1480, -1, -1));

        P7.add(linea22);
        linea22.setBorder(null);
        linea22.setContentAreaFilled(false);
        linea22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linea22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/azulverdemorada_casilla.png"))); // NOI18N
        linea22.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/azulcerdemorada_casilla_pressed.png"))); // NOI18N
        jPanel1.add(linea22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1430, -1, -1));

        P7.add(linea12);
        linea12.setBorder(null);
        linea12.setContentAreaFilled(false);
        linea12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linea12.setFocusPainted(false);
        linea12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/moradanaranja_casilla.png"))); // NOI18N
        linea12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/moradanaranja_casilla_pressed.png"))); // NOI18N
        jPanel1.add(linea12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/barra_separadora.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 560, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/barra_separadora.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 560, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/barra_separadora.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1090, 560, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/barra_separadora.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 560, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/barra_separadora.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1320, 560, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/barra_separadora.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 870, 560, 20));

        P5.add(option);
        option.setBorder(null);
        option.setContentAreaFilled(false);
        option.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/8_casilla.png"))); // NOI18N
        option.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/opciones/8_casilla_pressed.png"))); // NOI18N
        jPanel1.add(option, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 920, -1, -1));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1640, 640, 20));

        scroll.setViewportView(jPanel1);

        getContentPane().add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 630, 390));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/titulo_queves.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_atras.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setContentAreaFilled(false);
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.setFocusPainted(false);
        regresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_atras_press.png"))); // NOI18N
        regresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_atras_press.png"))); // NOI18N
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regresarMousePressed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/titulo_instrucciones.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_cerrar.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_cerrar_press.png"))); // NOI18N
        exit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_cerrar_press.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 50));

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_minimize.png"))); // NOI18N
        minimizar.setBorder(null);
        minimizar.setBorderPainted(false);
        minimizar.setContentAreaFilled(false);
        minimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/boton_minimize_press.png"))); // NOI18N
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizarMousePressed(evt);
            }
        });
        getContentPane().add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test1/fondo_sinbotones.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMousePressed
        // TODO add your handling code here:
        seleccion_test obj = new seleccion_test();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarMousePressed

    private void minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMousePressed
        // TODO add your handling code here:
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void listoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listoMousePressed
        // TODO add your handling code here:
         Icon error = new ImageIcon(getClass().getResource("/Test1/Ishikara/fondo_blanco/5.png"));
        select();
        if (this.contador_preguntas != 7) {
            int valor = 0;
            valor = 7 - this.contador_preguntas;
            sonido.play();
            JOptionPane.showMessageDialog(null,"Te han faltado preguntas por responder.\n"
                    + "Ahora busca imagenes con contorno blanco \ncomo la que se muestra aqui y respondelas. ","!ATENCION¡", WIDTH, error);
            this.contador_preguntas = this.contador_preguntas - this.contador_preguntas;
            this.contador_pNormal = this.contador_pNormal - this.contador_pNormal;
            this.contador_deuteran = this.contador_deuteran - this.contador_deuteran;
            this.contador_protan = this.contador_protan - this.contador_protan;

        } else {
            configuracion.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_listoMousePressed

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
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup P1;
    private javax.swing.ButtonGroup P2;
    private javax.swing.ButtonGroup P3;
    private javax.swing.ButtonGroup P4;
    private javax.swing.ButtonGroup P5;
    private javax.swing.ButtonGroup P6;
    private javax.swing.ButtonGroup P7;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton linea1;
    private javax.swing.JRadioButton linea12;
    private javax.swing.JRadioButton linea2;
    private javax.swing.JRadioButton linea22;
    private javax.swing.JButton listo;
    private javax.swing.JButton minimizar;
    private javax.swing.JRadioButton n10;
    private javax.swing.JRadioButton n12;
    private javax.swing.JRadioButton n29;
    private javax.swing.JRadioButton n3;
    private javax.swing.JRadioButton n5;
    private javax.swing.JRadioButton n6;
    private javax.swing.JRadioButton n62;
    private javax.swing.JRadioButton n70;
    private javax.swing.JRadioButton n8;
    private javax.swing.JRadioButton nada;
    private javax.swing.JRadioButton nada1;
    private javax.swing.JRadioButton nada2;
    private javax.swing.JRadioButton nada3;
    private javax.swing.JRadioButton nada4;
    private javax.swing.JRadioButton nada5;
    private javax.swing.JRadioButton nada6;
    private javax.swing.JRadioButton option;
    private javax.swing.JButton regresar;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
