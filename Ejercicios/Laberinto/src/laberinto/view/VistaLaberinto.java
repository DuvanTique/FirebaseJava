package laberinto.view;

import java.awt.Color;

/**
 *
 * @author Duvan
 */
public class VistaLaberinto extends javax.swing.JFrame {
    
    private boolean inGame=false;
    private int time = 0;

    public VistaLaberinto() {
        initComponents();
        this.setTitle("Laberinto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogWin = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlabelTime = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelVertical1 = new javax.swing.JPanel();
        jPanelHorizontal1 = new javax.swing.JPanel();
        jLabelStar = new javax.swing.JLabel();
        jLabelFinish = new javax.swing.JLabel();
        jPanelVertical2 = new javax.swing.JPanel();
        jPanelHorizontal2 = new javax.swing.JPanel();
        jPanelVertical3 = new javax.swing.JPanel();
        jPanelHorizontal3 = new javax.swing.JPanel();
        jPanelVertical4 = new javax.swing.JPanel();
        jPanelHorizontal4 = new javax.swing.JPanel();
        jPanelHorizontal5 = new javax.swing.JPanel();
        jPanelHorizontal6 = new javax.swing.JPanel();
        jPanelHorizontal7 = new javax.swing.JPanel();
        jPanelHorizontal8 = new javax.swing.JPanel();
        jPanelHorizontal9 = new javax.swing.JPanel();
        jPanelHorizontal10 = new javax.swing.JPanel();
        jPanelVertical5 = new javax.swing.JPanel();
        jPanelVertical6 = new javax.swing.JPanel();
        jPanelVertical7 = new javax.swing.JPanel();
        jPanelHorizontal11 = new javax.swing.JPanel();
        jPanelHorizontal12 = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jLabel1.setText("Ganaste!!");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlabelTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jlabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogWinLayout = new javax.swing.GroupLayout(jDialogWin.getContentPane());
        jDialogWin.getContentPane().setLayout(jDialogWinLayout);
        jDialogWinLayout.setHorizontalGroup(
            jDialogWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogWinLayout.setVerticalGroup(
            jDialogWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPasswordField1.setText("jPasswordField1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelVertical1.setBackground(new java.awt.Color(51, 51, 51));
        jPanelVertical1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVertical1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelVertical1Layout = new javax.swing.GroupLayout(jPanelVertical1);
        jPanelVertical1.setLayout(jPanelVertical1Layout);
        jPanelVertical1Layout.setHorizontalGroup(
            jPanelVertical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanelVertical1Layout.setVerticalGroup(
            jPanelVertical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelHorizontal1.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal1Layout = new javax.swing.GroupLayout(jPanelHorizontal1);
        jPanelHorizontal1.setLayout(jPanelHorizontal1Layout);
        jPanelHorizontal1Layout.setHorizontalGroup(
            jPanelHorizontal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelHorizontal1Layout.setVerticalGroup(
            jPanelHorizontal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jLabelStar.setBackground(new java.awt.Color(102, 102, 255));
        jLabelStar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabelStar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelStar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStar.setText("Incio");
        jLabelStar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelStar.setOpaque(true);
        jLabelStar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStarMouseClicked(evt);
            }
        });
        jLabelStar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabelStarPropertyChange(evt);
            }
        });

        jLabelFinish.setBackground(new java.awt.Color(255, 0, 102));
        jLabelFinish.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabelFinish.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFinish.setText("Final");
        jLabelFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelFinish.setOpaque(true);
        jLabelFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFinishMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelFinishMouseEntered(evt);
            }
        });

        jPanelVertical2.setBackground(new java.awt.Color(51, 51, 51));
        jPanelVertical2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVertical2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelVertical2Layout = new javax.swing.GroupLayout(jPanelVertical2);
        jPanelVertical2.setLayout(jPanelVertical2Layout);
        jPanelVertical2Layout.setHorizontalGroup(
            jPanelVertical2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        jPanelVertical2Layout.setVerticalGroup(
            jPanelVertical2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelHorizontal2.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal2.setAlignmentX(0.1F);
        jPanelHorizontal2.setAlignmentY(0.1F);
        jPanelHorizontal2.setAutoscrolls(true);
        jPanelHorizontal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal2Layout = new javax.swing.GroupLayout(jPanelHorizontal2);
        jPanelHorizontal2.setLayout(jPanelHorizontal2Layout);
        jPanelHorizontal2Layout.setHorizontalGroup(
            jPanelHorizontal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelHorizontal2Layout.setVerticalGroup(
            jPanelHorizontal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanelVertical3.setBackground(new java.awt.Color(51, 51, 51));
        jPanelVertical3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVertical3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelVertical3Layout = new javax.swing.GroupLayout(jPanelVertical3);
        jPanelVertical3.setLayout(jPanelVertical3Layout);
        jPanelVertical3Layout.setHorizontalGroup(
            jPanelVertical3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanelVertical3Layout.setVerticalGroup(
            jPanelVertical3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelHorizontal3.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal3Layout = new javax.swing.GroupLayout(jPanelHorizontal3);
        jPanelHorizontal3.setLayout(jPanelHorizontal3Layout);
        jPanelHorizontal3Layout.setHorizontalGroup(
            jPanelHorizontal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanelHorizontal3Layout.setVerticalGroup(
            jPanelHorizontal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jPanelVertical4.setBackground(new java.awt.Color(51, 51, 51));
        jPanelVertical4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVertical4MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelVertical4Layout = new javax.swing.GroupLayout(jPanelVertical4);
        jPanelVertical4.setLayout(jPanelVertical4Layout);
        jPanelVertical4Layout.setHorizontalGroup(
            jPanelVertical4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanelVertical4Layout.setVerticalGroup(
            jPanelVertical4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jPanelHorizontal4.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal4MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal4Layout = new javax.swing.GroupLayout(jPanelHorizontal4);
        jPanelHorizontal4.setLayout(jPanelHorizontal4Layout);
        jPanelHorizontal4Layout.setHorizontalGroup(
            jPanelHorizontal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        jPanelHorizontal4Layout.setVerticalGroup(
            jPanelHorizontal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanelHorizontal5.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal5Layout = new javax.swing.GroupLayout(jPanelHorizontal5);
        jPanelHorizontal5.setLayout(jPanelHorizontal5Layout);
        jPanelHorizontal5Layout.setHorizontalGroup(
            jPanelHorizontal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        jPanelHorizontal5Layout.setVerticalGroup(
            jPanelHorizontal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanelHorizontal6.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal6MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal6Layout = new javax.swing.GroupLayout(jPanelHorizontal6);
        jPanelHorizontal6.setLayout(jPanelHorizontal6Layout);
        jPanelHorizontal6Layout.setHorizontalGroup(
            jPanelHorizontal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        jPanelHorizontal6Layout.setVerticalGroup(
            jPanelHorizontal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanelHorizontal7.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal7MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal7Layout = new javax.swing.GroupLayout(jPanelHorizontal7);
        jPanelHorizontal7.setLayout(jPanelHorizontal7Layout);
        jPanelHorizontal7Layout.setHorizontalGroup(
            jPanelHorizontal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanelHorizontal7Layout.setVerticalGroup(
            jPanelHorizontal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanelHorizontal8.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal8MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal8Layout = new javax.swing.GroupLayout(jPanelHorizontal8);
        jPanelHorizontal8.setLayout(jPanelHorizontal8Layout);
        jPanelHorizontal8Layout.setHorizontalGroup(
            jPanelHorizontal8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        jPanelHorizontal8Layout.setVerticalGroup(
            jPanelHorizontal8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanelHorizontal9.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal9MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal9Layout = new javax.swing.GroupLayout(jPanelHorizontal9);
        jPanelHorizontal9.setLayout(jPanelHorizontal9Layout);
        jPanelHorizontal9Layout.setHorizontalGroup(
            jPanelHorizontal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        jPanelHorizontal9Layout.setVerticalGroup(
            jPanelHorizontal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanelHorizontal10.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal10MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal10Layout = new javax.swing.GroupLayout(jPanelHorizontal10);
        jPanelHorizontal10.setLayout(jPanelHorizontal10Layout);
        jPanelHorizontal10Layout.setHorizontalGroup(
            jPanelHorizontal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelHorizontal10Layout.setVerticalGroup(
            jPanelHorizontal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanelVertical5.setBackground(new java.awt.Color(51, 51, 51));
        jPanelVertical5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVertical5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelVertical5Layout = new javax.swing.GroupLayout(jPanelVertical5);
        jPanelVertical5.setLayout(jPanelVertical5Layout);
        jPanelVertical5Layout.setHorizontalGroup(
            jPanelVertical5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanelVertical5Layout.setVerticalGroup(
            jPanelVertical5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        jPanelVertical6.setBackground(new java.awt.Color(51, 51, 51));
        jPanelVertical6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVertical6MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelVertical6Layout = new javax.swing.GroupLayout(jPanelVertical6);
        jPanelVertical6.setLayout(jPanelVertical6Layout);
        jPanelVertical6Layout.setHorizontalGroup(
            jPanelVertical6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanelVertical6Layout.setVerticalGroup(
            jPanelVertical6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        jPanelVertical7.setBackground(new java.awt.Color(51, 51, 51));
        jPanelVertical7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVertical7MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelVertical7Layout = new javax.swing.GroupLayout(jPanelVertical7);
        jPanelVertical7.setLayout(jPanelVertical7Layout);
        jPanelVertical7Layout.setHorizontalGroup(
            jPanelVertical7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        jPanelVertical7Layout.setVerticalGroup(
            jPanelVertical7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );

        jPanelHorizontal11.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal11MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal11Layout = new javax.swing.GroupLayout(jPanelHorizontal11);
        jPanelHorizontal11.setLayout(jPanelHorizontal11Layout);
        jPanelHorizontal11Layout.setHorizontalGroup(
            jPanelHorizontal11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        jPanelHorizontal11Layout.setVerticalGroup(
            jPanelHorizontal11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanelHorizontal12.setBackground(new java.awt.Color(51, 51, 51));
        jPanelHorizontal12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHorizontal12MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanelHorizontal12Layout = new javax.swing.GroupLayout(jPanelHorizontal12);
        jPanelHorizontal12.setLayout(jPanelHorizontal12Layout);
        jPanelHorizontal12Layout.setHorizontalGroup(
            jPanelHorizontal12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanelHorizontal12Layout.setVerticalGroup(
            jPanelHorizontal12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelVertical1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelHorizontal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelHorizontal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanelHorizontal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanelHorizontal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabelStar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelHorizontal10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanelHorizontal9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addComponent(jPanelVertical3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelHorizontal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelHorizontal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelHorizontal4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelHorizontal6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanelVertical7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jPanelVertical5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jPanelVertical6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)))))
                        .addComponent(jPanelVertical4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelHorizontal12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelHorizontal11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, 0)
                .addComponent(jPanelVertical2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelVertical2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVertical1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelHorizontal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanelHorizontal12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jPanelHorizontal11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabelFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelVertical4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanelVertical3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelStar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanelHorizontal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanelHorizontal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(jPanelHorizontal9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelHorizontal10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanelVertical7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanelVertical6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addComponent(jPanelVertical5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanelHorizontal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanelHorizontal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jPanelHorizontal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanelHorizontal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)))
                        .addComponent(jPanelHorizontal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFinishMouseClicked

    }//GEN-LAST:event_jLabelFinishMouseClicked

    private void jLabelFinishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFinishMouseEntered
        if(inGame){
            jDialogWin.setLocationRelativeTo(null);
            jDialogWin.setSize(400,300);
            jDialogWin.setVisible(true);
            jLabelStar.setBackground(Color.blue);
            inGame = false;
        }
    }//GEN-LAST:event_jLabelFinishMouseEntered

    private void jPanelVertical1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVertical1MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelVertical1MouseEntered

    private void jPanelVertical2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVertical2MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelVertical2MouseEntered

    private void jPanelHorizontal1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal1MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal1MouseEntered

    private void jPanelHorizontal2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal2MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal2MouseEntered

    private void jPanelVertical3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVertical3MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelVertical3MouseEntered

    private void jPanelHorizontal3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal3MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal3MouseEntered

    private void jPanelVertical4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVertical4MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelVertical4MouseEntered

    private void jPanelHorizontal4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal4MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal4MouseEntered

    private void jPanelHorizontal5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal5MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal5MouseEntered

    private void jPanelHorizontal6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal6MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal6MouseEntered

    private void jPanelHorizontal7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal7MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal7MouseEntered

    private void jLabelStarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabelStarPropertyChange

    }//GEN-LAST:event_jLabelStarPropertyChange

    private void jLabelStarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStarMouseClicked
        inGame=true;
        jLabelStar.setBackground(Color.red);       
    }//GEN-LAST:event_jLabelStarMouseClicked

    private void jPanelHorizontal8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal8MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal8MouseEntered

    private void jPanelHorizontal9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal9MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal9MouseEntered

    private void jPanelHorizontal10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal10MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal10MouseEntered

    private void jPanelVertical5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVertical5MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelVertical5MouseEntered

    private void jPanelVertical6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVertical6MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelVertical6MouseEntered

    private void jPanelVertical7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVertical7MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelVertical7MouseEntered

    private void jPanelHorizontal11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal11MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal11MouseEntered

    private void jPanelHorizontal12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHorizontal12MouseEntered
        inGame = false;
        jLabelStar.setBackground(Color.blue);
    }//GEN-LAST:event_jPanelHorizontal12MouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialogWin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFinish;
    private javax.swing.JLabel jLabelStar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelHorizontal1;
    private javax.swing.JPanel jPanelHorizontal10;
    private javax.swing.JPanel jPanelHorizontal11;
    private javax.swing.JPanel jPanelHorizontal12;
    private javax.swing.JPanel jPanelHorizontal2;
    private javax.swing.JPanel jPanelHorizontal3;
    private javax.swing.JPanel jPanelHorizontal4;
    private javax.swing.JPanel jPanelHorizontal5;
    private javax.swing.JPanel jPanelHorizontal6;
    private javax.swing.JPanel jPanelHorizontal7;
    private javax.swing.JPanel jPanelHorizontal8;
    private javax.swing.JPanel jPanelHorizontal9;
    private javax.swing.JPanel jPanelVertical1;
    private javax.swing.JPanel jPanelVertical2;
    private javax.swing.JPanel jPanelVertical3;
    private javax.swing.JPanel jPanelVertical4;
    private javax.swing.JPanel jPanelVertical5;
    private javax.swing.JPanel jPanelVertical6;
    private javax.swing.JPanel jPanelVertical7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jlabelTime;
    // End of variables declaration//GEN-END:variables
}
