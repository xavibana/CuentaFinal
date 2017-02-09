
/**
 * @author Xavier Baños i Navarro
 * @version 1.0 26 JAN 2017
 */
package act4;


public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;


    public CCuenta ()
    {
    }

    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
   
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    
    public String obtenerNombre()
    {
        return nombre;
    }


     public double estado ()
    {
        return saldo;
    }

/**
 * 
 * @param cantidad quantitat de diners que vols ingresar
 * @throws CantidadNegativaException si la quantitat es negativa salta aquesta excepcio
 */
    public void ingresar(double cantidad) throws CantidadNegativaException
    {
        if (cantidad<0)
            throw new CantidadNegativaException();
        saldo = saldo + cantidad;
    }

 /**
  * 
  * @param cantidad Quantitat de diners que vols retirar
  * @throws CantidadNegativaException si introdueixes un numero negatiu salta aquesta excepcio
  * @throws SaldoNegativoException sino tens diners al compte salta aquesta excepcio
  */
    public void retirar (double cantidad) throws CantidadNegativaException, SaldoNegativoException   {
        if (cantidad < 0){
            throw new CantidadNegativaException();
        }else if (saldo< cantidad){
            throw new SaldoNegativoException();
            }else
    	saldo = saldo - cantidad;
            }


    public String obtenerCuenta ()
    {
        return cuenta;
    }
}
