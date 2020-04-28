/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Color Scheme
 * Background : 11151c
 * Accent Color : 5fe0d4  95,224,212
 * Second Color : 8,16,31
 */
/**
 *
 * @author gauravpunjabi
 */
public class LoginPage extends javax.swing.JFrame implements ActionListener,Constants {

    /**
     * Creates new form LoginPage
     */
    public PreparedStatement prepareStatement;
    public Connection conn;
    public ResultSet rs;
    public LoginPage() {
        initComponents();
        customInit();
        initDatabase();
    }
    private void initDatabase() {
        conn = MySqlConnect.connectDB();
        if(conn == null) {
            JOptionPane.showMessageDialog(null, "Some error in creating connection");
            return;
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(!isFieldEmpty()) {
            JOptionPane.showMessageDialog(null,"Username or Password is empty.");
            return;
        }
        processLogin();
    }
    private int isEmployee = 0;
    private void processLogin() {
        try {
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, jtfMobileNo.getText());
            prepareStatement.setString(2, jtfPassword.getText());
            rs = prepareStatement.executeQuery();
            if (rs.next()) {
                //JOptionPane.showMessageDialog(null, "Login Successfull!", "Login", JOptionPane.INFORMATION_MESSAGE);
                
                Dashboard db;
                isEmployee =rs.getInt("isEmployee");
                //db.setVisible(true);
                parallaxTimer.start();
            } else {
                JOptionPane.showMessageDialog(null, "Login Unsuccessfull!", "Login", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }
    private boolean isFieldEmpty() {
        if(jtfMobileNo.getText().equals("Enter your Username : ") || jtfPassword.getText().equals("password")) {
            return false;
        }
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpLoading = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                if(loadingCompleted)
                loadingAnimation(g);
                else
                super.paintComponent(g);
            }
        };
        jpLogin = new javax.swing.JPanel();
        jlLogin = new javax.swing.JLabel();
        jtfMobileNo = new javax.swing.JTextField();
        jlMobileNo = new javax.swing.JLabel();
        jspMobileNo = new javax.swing.JSeparator();
        jtfPassword = new javax.swing.JPasswordField();
        jspPassword = new javax.swing.JSeparator();
        jlPassword = new javax.swing.JLabel();
        jbLogin = new javax.swing.JButton();
        jlLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stockpile Management");
        setMinimumSize(new java.awt.Dimension(790, 622));
        setPreferredSize(new java.awt.Dimension(790, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpLoading.setMinimumSize(new java.awt.Dimension(788, 620));
        jpLoading.setOpaque(false);
        jpLoading.setPreferredSize(new java.awt.Dimension(788, 602));

        javax.swing.GroupLayout jpLoadingLayout = new javax.swing.GroupLayout(jpLoading);
        jpLoading.setLayout(jpLoadingLayout);
        jpLoadingLayout.setHorizontalGroup(
            jpLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        jpLoadingLayout.setVerticalGroup(
            jpLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(jpLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jpLogin.setBackground(new java.awt.Color(8, 16, 31));
        jpLogin.setMinimumSize(new java.awt.Dimension(788, 602));
        jpLogin.setPreferredSize(new java.awt.Dimension(788, 620));
        jpLogin.setLayout(null);

        jlLogin.setFont(new java.awt.Font("Raleway", 0, 48)); // NOI18N
        jlLogin.setForeground(new java.awt.Color(95, 224, 212));
        jlLogin.setText("Login");
        jpLogin.add(jlLogin);
        jlLogin.setBounds(122, 53, 119, 62);

        jtfMobileNo.setBackground(new java.awt.Color(8, 16, 31));
        jtfMobileNo.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jtfMobileNo.setForeground(new java.awt.Color(95, 224, 212));
        jtfMobileNo.setText("Enter your Username : ");
        jtfMobileNo.setBorder(null);
        jtfMobileNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfMobileNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfMobileNoFocusLost(evt);
            }
        });
        jtfMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMobileNoActionPerformed(evt);
            }
        });
        jpLogin.add(jtfMobileNo);
        jtfMobileNo.setBounds(63, 234, 248, 32);

        jlMobileNo.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        jlMobileNo.setForeground(new java.awt.Color(95, 224, 212));
        jlMobileNo.setText("User Name:");
        jpLogin.add(jlMobileNo);
        jlMobileNo.setBounds(60, 193, 131, 32);

        jspMobileNo.setBackground(new java.awt.Color(95, 224, 212));
        jspMobileNo.setForeground(new java.awt.Color(95, 224, 212));
        jpLogin.add(jspMobileNo);
        jspMobileNo.setBounds(60, 275, 262, 20);

        jtfPassword.setBackground(new java.awt.Color(8, 16, 31));
        jtfPassword.setFont(new java.awt.Font("Raleway", 0, 24)); // NOI18N
        jtfPassword.setForeground(new java.awt.Color(95, 224, 212));
        jtfPassword.setText("password");
        jtfPassword.setBorder(null);
        jtfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfPasswordFocusLost(evt);
            }
        });
        jtfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPasswordActionPerformed(evt);
            }
        });
        jpLogin.add(jtfPassword);
        jtfPassword.setBounds(60, 380, 260, 40);

        jspPassword.setBackground(new java.awt.Color(95, 224, 212));
        jspPassword.setForeground(new java.awt.Color(95, 224, 212));
        jpLogin.add(jspPassword);
        jspPassword.setBounds(60, 420, 262, 20);

        jlPassword.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(95, 224, 212));
        jlPassword.setText("Password : ");
        jpLogin.add(jlPassword);
        jlPassword.setBounds(60, 340, 136, 32);

        jbLogin.setBackground(new java.awt.Color(8, 16, 31));
        jbLogin.setFont(new java.awt.Font("Raleway", 0, 26)); // NOI18N
        jbLogin.setForeground(new java.awt.Color(95, 224, 212));
        jbLogin.setText("Login");
        jbLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(95, 224, 212), 1, true));
        jbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        jpLogin.add(jbLogin);
        jbLogin.setBounds(110, 480, 111, 50);

        getContentPane().add(jpLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 380, 600));

        jlLogo.setMinimumSize(new java.awt.Dimension(800, 602));
        jlLogo.setPreferredSize(new java.awt.Dimension(800, 620));
        getContentPane().add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 788, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void customInit() {
        setSize(788,594);
        setLocationRelativeTo(null);
        this.x = this.getWidth()/2;
        this.y = this.getHeight()/2;
        this.width = this.height = 0;
        this.jpLoading.setForeground(new Color(95,224,212));
        this.jbLogin.addActionListener(this);
        this.parallaxTimer = new Timer(6, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               parallaxActionPerformed(ae);
           }
        });
        this.loadingTimer = new Timer(2, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jlLogo.repaint();
            }
        });
    }
    private void loadingAnimation(Graphics g) {
        this.x -= 5;
        this.y -= 5;
        this.width += 10;
        this.height += 10;
        g.fillOval(this.x, this.y, width, height);
        if(this.x <= -200) {
            loadingCompleted = false;
            loadingTimer.stop();
            this.setVisible(false);
             Dashboard db;
            if(isEmployee == 1)
               db = new Dashboard(EMPLOYEE);
            else
                db = new Dashboard(ADMIN);
            db.setVisible(true);
            
            WindowEvent we = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
                Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
        }
    }
    private void parallaxActionPerformed(ActionEvent ae) {
        if(jpLogin.getLocation().x >= 585)
            this.firstPhaseComplete = true;
        if(firstPhaseComplete)
            this.jlLogo.setLocation(this.jlLogo.getLocation().x + 5,this.jlLogo.getLocation().y);
        this.jpLogin.setLocation(this.jpLogin.getLocation().x + 5,this.jpLogin.getLocation().y);
        if(jlLogo.getLocation().x >= -3) {
            parallaxTimer.stop();
            loadingCompleted = true;
            loadingTimer.start();
           
        }
    }
    private void jtfMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMobileNoActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        processLogin();
    }//GEN-LAST:event_jbLoginActionPerformed

    private void jtfMobileNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfMobileNoFocusGained
        if(this.jtfMobileNo.getText().equals("Enter your Username : "))
            this.jtfMobileNo.setText("");
    }//GEN-LAST:event_jtfMobileNoFocusGained

    private void jtfMobileNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfMobileNoFocusLost
        if(this.jtfMobileNo.getText().length() == 0)
            this.jtfMobileNo.setText("Enter your Username : ");
    }//GEN-LAST:event_jtfMobileNoFocusLost

    private void jtfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPasswordActionPerformed
        processLogin();     
    }//GEN-LAST:event_jtfPasswordActionPerformed

    private void jtfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPasswordFocusGained
        if(this.jtfPassword.getText().equals("password"))
            this.jtfPassword.setText("");
    }//GEN-LAST:event_jtfPasswordFocusGained

    private void jtfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPasswordFocusLost
        if(this.jtfMobileNo.getText().length() == 0)
            this.jtfMobileNo.setText("password");
    }//GEN-LAST:event_jtfPasswordFocusLost

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
                if ("Macintosh".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    private Timer parallaxTimer,loadingTimer;
    private boolean firstPhaseComplete = false;
    private boolean loadingCompleted = false;
    private int x,y,width,height;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbLogin;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlMobileNo;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JPanel jpLoading;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JSeparator jspMobileNo;
    private javax.swing.JSeparator jspPassword;
    private javax.swing.JTextField jtfMobileNo;
    private javax.swing.JPasswordField jtfPassword;
    // End of variables declaration//GEN-END:variables
}
