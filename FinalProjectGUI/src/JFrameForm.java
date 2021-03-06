
import java.sql.ResultSet;

import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@SuppressWarnings("serial")
public class JFrameForm extends javax.swing.JFrame {

    /**
     * Creates new form JFrameForm
     */
    public JFrameForm() {
        initComponents();
  
        jTable1.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        query2Input1 = new javax.swing.JTextField();
        query1Input1Label = new javax.swing.JLabel();
        queryOneButton = new javax.swing.JButton();
        query2Input1Label = new javax.swing.JLabel();
        query1Input1 = new javax.swing.JTextField();
        query2Button = new javax.swing.JButton();
        query3Input1Label = new javax.swing.JLabel();
        query3Button = new javax.swing.JButton();
        query4Input1Label = new javax.swing.JLabel();
        query4Button = new javax.swing.JButton();
        query1Input1Label1 = new javax.swing.JLabel();
        query1Input1Label2 = new javax.swing.JLabel();
        query1Input1Label3 = new javax.swing.JLabel();
        query1Input1Label4 = new javax.swing.JLabel();
        query3Input1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CWRU Drinks");
        setResizable(false);

        query1Input1Label.setText("ENTER DOLLAR AMOUNT (WITHOUT \"$\"):");

        queryOneButton.setText("Find");
        queryOneButton.setToolTipText("Search");
        queryOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryOneButtonActionPerformed(evt);
            }
        });

        query2Input1Label.setText("DRINK NAME:");

        query2Button.setText("Find");
        query2Button.setToolTipText("Search");
        query2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                query2ButtonActionPerformed(evt);
            }
        });

        query3Input1Label.setText("BUSINESS NAME:");

        query3Button.setText("Find");
        query3Button.setToolTipText("Search");
        query3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                query3ButtonActionPerformed(evt);
            }
        });

        query4Input1Label.setText("GRADUATION YEAR:");

        query4Button.setText("Find");
        query4Button.setToolTipText("Search");
        query4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                query4ButtonActionPerformed(evt);
            }
        });

        query1Input1Label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        query1Input1Label1.setText("Cheapest Places to Get A Specific Drink");

        query1Input1Label2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        query1Input1Label2.setText("Find All Drinks and Where They are Sold for This Price or Less ");

        query1Input1Label3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        query1Input1Label3.setText("Find the Number of Drinks Consumed By Type for a Graduating Class");
        query1Input1Label3.setToolTipText("");

        query1Input1Label4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        query1Input1Label4.setText("Events Hosted by a Specific Alcohol Selling Business");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Enter A Valid Number");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Enter A Drink Name");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Enter A Business Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(query1Input1Label2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addComponent(query1Input1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(query1Input1Label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(query1Input1Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(query2Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(query2Button)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57))
                    .addComponent(query1Input1Label3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(query1Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(queryOneButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(query3Input1Label))
                                    .addComponent(query3Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(query3Button))
                            .addComponent(query2Input1Label)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(query4Input1Label))
                                .addGap(15, 15, 15)
                                .addComponent(query4Button)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(query1Input1Label2)
                        .addGap(4, 4, 4)
                        .addComponent(query1Input1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(query1Input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(queryOneButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(query1Input1Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(query2Input1Label)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(query2Input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(query2Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(query1Input1Label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(query3Input1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(query3Button)
                            .addComponent(query3Input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(query1Input1Label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(query4Input1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(query4Button)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void queryOneButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        //QUERY ONE BUTTON IS PRESSED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    	 String inputOne = this.query1Input1.getText();
         if (!isNumber(inputOne)) {
             jLabel1.setVisible(true);
         }
         else {
             if (inputOne != null) {
                jLabel1.setVisible(false);
                rs = Queries.queryOne(inputOne);
                resultSetToTable();
                jScrollPane1.setVisible(true);
                jTable1.setVisible(true);
             }
             else {
                 //Do Nothing
             }
         }
    }           
    
    private void query2ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //QUERY TWO BUTTON IS PRESSED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    	String inputOne = this.query2Input1.getText();
        if (inputOne != null && !inputOne.isEmpty()) {
            
            jLabel2.setVisible(false);
            rs = Queries.queryTwo(inputOne);
            resultSetToTable();
            jScrollPane1.setVisible(true);
            jTable1.setVisible(true);
        }
        else {
            jLabel2.setVisible(true);
        }
    }                                            

    private void query3ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //QUERY THREE BUTTON IS PRESSED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        String inputOne = this.query3Input1.getText();
        if (inputOne != null && !inputOne.isEmpty()) {
            jLabel3.setVisible(false);
            rs = Queries.queryThree(inputOne);
            resultSetToTable();
            jScrollPane1.setVisible(true);
            jTable1.setVisible(true);
        }
        else {
            jLabel3.setVisible(true);
        }
    }                                            

    private void query4ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //QUERY FOUR BUTTON IS PRESSED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        String inputOne = this.jComboBox1.getSelectedItem().toString();
        if (inputOne != null && !inputOne.isEmpty()) {
            rs = Queries.queryFour(inputOne);
            resultSetToTable();
            jScrollPane1.setVisible(true);
            jTable1.setVisible(true);
        }
        else {
            //Do Nothing
        }
    }                                            
                                   

    public static boolean isNumber(String s) {
        try { 
        	Double.parseDouble(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // DO NOTHING
    }                                          

   
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
            java.util.logging.Logger.getLogger(JFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameForm().setVisible(true);
            }
        });
    }
    
    public void resultSetToTable() {
        jTable1.setModel(DbUtils.resultSetToTableModel(this.rs));
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField query1Input1;
    private javax.swing.JLabel query1Input1Label;
    private javax.swing.JLabel query1Input1Label1;
    private javax.swing.JLabel query1Input1Label2;
    private javax.swing.JLabel query1Input1Label3;
    private javax.swing.JLabel query1Input1Label4;
    private javax.swing.JButton query2Button;
    private javax.swing.JTextField query2Input1;
    private javax.swing.JLabel query2Input1Label;
    private javax.swing.JButton query3Button;
    private javax.swing.JTextField query3Input1;
    private javax.swing.JLabel query3Input1Label;
    private javax.swing.JButton query4Button;
    private javax.swing.JLabel query4Input1Label;
    private javax.swing.JButton queryOneButton;
    // End of variables declaration                   
    private ResultSet rs;
}
