



package Modelo;

/**
 *
 * @author yadir
 */
public class Prestamos_Libros {
    
    private String numeroPrestamo;
    private String nombreUsuario;
    private String cedulaUsuario;
    private String codigoLibro;

    public Prestamos_Libros(String numeroPrestamo, String nombreUsuario, String cedulaUsuario, String codigoLibro) {
        this.numeroPrestamo = numeroPrestamo;
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.codigoLibro = codigoLibro;
    }

    /**
     * @return the numeroPrestamo
     */
    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    /**
     * @param numeroPrestamo the numeroPrestamo to set
     */
    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the cedulaUsuario
     */
    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    /**
     * @param cedulaUsuario the cedulaUsuario to set
     */
    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    /**
     * @return the codigoLibro
     */
    public String getCodigoLibro() {
        return codigoLibro;
    }

    /**
     * @param codigoLibro the codigoLibro to set
     */
    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }
    
    
}
