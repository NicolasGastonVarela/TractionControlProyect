package TractionControl;

public class CarWheels {

    public void wheel1() {
        CarElements carElements = new CarElements();
        if (carElements.getWheelSpeed() > carElements.getSlippage()) {
            System.out.println("Wheel 1 brake percentage: " + carElements.getBrakePercentage());
        } else if (carElements.getWheelSpeed() < carElements.getSlippage()) {
            System.out.println("Wheel 1 brake percentage: " + carElements.getBrakePercentage());
        }
    }

    public void wheel2() {
        CarElements carElements = new CarElements();
        if (carElements.getWheelSpeed() > carElements.getSlippage()) {
            System.out.println("Wheel 2 brake percentage: " + carElements.getBrakePercentage());
        } else if (carElements.getWheelSpeed() < carElements.getSlippage()) {
            System.out.println("Wheel 2 brake percentage: " + carElements.getBrakePercentage());
        }
    }

    public void wheel3() {
        CarElements carElements = new CarElements();
        if (carElements.getWheelSpeed() > carElements.getSlippage()) {
            System.out.println("Wheel 3 brake percentage: " + carElements.getBrakePercentage());
        } else if (carElements.getWheelSpeed() < carElements.getSlippage()) {
            System.out.println("Wheel 3 brake percentage: " + carElements.getBrakePercentage());
        }
    }

    public void wheel4() {
        CarElements carElements = new CarElements();
        if (carElements.getWheelSpeed() > carElements.getSlippage()) {
            System.out.println("Wheel 4 brake percentage: " + carElements.getBrakePercentage());
        } else if (carElements.getWheelSpeed() < carElements.getSlippage()) {
            System.out.println("Wheel 4 brake percentage: " + carElements.getBrakePercentage());
        }
    }
}

