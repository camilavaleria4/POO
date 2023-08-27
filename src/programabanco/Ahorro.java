
package programabanco;
public class Ahorro {
    double monto;
    double interes;

    public Ahorro(int monto){
            this.monto=monto;
    }
    public double cuenta_de_ahorro(){
        if(monto<10000){
            interes=0.01;
        }else
        {
            if(monto>=10000 && monto<15000){
                interes=0.02;
            } else {
                    if(monto>=15000 && monto<20000){
                        interes=0.03;
                    }else
                        {if(monto>=20000 && monto<25000){
                            interes=0.05;
                        }else
                        {interes=0.07;}}}}
        System.out.println("Porcentaje de interes: " + interes +"%");
        return interes;
    }
    public double cuenta_sueldo(){
        if(monto<10000){
            interes=0.03;
        }else
        {
            if(monto>=10000 && monto<15000){
                interes=0.05;
            } else {
                    if(monto>=15000 && monto<20000){
                        interes=0.07;
                    }else
                        {if(monto>=20000 && monto<25000){
                            interes=0.09;
                        }else
                        {interes=0.11;}}}}
        return interes;
    }
    public double cuenta_premium(){
        if(monto<10000){
            interes=0.035;
        }else
        {
            if(monto>=10000 && monto<15000){
                interes=0.06;
            } else {
                    if(monto>=15000 && monto<20000){
                        interes=0.075;
                    }else
                        {if(monto>=20000 && monto<25000){
                            interes=0.1;
                        }else
                        {interes=0.125;}}}}
        return interes;
    }
    public double setdeposito(float monto_op){
        monto=monto+monto_op;
        System.out.println("Monto final: "+monto);
        return monto;
    }
    public double setretiro(int monto_op){
        monto=monto-monto_op;
        System.out.println("Monto final: "+monto);
        return monto;
    }
    public double getmonto(){
        return monto;
    }
}