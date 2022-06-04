package ui;

import data.ReadFileCSV;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import search.FootballTeam;

public class FormDatosTable extends javax.swing.JPanel {

    public FormDatosTable() {
        initComponents();
        
        if (!"".equals(main.infoData)) {
            ReadFileCSV file = new ReadFileCSV(main.infoData);
            List<ArrayList<String>> data = file.getData();
            DefaultTableModel model = (DefaultTableModel) tablaDatos.getModel();
            for (int i = 1; i < data.size(); i++) {
                String[] row = {data.get(i).get(0), data.get(i).get(1), data.get(i).get(2), data.get(i).get(3), data.get(i).get(4), data.get(i).get(5), data.get(i).get(6)};
                model.addRow(row);
            }
                
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setBackground(new java.awt.Color(253, 253, 253));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ranking", "Grupo", "Nombre", "DEL", "MED", "DEF", "GLB"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
