package Lab7P2_LloydCooper;

import java.awt.event.MouseAdapter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CUSTOMER PC
 */
public class FramePP extends javax.swing.JFrame {

    /**
     * Creates new form FrameMain
     */
    public FramePP() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        actualizarTabla = new javax.swing.JButton();
        exportarDatos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        exportarDatos2 = new javax.swing.JButton();
        addRows = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Category", "Price", "Aisle", "Bin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 450, 230));

        actualizarTabla.setText("Actualizar tabla");
        actualizarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarTablaMouseClicked(evt);
            }
        });
        jPanel1.add(actualizarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 140, -1));

        exportarDatos.setText("Exportar datos");
        exportarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportarDatosMouseClicked(evt);
            }
        });
        jPanel1.add(exportarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 140, -1));

        jTabbedPane1.addTab("Menu principal", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Category", "Price", "Aisle", "Bin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        exportarDatos2.setText("Exportar datos");
        exportarDatos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportarDatos2MouseClicked(evt);
            }
        });

        addRows.setText("Anadir fila");
        addRows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRowsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addRows, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exportarDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportarDatos2)
                    .addComponent(addRows))
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Crear archivo", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarTablaMouseClicked
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Category");
        model.addColumn("Price");
        model.addColumn("Aisle");
        model.addColumn("Bin");

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/txt/data.txt"));
            String linea;
            int lineNumber = 1;
            while ((linea = br.readLine()) != null) {
                String[] data = linea.split(",");
                if (data.length == 6) {

                    int id;
                    try {
                        id = Integer.parseInt(data[0]);
                    } catch (NumberFormatException e) { 
                        lineNumber++;
                        continue;
                    }

                    String name = data[1];

                    int category;
                    try {
                        category = Integer.parseInt(data[2]);
                        if (category < 0 || category > 9) {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: La categoría en la línea " + lineNumber + " no es un numero entero válido entre 0 y 9");
                        lineNumber++;
                        continue;
                    }

                    double price;
                    try {
                        price = Double.parseDouble(data[3]);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: El precio en la línea " + lineNumber + " no es un numero valido");
                        lineNumber++;
                        continue;
                    }

                    int aisle;
                    try {
                        aisle = Integer.parseInt(data[4]);
                        if (aisle < 0 || aisle > 999) {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: El pasillo en la línea " + lineNumber + " no es un numero entero valido de 3 posiciones");
                        lineNumber++;
                        continue;
                    }

                    int bin;
                    try {
                        bin = Integer.parseInt(data[5]);
                        if (bin < 0 || bin > 999) {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: El bin en la línea " + lineNumber + " no es un numero entero valido de 3 posiciones");
                        lineNumber++;
                        continue;
                    }


                    model.addRow(data);
                } else {
                    System.out.println("Error: La línea " + lineNumber + " no tiene el formato correcto");
                }

                lineNumber++;
            }
           
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        jTable1.setModel(model);
        tablaActualizada = true;
        
    }//GEN-LAST:event_actualizarTablaMouseClicked

    private void exportarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportarDatosMouseClicked
        
        if (tablaActualizada) {
             String jsonData = generarJsonFile();

            String filePath = "src/txt/datajson.txt";
            guardarJsonAFile(jsonData, filePath);
        }
    }//GEN-LAST:event_exportarDatosMouseClicked
    
    private String generarJsonFile() {
      StringBuilder archivoJson = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/txt/data.txt"));
            String line;
            archivoJson.append("[\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    if (esNumerico(data[0])) {
                        if (archivoJson.length() > 1) {
                            
                            archivoJson.append("\n"); // Agrega una nueva línea antes de cada objeto
                        }
                        archivoJson.append("{");
                        archivoJson.append("\"id\": ").append(Integer.parseInt(data[0])).append(",");
                        archivoJson.append("\"name\": \"").append(data[1]).append("\",");
                        archivoJson.append("\"category\": ").append(Integer.parseInt(data[2])).append(",");
                        archivoJson.append("\"price\": ").append(Double.parseDouble(data[3])).append(",");
                        archivoJson.append("\"aisle\": ").append(Integer.parseInt(data[4])).append(",");
                        archivoJson.append("\"bin\": ").append(Integer.parseInt(data[5]));
                        archivoJson.append("}");
                    }
                }
            }
            archivoJson.append("\n");
            archivoJson.append("\n]");

            br.close();
            
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            fileChooser.setFileFilter(filtro);
            int option = fileChooser.showSaveDialog(this);

            if (option == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath()+".txt";

                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.write(archivoJson.toString());
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return archivoJson.toString();
    }

    private boolean esNumerico(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private void guardarJsonAFile(String jsonData, String filePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(jsonData);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void exportarDatos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportarDatos2MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        StringBuilder archivoTxt = new StringBuilder();

        int contadorRows = model.getRowCount();
        int contadorColumns = model.getColumnCount();

        for (int i = 0; i < contadorRows; i++) {
        for (int j = 0; j < contadorColumns; j++) {
            Object valor = model.getValueAt(i, j);
            if (valor != null && !valor.toString().isEmpty()) {
                archivoTxt.append(valor);
            }
            if (j < contadorColumns - 1) {
                archivoTxt.append(",");
            }
        }
        archivoTxt.append("\n");
    }

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
        fileChooser.setFileFilter(filtro);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath()+".txt";
            
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));               
                writer.write(archivoTxt.toString());
                writer.close();
                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_exportarDatos2MouseClicked

    private void addRowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRowsMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object[model.getColumnCount()]);
    }//GEN-LAST:event_addRowsMouseClicked
    
    
        
    
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
            java.util.logging.Logger.getLogger(FramePP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarTabla;
    private javax.swing.JButton addRows;
    private javax.swing.JButton exportarDatos;
    private javax.swing.JButton exportarDatos2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
    private boolean tablaActualizada = false;  
}
