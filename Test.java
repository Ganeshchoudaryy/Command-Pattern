//I dont know the idea of simple Fly Swatter, so I did it according to Electronic fly Swatter, and assumed that there is a knob which has following options:
//Turn On
//Turn OFF
//Increase intensity of voltage
//Decrease intensity of Voltage

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlySwatterKnob knob = new FlySwatterKnob();
		ElectronicFlySwatter flyswatter = new ElectronicFlySwatter();
		
		knob.setFlySwatterCommand(new TurnOnFlySwatter(flyswatter));
		knob.knobMoved();
		knob.setFlySwatterCommand(new IncreaseIntensity(flyswatter));
		knob.knobMoved();
		knob.setFlySwatterCommand(new DecreaseIntensity(flyswatter));
		knob.knobMoved();
		knob.setFlySwatterCommand(new TurnOffFlySwatter(flyswatter));
		knob.knobMoved();

	}

}
