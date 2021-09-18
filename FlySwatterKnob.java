
public class FlySwatterKnob {
	
	ElectronicFlySwatterCommand flycommand;
	public void setFlySwatterCommand(ElectronicFlySwatterCommand flycommand)
	{
		this.flycommand = flycommand;
	}
	
	public void knobMoved()
	{
		flycommand.executeFlySwatter();
	}

}
