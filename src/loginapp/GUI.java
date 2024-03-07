package loginapp;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        PWID = new javax.swing.JPasswordField();
        UserID = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        UIDLabel = new javax.swing.JLabel();
        PWLabel = new javax.swing.JLabel();
        ErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        TitleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Simple Login Application");
        TitleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        UserID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UserID.setName("Username"); // NOI18N
        UserID.setOpaque(true);

        LoginButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setPreferredSize(new java.awt.Dimension(70, 22));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        UIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UIDLabel.setText("Username");
        UIDLabel.setName("UserLabel"); // NOI18N
        UIDLabel.setPreferredSize(new java.awt.Dimension(70, 16));

        PWLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PWLabel.setText("Password");
        PWLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        PWLabel.setName("PWLabel"); // NOI18N
        PWLabel.setPreferredSize(new java.awt.Dimension(70, 16));

        ErrorMessage.setForeground(new java.awt.Color(255, 51, 51));
        ErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PWLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PWID)
                    .addComponent(UserID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(TitleLabel)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PWID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PWLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorMessage)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        HandlingInput HI = new HandlingInput();
        Boolean Validity = HI.HandlingInput(UserID.getText(), new String(PWID.getPassword()), 0);
        
        if (Validity == true){
            this.dispose();
            new LoggedInPage(UserID.getText());
        } else {
            ErrorMessage.setText("Invalid UserID or Password");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PWID;
    private javax.swing.JLabel PWLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UIDLabel;
    private javax.swing.JTextField UserID;
    // End of variables declaration//GEN-END:variables
}
