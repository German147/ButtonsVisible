
import java.awt.Color;




public class Play extends javax.swing.JFrame {

    int level;
    public Play() {
        initComponents();
        this.setTitle("Playing With Buttons!");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        
        level = 1;
        textLevel.setText(""+level);
        buttonDecrease.setEnabled(false);
        buttonIncrease.setEnabled(false);
        buttonPlay.setEnabled(false);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPick = new javax.swing.JButton();
        buttonDecrease = new javax.swing.JButton();
        buttonIncrease = new javax.swing.JButton();
        buttonPlay = new javax.swing.JButton();
        textLevel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonPick.setText("Pick Level");
        buttonPick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPickActionPerformed(evt);
            }
        });

        buttonDecrease.setText("Decrease Level");
        buttonDecrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDecreaseActionPerformed(evt);
            }
        });

        buttonIncrease.setText("Increase Level");
        buttonIncrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIncreaseActionPerformed(evt);
            }
        });

        buttonPlay.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        buttonPlay.setText("Play");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textLevel)
                    .addComponent(buttonDecrease, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(buttonPick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonIncrease, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonPick, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonIncrease, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(textLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonDecrease, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIncreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIncreaseActionPerformed
        // TODO add your handling code here:
        if(level<5){
            level=level+1;
            textLevel.setText(""+level);
            buttonDecrease.setEnabled(true);
            
        }else{
            buttonIncrease.setEnabled(false);
    }//GEN-LAST:event_buttonIncreaseActionPerformed

    private void buttonPickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPickActionPerformed
        // TODO add your handling code here:
        buttonDecrease.setEnabled(true);
        buttonIncrease.setEnabled(true);
        buttonPlay.setEnabled(true);
        buttonPick.setEnabled(false);
        
        
    }//GEN-LAST:event_buttonPickActionPerformed

    private void buttonDecreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDecreaseActionPerformed
        // TODO add your handling code here:
        if (level>1){
                level=level-1;
                textLevel.setText(""+level);
                buttonIncrease.setEnabled(true);
        }else{
            buttonDecrease.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_buttonDecreaseActionPerformed

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
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDecrease;
    private javax.swing.JButton buttonIncrease;
    private javax.swing.JButton buttonPick;
    private javax.swing.JButton buttonPlay;
    private javax.swing.JTextField textLevel;
    // End of variables declaration//GEN-END:variables
}
