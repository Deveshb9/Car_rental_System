
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class booking1 extends javax.swing.JFrame {

    /** Creates new form booking1 */
    public booking1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nametf = new javax.swing.JTextField();
        dloctf = new javax.swing.JTextField();
        timetf = new javax.swing.JTextField();
        ploctf = new javax.swing.JTextField();
        datetf = new javax.swing.JTextField();
        nofdays = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 11)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 100, 70, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DROPOFF LOCATION");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 160, 130, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("   PICKUP TIME ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 220, 90, 20);

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 11)); // NOI18N
        jLabel5.setText("PICKUP LOCATION");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 100, 130, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("PICKUP DATE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 160, 100, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("NUMBER OF DAYS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 220, 120, 20);

        jButton1.setText("Proceed to billing");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 300, 160, 30);

        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 300, 90, 30);
        getContentPane().add(nametf);
        nametf.setBounds(150, 100, 110, 20);
        getContentPane().add(dloctf);
        dloctf.setBounds(470, 160, 110, 20);

        timetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetfActionPerformed(evt);
            }
        });
        getContentPane().add(timetf);
        timetf.setBounds(150, 220, 110, 20);
        getContentPane().add(ploctf);
        ploctf.setBounds(470, 100, 110, 20);

        datetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetfActionPerformed(evt);
            }
        });
        getContentPane().add(datetf);
        datetf.setBounds(150, 160, 110, 20);

        nofdays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nofdaysActionPerformed(evt);
            }
        });
        getContentPane().add(nofdays);
        nofdays.setBounds(470, 220, 110, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESERVAION.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 650, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static String name,Ddate;
public static String ploc ;
public static String dloc;
public static String ptime;
public static int n,booking_id;
public static int c;
public static int date;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
name=nametf.getText();
ploc= ploctf.getText();
dloc=dloctf.getText();
ptime= timetf.getText();
String s=nofdays.getText();
n=Integer.parseInt(s);
Ddate=datetf.getText();
//date=Integer.parseInt(Ddate);


try
    {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root" , "deva321");
         
         /*Statement stmt1 = (Statement)con.createStatement();
         String query1 = "select count(client_id) from bookings;";
         ResultSet rs=stmt1.executeQuery(query1);
         while(rs.next())
         {
             booking_id=rs.getInt(1);
         }
         booking_id++;*/
         Statement stmt = (Statement)con.createStatement();
        String query = "INSERT INTO booking VALUES ('"+name+"', '"+cars.carname+"', '"+ploc+"', '"+dloc+"',  '"+Ddate+"', '"+ptime+"', '"+n+"' );";
        stmt.executeUpdate(query);
        
    }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(this , e.getMessage());
     }
JOptionPane.showMessageDialog(this,"Booking succesful");
this.dispose();
new bill().setVisible(true);

      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new login1().setVisible(true);


    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nofdaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nofdaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nofdaysActionPerformed

    private void datetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datetfActionPerformed

    private void timetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timetfActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField datetf;
    private javax.swing.JTextField dloctf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField nofdays;
    private javax.swing.JTextField ploctf;
    private javax.swing.JTextField timetf;
    // End of variables declaration//GEN-END:variables

}
