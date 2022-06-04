package ui;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FormSeleccionDatos extends javax.swing.JPanel {

    public FormSeleccionDatos() {
        initComponents();
        pathData.setText(main.infoData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonSelectNodes = new javax.swing.JLabel();
        pathData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ButtonConfirm = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 253, 253));

        ButtonSelectNodes.setBackground(new java.awt.Color(201, 214, 223));
        ButtonSelectNodes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ButtonSelectNodes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonSelectNodes.setText("...");
        ButtonSelectNodes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSelectNodes.setOpaque(true);
        ButtonSelectNodes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSelectNodesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonSelectNodesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonSelectNodesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonSelectNodesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonSelectNodesMouseReleased(evt);
            }
        });

        pathData.setBackground(new java.awt.Color(255, 255, 255));
        pathData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pathData.setOpaque(true);

        jLabel1.setText("Selecciona Archivo con la informacion para alimentar el sistema (.csv)");

        ButtonConfirm.setBackground(new java.awt.Color(201, 214, 223));
        ButtonConfirm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonConfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonConfirm.setText("Confirmar");
        ButtonConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonConfirm.setOpaque(true);
        ButtonConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonConfirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonConfirmMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonConfirmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonConfirmMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonSelectNodes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pathData, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonSelectNodes, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(pathData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(ButtonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // accion cuando damos click en seleccionar archivo
    private void ButtonSelectNodesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSelectNodesMouseClicked
        // creamos el objeto JFileChooser Para seleccionar los archivos
        JFileChooser fc = new JFileChooser();
        // Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion = fc.showOpenDialog(this);
        // si el usuario pincha en aceptar
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            // seleccionamos el fichero
            File fichero = fc.getSelectedFile();
            //Escribe la ruta del fichero seleccionado en el campo de texto
            pathData.setText(fichero.getAbsolutePath());
        }
    }//GEN-LAST:event_ButtonSelectNodesMouseClicked

    private void ButtonConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonConfirmMouseClicked
        /*
        este boton nos sirve para guardar las rutas de los archivos que tienen la informacion para el sistema
        Este metodo tiene la funcionalidad de comprobar si se seleccionaron archivos para guardar las rutas de los archivos.
        
        tambine maneja los mensajes de error o de confirmacion para el usuario
         */
        if (!"".equals(pathData.getText())) {
            main.infoData = pathData.getText();
            JOptionPane.showMessageDialog(null, "Ruta del archivo con la informacion para el sistema Guardada.", "Informacion del sistema Guardada", JOptionPane.INFORMATION_MESSAGE);
        }

        if ("".equals(pathData.getText())) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun tipo de archivo csv para alimentar el sistema.", "Error con archivo del sistema.", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ButtonConfirmMouseClicked

    // metodos de UI sin importancia realmente 
    private void ButtonSelectNodesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSelectNodesMouseEntered
        ButtonSelectNodes.setBackground(new Color(82, 97, 107));
        ButtonSelectNodes.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_ButtonSelectNodesMouseEntered

    private void ButtonSelectNodesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSelectNodesMouseExited
        ButtonSelectNodes.setBackground(new Color(201, 214, 223));
        ButtonSelectNodes.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_ButtonSelectNodesMouseExited

    private void ButtonSelectNodesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSelectNodesMousePressed
        ButtonSelectNodes.setBackground(new Color(30, 32, 34));
    }//GEN-LAST:event_ButtonSelectNodesMousePressed

    private void ButtonSelectNodesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSelectNodesMouseReleased
        ButtonSelectNodes.setBackground(new Color(82, 97, 107));
    }//GEN-LAST:event_ButtonSelectNodesMouseReleased

    private void ButtonConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonConfirmMouseEntered
        ButtonConfirm.setBackground(new Color(82, 97, 107));
        ButtonConfirm.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_ButtonConfirmMouseEntered

    private void ButtonConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonConfirmMouseExited
        ButtonConfirm.setBackground(new Color(201, 214, 223));
        ButtonConfirm.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_ButtonConfirmMouseExited

    private void ButtonConfirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonConfirmMousePressed
        ButtonConfirm.setBackground(new Color(30, 32, 34));
    }//GEN-LAST:event_ButtonConfirmMousePressed

    private void ButtonConfirmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonConfirmMouseReleased
        ButtonConfirm.setBackground(new Color(82, 97, 107));
    }//GEN-LAST:event_ButtonConfirmMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonConfirm;
    private javax.swing.JLabel ButtonSelectNodes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pathData;
    // End of variables declaration//GEN-END:variables
}
