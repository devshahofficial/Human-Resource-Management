/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package secondAssignment.system.ui;

import javax.swing.table.DefaultTableModel;
import secondAssignment.system.person.City;
import secondAssignment.system.person.Community;
import secondAssignment.system.person.DoctorDirectory;
import secondAssignment.system.person.Encounter;
import secondAssignment.system.person.EncounterHistory;
import secondAssignment.system.person.Patient;
import secondAssignment.system.person.PatientDirectory;

/**
 *
 * @author devshahofficial
 */
public class ViewAbnormality extends javax.swing.JFrame {

    /**
     * Creates new form ViewAbnormality
     */
     PatientDirectory pList;
    City city;
    DoctorDirectory dlist;
    public ViewAbnormality(PatientDirectory pList, City city,DoctorDirectory dlist) {
        initComponents();
         this.pList = pList;
        this.city=city;
        this.dlist = dlist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViewAbnormality = new javax.swing.JTable();
        lblDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);

        jLabel1.setText("View Abnormality");

        jLabel2.setText("Community");

        jButton1.setText("Blood Pressure");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Resperatory rate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Heart Rate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Temperature");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        tblViewAbnormality.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Blood Pressure", "Respiration Rate", "Heart Rate", "Weight", "Temprature"
            }
        ));
        jScrollPane2.setViewportView(tblViewAbnormality);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 611, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(101, 101, 101)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(108, 108, 108)
                        .addComponent(jButton4)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisplay))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          //BP
         DefaultTableModel model = (DefaultTableModel)tblViewAbnormality.getModel();
      model.setRowCount(0);
        Integer count=0;
       String community = txtCommunity.getText();
       
      for(int i=0; i<pList.getPatientList().size(); i++) //Check if comunity exists
      {
           Community c1=city.getCommunity(community);
       
      if(c1.getCommunityName()!=null)
      {
          if(pList.getPatientList().get(i).getCommunity().getCommunityName().equalsIgnoreCase(community)){
           
          
            Patient patient=pList.getPatientList().get(i);
            EncounterHistory eh=new EncounterHistory();
            eh=patient.getEncounterHistory();
            //TODO: AND patient belongs to given community
            Encounter lastEncounter = null;
            for(Encounter r: eh.getEncounterHistory())
            {
                System.out.println("out vitalabnoraml");
                patient.setIsBPAbnormal(r.isVitalSignAbNormalBP(r,patient.getAge()));
                lastEncounter = r;
            }
            if(patient.getIsBPAbnormal()){
           
      
         Object[] object={
             
            patient.getPatientID(),
            patient.getName(),
            lastEncounter.getVitalSigns().getBloodPressure(),
            lastEncounter.getVitalSigns().getRespiratoryRate(),
            lastEncounter.getVitalSigns().getHR(),
            lastEncounter.getVitalSigns().getWeight(),
            lastEncounter.getVitalSigns().getTemperature(),
            
};
                 model.addRow(object); 
            count+=1;
            }
            lblDisplay.setText("Number of People with abnormalities in "+community+ " are "+count+"");}
          
      }
      else
      {
           
            System.out.println("Community dont exist");
            
      }
            }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
           DefaultTableModel model = (DefaultTableModel)tblViewAbnormality.getModel();
      model.setRowCount(0);
      
       String community = txtCommunity.getText();
       Integer count=0;
      for(int i=0; i<pList.getPatientList().size(); i++)
      {
          Community c1=city.getCommunity(community);
       
      if(c1.getCommunityName()!=null)
      {
           if(pList.getPatientList().get(i).getCommunity().getCommunityName().equalsIgnoreCase(community)){
         
            Patient patient=pList.getPatientList().get(i);
            EncounterHistory eh=new EncounterHistory();
            eh=patient.getEncounterHistory();
            //TODO: AND patient belongs to given community
            Encounter lastEncounter = null;
            for(Encounter r: eh.getEncounterHistory()){
                System.out.println("out vitalabnoraml");
                  patient.setIsRespirationAbnormal(r.isVitalSignAbNormalRespiration(r, patient.getAge()));
                  lastEncounter = r;
            }
            if(patient.getIsRespirationAbnormal()){
           
      
         Object[] object={
             
            patient.getPatientID(),
            patient.getName(),
            lastEncounter.getVitalSigns().getBloodPressure(),
            lastEncounter.getVitalSigns().getRespiratoryRate(),
            lastEncounter.getVitalSigns().getHR(),
            lastEncounter.getVitalSigns().getWeight(),
            lastEncounter.getVitalSigns().getTemperature(),
            
            
            
};
                 model.addRow(object); 
             count+=1;
            }
            lblDisplay.setText("Number of People with abnormalities in "+community+ " are "+count+"");}
          
      }
      else
      {
           
            System.out.println("Community dont exist");
            
      }
            }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            //Heart Rate
        
            DefaultTableModel model = (DefaultTableModel)tblViewAbnormality.getModel();
      model.setRowCount(0);
      
       String community = txtCommunity.getText();
       Integer count=0;
      for(int i=0; i<pList.getPatientList().size(); i++)
      {
          Community c1=city.getCommunity(community);
       
      if(c1.getCommunityName()!=null)
      {
           if(pList.getPatientList().get(i).getCommunity().getCommunityName().equalsIgnoreCase(community)){
         
            Patient patient=pList.getPatientList().get(i);
            EncounterHistory eh=new EncounterHistory();
            eh=patient.getEncounterHistory();
            //TODO: AND patient belongs to given community
            Encounter lastEncounter = null;
            for(Encounter r: eh.getEncounterHistory()){
                System.out.println("out vitalabnoraml");
                  patient.setIsPulseAbnormal(r.isVitalSignAbNormalHR(r, patient.getAge()));
                  lastEncounter = r;
            }
            if(patient.getIsPulseAbnormal()){
           
         Object[] object={
                    
            patient.getPatientID(),
            patient.getName(),
            lastEncounter.getVitalSigns().getBloodPressure(),
            lastEncounter.getVitalSigns().getRespiratoryRate(),
            lastEncounter.getVitalSigns().getHR(),
            lastEncounter.getVitalSigns().getWeight(),
            lastEncounter.getVitalSigns().getTemperature(), 
            
};
                 model.addRow(object); 
            count+=1;
            }
            lblDisplay.setText("Number of People with abnormalities in "+community+ " are "+count+"");}
          
      }
      else
      {
           
            System.out.println("Community dont exist");
            
      }
            }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
              //temp
        
          DefaultTableModel model = (DefaultTableModel)tblViewAbnormality.getModel();
      model.setRowCount(0);
      
       String community = txtCommunity.getText();
         Integer count=0;
      for(int i=0; i<pList.getPatientList().size(); i++)
      {
      Community c1=city.getCommunity(community);
       
      if(c1.getCommunityName()!=null)
      {
            if(pList.getPatientList().get(i).getCommunity().getCommunityName().equalsIgnoreCase(community)){
         
            Patient patient=pList.getPatientList().get(i);
            EncounterHistory eh=new EncounterHistory();
            eh=patient.getEncounterHistory();
            //TODO: AND patient belongs to given community
            Encounter lastEncounter = null;
            for(Encounter r: eh.getEncounterHistory()){
                System.out.println("out vitalabnoraml");
                  patient.setIsBTAbnormal(r.isVitalSignAbNormalBT(r, patient.getAge()));
                  lastEncounter = r;
            }
            if(patient.getIsBTAbnormal()){
           
      
         Object[] object={
                    
            patient.getPatientID(),
            patient.getName(),
            lastEncounter.getVitalSigns().getBloodPressure(),
            lastEncounter.getVitalSigns().getRespiratoryRate(),
            lastEncounter.getVitalSigns().getHR(),
            lastEncounter.getVitalSigns().getWeight(),
            lastEncounter.getVitalSigns().getTemperature(),

            
};
                 model.addRow(object); 
             count+=1;
            }
            lblDisplay.setText("Number of People with abnormalities in "+community+ " are "+count+"");}
          
      }
      else
      {
           
            System.out.println("Community dont exist");
            
      }    
          
            }
    }//GEN-LAST:event_jButton4ActionPerformed

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
//            java.util.logging.Logger.getLogger(ViewAbnormality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewAbnormality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewAbnormality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewAbnormality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewAbnormality().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JTable tblViewAbnormality;
    private javax.swing.JTextField txtCommunity;
    // End of variables declaration//GEN-END:variables
}