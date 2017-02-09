
/**
 * @author Xavier Baños i Navarro
 * @version 1.0 26 JAN 2017
 */
package act4;


public class Main {

   
    public static void main(String[] args) {
  
  
       double saldoActual=0;
	   double valorActual;
	   double valorAnterior;		
       float quant=0;

	
	 try{
		 CCuenta cuenta1 = new CCuenta("Juan LÃ³pez","1000-2365-85-123456789",2500,0);
		 saldoActual=operativaCuenta(cuenta1,saldoActual,quant);
		 cuenta1.ingresar(20.00);
		 cuenta1.retirar(500.00);
		 System.out.println("El saldo actual es "+ cuenta1.estado());
		 
	 }catch(CantidadNegativaException e){
		 System.out.println("La cantidad es negativa, lo siento, gastaremos todo su dinero en preferentes.");
	 }catch(SaldoNegativoException e){
		 System.out.println("Lo lamento pero eres pobre, no tienes dinero para extraer.");
	 }
	 
	 
	 
    }
    /**
     * 
     * @param c objeto cuenta
     * @param saldoAct saldo actual de la cuenta
     * @param quantitat cantidad.
     * @return
     */
    public static double operativaCuenta(CCuenta c,double saldoAct,float quantitat){
        saldoAct = c.estado();
        return saldoAct;
	   }

}
