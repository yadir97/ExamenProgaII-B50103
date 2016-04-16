



package Vista;

import Controlador.Controlador_FRM_VentanaPrincipal;

/**
 *
 * @author yadir
 */
public class Panel_Botones extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Botones
     */
    public Panel_Botones() {
        initComponents();
        
    }
/*******************************/
   public void agregarEventos(Controlador_FRM_VentanaPrincipal controlador)
   {
       this.btn_Agregar.addActionListener(controlador);
       this.btn_Consultar.addActionListener(controlador);
       this.btn_Modificar.addActionListener(controlador);
       this.btn_Eliminar.addActionListener(controlador);
   }
/*****************************************************************/   
   
   /*ESTE METODO HACE QUE LOS BOTONES DE AGREGAR,MODIFICAR Y ELMINAR ESTEN INHABILITADOS CUANDO
   *SE EJECUTE EL PROGRAMA
   */
   public void estadoBotonesInicio()
   {
    this.btn_Agregar.setEnabled(false);
    this.btn_Modificar.setEnabled(false);
    this.btn_Eliminar.setEnabled(false);
   }
/*******************************************************************/
//HABILITA EL BOTON DE AGREGAR DESPUES DE COLSUTAR   
   public void habilitarAgregar()
   {
       this.btn_Agregar.setEnabled(true);
       
   }
/*******************************************************************/
//DESHABILITA EL BOTON AGREGAR   
   public void deshabilitarAgregar()
   {
       this.btn_Agregar.setEnabled(false);
   }
/*******************************************************************/
/*HABILITA LOS BOTONES DE MODIFICAR Y ELIMINAR UNA VEZ QUE SE HAYA CONSULTADO Y EFCTIVAMENTE EXISTA, 
 *ALGUN PRESTAMO REGISTRADO
 */   
   public void habilitarModificarEliminar()
   {
       this.btn_Modificar.setEnabled(true);
       this.btn_Eliminar.setEnabled(true);
   }
  
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Eliminar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Consultar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Modificar.setText("Modificar");

        btn_Consultar.setText("Consultar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });
        btn_Consultar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Intro(evt);
            }
        });

        btn_Agregar.setText("Agregar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btn_Agregar)
                .addGap(30, 30, 30)
                .addComponent(btn_Consultar)
                .addGap(32, 32, 32)
                .addComponent(btn_Modificar)
                .addGap(30, 30, 30)
                .addComponent(btn_Eliminar)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Eliminar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Consultar)
                    .addComponent(btn_Agregar))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void Intro(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Intro
        // TODO add your handling code here:
    }//GEN-LAST:event_Intro


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}
