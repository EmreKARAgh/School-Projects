/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mysql.cj.protocol.Resultset;
import com.oracle.jrockit.jfr.Producer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author EmreKARA
 */
public class girisJFrame extends javax.swing.JFrame {

    /**
     * Creates new form girisJFrame
     */
    conDB conn;

    public girisJFrame() {
        initComponents();
        conn = new conDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInputArea = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButtonImageInputTekDosya = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaResults = new javax.swing.JTextArea();
        jButtonImageInputKlasor = new javax.swing.JButton();
        jPanelSearchArea = new javax.swing.JPanel();
        jTextFieldAramaIsletmeAdi = new javax.swing.JTextField();
        jTextFieldAramaTarih = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jButtonAra = new javax.swing.JButton();
        jPanelListArea = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInputArea.setBackground(new java.awt.Color(153, 204, 255));

        jButtonImageInputTekDosya.setText("TEK DOSYA");
        jButtonImageInputTekDosya.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonImageInputTekDosya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonImageInputTekDosyaMouseClicked(evt);
            }
        });
        jButtonImageInputTekDosya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImageInputTekDosyaActionPerformed(evt);
            }
        });

        jTextAreaResults.setColumns(20);
        jTextAreaResults.setRows(5);
        jScrollPane2.setViewportView(jTextAreaResults);

        jButtonImageInputKlasor.setText("KLASÖR");
        jButtonImageInputKlasor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonImageInputKlasor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonImageInputKlasorMouseClicked(evt);
            }
        });
        jButtonImageInputKlasor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImageInputKlasorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInputAreaLayout = new javax.swing.GroupLayout(jPanelInputArea);
        jPanelInputArea.setLayout(jPanelInputAreaLayout);
        jPanelInputAreaLayout.setHorizontalGroup(
            jPanelInputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInputAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelInputAreaLayout.createSequentialGroup()
                        .addGroup(jPanelInputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonImageInputTekDosya, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jButtonImageInputKlasor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelInputAreaLayout.setVerticalGroup(
            jPanelInputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInputAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInputAreaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButtonImageInputTekDosya, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonImageInputKlasor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelSearchArea.setBackground(new java.awt.Color(153, 153, 255));

        jTextFieldAramaIsletmeAdi.setText("İşletme Adı:");
        jTextFieldAramaIsletmeAdi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAramaIsletmeAdiMouseClicked(evt);
            }
        });
        jTextFieldAramaIsletmeAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAramaIsletmeAdiActionPerformed(evt);
            }
        });

        jTextFieldAramaTarih.setText("Tarih:");
        jTextFieldAramaTarih.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAramaTarihMouseClicked(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        label1.setText("Arama");

        jButtonAra.setText("Ara");
        jButtonAra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAraMouseClicked(evt);
            }
        });
        jButtonAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchAreaLayout = new javax.swing.GroupLayout(jPanelSearchArea);
        jPanelSearchArea.setLayout(jPanelSearchAreaLayout);
        jPanelSearchAreaLayout.setHorizontalGroup(
            jPanelSearchAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchAreaLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanelSearchAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchAreaLayout.createSequentialGroup()
                        .addGroup(jPanelSearchAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAramaIsletmeAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jTextFieldAramaTarih))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchAreaLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
            .addGroup(jPanelSearchAreaLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButtonAra, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelSearchAreaLayout.setVerticalGroup(
            jPanelSearchAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchAreaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAramaIsletmeAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldAramaTarih, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAra, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelListArea.setBackground(new java.awt.Color(102, 153, 255));

        jTableList.setBackground(new java.awt.Color(255, 204, 204));
        jTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İşletme Adı", "Tarih", "Fiş No", "Toplam"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableList);

        javax.swing.GroupLayout jPanelListAreaLayout = new javax.swing.GroupLayout(jPanelListArea);
        jPanelListArea.setLayout(jPanelListAreaLayout);
        jPanelListAreaLayout.setHorizontalGroup(
            jPanelListAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelListAreaLayout.setVerticalGroup(
            jPanelListAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelListArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelInputArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSearchArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelInputArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSearchArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelListArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAraActionPerformed
        /*
        DefaultTableModel dm = (DefaultTableModel) jTableList.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        String isletmeAdi = this.jTextFieldAramaIsletmeAdi.getText();
        String tarih = this.jTextFieldAramaTarih.getText();
        try {
            dbGet();
        } catch (SQLException ex) {
            Logger.getLogger(girisJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jButtonAraActionPerformed

    private void jButtonImageInputTekDosyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonImageInputTekDosyaMouseClicked
        String result = "";
        JFileChooser fileChooser = new JFileChooser();
        FileFilter ft = new FileNameExtensionFilter("Image Files", "jpg", "png");
        fileChooser.addChoosableFileFilter(ft);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            System.out.println(file.getName());
            try {
                result = tesseract.doTesseract(file.getAbsolutePath());
                jTextAreaResults.append(result);
                ArrayList<String> dbValues = new ArrayList<String>();
                Filtration myFilter = new Filtration();
                dbValues = myFilter.filter(result);
                dbPut(dbValues);
            } catch (TesseractException ex) {
                Logger.getLogger(girisJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(girisJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonImageInputTekDosyaMouseClicked

    private void jButtonImageInputTekDosyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImageInputTekDosyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonImageInputTekDosyaActionPerformed

    private void jButtonImageInputKlasorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonImageInputKlasorMouseClicked
        String result = "";
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        f.showSaveDialog(null);
        System.out.println(f.getSelectedFile());
        String folderPath = f.getSelectedFile().toString();
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        File file;
        for (File file2 : listOfFiles) {
            if (file2.isFile()) {
                System.out.println(file2.getName() + ":\n");
                file = new File((folderPath + "\\" + file2.getName()));
                try {
                    result = tesseract.doTesseract(file.getAbsolutePath());
                    jTextAreaResults.append(result);
                    ArrayList<String> dbValues = new ArrayList<String>();
                    Filtration myFilter = new Filtration();
                    dbValues = myFilter.filter(result);
                    dbPut(dbValues);
                } catch (TesseractException ex) {
                    Logger.getLogger(girisJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(girisJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_jButtonImageInputKlasorMouseClicked

    private void jButtonImageInputKlasorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImageInputKlasorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonImageInputKlasorActionPerformed

    private void jTextFieldAramaIsletmeAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAramaIsletmeAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAramaIsletmeAdiActionPerformed

    private void jTextFieldAramaIsletmeAdiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAramaIsletmeAdiMouseClicked
        jTextFieldAramaIsletmeAdi.setText("");
    }//GEN-LAST:event_jTextFieldAramaIsletmeAdiMouseClicked

    private void jTextFieldAramaTarihMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAramaTarihMouseClicked
        jTextFieldAramaTarih.setText("");
    }//GEN-LAST:event_jTextFieldAramaTarihMouseClicked

    private void jTableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListMouseClicked
        if (evt.getClickCount() == 2) {
            conn.connect();
            DefaultTableModel model = (DefaultTableModel) jTableList.getModel();
            int selectedRowIndex = jTableList.getSelectedRow();
            String isletmeAdi = jTableList.getValueAt(jTableList.getSelectedRow(), 0).toString();
            String fisNo = jTableList.getValueAt(jTableList.getSelectedRow(), 2).toString();
            ResultSet rs;
            try {
                rs = conn.selectUrunler(isletmeAdi,fisNo);
                ProductsjFrame myProductsjFrame = new ProductsjFrame(rs);
                myProductsjFrame.setLocationRelativeTo(null);
                myProductsjFrame.setVisible(true);
                myProductsjFrame.fillTable();
            } catch (SQLException ex) {
                Logger.getLogger(girisJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.disconnect();
            } catch (SQLException ex) {
                Logger.getLogger(girisJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jTableListMouseClicked

    private void jButtonAraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAraMouseClicked
        if(evt.getClickCount() == 1){
            DefaultTableModel dm = (DefaultTableModel) jTableList.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged();
            try {
                jTableList.setModel(dbGet((DefaultTableModel) jTableList.getModel()));
            } catch (SQLException ex) {
                Logger.getLogger(girisJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(evt.getClickCount() == 2){
            DefaultTableModel dm = (DefaultTableModel) jTableList.getModel();
            dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged();
            ProductsjFrame myProductsjFrame = new ProductsjFrame();
            myProductsjFrame.setLocationRelativeTo(null);
            myProductsjFrame.setVisible(true);
            try {
                myProductsjFrame.fillTable2(dbGet((DefaultTableModel) jTableList.getModel()));
            } catch (SQLException ex) {
                Logger.getLogger(girisJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonAraMouseClicked

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
            java.util.logging.Logger.getLogger(girisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new girisJFrame().setVisible(true);
            }
        });
    }

    private void dbPut(ArrayList dbValues) throws SQLException {
        //System.out.println("Kontrol dbPut()");

        conn.connect();
        conn.insert(dbValues);
        conn.disconnect();

    }

    private DefaultTableModel dbGet(DefaultTableModel model) throws SQLException {
        conn.connect();
        if ((jTextFieldAramaIsletmeAdi.getText().equals("") || jTextFieldAramaIsletmeAdi.getText().equals("İşletme Adı:")) && (jTextFieldAramaTarih.getText().equals("") || jTextFieldAramaTarih.getText().equals("Tarih:"))) {
            //Her ikisi de boş bırakılmış
            ResultSet rs = conn.selectAll();
            while (rs.next()) {
                String isletmeAd = rs.getString("isletmeAdi");
                String tarih = rs.getString("tarih");
                String fisNo = rs.getString("fisNo");
                String toplamFiyat = rs.getString("toplamFiyat");
                model.addRow(new Object[]{isletmeAd, tarih, fisNo, toplamFiyat});
            }

        } else if (!(jTextFieldAramaIsletmeAdi.getText().equals("") || jTextFieldAramaIsletmeAdi.getText().equals("İşletme Adı:")) && (jTextFieldAramaTarih.getText().equals("") || jTextFieldAramaTarih.getText().equals("Tarih:"))) {
            //İşletme Adına göre
            ResultSet rs = conn.selectİsletmeAdi(jTextFieldAramaIsletmeAdi.getText());
            System.out.println("check1");
            while (rs.next()) {
                System.out.println("check2");
                String isletmeAd = rs.getString("isletmeAdi");
                String tarih = rs.getString("tarih");
                String fisNo = rs.getString("fisNo");
                String toplamFiyat = rs.getString("toplamFiyat");
                model.addRow(new Object[]{isletmeAd, tarih, fisNo, toplamFiyat});
            }
        } else if ((jTextFieldAramaIsletmeAdi.getText().equals("") || jTextFieldAramaIsletmeAdi.getText().equals("İşletme Adı:")) && !(jTextFieldAramaTarih.getText().equals("") || jTextFieldAramaTarih.getText().equals("Tarih:"))) {
            //Tarihe göre
            System.out.println("tarih: " + jTextFieldAramaTarih.getText());
            ResultSet rs = conn.selectTarih(jTextFieldAramaTarih.getText());
            while (rs.next()) {
                String isletmeAd = rs.getString("isletmeAdi");
                String tarih = rs.getString("tarih");
                String fisNo = rs.getString("fisNo");
                String toplamFiyat = rs.getString("toplamFiyat");
                model.addRow(new Object[]{isletmeAd, tarih, fisNo, toplamFiyat});
            }
        } else if (!(jTextFieldAramaIsletmeAdi.getText().equals("") || jTextFieldAramaIsletmeAdi.getText().equals("İşletme Adı:")) && !(jTextFieldAramaTarih.getText().equals("") || jTextFieldAramaTarih.getText().equals("Tarih:"))) {
            //Her ikisine göre
            ResultSet rs = conn.selectBoth(jTextFieldAramaIsletmeAdi.getText(), jTextFieldAramaTarih.getText());
            while (rs.next()) {
                String isletmeAd = rs.getString("isletmeAdi");
                String tarih = rs.getString("tarih");
                String fisNo = rs.getString("fisNo");
                String toplamFiyat = rs.getString("toplamFiyat");
                model.addRow(new Object[]{isletmeAd, tarih, fisNo, toplamFiyat});
            }
        }

        conn.disconnect();
        return model;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAra;
    private javax.swing.JButton jButtonImageInputKlasor;
    private javax.swing.JButton jButtonImageInputTekDosya;
    private javax.swing.JPanel jPanelInputArea;
    private javax.swing.JPanel jPanelListArea;
    private javax.swing.JPanel jPanelSearchArea;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableList;
    private javax.swing.JTextArea jTextAreaResults;
    private javax.swing.JTextField jTextFieldAramaIsletmeAdi;
    private javax.swing.JTextField jTextFieldAramaTarih;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
