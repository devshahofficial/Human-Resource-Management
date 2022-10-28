/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package secondAssignment.system.ui;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import secondAssignment.system.person.City;
import secondAssignment.system.person.DoctorDirectory;
import secondAssignment.system.person.Encounter;
import secondAssignment.system.person.Patient;
import secondAssignment.system.person.PatientDirectory;

/**
 *
 * @author devshahofficial
 */
public class HistoryPatient extends javax.swing.JFrame {

    /**
     * Creates new form HistoryPatient
     */
    PatientDirectory pDirectory;
    City city;
    DoctorDirectory plist;
    public HistoryPatient(PatientDirectory history,City city,DoctorDirectory plist) {
        initComponents();
        this.pDirectory = history;
        this.city=city;
        this.plist = plist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtPatientID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnViewHis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient ID");

        btnViewHis.setBackground(new java.awt.Color(242, 242, 242));
        btnViewHis.setText("View History");
        btnViewHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHisActionPerformed(evt);
            }
        });

        tblHistory.setBackground(new java.awt.Color(242, 242, 242));
        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Temperature", "Heart Rate", "Respiratory Rate", "Blood Pressure", "Weight", "Time Stamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHistory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(btnViewHis)
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewHis))
                .addGap(152, 152, 152)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
            tblHistory.setAutoResizeMode(tblHistory.AUTO_RESIZE_OFF);
           // jTable1.setModel(edhar array list aega);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"error");
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHisActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblHistory.getModel();

        model.setRowCount(0);
        String patientID= txtPatientID.getText();
        if(Pattern.compile("^[1-9]\\d*$").matcher(patientID).matches() && !patientID.equals("")){
        
            Integer id = Integer.parseInt(patientID);

//        if (id == null){
//
//            JOptionPane.showMessageDialog(this,"Enter all values for the search!","ERROR",JOptionPane.ERROR_MESSAGE);
//        }
        List<Patient> filteredPatients = pDirectory.getPatientList().stream()
        .filter(p -> p.getPatientID().equals(id)
        )
        .collect(Collectors.toList());
        if(filteredPatients.isEmpty()){
            JOptionPane.showMessageDialog(this,"No record exists for "
                + "given values!!","ERROR",JOptionPane.ERROR_MESSAGE );
        }else{
            for(Patient patient: filteredPatients){
                addObjectToRow(patient);
            }
        }

        //        for(int i=0; i<pDirectory.getPatientList().size(); i++){
            //
            //            Patient p=pDirectory.getPatientList().get(i);
            //            if (id==p.getPatientID() || name==p.getName()){
                //
                //                addObjectToRow(p);
                //
                //            }
            //
            //
            //            else{
                //             JOptionPane.showMessageDialog(this,"No record exists for given values!!","ERROR",JOptionPane.ERROR_MESSAGE );
                //
                //            }
            //        }
    }//GEN-LAST:event_btnViewHisActionPerformed
        else{
            JOptionPane.showMessageDialog(this,"Patient ID is not valid","ERROR",JOptionPane.ERROR_MESSAGE );

        }
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HistoryPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HistoryPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HistoryPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HistoryPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HistoryPatient().setVisible(true);
//            }
//        });
//    }
 private void addObjectToRow(Patient p)
    {
        DefaultTableModel model = (DefaultTableModel)tblHistory.getModel();
        model.setRowCount(0);
        for(Encounter e: p.getEncounterHistory().getEncounterHistory())
        {
            Object[] object=
             {           
            p.getName(),
            p.getPatientID(),
            e.getVitalSigns().getTemperature(),
            e.getVitalSigns().getHR(),
            e.getVitalSigns().getRespiratoryRate(),
            e.getVitalSigns().getBloodPressure(),
            e.getVitalSigns().getWeight(),
            e.getDateOfEncounter()
             };
            model.addRow(object); 
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewHis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTextField txtPatientID;
    // End of variables declaration//GEN-END:variables
}
