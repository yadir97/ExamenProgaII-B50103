




package Vista;

import Controlador.Controlador_FRM_VentanaPrincipal;






/**
 *
 * @author yadir
 */
public class FRM_VentanaPrincipal extends javax.swing.JFrame {

    Controlador_FRM_VentanaPrincipal controlador;
    
    public FRM_VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        
        controlador=new Controlador_FRM_VentanaPrincipal(this);
        agregarEventos();
        estadoBotonesInicio();
        deshabilitarCampos();
    }
    
/******************************************/
    
    public void agregarEventos()
    {
      this.panel_Botones1.agregarEventos(controlador);
    }
    public void establecerInformacionCampos(String[] arreglo)
    {
        this.panel_Informacion1.establecerInformacionCampos(arreglo);
    }
    public void estblecerNumeroPrestamo(String numero)
    {
        this.panel_Informacion1.estblecerNumeroPrestamo(numero);
    }
            
    public void habilitarCampos()
    {
        this.panel_Informacion1.habilitarCampos();
    }
    public void deshabilitarCampos()
    {
        this.panel_Informacion1.deshabilitarCampos();
    }
    public boolean comprobarCamposVacios()
    {
        return this.panel_Informacion1.comprobarCamposVacios();
    }
    public String[] devolverInformacio()
    {
        return this.panel_Informacion1.devolverInformacio();
    }
    public String getNumeroDePrestamo()
    {
        return this.panel_Informacion1.getNumeroDePrestamo();
    }
    public void limpiarCampos()
    {
        this.panel_Informacion1.limpiarCampos();
    }
    public void habilitarAgregar()
    {
        this.panel_Botones1.habilitarAgregar();
    }
    public void habilitarModificarEliminar()
    {
        this.panel_Botones1.habilitarModificarEliminar();
    }
    public void estadoBotonesInicio()
    {
        this.panel_Botones1.estadoBotonesInicio();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Botones1 = new Vista.Panel_Botones();
        panel_Informacion1 = new Vista.Panel_Informacion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_Informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panel_Informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.Panel_Botones panel_Botones1;
    private Vista.Panel_Informacion panel_Informacion1;
    // End of variables declaration//GEN-END:variables
}
