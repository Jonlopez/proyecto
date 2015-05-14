
package vista;

import javax.swing.JOptionPane;
import udalekuak.Control;
import uml.CentroEd;
import uml.Inscripcion;
import uml.Solicitud;
import uml.Tutor;

/**
 *
 * @author javi&Jon 
 */
public class Sinscripcion extends javax.swing.JDialog {

    private umldirecciones.Direccion direccion;
    private int contador;
    private Inscripcion inscrip;
    private Solicitud sol;
    private CentroEd centro;
    
    /**
     * Creates new form Sinscripcion
     */
    public Sinscripcion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Solicitud de inscripción");
        contador = 1;
        sol = Control.creaSolicitud();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgsexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfDniT = new javax.swing.JTextField();
        tfNombreT = new javax.swing.JTextField();
        tfApelpT = new javax.swing.JTextField();
        tfApelsT = new javax.swing.JTextField();
        bDireccion = new javax.swing.JButton();
        chbTelf1 = new java.awt.Checkbox();
        chbTelf2 = new java.awt.Checkbox();
        chbTelf3 = new java.awt.Checkbox();
        chbTelf4 = new java.awt.Checkbox();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDireccion = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfDniM = new javax.swing.JTextField();
        tfNombreM = new javax.swing.JTextField();
        tfApelpM = new javax.swing.JTextField();
        tfApelsM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rbHombre = new javax.swing.JRadioButton();
        rbMujer = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        chbDiscapacidad = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        cbCentro = new javax.swing.JComboBox();
        ftfFechaNac = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        ftfModelo = new javax.swing.JFormattedTextField();
        blimpiar = new javax.swing.JButton();
        bParticipante = new javax.swing.JButton();
        bFinalizar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jLabel1.setText("Solicitud de Inscripción");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 2, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Datos del padre/madre o tutor");

        jLabel3.setText("DNI");

        jLabel4.setText("nombre");

        jLabel5.setText("primer apellido");

        jLabel6.setText("segundo apellido");

        bDireccion.setText("Direccón");
        bDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDireccionActionPerformed(evt);
            }
        });

        chbTelf1.setLabel("Telefono 1");

        chbTelf2.setLabel("Telefono 2");

        chbTelf3.setLabel("Telefono 3");

        chbTelf4.setLabel("Telefono 4");

        taDireccion.setColumns(20);
        taDireccion.setRows(5);
        jScrollPane1.setViewportView(taDireccion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(bDireccion))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfApelpT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                                .addComponent(tfNombreT, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDniT, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(tfApelsT, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chbTelf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(chbTelf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(chbTelf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(chbTelf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDniT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfApelpT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfApelsT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bDireccion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chbTelf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbTelf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbTelf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbTelf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 2, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Datos del menor");

        jLabel8.setText("DNI");

        jLabel9.setText("nombre");

        jLabel10.setText("primer apellido");

        jLabel11.setText("Segundo apellido");

        jLabel12.setText("sexo");

        bgsexo.add(rbHombre);
        rbHombre.setText("Hombre");

        bgsexo.add(rbMujer);
        rbMujer.setText("Mujer");

        jLabel13.setText("Fecha de nacimiento");

        chbDiscapacidad.setText("Discapacidad");

        jLabel14.setText("Centro de ensañanza");

        cbCentro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ftfFechaNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel15.setText("Modelo");

        try {
            ftfModelo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("?")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(chbDiscapacidad)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel12)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbHombre)
                                .addGap(38, 38, 38)
                                .addComponent(rbMujer))
                            .addComponent(tfDniM)
                            .addComponent(tfNombreM)
                            .addComponent(tfApelpM)
                            .addComponent(tfApelsM)
                            .addComponent(cbCentro, 0, 406, Short.MAX_VALUE)
                            .addComponent(ftfFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDniM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfApelpM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfApelsM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rbHombre)
                    .addComponent(rbMujer))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ftfFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbDiscapacidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ftfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        blimpiar.setText("Limpiar");

        bParticipante.setText("Añadir participante");
        bParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bParticipanteActionPerformed(evt);
            }
        });

        bFinalizar.setText("Finalizar");
        bFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFinalizarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blimpiar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bParticipante)
                                    .addGap(18, 18, 18)
                                    .addComponent(bFinalizar))
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(blimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFinalizar)
                    .addComponent(bParticipante)
                    .addComponent(bCancelar))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        ControlVistas.cerrarDialogo(this);
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDireccionActionPerformed
        direccion = controldirecciones.Control.devuelveDireccion(this, true);
         //Esta linea es para comprobar el objeto direccion que devuelve
        javax.swing.JOptionPane.showMessageDialog(null, direccion.toString());
       
    }//GEN-LAST:event_bDireccionActionPerformed
/**
 * Se añade un nuevo participante a la solictud
 * @param evt 
 */
    private void bParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bParticipanteActionPerformed
        //valida los datos del formulario 
        if(validaDatos())
        {   
            //es y correcto procede a guardar datos
            //crea inscripcion
            inscrip = Control.creaInscripcion();
            //anade id inscripcion
            inscrip.setIdIns(contador);
            contador ++;
            //anade solicitud 
            inscrip.setSolicitud(sol);
            //anade direccion
            inscrip.setDireccion(direccion);
            //si tutor no existe
            Tutor t = Control.buscaTutor(this.tfDniT.toString());
            if(t==null)
            {
                //anade tutor pasandole los datos del formulario
                inscrip.setTutor(
                        this.tfDniT.getText(),
                        this.tfNombreT.getText(),
                        this.tfApelpT.getText(),
                        this.tfApelsT.getText()
                );
            //si tutor existe
            }else
            {
                //anade el tutor buscado anteriormente
                inscrip.setTutor(t);
            }
            
            //averigua el sexo
            char sexo;
            if(rbHombre.isSelected())
                sexo = 'H';
            else
                sexo = 'M';
            //gurada los datos anadiendo un menor a la inscripcion
            inscrip.setMenor(
                    this.tfDniM.getText(),
                    this.tfNombreM.getText(),
                    this.tfApelpM.getText(),
                    this.tfApelsM.getText(),
                    sexo,
                    this.ftfFechaNac.getText(),
                    this.chbDiscapacidad.isSelected(),
                    this.ftfModelo.getText().charAt(0),
                    centro                
            );
            //anade los telefonos
            inscrip.setTelf1(this.tfTelef1);
            inscrip.setTelf2(this.tfTelef2);
            inscrip.setTelf3(this.tfTelef3);
            inscrip.setTelf4(this.tfTelef4);
            //inscripcion ya esta completa
            
            
        }
        //si no es correcto, muestra el mensaje correspondiente y no hace nada
        limpiar();
        //comprueba cuantas inscripciones hay ya en la solicitud
        //cuando hay dos inscripciones deshabilita el boton anadir participante
        compruebaCantidadInscripciones();
        ;
    }//GEN-LAST:event_bParticipanteActionPerformed

    private void bFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFinalizarActionPerformed
       try
       {
           udalekuak.Control.finalizarSolicitud(this,inscrip,sol);
       }
       catch (Exception e) {
            ControlVistas.enviarMensaje("Fallo al guardar la solicitud");
        }
    }//GEN-LAST:event_bFinalizarActionPerformed

/**
 * Se pide confirmación para conservar los datos del tutor
 * o borrarlos
 * @return 
 */
    private void limpiar(){
       int conf = JOptionPane.showConfirmDialog(null, "Desea conservar los datos de tutor");
       if(conf==0)
           limpiarMenor();
       if(conf==1){
           limpiarMenor();
           limpiarTutor();
       }
    }
    
    /**
     * Valida los datos del formulario antes de proceder a guardar los datos
     */
    private boolean validaDatos()
    {
        boolean validacion = true;
        
        //aqui van todas las validaciones
        
        //se puede hacer un metodo para cada una y aqui llamarlos a todos
        
        return validacion;
    }
/**
 * Se limpian los campos del panel de menor
 */  
    private void limpiarMenor(){
        tfNombreM.setText(null);
        tfApelpM.setText(null);
        tfApelsM.setText(null);
        tfDniM.setText(null);
        ftfFechaNac.setText(null);
        
    }
/**
 * Se limpian los campos del panel de tutor
 */    
    private void limpiarTutor(){
        tfNombreT.setText(null);
        tfApelpT.setText(null);
        tfApelsT.setText(null);
        tfDniT.setText(null);        
    }
/**
 * Se cuentan los participantes insertados 
 * para deshabilitar el boton de añadir otro
 */    
    private void compruebaCantidadInscripciones(){               
        if(contador==2){
          bParticipante.setEnabled(false); 
        }            
        else contador =  contador+1;
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
            java.util.logging.Logger.getLogger(Sinscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sinscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sinscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sinscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sinscripcion dialog = new Sinscripcion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bDireccion;
    private javax.swing.JButton bFinalizar;
    private javax.swing.JButton bParticipante;
    private javax.swing.ButtonGroup bgsexo;
    private javax.swing.JButton blimpiar;
    private javax.swing.JComboBox cbCentro;
    private javax.swing.JCheckBox chbDiscapacidad;
    private java.awt.Checkbox chbTelf1;
    private java.awt.Checkbox chbTelf2;
    private java.awt.Checkbox chbTelf3;
    private java.awt.Checkbox chbTelf4;
    private javax.swing.JFormattedTextField ftfFechaNac;
    private javax.swing.JFormattedTextField ftfModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbHombre;
    private javax.swing.JRadioButton rbMujer;
    private javax.swing.JTextArea taDireccion;
    private javax.swing.JTextField tfApelpM;
    private javax.swing.JTextField tfApelpT;
    private javax.swing.JTextField tfApelsM;
    private javax.swing.JTextField tfApelsT;
    private javax.swing.JTextField tfDniM;
    private javax.swing.JTextField tfDniT;
    private javax.swing.JTextField tfNombreM;
    private javax.swing.JTextField tfNombreT;
    // End of variables declaration//GEN-END:variables
}
