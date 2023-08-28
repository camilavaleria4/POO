
package programabanco;
public class Ahorro {
    private double monto;
    private double interes;

    public Ahorro(int monto){
            this.monto=monto;
    }
    public double cuenta_de_ahorro(){
        if(monto<10000){
            interes=1;
        }else
        {
            if(monto>=10000 && monto<15000){
                interes=2;
            } else {
                    if(monto>=15000 && monto<20000){
                        interes=3;
                    }else
                        {if(monto>=20000 && monto<25000){
                            interes=5;
                        }else
                        {interes=7;}}}}
        return interes;
    }
    public double cuenta_sueldo(){
        if(monto<10000){
            interes=3;
        }else
        {
            if(monto>=10000 && monto<15000){
                interes=5;
            } else {
                    if(monto>=15000 && monto<20000){
                        interes=7;
                    }else
                        {if(monto>=20000 && monto<25000){
                            interes=9;
                        }else
                        {interes=11;}}}}
        return interes;
    }
    public double cuenta_premium(){
        if(monto<10000){
            interes=3.5;
        }else
        {
            if(monto>=10000 && monto<15000){
                interes=6;
            } else {
                    if(monto>=15000 && monto<20000){
                        interes=7.5;
                    }else
                        {if(monto>=20000 && monto<25000){
                            interes=10;
                        }else
                        {interes=12.5;}}}}
        return interes;
    }
    public double setdeposito(float monto_op){
        monto=monto+monto_op;
        System.out.println("Deposito: "+monto_op);
        System.out.println("Monto final: "+monto);
        return monto;
    }
    public double setretiro(int monto_op){
        if (monto_op<=monto){
        monto=monto-monto_op;
        System.out.println("Retiro: "+monto_op);
        System.out.println("Monto final: "+monto);
        } else {
            System.out.println("La cantidad que desea retirar excede al monto actual de su cuenta");
        } 
        return monto;
    }
    public double getmonto(){
        return monto;
    }
}