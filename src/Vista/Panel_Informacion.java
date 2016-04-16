/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author yadir
 */
public class Panel_Informacion extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Informacion
     */
    public Panel_Informacion() {
        initComponents();
    }
/******************************/
    /*ESTE METODO LO QUE HACE ES QUE CUANDO SE DESEA REGISTRA UN PRESTAMO, TOMA LA INFORMACION CONTENIDA
     *EN LOS TEXTFIELD Y LOS GUARDA EN UN ARREGLO, EL CUAL SE ESTBLECERA EN EN EL PARAMENTRO DEL METODO AGREGAR
     */
    public String[] devolverInformacio()
    {
        String arreglo[]=new String[4];
        arreglo[0]=this.txt_NumeroPrestamo.getText();
        arreglo[1]=this.txt_NombreUsuario.getText();
        arreglo[2]=this.txt_CedulaUsuario.getText();
        arreglo[3]=this.txt_ISBN_Libro.getText();
        
        return arreglo;
        
    }
/**************************************************************/
/*ESTE METODO CONSISTE EN QUE EL ARREGLO QUE LE ENTRA POR PARAMETRO, EL CUAL ES EL DE "arregloInformacionConsultada",
 *ENTONCES LA INFORMACION CONTENIDA EN DICHO ARREGLO ES ESTBLECIDA EN LOS RESPECTIVOS TEXTFIELDS
 */    
    public void establecerInformacionCampos(String[] arreglo)
    {
        this.txt_NombreUsuario.setText(arreglo[1]);
        this.txt_CedulaUsuario.setText(arreglo[2]);
        this.txt_ISBN_Libro.setText(arreglo[3]);
    }
 /***************************************************************/
    /*ESTE METODO CONSISTE EN DESHABILITAR LOS CAMPOS DE NOMBRE DE USUARIO,CEDULA DEL MISMO Y EL ISBN DEL LIBRO
     *A LA HORA DE EJECUTAR EL PROGRAMA
     */
    
    public void deshabilitarCampos()
    {
        this.txt_NombreUsuario.setEditable(false);
        this.txt_CedulaUsuario.setEditable(false);
        this.txt_ISBN_Libro.setEditable(false);
    }
  /************************************************************/
    /*ESTE METODO HABILITA LOS CAMPOS DE TEXTO A LA HORA QUE USUARIO CONSULTA
    *
    */
    public void habilitarCampos()
    {
          this.txt_NombreUsuario.setEditable(true);
        this.txt_CedulaUsuario.setEditable(true);
        this.txt_ISBN_Libro.setEditable(true);
    }
  /**************************************************************/
    /*ESTE METODO LIMPIA LOS CAMPOS DE TEXTO
    *
    */
    public void limpiarCampos()
    {
        this.txt_NumeroPrestamo.setText("");
        this.txt_NombreUsuario.setText("");
        this.txt_CedulaUsuario.setText("");
        this.txt_ISBN_Libro.setText("");
        
        this.txt_NumeroPrestamo.requestFocus();
      
    }
  /***************************************************************/
    /*ESTE METODO COMPRUEBA SI EXISTE ALGUN CAMPO VACIO, ESTO A LA HORA DE AGREGAR UN PRESTAMO,EN 
    EL CASO QUE EXISTA ALGUN CAMPO VACIO NO PODRA AGREGAR EL PRESTAMMO
    */
    public boolean comprobarCamposVacios()
    {
        boolean existen=false;
        String compara="";
        if(this.txt_NumeroPrestamo.getText().equals(compara)||this.txt_NombreUsuario.getText().equals(compara)
          || this.txt_CedulaUsuario.getText().equals(compara) ||this.txt_ISBN_Libro.getText().equals(compara))
        {
           existen=true; 
        }
        return existen;
    }
  /*********************************************************/ 
    /*ESTE METODO GENERA Y RETORNA EL NUMERO DE PRESTAMO DE MANERA AUTOMATICA
    
    */
    public String getNumeroDePrestamo()
    {
        return this.txt_NumeroPrestamo.getText();
    }
    public void estblecerNumeroPrestamo(String numero)
    {
        this.txt_NumeroPrestamo.setText(numero);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_ISBN_Libro = new javax.swing.JLabel();
        jl_CedulaUsuario = new javax.swing.JLabel();
        jl_NombreUsuario = new javax.swing.JLabel();
        jl_NumeroPrestamo = new javax.swing.JLabel();
        txt_ISBN_Libro = new javax.swing.JTextField();
        txt_CedulaUsuario = new javax.swing.JTextField();
        txt_NumeroPrestamo = new javax.swing.JTextField();
        txt_NombreUsuario = new javax.swing.JTextField();

        jl_ISBN_Libro.setText("ISBN del Libro:");

        jl_CedulaUsuario.setText("Cédula del Usuario:");

        jl_NombreUsuario.setText("Nombre Usuario:");

        jl_NumeroPrestamo.setText("Número de Préstamo:");

        txt_CedulaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CedulaUsuarioActionPerformed(evt);
            }
        });

        txt_NumeroPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_NumeroPrestamoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_NumeroPrestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_CedulaUsuario)
                            .addComponent(jl_ISBN_Libro)
                            .addComponent(jl_NombreUsuario))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NombreUsuario)
                            .addComponent(txt_CedulaUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_ISBN_Libro, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NumeroPrestamo)
                    .addComponent(txt_NumeroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreUsuario)
                    .addComponent(txt_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CedulaUsuario)
                    .addComponent(txt_CedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_ISBN_Libro)
                    .addComponent(txt_ISBN_Libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_CedulaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CedulaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CedulaUsuarioActionPerformed

    private void txt_NumeroPrestamoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NumeroPrestamoKeyPressed

      if(evt.getKeyCode()==10)
      {
          
          //JOptionPane.showMessageDialog(null, "Sirve");
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NumeroPrestamoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CedulaUsuario;
    private javax.swing.JLabel jl_ISBN_Libro;
    private javax.swing.JLabel jl_NombreUsuario;
    private javax.swing.JLabel jl_NumeroPrestamo;
    private javax.swing.JTextField txt_CedulaUsuario;
    private javax.swing.JTextField txt_ISBN_Libro;
    private javax.swing.JTextField txt_NombreUsuario;
    private javax.swing.JTextField txt_NumeroPrestamo;
    // End of variables declaration//GEN-END:variables
}
