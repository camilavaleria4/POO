package programabanco;

public class ProgramaBanco {

    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("-------------------");
        Cuenta_premium cuenta_cero=new Cuenta_premium();
        cuenta_cero.imprimir_datos();
        
        System.out.println("-------------------");
        System.out.println("-------------------");
        
        Cuenta_premium cuenta_uno= new Cuenta_premium("111111", "Cuenta premium", 10000);
        cuenta_uno.imprimir_datos();
        System.out.println("-------------------");
        cuenta_uno.setdeposito(5000);
        cuenta_uno.imprimir_interes();
        System.out.println("-------------------");
        cuenta_uno.setretiro(300);
        cuenta_uno.imprimir_interes();
        
        System.out.println("-------------------");
        System.out.println("-------------------");
        
        Cuenta_de_ahorro cuenta_dos=new Cuenta_de_ahorro();
        cuenta_dos.imprimir_datos();
        System.out.println("-------------------");
        cuenta_dos.setdeposito(20000);
        cuenta_dos.imprimir_interes();
        System.out.println("-------------------");
        cuenta_dos.setretiro(4000);
        cuenta_dos.imprimir_interes();
        
        System.out.println("-------------------");
        System.out.println("-------------------");
        
        Cuenta_sueldo cuenta_tres= new Cuenta_sueldo("112345", "Cuenta sueldo", 700);
        cuenta_tres.imprimir_datos();
        System.out.println("-------------------");
        cuenta_tres.setdeposito(100);
        cuenta_tres.imprimir_interes();
        System.out.println("-------------------");
        cuenta_tres.setretiro(1000);
        cuenta_tres.imprimir_interes();
        
        System.out.println("-------------------");
        System.out.println("-------------------");
        
    }
    
}
