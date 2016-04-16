


package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yadir
 */
public class Metodos_Pretamos_Libros {
    
    ArrayList<Prestamos_Libros> arrayPrestamos;
    String arregloInformacionConsultada[]=new String[4];
    
    public Metodos_Pretamos_Libros()
    {
        arrayPrestamos=new ArrayList<Prestamos_Libros>();
    }
 /*************************************************/
    /*ESTE ES EL METODO PARA AGREGAR EL PRESTAMO, 
    EL ARREGLO QUE LE ENTRA POR PARAMETROS ES EL QUE CONTENIENE LA INFORMACION ESTABLECIDA POR EL USUARIO
    EN LOS TEXTFIELDS
    */
     public void agregarPrestamo(String[] arreglo)
     {
         Prestamos_Libros temporal=new Prestamos_Libros(arreglo[0], arreglo[1], arreglo[2], arreglo[3]);
         arrayPrestamos.add(temporal);
         JOptionPane.showMessageDialog(null, "El prestamo del libro se ha agregado con éxito");
         
         
     }
 /***************************************************/
     /*ESTE METODO CONSISTE EN VERIFICAR SI EL PRESTAMO,POR MEDIO DEL NUMERO DE REGISTRO EXISTE
     
     */
     public boolean consultar(String numeroPrestamo)
     {
       boolean existe=false;
         
       for(int i=0;i<arrayPrestamos.size();i++)
       {
           if(arrayPrestamos.get(i).getNumeroPrestamo().equals(numeroPrestamo))
           {
               arregloInformacionConsultada[1]=arrayPrestamos.get(i).getNombreUsuario();
               arregloInformacionConsultada[2]=arrayPrestamos.get(i).getCedulaUsuario();
               arregloInformacionConsultada[3]=arrayPrestamos.get(i).getCodigoLibro();
               
               existe=true;
           }
       }
           return existe;
     
     }
 /****************************************************/
     /*ESTE METODO CONSISTE EN MODOFICAR LOS ATRIBUTOS DE UN PRESTAMO YA REGISTRADO, EXCEPTO EL NUMERO DE PRESTAMO
        ES ARREGLO QUE LE ENTRA POR PARAMETRO CONTIENE LA DATOS ACTUALIZADOS EN LOS TEXTFIELDS, ESTABLECIDOS 
       USUARIO
     */
     public void modificarPrestamo(String[] arreglo)
     {
      
         for(int i=0;i<arrayPrestamos.size();i++)
         {
             if(arrayPrestamos.get(i).getNumeroPrestamo().equals(arreglo[0]))
             {
                 arrayPrestamos.get(i).setNombreUsuario(arreglo[1]);
                 arrayPrestamos.get(i).setCedulaUsuario(arreglo[2]);
                 arrayPrestamos.get(i).setCodigoLibro(arreglo[3]);
                 
                 JOptionPane.showMessageDialog(null, "El prestamo del libro ha sido modificado");
             }
         }
         
     }
 /******************************************************/
     /*ESTE METODO ELIMINA UN PRESTAMO YA REGISTRADO, Y LO HACE POR MEDIO DEL NUMERO DE PRESTAMO
     
     */
     public void eliminarPrestamo(String numeroPrestamo)
     {
         
         for(int i=0;i<arrayPrestamos.size();i++)
         {
             if(arrayPrestamos.get(i).getNumeroPrestamo().equals(numeroPrestamo))
             {
                 arrayPrestamos.remove(i);
                 JOptionPane.showMessageDialog(null, "El prestamo del libro ha sido eliminado");
             }
         }
     }
 /*****************************************************/
     //RETORNA EL ARRAY DE LOS PRESTAMOS
     
     public ArrayList<Prestamos_Libros> getArrayPrestamos()
     {
         return this.arrayPrestamos;
     }
/******************************************************/
   //ESTE METODO RETORNA EL ARREGLO DE LA INFORMACION CONSULTADA
     
     public String[] getArregloInformacionConsultada()
     {
         return this.arregloInformacionConsultada;
     }
/*****************************************************/
/*ESTE METODO GENERA DE FORMA AUTOMATICA EL NUMERO DE PRESTAMO

     */     
       public String generarNumero()
    {   String numero="00";
       int num=(arrayPrestamos.size()+1);
       numero+=num;
          if(num>9)
          {
             numero="0" + num;
             
          }
          else
          {
              if(num>99)
              {
                  numero=""+num;
              }
          }
        return numero;
    }
       
     
    
}
