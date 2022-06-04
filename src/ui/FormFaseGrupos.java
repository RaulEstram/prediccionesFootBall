package ui;

import data.ReadFileCSV;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import search.FootballTeam;

public class FormFaseGrupos extends javax.swing.JPanel {

    public FormFaseGrupos() {
        initComponents();
        if (!"".equals(main.infoData)) {
            ReadFileCSV file = new ReadFileCSV(main.infoData);
            FootballTeam ft = new FootballTeam(file.getData());
            List<ArrayList<String>> groups = ft.getDataGroupStages();
            List<ArrayList<String>> winners = ft.getNumberOfWinsAndLosses(groups);

            equipoA1.setText(winners.get(0).get(2) + " " + winners.get(0).get(3) + " - " + winners.get(0).get(4));
            equipoA2.setText(winners.get(1).get(2) + " " + winners.get(1).get(3) + " - " + winners.get(1).get(4));
            equipoA3.setText(winners.get(2).get(2) + " " + winners.get(2).get(3) + " - " + winners.get(2).get(4));
            equipoA4.setText(winners.get(3).get(2) + " " + winners.get(3).get(3) + " - " + winners.get(3).get(4));
            equipoB1.setText(winners.get(4).get(2) + " " + winners.get(4).get(3) + " - " + winners.get(4).get(4));
            equipoB2.setText(winners.get(5).get(2) + " " + winners.get(5).get(3) + " - " + winners.get(5).get(4));
            equipoB3.setText(winners.get(6).get(2) + " " + winners.get(6).get(3) + " - " + winners.get(6).get(4));
            equipoB4.setText(winners.get(7).get(2) + " " + winners.get(7).get(3) + " - " + winners.get(7).get(4));
            equipoC1.setText(winners.get(8).get(2) + " " + winners.get(8).get(3) + " - " + winners.get(8).get(4));
            equipoC2.setText(winners.get(9).get(2) + " " + winners.get(9).get(3) + " - " + winners.get(9).get(4));
            equipoC3.setText(winners.get(10).get(2) + " " + winners.get(10).get(3) + " - " + winners.get(10).get(4));
            equipoC4.setText(winners.get(11).get(2) + " " + winners.get(11).get(3) + " - " + winners.get(11).get(4));
            equipoD1.setText(winners.get(12).get(2) + " " + winners.get(12).get(3) + " - " + winners.get(12).get(4));
            equipoD2.setText(winners.get(13).get(2) + " " + winners.get(13).get(3) + " - " + winners.get(13).get(4));
            equipoD3.setText(winners.get(14).get(2) + " " + winners.get(14).get(3) + " - " + winners.get(14).get(4));
            equipoD4.setText(winners.get(15).get(2) + " " + winners.get(15).get(3) + " - " + winners.get(15).get(4));
            equipoE1.setText(winners.get(16).get(2) + " " + winners.get(16).get(3) + " - " + winners.get(16).get(4));
            equipoE2.setText(winners.get(17).get(2) + " " + winners.get(17).get(3) + " - " + winners.get(17).get(4));
            equipoE3.setText(winners.get(18).get(2) + " " + winners.get(18).get(3) + " - " + winners.get(18).get(4));
            equipoE4.setText(winners.get(19).get(2) + " " + winners.get(19).get(3) + " - " + winners.get(19).get(4));
            equipoF1.setText(winners.get(20).get(2) + " " + winners.get(20).get(3) + " - " + winners.get(20).get(4));
            equipoF2.setText(winners.get(21).get(2) + " " + winners.get(21).get(3) + " - " + winners.get(21).get(4));
            equipoF3.setText(winners.get(22).get(2) + " " + winners.get(22).get(3) + " - " + winners.get(22).get(4));
            equipoF4.setText(winners.get(23).get(2) + " " + winners.get(23).get(3) + " - " + winners.get(23).get(4));
            equipoG1.setText(winners.get(24).get(2) + " " + winners.get(24).get(3) + " - " + winners.get(24).get(4));
            equipoG2.setText(winners.get(25).get(2) + " " + winners.get(25).get(3) + " - " + winners.get(25).get(4));
            equipoG3.setText(winners.get(26).get(2) + " " + winners.get(26).get(3) + " - " + winners.get(26).get(4));
            equipoG4.setText(winners.get(27).get(2) + " " + winners.get(27).get(3) + " - " + winners.get(27).get(4));
            equipoH1.setText(winners.get(28).get(2) + " " + winners.get(28).get(3) + " - " + winners.get(28).get(4));
            equipoH2.setText(winners.get(29).get(2) + " " + winners.get(29).get(3) + " - " + winners.get(29).get(4));
            equipoH3.setText(winners.get(30).get(2) + " " + winners.get(30).get(3) + " - " + winners.get(30).get(4));
            equipoH4.setText(winners.get(31).get(2) + " " + winners.get(31).get(3) + " - " + winners.get(31).get(4));

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        equipoA1 = new javax.swing.JLabel();
        equipoA2 = new javax.swing.JLabel();
        equipoA3 = new javax.swing.JLabel();
        equipoA4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        equipoB1 = new javax.swing.JLabel();
        equipoB2 = new javax.swing.JLabel();
        equipoB3 = new javax.swing.JLabel();
        equipoB4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        equipoC1 = new javax.swing.JLabel();
        equipoC2 = new javax.swing.JLabel();
        equipoC3 = new javax.swing.JLabel();
        equipoC4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        equipoD1 = new javax.swing.JLabel();
        equipoD2 = new javax.swing.JLabel();
        equipoD3 = new javax.swing.JLabel();
        equipoD4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        equipoE1 = new javax.swing.JLabel();
        equipoE2 = new javax.swing.JLabel();
        equipoE3 = new javax.swing.JLabel();
        equipoE4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        equipoF1 = new javax.swing.JLabel();
        equipoF2 = new javax.swing.JLabel();
        equipoF3 = new javax.swing.JLabel();
        equipoF4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        equipoG1 = new javax.swing.JLabel();
        equipoG2 = new javax.swing.JLabel();
        equipoG3 = new javax.swing.JLabel();
        equipoG4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        equipoH1 = new javax.swing.JLabel();
        equipoH2 = new javax.swing.JLabel();
        equipoH3 = new javax.swing.JLabel();
        equipoH4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 253, 253));
        setLayout(new java.awt.GridLayout(2, 4, 20, 20));

        jPanel1.setBackground(new java.awt.Color(231, 231, 231));
        jPanel1.setLayout(new java.awt.GridLayout(5, 0));

        jLabel1.setBackground(new java.awt.Color(119, 16, 35));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grupo A");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);

        equipoA1.setText("Equipo 1");
        jPanel1.add(equipoA1);

        equipoA2.setText("Equipo 2");
        jPanel1.add(equipoA2);

        equipoA3.setText("Equipo 3");
        jPanel1.add(equipoA3);

        equipoA4.setText("Equipo 4");
        jPanel1.add(equipoA4);

        add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(231, 231, 231));
        jPanel2.setLayout(new java.awt.GridLayout(5, 0));

        jLabel6.setBackground(new java.awt.Color(119, 16, 35));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Grupo B");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6);

        equipoB1.setText("Equipo 1");
        jPanel2.add(equipoB1);

        equipoB2.setText("Equipo 2");
        jPanel2.add(equipoB2);

        equipoB3.setText("Equipo 3");
        jPanel2.add(equipoB3);

        equipoB4.setText("Equipo 4");
        jPanel2.add(equipoB4);

        add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(231, 231, 231));
        jPanel3.setLayout(new java.awt.GridLayout(5, 0));

        jLabel11.setBackground(new java.awt.Color(119, 16, 35));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Grupo C");
        jLabel11.setOpaque(true);
        jPanel3.add(jLabel11);

        equipoC1.setText("Equipo 1");
        jPanel3.add(equipoC1);

        equipoC2.setText("Equipo 2");
        jPanel3.add(equipoC2);

        equipoC3.setText("Equipo 3");
        jPanel3.add(equipoC3);

        equipoC4.setText("Equipo 4");
        jPanel3.add(equipoC4);

        add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(231, 231, 231));
        jPanel4.setLayout(new java.awt.GridLayout(5, 0));

        jLabel16.setBackground(new java.awt.Color(119, 16, 35));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Grupo D");
        jLabel16.setOpaque(true);
        jPanel4.add(jLabel16);

        equipoD1.setText("Equipo 1");
        jPanel4.add(equipoD1);

        equipoD2.setText("Equipo 2");
        jPanel4.add(equipoD2);

        equipoD3.setText("Equipo 3");
        jPanel4.add(equipoD3);

        equipoD4.setText("Equipo 4");
        jPanel4.add(equipoD4);

        add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(231, 231, 231));
        jPanel5.setLayout(new java.awt.GridLayout(5, 0));

        jLabel21.setBackground(new java.awt.Color(119, 16, 35));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Grupo E");
        jLabel21.setOpaque(true);
        jPanel5.add(jLabel21);

        equipoE1.setText("Equipo 1");
        jPanel5.add(equipoE1);

        equipoE2.setText("Equipo 2");
        jPanel5.add(equipoE2);

        equipoE3.setText("Equipo 3");
        jPanel5.add(equipoE3);

        equipoE4.setText("Equipo 4");
        jPanel5.add(equipoE4);

        add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(231, 231, 231));
        jPanel6.setLayout(new java.awt.GridLayout(5, 0));

        jLabel26.setBackground(new java.awt.Color(119, 16, 35));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Grupo F");
        jLabel26.setOpaque(true);
        jPanel6.add(jLabel26);

        equipoF1.setText("Equipo 1");
        jPanel6.add(equipoF1);

        equipoF2.setText("Equipo 2");
        jPanel6.add(equipoF2);

        equipoF3.setText("Equipo 3");
        jPanel6.add(equipoF3);

        equipoF4.setText("Equipo 4");
        jPanel6.add(equipoF4);

        add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(231, 231, 231));
        jPanel7.setLayout(new java.awt.GridLayout(5, 0));

        jLabel31.setBackground(new java.awt.Color(119, 16, 35));
        jLabel31.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Grupo G");
        jLabel31.setOpaque(true);
        jPanel7.add(jLabel31);

        equipoG1.setText("Equipo 1");
        jPanel7.add(equipoG1);

        equipoG2.setText("Equipo 2");
        jPanel7.add(equipoG2);

        equipoG3.setText("Equipo 3");
        jPanel7.add(equipoG3);

        equipoG4.setText("Equipo 4");
        jPanel7.add(equipoG4);

        add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(231, 231, 231));
        jPanel8.setLayout(new java.awt.GridLayout(5, 0));

        jLabel36.setBackground(new java.awt.Color(119, 16, 35));
        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Grupo H");
        jLabel36.setOpaque(true);
        jPanel8.add(jLabel36);

        equipoH1.setText("Equipo 1");
        jPanel8.add(equipoH1);

        equipoH2.setText("Equipo 2");
        jPanel8.add(equipoH2);

        equipoH3.setText("Equipo 3");
        jPanel8.add(equipoH3);

        equipoH4.setText("Equipo 4");
        jPanel8.add(equipoH4);

        add(jPanel8);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel equipoA1;
    private javax.swing.JLabel equipoA2;
    private javax.swing.JLabel equipoA3;
    private javax.swing.JLabel equipoA4;
    private javax.swing.JLabel equipoB1;
    private javax.swing.JLabel equipoB2;
    private javax.swing.JLabel equipoB3;
    private javax.swing.JLabel equipoB4;
    private javax.swing.JLabel equipoC1;
    private javax.swing.JLabel equipoC2;
    private javax.swing.JLabel equipoC3;
    private javax.swing.JLabel equipoC4;
    private javax.swing.JLabel equipoD1;
    private javax.swing.JLabel equipoD2;
    private javax.swing.JLabel equipoD3;
    private javax.swing.JLabel equipoD4;
    private javax.swing.JLabel equipoE1;
    private javax.swing.JLabel equipoE2;
    private javax.swing.JLabel equipoE3;
    private javax.swing.JLabel equipoE4;
    private javax.swing.JLabel equipoF1;
    private javax.swing.JLabel equipoF2;
    private javax.swing.JLabel equipoF3;
    private javax.swing.JLabel equipoF4;
    private javax.swing.JLabel equipoG1;
    private javax.swing.JLabel equipoG2;
    private javax.swing.JLabel equipoG3;
    private javax.swing.JLabel equipoG4;
    private javax.swing.JLabel equipoH1;
    private javax.swing.JLabel equipoH2;
    private javax.swing.JLabel equipoH3;
    private javax.swing.JLabel equipoH4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
