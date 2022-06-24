package TractionControl;

import java.util.Random;

public class CarElements {
    private int slippage;
    private int brake;
    private int minSlippeage = 0;
    private int maxSlippeage = 10;

    public int getWheelSpeed() {
        Random random = new Random();
        return random.nextInt();
    }

    public int getSlippage(){
        Random random = new Random();
        return random.nextInt();
    }

    public int getBrakePercentage(){
        if(maxSlippeage > 5){
            brake = maxSlippeage - 5;
        }
        else {
            brake = 0;
        }
        return brake;
    }
}
