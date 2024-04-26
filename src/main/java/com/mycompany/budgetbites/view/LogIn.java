package com.mycompany.budgetbites.view;

import com.mycompany.budgetbites.dao.AuthDAO;
import com.mycompany.budgetbites.model.LoginModel;
import com.mycompany.budgetbites.model.UserData;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        slogan1 = new javax.swing.JLabel();
        slogan2 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        pwField = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        pwLabel = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        forgotPwLabel = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        signupLabel = new javax.swing.JLabel();
        pwCheckLogin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 480));

        LoginPanel.setBackground(new java.awt.Color(199, 201, 120));
        LoginPanel.setSize(new java.awt.Dimension(800, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/nobglogo.png"))); // NOI18N

        slogan1.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        slogan1.setForeground(new java.awt.Color(90, 0, 0));
        slogan1.setText("Flavourful Moments");

        slogan2.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        slogan2.setForeground(new java.awt.Color(90, 0, 0));
        slogan2.setText("Begin With A Click!");

        emailField.setBackground(new java.awt.Color(227, 235, 219));
        emailField.setForeground(new java.awt.Color(102, 102, 102));

        pwField.setBackground(new java.awt.Color(227, 235, 219));
        pwField.setForeground(new java.awt.Color(102, 102, 102));
        pwField.setSize(new java.awt.Dimension(78, 23));

        emailLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emailLabel.setText("Email Address");

        pwLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pwLabel.setText("Password");

        LoginBtn.setBackground(new java.awt.Color(227, 235, 219));
        LoginBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(90, 0, 0));
        LoginBtn.setText("LOG IN");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });

        forgotPwLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        forgotPwLabel.setForeground(new java.awt.Color(22, 17, 243));
        forgotPwLabel.setText("Forgot Password?");
        forgotPwLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPwLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPwLabelMouseClicked(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        label1.setText("Don't have an account yet?");

        signupLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        signupLabel.setForeground(new java.awt.Color(255, 107, 0));
        signupLabel.setText("Sign Up");
        signupLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLabelMouseClicked(evt);
            }
        });

        pwCheckLogin.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        pwCheckLogin.setText("See Password");
        pwCheckLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pwCheckLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwCheckLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(pwCheckLogin))
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slogan2)
                                    .addComponent(slogan1))
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                .addComponent(forgotPwLabel)
                                .addGap(195, 195, 195))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabel)
                                    .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwLabel))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupLabel)
                .addGap(154, 154, 154))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(slogan1)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slogan2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pwLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pwCheckLogin)
                        .addGap(42, 42, 42)
                        .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forgotPwLabel))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(signupLabel))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwCheckLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwCheckLoginActionPerformed
        if(pwCheckLogin.isSelected()){
            pwField.setEchoChar((char)0);
        }
        else{
            pwField.setEchoChar('*');
        }
    }//GEN-LAST:event_pwCheckLoginActionPerformed

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
        String email = emailField.getText();
        if(email == ""){
            JOptionPane.showMessageDialog(this, "Please enter an email");
        }
        String password = pwField.getText();
        if(password == ""){
            JOptionPane.showMessageDialog(this, "Please enter a password");
        }
        LoginModel lm = new LoginModel(email, password);
        AuthDAO auth = new AuthDAO();
        UserData user = auth.login(lm);
        if(user == null){
            JOptionPane.showMessageDialog(this, "Invalid Credentials");
        }
        else{
            // JOptionPane.showMessageDialog(this, "Login Successful");
            Dashboard ds = new Dashboard();
            ds.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LoginBtnMouseClicked

    private void signupLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseClicked
        SignUp su = new SignUp();
            su.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_signupLabelMouseClicked

    private void forgotPwLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPwLabelMouseClicked
        ForgotPassword forget = new ForgotPassword();
            forget.setVisible(true);
    }//GEN-LAST:event_forgotPwLabelMouseClicked

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel forgotPwLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label1;
    private javax.swing.JCheckBox pwCheckLogin;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JLabel slogan1;
    private javax.swing.JLabel slogan2;
    // End of variables declaration//GEN-END:variables
        String getEmail() {
            String mailuser = emailField.getText();
            return mailuser;
    }
}
