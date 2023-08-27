package programabanco;

public class ProgramaBanco {

    public static void main(String[] args) {
        Cuenta_premium cuenta_uno= new Cuenta_premium("111111", "Cuenta premium", 10000);
        cuenta_uno.imprimir_datos();
        cuenta_uno.setdeposito(5000);
        cuenta_uno.imprimir_interes();
        
    }
    
}
