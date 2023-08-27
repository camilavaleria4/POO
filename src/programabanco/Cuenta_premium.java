package programabanco;

public class Cuenta_premium {
    String numero_cuenta;
    String nombre;
    Ahorro ahorro;
    
    public Cuenta_premium(){
        nombre="Cuenta premium";
    }
    
    public Cuenta_premium(String numero_cuenta, String nombre, int monto){
        this.numero_cuenta=numero_cuenta;
        this.nombre=nombre;
        this.ahorro=new Ahorro(monto);
    }
    public double setdeposito(int monto_op){
        return ahorro.setdeposito(monto_op);
    }
    
    public void imprimir_interes(){
        System.out.println("Nuevo interes: "+ ahorro.cuenta_premium());
    }
    
    public void imprimir_datos(){
        System.out.println("Numero de cuenta: " + numero_cuenta);
        System.out.println("Nombre de la cuenta: " + nombre);
        System.out.println("Monto de la cuenta: " + ahorro.getmonto());
        System.out.println("Interes de la cuenta: " + ahorro.cuenta_premium());
    }
}
