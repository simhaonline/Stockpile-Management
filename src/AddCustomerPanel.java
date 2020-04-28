
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shubham
 */
public class AddCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomerPanel() {
        initComponents();
        conn = MySqlConnect.connectDB();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        lblCustContact = new javax.swing.JLabel();
        lblCustGST = new javax.swing.JLabel();
        lblCustEmail = new javax.swing.JLabel();
        txtCustEmail = new javax.swing.JTextField();
        txtcustGST = new javax.swing.JTextField();
        txtCustContact = new javax.swing.JTextField();
        jspContact = new javax.swing.JSeparator();
        jspName = new javax.swing.JSeparator();
        jspGST = new javax.swing.JSeparator();
        jspEmail = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(29, 35, 59));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Share Tech Mono", 0, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 250, 255));
        lblName.setText("Name ");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtCustName.setFont(new java.awt.Font("Share Tech Mono", 0, 24)); // NOI18N
        txtCustName.setForeground(new java.awt.Color(0, 246, 237));
        txtCustName.setBorder(null);
        txtCustName.setCaretColor(new java.awt.Color(0, 246, 237));
        txtCustName.setOpaque(false);
        txtCustName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCustNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCustNameFocusLost(evt);
            }
        });
        txtCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustNameActionPerformed(evt);
            }
        });
        add(txtCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 220, -1));

        lblCustContact.setFont(new java.awt.Font("Share Tech Mono", 0, 24)); // NOI18N
        lblCustContact.setForeground(new java.awt.Color(255, 250, 255));
        lblCustContact.setText("Contact  ");
        lblCustContact.setToolTipText("");
        add(lblCustContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        lblCustGST.setFont(new java.awt.Font("Share Tech Mono", 0, 24)); // NOI18N
        lblCustGST.setForeground(new java.awt.Color(255, 250, 255));
        lblCustGST.setText("GST NO. ");
        lblCustGST.setToolTipText("");
        add(lblCustGST, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        lblCustEmail.setFont(new java.awt.Font("Share Tech Mono", 0, 24)); // NOI18N
        lblCustEmail.setForeground(new java.awt.Color(255, 250, 255));
        lblCustEmail.setText("Email ID ");
        lblCustEmail.setToolTipText("");
        add(lblCustEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        txtCustEmail.setFont(new java.awt.Font("Share Tech Mono", 0, 24)); // NOI18N
        txtCustEmail.setForeground(new java.awt.Color(0, 246, 237));
        txtCustEmail.setBorder(null);
        txtCustEmail.setCaretColor(new java.awt.Color(0, 246, 237));
        txtCustEmail.setOpaque(false);
        txtCustEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCustEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCustEmailFocusLost(evt);
            }
        });
        txtCustEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustEmailActionPerformed(evt);
            }
        });
        add(txtCustEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 220, -1));

        txtcustGST.setFont(new java.awt.Font("Share Tech Mono", 0, 24)); // NOI18N
        txtcustGST.setForeground(new java.awt.Color(0, 246, 237));
        txtcustGST.setBorder(null);
        txtcustGST.setCaretColor(new java.awt.Color(0, 246, 237));
        txtcustGST.setOpaque(false);
        txtcustGST.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcustGSTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcustGSTFocusLost(evt);
            }
        });
        txtcustGST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustGSTActionPerformed(evt);
            }
        });
        add(txtcustGST, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 220, -1));

        txtCustContact.setFont(new java.awt.Font("Share Tech Mono", 0, 24)); // NOI18N
        txtCustContact.setForeground(new java.awt.Color(0, 246, 237));
        txtCustContact.setBorder(null);
        txtCustContact.setCaretColor(new java.awt.Color(0, 246, 237));
        txtCustContact.setOpaque(false);
        txtCustContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCustContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCustContactFocusLost(evt);
            }
        });
        txtCustContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustContactActionPerformed(evt);
            }
        });
        add(txtCustContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 220, -1));

        jspContact.setBackground(new java.awt.Color(255, 250, 255));
        jspContact.setForeground(new java.awt.Color(255, 250, 255));
        add(jspContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 220, -1));

        jspName.setBackground(new java.awt.Color(255, 250, 255));
        jspName.setForeground(new java.awt.Color(255, 250, 255));
        add(jspName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 220, -1));

        jspGST.setBackground(new java.awt.Color(255, 250, 255));
        jspGST.setForeground(new java.awt.Color(255, 250, 255));
        add(jspGST, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 220, -1));

        jspEmail.setBackground(new java.awt.Color(255, 250, 255));
        jspEmail.setForeground(new java.awt.Color(255, 250, 255));
        add(jspEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 220, -1));

        btnAdd.setBackground(new java.awt.Color(29, 35, 59));
        btnAdd.setFont(new java.awt.Font("Share Tech Mono", 0, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 246, 237));
        btnAdd.setText(" ADD");
        btnAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 246, 237), 1, true));
        btnAdd.setOpaque(false);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddMouseReleased(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 140, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustNameFocusGained
        jspName.setBackground(Constants.LIGHT_BLUE);
        jspName.setForeground(Constants.LIGHT_BLUE);
        lblName.setForeground(Constants.LIGHT_BLUE);
    }//GEN-LAST:event_txtCustNameFocusGained

    private void txtCustNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustNameFocusLost
        jspName.setBackground(Constants.WHITE);
        jspName.setForeground(Constants.WHITE);
        lblName.setForeground(Constants.WHITE);
    }//GEN-LAST:event_txtCustNameFocusLost

    private void txtCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustNameActionPerformed

    private void txtCustEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustEmailFocusGained
        jspEmail.setBackground(Constants.LIGHT_BLUE);
        jspEmail.setForeground(Constants.LIGHT_BLUE);
        lblCustEmail.setForeground(Constants.LIGHT_BLUE);
    }//GEN-LAST:event_txtCustEmailFocusGained

    private void txtCustEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustEmailFocusLost
        jspEmail.setBackground(Constants.WHITE);
        jspEmail.setForeground(Constants.WHITE);
        lblCustEmail.setForeground(Constants.WHITE);
    }//GEN-LAST:event_txtCustEmailFocusLost

    private void txtCustEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustEmailActionPerformed

    private void txtcustGSTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcustGSTFocusGained
        jspGST.setBackground(Constants.LIGHT_BLUE);
        jspGST.setForeground(Constants.LIGHT_BLUE);
        lblCustGST.setForeground(Constants.LIGHT_BLUE);
    }//GEN-LAST:event_txtcustGSTFocusGained

    private void txtcustGSTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcustGSTFocusLost
        jspGST.setBackground(Constants.WHITE);
        jspGST.setForeground(Constants.WHITE);
        lblCustGST.setForeground(Constants.WHITE);
    }//GEN-LAST:event_txtcustGSTFocusLost

    private void txtcustGSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustGSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustGSTActionPerformed

    private void txtCustContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustContactFocusGained
        jspContact.setBackground(Constants.LIGHT_BLUE);
        jspContact.setForeground(Constants.LIGHT_BLUE);
        lblCustContact.setForeground(Constants.LIGHT_BLUE);
    }//GEN-LAST:event_txtCustContactFocusGained

    private void txtCustContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustContactFocusLost
        jspContact.setBackground(Constants.WHITE);
        jspContact.setForeground(Constants.WHITE);
        lblCustContact.setForeground(Constants.WHITE);
    }//GEN-LAST:event_txtCustContactFocusLost

    private void txtCustContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustContactActionPerformed

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAddMousePressed

    private void btnAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseReleased

    }//GEN-LAST:event_btnAddMouseReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtCustName.getText().equals("") || txtCustContact.getText().equals("") || txtCustEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Some Fields are missing");
        }
        //else if(jspEmail.getBackground()!= Color())
        else{
            String sql = "INSERT INTO customer( customername, contactno, gst, email) VALUES (?,?,?,?)";
            try {
                preparedStatement = conn.prepareStatement(sql);

                preparedStatement.setString(1, txtCustName.getText());
                preparedStatement.setString(2, txtCustContact.getText());
                preparedStatement.setString(3, txtcustGST.getText());
                preparedStatement.setString(4, txtCustEmail.getText());

                boolean stmt = preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "Record Saved Successfully");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Some Error : " + e);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JSeparator jspContact;
    private javax.swing.JSeparator jspEmail;
    private javax.swing.JSeparator jspGST;
    private javax.swing.JSeparator jspName;
    private javax.swing.JLabel lblCustContact;
    private javax.swing.JLabel lblCustEmail;
    private javax.swing.JLabel lblCustGST;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtCustContact;
    private javax.swing.JTextField txtCustEmail;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtcustGST;
    // End of variables declaration//GEN-END:variables

    private Connection conn = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;
    private String sql = null;
    private int selectedRow;
    private String selectedCustId;
}