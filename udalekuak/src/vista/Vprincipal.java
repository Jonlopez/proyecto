
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author javi&Jon
 */
public class Vprincipal extends javax.swing.JFrame {

    /**
     * Creates new form Vprincipal
     */
    public Vprincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        deshabilitarMenus();
    }
/**
 * deshabilita los menus de Usuario administrador
 */
    private void deshabilitarMenus(){
        mConfiguracion.setEnabled(false);
        mSorteo.setEnabled(false);
        bLogOut.setEnabled(false);
    }
    
    public void habilitarMenus(){
        mConfiguracion.setEnabled(true);
        mSorteo.setEnabled(true);
        bLogin.setEnabled(false);
        bLogOut.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bLogin = new javax.swing.JButton();
        bLogOut = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mConfiguracion = new javax.swing.JMenuItem();
        mSorteo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mInscripcion = new javax.swing.JMenuItem();
        mConsultaIns = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mListPrevio = new javax.swing.JMenuItem();
        mListPost = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bLogin.setText("LogIn ");
        bLogin.setFocusable(false);
        bLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        bLogOut.setText("LogOut");
        bLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogOutActionPerformed(evt);
            }
        });

        jMenu1.setText("Administración");

        mConfiguracion.setText("Configuración");
        mConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConfiguracionActionPerformed(evt);
            }
        });
        jMenu1.add(mConfiguracion);

        mSorteo.setText("Sorteo");
        mSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSorteoActionPerformed(evt);
            }
        });
        jMenu1.add(mSorteo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inscripción");

        mInscripcion.setText("Realizar Inscripción");
        mInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInscripcionActionPerformed(evt);
            }
        });
        jMenu2.add(mInscripcion);

        mConsultaIns.setText("Consultar Inscripción");
        mConsultaIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsultaInsActionPerformed(evt);
            }
        });
        jMenu2.add(mConsultaIns);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Listados");

        mListPrevio.setText("Listado Previo");
        mListPrevio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListPrevioActionPerformed(evt);
            }
        });
        jMenu3.add(mListPrevio);

        mListPost.setText("Listado Posterior");
        mListPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListPostActionPerformed(evt);
            }
        });
        jMenu3.add(mListPost);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salir");

        jMenuItem3.setText("Salir del programa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 1111, Short.MAX_VALUE)
                .addComponent(bLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bLogOut))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bLogin)
                    .addComponent(bLogOut))
                .addGap(0, 755, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInscripcionActionPerformed
        ControlVistas.muestraInscripcion();
    }//GEN-LAST:event_mInscripcionActionPerformed

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
       try{
           ControlVistas.muestraLogin();
       }
         catch(Exception e){
             JOptionPane.showMessageDialog(this, e.getMessage());
         }  
    }//GEN-LAST:event_bLoginActionPerformed

    private void bLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogOutActionPerformed
        bLogin.setEnabled(true);
        deshabilitarMenus();
    }//GEN-LAST:event_bLogOutActionPerformed

    private void mConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConfiguracionActionPerformed
        ControlVistas.muestraConfig();
    }//GEN-LAST:event_mConfiguracionActionPerformed

    private void mSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSorteoActionPerformed
        ControlVistas.muestraSorteo();
    }//GEN-LAST:event_mSorteoActionPerformed

    private void mConsultaInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsultaInsActionPerformed
        ControlVistas.muestraConsultaSol();
    }//GEN-LAST:event_mConsultaInsActionPerformed

    private void mListPrevioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListPrevioActionPerformed
        ControlVistas.muestraListadoPrevio();
    }//GEN-LAST:event_mListPrevioActionPerformed

    private void mListPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListPostActionPerformed
        ControlVistas.muestraListadoPosterior();
    }//GEN-LAST:event_mListPostActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ControlVistas.salir();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogOut;
    private javax.swing.JButton bLogin;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mConfiguracion;
    private javax.swing.JMenuItem mConsultaIns;
    private javax.swing.JMenuItem mInscripcion;
    private javax.swing.JMenuItem mListPost;
    private javax.swing.JMenuItem mListPrevio;
    private javax.swing.JMenuItem mSorteo;
    // End of variables declaration//GEN-END:variables
}
