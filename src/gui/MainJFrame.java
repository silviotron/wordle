/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JLabel;
import motores.*;

/**
 *
 * @author silvi
 */
public class MainJFrame extends javax.swing.JFrame {

    private IMotor motor;
    private String objetivo;
    private String palabra;
    private String palabras[];
    private int fila = 0;
    private JLabel cuadricula[][];

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame(IMotor motor) {
        initComponents();
        JLabel eje[][] = {
            {this.jLabel0_0, this.jLabel0_1, this.jLabel0_2, this.jLabel0_3, this.jLabel0_4},
            {this.jLabel1_0, this.jLabel1_1, this.jLabel1_2, this.jLabel1_3, this.jLabel1_4},
            {this.jLabel2_0, this.jLabel2_1, this.jLabel2_2, this.jLabel2_3, this.jLabel2_4},
            {this.jLabel3_0, this.jLabel3_1, this.jLabel3_2, this.jLabel3_3, this.jLabel3_4},
            {this.jLabel4_0, this.jLabel4_1, this.jLabel4_2, this.jLabel4_3, this.jLabel4_4},
            {this.jLabel5_0, this.jLabel5_1, this.jLabel5_2, this.jLabel5_3, this.jLabel5_4}
        };
        cuadricula = eje;
        this.motor = motor;
        objetivo = motor.obtenerPalabraAleatoria();
        palabras = new String[6];

        //TODO: implementar el funcionamiento del enter para poder saltar de linea
    }

    public MainJFrame() {
        initComponents();
        JLabel eje[][] = {
            {this.jLabel0_0, this.jLabel0_1, this.jLabel0_2, this.jLabel0_3, this.jLabel0_4},
            {this.jLabel1_0, this.jLabel1_1, this.jLabel1_2, this.jLabel1_3, this.jLabel1_4},
            {this.jLabel2_0, this.jLabel2_1, this.jLabel2_2, this.jLabel2_3, this.jLabel2_4},
            {this.jLabel3_0, this.jLabel3_1, this.jLabel3_2, this.jLabel3_3, this.jLabel3_4},
            {this.jLabel4_0, this.jLabel4_1, this.jLabel4_2, this.jLabel4_3, this.jLabel4_4},
            {this.jLabel5_0, this.jLabel5_1, this.jLabel5_2, this.jLabel5_3, this.jLabel5_4}
        };
        cuadricula = eje;
        this.motor = new MotorTest();
        objetivo = motor.obtenerPalabraAleatoria();
        palabras = new String[6];
        this.palabrajTextField.setHighlighter(null);
        this.motor1JRadioButtonMenuItem.setSelected(true);
        this.motor2JRadioButtonMenuItem.setSelected(false);
        this.motor3JRadioButtonMenuItem.setSelected(false);

        //TODO: implementar el funcionamiento del enter para poder saltar de linea
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        motoresButtonGroup = new javax.swing.ButtonGroup();
        palabrajTextField = new javax.swing.JTextField();
        fondojPanel = new javax.swing.JPanel();
        principaljPanel = new javax.swing.JPanel();
        jLabel0_0 = new javax.swing.JLabel();
        jLabel0_1 = new javax.swing.JLabel();
        jLabel0_2 = new javax.swing.JLabel();
        jLabel0_3 = new javax.swing.JLabel();
        jLabel0_4 = new javax.swing.JLabel();
        jLabel1_0 = new javax.swing.JLabel();
        jLabel1_1 = new javax.swing.JLabel();
        jLabel1_2 = new javax.swing.JLabel();
        jLabel1_3 = new javax.swing.JLabel();
        jLabel1_4 = new javax.swing.JLabel();
        jLabel2_0 = new javax.swing.JLabel();
        jLabel2_1 = new javax.swing.JLabel();
        jLabel2_2 = new javax.swing.JLabel();
        jLabel2_3 = new javax.swing.JLabel();
        jLabel2_4 = new javax.swing.JLabel();
        jLabel3_0 = new javax.swing.JLabel();
        jLabel3_1 = new javax.swing.JLabel();
        jLabel3_2 = new javax.swing.JLabel();
        jLabel3_3 = new javax.swing.JLabel();
        jLabel3_4 = new javax.swing.JLabel();
        jLabel4_0 = new javax.swing.JLabel();
        jLabel4_1 = new javax.swing.JLabel();
        jLabel4_2 = new javax.swing.JLabel();
        jLabel4_3 = new javax.swing.JLabel();
        jLabel4_4 = new javax.swing.JLabel();
        jLabel5_0 = new javax.swing.JLabel();
        jLabel5_1 = new javax.swing.JLabel();
        jLabel5_2 = new javax.swing.JLabel();
        jLabel5_3 = new javax.swing.JLabel();
        jLabel5_4 = new javax.swing.JLabel();
        titulojLabel = new javax.swing.JLabel();
        textojLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nuevoJMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        motor1JRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        motor2JRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        motor3JRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();
        motor4JRadioButtonMenuItem = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        palabrajTextField.setBackground(new java.awt.Color(102, 102, 102));
        palabrajTextField.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        palabrajTextField.setForeground(new java.awt.Color(102, 102, 102));
        palabrajTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        palabrajTextField.setBorder(null);
        palabrajTextField.setCaretColor(new java.awt.Color(102, 102, 102));
        palabrajTextField.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        palabrajTextField.setMargin(new java.awt.Insets(2, 10, 2, 6));
        palabrajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabrajTextFieldActionPerformed(evt);
            }
        });
        palabrajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                palabrajTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                palabrajTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                palabrajTextFieldKeyTyped(evt);
            }
        });

        fondojPanel.setBackground(new java.awt.Color(51, 51, 51));

        principaljPanel.setBackground(new java.awt.Color(102, 102, 102));
        principaljPanel.setLayout(new java.awt.GridLayout(6, 5));

        jLabel0_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_0.setForeground(new java.awt.Color(153, 153, 153));
        jLabel0_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_0.setAlignmentX(0.5F);
        jLabel0_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_0);

        jLabel0_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel0_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_1.setAlignmentX(0.5F);
        jLabel0_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_1);

        jLabel0_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel0_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_2.setAlignmentX(0.5F);
        jLabel0_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_2);

        jLabel0_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel0_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_3.setAlignmentX(0.5F);
        jLabel0_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_3);

        jLabel0_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel0_4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel0_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel0_4.setAlignmentX(0.5F);
        jLabel0_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel0_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel0_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel0_4);

        jLabel1_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_0.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_0.setAlignmentX(0.5F);
        jLabel1_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_0);

        jLabel1_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_1.setAlignmentX(0.5F);
        jLabel1_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_1);

        jLabel1_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_2.setAlignmentX(0.5F);
        jLabel1_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_2);

        jLabel1_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_3.setAlignmentX(0.5F);
        jLabel1_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_3);

        jLabel1_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1_4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_4.setAlignmentX(0.5F);
        jLabel1_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel1_4);

        jLabel2_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_0.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_0.setAlignmentX(0.5F);
        jLabel2_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_0);

        jLabel2_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_1.setAlignmentX(0.5F);
        jLabel2_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_1);

        jLabel2_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_2.setAlignmentX(0.5F);
        jLabel2_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_2);

        jLabel2_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_3.setAlignmentX(0.5F);
        jLabel2_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_3);

        jLabel2_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2_4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_4.setAlignmentX(0.5F);
        jLabel2_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel2_4);

        jLabel3_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_0.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_0.setAlignmentX(0.5F);
        jLabel3_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_0);

        jLabel3_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_1.setAlignmentX(0.5F);
        jLabel3_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_1);

        jLabel3_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_2.setAlignmentX(0.5F);
        jLabel3_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_2);

        jLabel3_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_3.setAlignmentX(0.5F);
        jLabel3_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_3);

        jLabel3_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel3_4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_4.setAlignmentX(0.5F);
        jLabel3_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel3_4);

        jLabel4_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_0.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_0.setAlignmentX(0.5F);
        jLabel4_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_0);

        jLabel4_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_1.setAlignmentX(0.5F);
        jLabel4_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_1);

        jLabel4_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_2.setAlignmentX(0.5F);
        jLabel4_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_2);

        jLabel4_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_3.setAlignmentX(0.5F);
        jLabel4_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_3);

        jLabel4_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel4_4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_4.setAlignmentX(0.5F);
        jLabel4_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel4_4);

        jLabel5_0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_0.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_0.setAlignmentX(0.5F);
        jLabel5_0.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_0.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_0.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_0);

        jLabel5_1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_1.setAlignmentX(0.5F);
        jLabel5_1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_1.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_1);

        jLabel5_2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_2.setAlignmentX(0.5F);
        jLabel5_2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_2.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_2);

        jLabel5_3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_3.setAlignmentX(0.5F);
        jLabel5_3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_3.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_3);

        jLabel5_4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel5_4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_4.setAlignmentX(0.5F);
        jLabel5_4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5_4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5_4.setPreferredSize(new java.awt.Dimension(50, 50));
        principaljPanel.add(jLabel5_4);

        titulojLabel.setFont(new java.awt.Font("Monospaced", 1, 56)); // NOI18N
        titulojLabel.setForeground(new java.awt.Color(153, 153, 153));
        titulojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulojLabel.setText("WORDLE");

        textojLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textojLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textojLabel1.setText(" ");

        javax.swing.GroupLayout fondojPanelLayout = new javax.swing.GroupLayout(fondojPanel);
        fondojPanel.setLayout(fondojPanelLayout);
        fondojPanelLayout.setHorizontalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondojPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(titulojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(principaljPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textojLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        fondojPanelLayout.setVerticalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titulojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(principaljPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(textojLabel1)
                .addGap(13, 13, 13))
        );

        jMenu1.setText("Archivo");

        nuevoJMenuItem1.setText("juego nuevo");
        nuevoJMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoJMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(nuevoJMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Motores");

        motoresButtonGroup.add(motor1JRadioButtonMenuItem);
        motor1JRadioButtonMenuItem.setSelected(true);
        motor1JRadioButtonMenuItem.setText("TEST");
        motor1JRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor1JRadioButtonMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(motor1JRadioButtonMenuItem);

        motoresButtonGroup.add(motor2JRadioButtonMenuItem);
        motor2JRadioButtonMenuItem.setText("Alumnos");
        motor2JRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor2JRadioButtonMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(motor2JRadioButtonMenuItem);

        motoresButtonGroup.add(motor3JRadioButtonMenuItem);
        motor3JRadioButtonMenuItem.setText("Ingles");
        motor3JRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor3JRadioButtonMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(motor3JRadioButtonMenuItem);

        motoresButtonGroup.add(motor4JRadioButtonMenuItem);
        motor4JRadioButtonMenuItem.setText("archivo");
        motor4JRadioButtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor4JRadioButtonMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(motor4JRadioButtonMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(palabrajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(palabrajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palabrajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabrajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabrajTextFieldActionPerformed

    private void palabrajTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabrajTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (fila <= 5) {
                if (!cuadricula[fila][4].getText().isEmpty()) {
                    if (motor.checkPalabra(palabra)) {
                        palabras[fila] = palabra;
                        setColores();
                        if (palabras[fila].equals(objetivo)) {
                            this.textojLabel1.setForeground(Color.green);
                            this.textojLabel1.setText("Ganaste perro.");
                        }else if(fila == 5){
                            this.textojLabel1.setForeground(Color.red);
                            this.textojLabel1.setText("Perdiste perro. Era " + objetivo);                            
                        }
                        palabrajTextField.setText("");
                        fila++;

                    }

                }
            }
        }
        setPalabra();
    }//GEN-LAST:event_palabrajTextFieldKeyPressed

    private void setColores() {
        for (int i = 0; i < 5; i++) {
            if (objetivo.charAt(i) == palabras[fila].charAt(i)) {
                cuadricula[fila][i].setForeground(Color.green);
            } else if (objetivo.contains(palabras[fila].charAt(i) + "")) {
                cuadricula[fila][i].setForeground(Color.yellow);

            } else {
                cuadricula[fila][i].setForeground(Color.black);
            }
        }
    }

    private void setColore(int n) {

    }

    private void palabrajTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabrajTextFieldKeyReleased
        setPalabra();
    }//GEN-LAST:event_palabrajTextFieldKeyReleased

    private void palabrajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabrajTextFieldKeyTyped
        setPalabra();

    }//GEN-LAST:event_palabrajTextFieldKeyTyped

    private void motor1JRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor1JRadioButtonMenuItemActionPerformed
        if (!this.motor.getClass().equals(MotorTest.class)) {
            motor = new MotorTest();
            restart();
            
        }

    }//GEN-LAST:event_motor1JRadioButtonMenuItemActionPerformed

    private void motor2JRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor2JRadioButtonMenuItemActionPerformed
        if (!this.motor.getClass().equals(MotorAlumnos.class)) {
            motor = new MotorAlumnos();
            restart();           
        }        

    }//GEN-LAST:event_motor2JRadioButtonMenuItemActionPerformed

    private void motor3JRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor3JRadioButtonMenuItemActionPerformed
        if (!this.motor.getClass().equals(MotorIngles.class)) {
            motor = new MotorIngles();
            restart();
            
        }        

    }//GEN-LAST:event_motor3JRadioButtonMenuItemActionPerformed

    private void nuevoJMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoJMenuItem1ActionPerformed
        restart();
    }//GEN-LAST:event_nuevoJMenuItem1ActionPerformed

    private void motor4JRadioButtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor4JRadioButtonMenuItemActionPerformed
            motor = new MotorArchivo();
            restart();
    }//GEN-LAST:event_motor4JRadioButtonMenuItemActionPerformed

    private void restart() {
        for (JLabel[] x : cuadricula) {
            for (JLabel y : x) {
                y.setText("");
                y.setForeground(Color.gray);
            }
        }
        for (String p : palabras) {
            p = "";
        }
        this.palabrajTextField.setText("");
        fila = 0;
        this.textojLabel1.setText(" ");
        objetivo = motor.obtenerPalabraAleatoria();
    }

    private void setPalabra() {
        palabra = this.palabrajTextField.getText().toUpperCase().replaceAll("[^A-ZÇÑÁÉÍÓÚ]", ""); //tildes: ÁÉÍÓÚ

        if (fila < 6) {
            setLetras();
        }
    }

    private void setLetras() {
        if (palabra.length() == 0) {
            cuadricula[fila][0].setText("");
            cuadricula[fila][1].setText("");
            cuadricula[fila][2].setText("");
            cuadricula[fila][3].setText("");
            cuadricula[fila][4].setText("");
        }

        if (palabra.length() == 1) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText("");
            cuadricula[fila][2].setText("");
            cuadricula[fila][3].setText("");
            cuadricula[fila][4].setText("");
        }
        if (palabra.length() == 2) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText(palabra.charAt(1) + "");
            cuadricula[fila][2].setText("");
            cuadricula[fila][3].setText("");
            cuadricula[fila][4].setText("");
        }
        if (palabra.length() == 3) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText(palabra.charAt(1) + "");
            cuadricula[fila][2].setText(palabra.charAt(2) + "");
            cuadricula[fila][3].setText("");
            cuadricula[fila][4].setText("");
        }
        if (palabra.length() == 4) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText(palabra.charAt(1) + "");
            cuadricula[fila][2].setText(palabra.charAt(2) + "");
            cuadricula[fila][3].setText(palabra.charAt(3) + "");
            cuadricula[fila][4].setText("");
        }
        if (palabra.length() == 5) {
            cuadricula[fila][0].setText(palabra.charAt(0) + "");
            cuadricula[fila][1].setText(palabra.charAt(1) + "");
            cuadricula[fila][2].setText(palabra.charAt(2) + "");
            cuadricula[fila][3].setText(palabra.charAt(3) + "");
            cuadricula[fila][4].setText(palabra.charAt(4) + "");
        }
        if (palabra.length() > 5) {
            palabra = palabra.substring(0, 5);
        }
        this.palabrajTextField.setText(palabra);
    }

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame(new MotorTest()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondojPanel;
    private javax.swing.JLabel jLabel0_0;
    private javax.swing.JLabel jLabel0_1;
    private javax.swing.JLabel jLabel0_2;
    private javax.swing.JLabel jLabel0_3;
    private javax.swing.JLabel jLabel0_4;
    private javax.swing.JLabel jLabel1_0;
    private javax.swing.JLabel jLabel1_1;
    private javax.swing.JLabel jLabel1_2;
    private javax.swing.JLabel jLabel1_3;
    private javax.swing.JLabel jLabel1_4;
    private javax.swing.JLabel jLabel2_0;
    private javax.swing.JLabel jLabel2_1;
    private javax.swing.JLabel jLabel2_2;
    private javax.swing.JLabel jLabel2_3;
    private javax.swing.JLabel jLabel2_4;
    private javax.swing.JLabel jLabel3_0;
    private javax.swing.JLabel jLabel3_1;
    private javax.swing.JLabel jLabel3_2;
    private javax.swing.JLabel jLabel3_3;
    private javax.swing.JLabel jLabel3_4;
    private javax.swing.JLabel jLabel4_0;
    private javax.swing.JLabel jLabel4_1;
    private javax.swing.JLabel jLabel4_2;
    private javax.swing.JLabel jLabel4_3;
    private javax.swing.JLabel jLabel4_4;
    private javax.swing.JLabel jLabel5_0;
    private javax.swing.JLabel jLabel5_1;
    private javax.swing.JLabel jLabel5_2;
    private javax.swing.JLabel jLabel5_3;
    private javax.swing.JLabel jLabel5_4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem motor1JRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem motor2JRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem motor3JRadioButtonMenuItem;
    private javax.swing.JRadioButtonMenuItem motor4JRadioButtonMenuItem;
    private javax.swing.ButtonGroup motoresButtonGroup;
    private javax.swing.JMenuItem nuevoJMenuItem1;
    private javax.swing.JTextField palabrajTextField;
    private javax.swing.JPanel principaljPanel;
    private javax.swing.JLabel textojLabel1;
    private javax.swing.JLabel titulojLabel;
    // End of variables declaration//GEN-END:variables

}
