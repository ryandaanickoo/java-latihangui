/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Hasil extends javax.swing.JFrame {

    /**
     * Creates new form Hasil
     */
    public Hasil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        absen = new javax.swing.JLabel();
        kelas = new javax.swing.JLabel();
        jurusan = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Pictures\\nnnj.jpeg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Hasil Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 0, 170, 60);

        nama.setText("Hasil1");
        getContentPane().add(nama);
        nama.setBounds(60, 70, 50, 30);

        absen.setText("Hasil2");
        getContentPane().add(absen);
        absen.setBounds(60, 100, 50, 40);

        kelas.setText("Hasil3");
        getContentPane().add(kelas);
        kelas.setBounds(60, 140, 50, 40);

        jurusan.setText("Hasil4");
        getContentPane().add(jurusan);
        jurusan.setBounds(60, 170, 50, 40);

        alamat.setText("Hasil5");
        getContentPane().add(alamat);
        alamat.setBounds(60, 210, 50, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hasil().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absen;
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jurusan;
    private javax.swing.JLabel kelas;
    private javax.swing.JLabel nama;
    // End of variables declaration//GEN-END:variables
}
