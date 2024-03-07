
package loginapp;


public class LoggedInPage extends javax.swing.JFrame {

    private final String userlb;
    private final String roleslb;
    private final String namelb;
    private final int authority;

    /**
     * Creates new form LoggedInPage
     * @param loggedUser
     */
    public LoggedInPage(String loggedUser) {
        HandlingInput HI = new HandlingInput();
        userlb = loggedUser;
        namelb = HI.HandlingInput(loggedUser, 2);
        roleslb = HI.HandlingInput(loggedUser, 3);
        authority = Integer.parseInt(HI.HandlingInput(loggedUser, 4));
        
        initComponents();
        authcheck(authority);

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        WelcomeLabel = new javax.swing.JLabel();
        NameLabel1 = new javax.swing.JLabel();
        NameLabel2 = new javax.swing.JLabel();
        RSpanel = new javax.swing.JPanel();
        RSwebsite = new javax.swing.JButton();
        RSLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        NameLabel.setText("@"+userlb);

        WelcomeLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("Welcome");
        WelcomeLabel.setToolTipText("");
        WelcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        NameLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        NameLabel1.setText(roleslb);

        NameLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        NameLabel2.setText(namelb);

        RSwebsite.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RSwebsite.setText("Restricted");
        RSwebsite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RSwebsite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RSwebsiteMouseClicked(evt);
            }
        });

        RSLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RSLabel.setText("For Access to Restricted Website --->");

        javax.swing.GroupLayout RSpanelLayout = new javax.swing.GroupLayout(RSpanel);
        RSpanel.setLayout(RSpanelLayout);
        RSpanelLayout.setHorizontalGroup(
            RSpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RSpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RSLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RSwebsite))
        );
        RSpanelLayout.setVerticalGroup(
            RSpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RSpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RSwebsite)
                .addComponent(RSLabel))
        );

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("LogOut?");
        jButton1.setToolTipText("");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
                .addComponent(WelcomeLabel)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RSpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(WelcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(RSpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RSwebsiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RSwebsiteMouseClicked
        new FinalPage();
        this.dispose();
    }//GEN-LAST:event_RSwebsiteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose(); 
        new GUI().setVisible(true);        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void authcheck(int authority){
        if (authority !=1){
            RSpanel.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel NameLabel2;
    private javax.swing.JLabel RSLabel;
    private javax.swing.JPanel RSpanel;
    private javax.swing.JButton RSwebsite;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
