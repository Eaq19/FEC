/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Fec;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hhurtado
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDialogTablaVerdad = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTVerdad = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbElementosDeMemoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        sltSalidas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        btnIngresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnCodificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        JDialogTablaVerdad.setMinimumSize(new java.awt.Dimension(600, 400));

        tableTVerdad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableTVerdad);

        javax.swing.GroupLayout JDialogTablaVerdadLayout = new javax.swing.GroupLayout(JDialogTablaVerdad.getContentPane());
        JDialogTablaVerdad.getContentPane().setLayout(JDialogTablaVerdadLayout);
        JDialogTablaVerdadLayout.setHorizontalGroup(
            JDialogTablaVerdadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogTablaVerdadLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        JDialogTablaVerdadLayout.setVerticalGroup(
            JDialogTablaVerdadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogTablaVerdadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CODIFICADOR FEC");

        jLabel2.setText("Ingrese cantidad de elementos de memoria:");

        cmbElementosDeMemoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cmbElementosDeMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbElementosDeMemoriaActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite cantidad de salidas:");

        sltSalidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel4.setText("Describa las ecuaciones de las salidas:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E", "D1", "D2", "D3" }));

        jLabel5.setText("XOR");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E", "D1", "D2", "D3", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel6.setText("XOR");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E", "D1", "D2", "D3", "Niguna" }));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel7.setText("Digite mensaje a codificar con el sistema:");

        btnCodificar.setText("Codificar");
        btnCodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodificarActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("Ingresar mensaje binario");

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Seleccione ninguno en los items en caso de que la operacion no contenga más XOR (debe haber minimo uno)");

        jLabel10.setText("XOR");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E", "D1", "D2", "D3", "Niguna" }));

        jButton1.setText("Generar Tabla de Verdad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(45, 45, 45)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sltSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbElementosDeMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)
                        .addComponent(btnCodificar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnIngresar)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbElementosDeMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(sltSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCodificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodificarActionPerformed
        // TODO add your handling code here:
        
        this.JDialogTablaVerdad.show();
        DefaultTableModel modelo=new DefaultTableModel(); 
        this.tableTVerdad.setModel(modelo); 
        
         if(this.cmbElementosDeMemoria.getSelectedItem() == "1")
        {
            int EstadosIniciales[][] = new int[4][2];
            int EstadosSiguientes[][] = new int[4][1];
            
                EstadosIniciales[0][0] = 0;
                EstadosIniciales[0][1] = 1;   
                EstadosIniciales[1][0] = 1;
                EstadosIniciales[1][1] = 0;
                EstadosIniciales[2][0] = 0;
                EstadosIniciales[2][1] = 0;   
                EstadosIniciales[3][0] = 1;
                EstadosIniciales[3][1] = 1;
                
                String cadena = "";
                modelo.addColumn("E");
                modelo.addColumn("D1(actual)");
                modelo.addColumn("D1(Siguiente)");
                
                for(int i=0; i<4;i++){
                    //System.out.println("\n");
                    EstadosSiguientes[i][0]=EstadosIniciales[i][0];
                    for(int j=0; j<2;j++)
                    {
                        cadena = cadena + " " + EstadosIniciales[i][j];
                    } 
                   
                    Object[] fila = new Object[3]; 
                    fila[0]=EstadosIniciales[i][0];
                    fila[1]=EstadosIniciales[i][1];
                    fila[2]=EstadosSiguientes[i][0];
                    modelo.addRow(fila); 
                    System.out.println(cadena);
                    cadena = "";
                }
                
                for(int g=0; g<4;g++)
                    {
                        System.out.println(EstadosSiguientes[g][0]);
                    }         
          
                             
        }
        else
            if(this.cmbElementosDeMemoria.getSelectedItem() == "2")
            {
                int EstadosIniciales[][] = new int[8][3];
                int EstadosSiguientes[][] = new int[8][2];
                
                EstadosIniciales[0][0] = 0;
                EstadosIniciales[0][1] = 0;   
                EstadosIniciales[0][2] = 0; 
                EstadosIniciales[1][0] = 1;
                EstadosIniciales[1][1] = 0;
                EstadosIniciales[1][2] = 1;
                EstadosIniciales[2][0] = 0;
                EstadosIniciales[2][1] = 1;
                EstadosIniciales[2][2] = 0;
                EstadosIniciales[3][0] = 1;
                EstadosIniciales[3][1] = 1;
                EstadosIniciales[3][2] = 1;
                EstadosIniciales[4][0] = 0;
                EstadosIniciales[4][1] = 1;
                EstadosIniciales[4][2] = 1;
                EstadosIniciales[5][0] = 1;
                EstadosIniciales[5][1] = 0;
                EstadosIniciales[5][2] = 0;
                EstadosIniciales[6][0] = 0;
                EstadosIniciales[6][1] = 0;
                EstadosIniciales[6][2] = 1;
                EstadosIniciales[7][0] = 1;
                EstadosIniciales[7][1] = 1;
                EstadosIniciales[7][2] = 0;
                
                String cadena = "";
                modelo.addColumn("E");
                modelo.addColumn("D1(actual)");
                modelo.addColumn("D2(actual)");
                modelo.addColumn("D1(Siguiente)");
                modelo.addColumn("D2(siguiente)");
                
                
                 for(int i=0; i<8;i++){
                    //System.out.println("\n");
                    EstadosSiguientes[i][0]=EstadosIniciales[i][0];
                    EstadosSiguientes[i][1]=EstadosIniciales[i][1];
                    for(int j=0; j<3;j++)
                    {
                        cadena = cadena + " " + EstadosIniciales[i][j];
                    } 
                    
                    Object[] fila = new Object[5]; 
                    fila[0]=EstadosIniciales[i][0];
                    fila[1]=EstadosIniciales[i][1];
                    fila[2]=EstadosIniciales[i][2];
                    fila[3]=EstadosSiguientes[i][0];
                    fila[4]=EstadosSiguientes[i][1];
                    modelo.addRow(fila); 
                    System.out.println(cadena);
                    cadena = "";
                   
                }
                 
                 String cadena2 = "";
                 for(int i=0; i<8;i++){
                    for(int j=0; j<2;j++)
                    {
                        cadena2 = cadena2 + " " + EstadosSiguientes[i][j];
                    } 
                    System.out.println(cadena2);
                    cadena2 = "";
                   
                }
            }
            else
                if(this.cmbElementosDeMemoria.getSelectedItem() == "3")
                {
                    int EstadosIniciales[][] = new int[16][4];
                    int EstadosSiguientes[][] = new int[16][3];
                    
                    EstadosIniciales[0][0] = 0;
                    EstadosIniciales[0][1] = 0;   
                    EstadosIniciales[0][2] = 0; 
                    EstadosIniciales[0][3] = 0;
                    EstadosIniciales[1][0] = 1;
                    EstadosIniciales[1][1] = 0;   
                    EstadosIniciales[1][2] = 0; 
                    EstadosIniciales[1][3] = 0;
                    EstadosIniciales[2][0] = 0;
                    EstadosIniciales[2][1] = 0;   
                    EstadosIniciales[2][2] = 1; 
                    EstadosIniciales[2][3] = 0;
                    EstadosIniciales[3][0] = 1;
                    EstadosIniciales[3][1] = 0;   
                    EstadosIniciales[3][2] = 1; 
                    EstadosIniciales[3][3] = 0;
                    EstadosIniciales[4][0] = 0;
                    EstadosIniciales[4][1] = 1;   
                    EstadosIniciales[4][2] = 0; 
                    EstadosIniciales[4][3] = 0;
                    EstadosIniciales[5][0] = 1;
                    EstadosIniciales[5][1] = 1;   
                    EstadosIniciales[5][2] = 0; 
                    EstadosIniciales[5][3] = 0;
                    EstadosIniciales[6][0] = 0;
                    EstadosIniciales[6][1] = 0;   
                    EstadosIniciales[6][2] = 0; 
                    EstadosIniciales[6][3] = 1;
                    EstadosIniciales[7][0] = 1;
                    EstadosIniciales[7][1] = 0;   
                    EstadosIniciales[7][2] = 0; 
                    EstadosIniciales[7][3] = 1;
                    EstadosIniciales[8][0] = 0;
                    EstadosIniciales[8][1] = 0;   
                    EstadosIniciales[8][2] = 1; 
                    EstadosIniciales[8][3] = 1;
                    EstadosIniciales[9][0] = 1;
                    EstadosIniciales[9][1] = 0;   
                    EstadosIniciales[9][2] = 1; 
                    EstadosIniciales[9][3] = 1;
                    EstadosIniciales[10][0] = 0;
                    EstadosIniciales[10][1] = 1;   
                    EstadosIniciales[10][2] = 1; 
                    EstadosIniciales[10][3] = 1;
                    EstadosIniciales[11][0] = 1;
                    EstadosIniciales[11][1] = 1;   
                    EstadosIniciales[11][2] = 1; 
                    EstadosIniciales[11][3] = 1;
                    EstadosIniciales[12][0] = 0;
                    EstadosIniciales[12][1] = 1;   
                    EstadosIniciales[12][2] = 0; 
                    EstadosIniciales[12][3] = 1;
                    EstadosIniciales[13][0] = 1;
                    EstadosIniciales[13][1] = 1;   
                    EstadosIniciales[13][2] = 0; 
                    EstadosIniciales[13][3] = 1;
                    EstadosIniciales[14][0] = 0;
                    EstadosIniciales[14][1] = 1;   
                    EstadosIniciales[14][2] = 1; 
                    EstadosIniciales[14][3] = 0;
                    EstadosIniciales[15][0] = 1;
                    EstadosIniciales[15][1] = 1;   
                    EstadosIniciales[15][2] = 1; 
                    EstadosIniciales[15][3] = 0;
                    
                    String cadena = "";
                    modelo.addColumn("E");
                    modelo.addColumn("D1(actual)");
                    modelo.addColumn("D2(actual)");
                    modelo.addColumn("D3(actual)");
                    modelo.addColumn("D1(Siguiente)");
                    modelo.addColumn("D2(siguiente)");
                    modelo.addColumn("D3(siguiente)");

                     for(int i=0; i<16;i++){
                    //System.out.println("\n");
                    EstadosSiguientes[i][0]=EstadosIniciales[i][0];
                    EstadosSiguientes[i][1]=EstadosIniciales[i][1];
                    EstadosSiguientes[i][2]=EstadosIniciales[i][2];
                    for(int j=0; j<4;j++)
                    {
                        cadena = cadena + " " + EstadosIniciales[i][j];
                    } 
                    System.out.println(cadena);
                    cadena = "";
                }
                     
                    String cadena2 = "";
                 for(int i=0; i<16;i++){
                    for(int j=0; j<3;j++)
                    {
                        cadena2 = cadena2 + " " + EstadosSiguientes[i][j];
                    } 
                    
                    Object[] fila = new Object[7]; 
                    fila[0]=EstadosIniciales[i][0];
                    fila[1]=EstadosIniciales[i][1];
                    fila[2]=EstadosIniciales[i][2];
                    fila[3]=EstadosIniciales[i][3];
                    fila[4]=EstadosSiguientes[i][0];
                    fila[5]=EstadosSiguientes[i][1];
                    fila[6]=EstadosSiguientes[i][2];
                    modelo.addRow(fila); 
                    System.out.println(cadena2);
                    cadena2 = "";
                   
                } 
                }
        
    }//GEN-LAST:event_btnCodificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Fec oFec = new Fec(Integer.parseInt(this.cmbElementosDeMemoria.getSelectedItem().toString()), Integer.parseInt(this.sltSalidas.getSelectedItem().toString()));
        int[][] iTabla = oFec.getTablaVerdad();
        int iAux = Integer.parseInt(this.cmbElementosDeMemoria.getSelectedItem().toString());
        this.JDialogTablaVerdad.show();
        DefaultTableModel modelo=new DefaultTableModel(); 
        this.tableTVerdad.setModel(modelo);
        // For para imprimir la matriz de prueba
        int iAux2 = 0;
        for (int i = 0; i < iTabla[0].length; i++) {
            if (i == 0) {
                modelo.addColumn("E");
            } else if (i < (iAux + 1)){
                if (i == 1) {
                    iAux2 = 1;
                }
                modelo.addColumn("D" + iAux2);
                iAux2++;
            } else if (i >= (iAux + 1) && i < ((iAux * 2) + 1)) {
                if (i == (iAux + 1)) {
                    iAux2 = 1;
                }
                modelo.addColumn("D" + iAux2);
                iAux2++;
            } else {
                if (i == ((iAux * 2) + 1)) {
                    iAux2 = 1;
                }
                modelo.addColumn("S" + iAux2);
                iAux2++;
            }
        }
        for (int i = 0; i < iTabla.length; i++) {
            Object[] fila = new Object[iTabla[i].length];
            for (int j = 0; j < iTabla[i].length; j++) {
                    fila[j] = iTabla[i][j];
                    System.out.print("|" + iTabla[i][j] + "|");
            }
            System.out.println("");
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbElementosDeMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbElementosDeMemoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbElementosDeMemoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JDialogTablaVerdad;
    private javax.swing.JButton btnCodificar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cmbElementosDeMemoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> sltSalidas;
    private javax.swing.JTable tableTVerdad;
    // End of variables declaration//GEN-END:variables

}