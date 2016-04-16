



package Controlador;

import Modelo.Metodos_Pretamos_Libros;
import Vista.FRM_VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author yadir
 */
public class Controlador_FRM_VentanaPrincipal implements ActionListener{
    
    FRM_VentanaPrincipal frm_VentanaPrincipal;
    public Metodos_Pretamos_Libros metodos;
    
    public Controlador_FRM_VentanaPrincipal(FRM_VentanaPrincipal frm_VentanaPrincipal)
    {
        this.frm_VentanaPrincipal=frm_VentanaPrincipal;
        metodos=new Metodos_Pretamos_Libros();
        frm_VentanaPrincipal.estblecerNumeroPrestamo(metodos.generarNumero());
    }
    
    
 /*********************************/
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Agregar"))
        {
            if(frm_VentanaPrincipal.comprobarCamposVacios())
            {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
            }
            else
            {
                metodos.agregarPrestamo(frm_VentanaPrincipal.devolverInformacio());
                frm_VentanaPrincipal.limpiarCampos();
                frm_VentanaPrincipal.estblecerNumeroPrestamo(metodos.generarNumero());
            }
        }
     /*********************/
        if(e.getActionCommand().equals("Consultar"))
        {
            
            if(metodos.consultar(frm_VentanaPrincipal.getNumeroDePrestamo()))
            {
                frm_VentanaPrincipal.establecerInformacionCampos(metodos.getArregloInformacionConsultada());
                frm_VentanaPrincipal.habilitarModificarEliminar();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El número de préstamo no existe");
                frm_VentanaPrincipal.habilitarAgregar();
                frm_VentanaPrincipal.habilitarCampos();
            }
            
        }
     /**********************/
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarPrestamo(frm_VentanaPrincipal.devolverInformacio());
            frm_VentanaPrincipal.limpiarCampos();
            frm_VentanaPrincipal.estadoBotonesInicio();
        }
     /**********************/
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarPrestamo(frm_VentanaPrincipal.getNumeroDePrestamo());
             frm_VentanaPrincipal.limpiarCampos();
            frm_VentanaPrincipal.estadoBotonesInicio();
        }
     
        
        
    }
   
}
