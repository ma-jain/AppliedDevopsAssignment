package org.example;

public class CalculateCharge {

    public static double Charge(int weight){
        if(weight<=0) return 0;
        double charge=0;
        if (weight <= 40) {
            charge=5.75;
        }
        else if(weight<=500){
            int extra=weight-40;
            int extraCharge=(int)((extra-1)/18)+1;
            charge=5.75+(extraCharge*3.88);
        }
        else{
            charge=5.75+26*3.88+(weight-500)*0.67;
        }
        return charge;
    }
}
