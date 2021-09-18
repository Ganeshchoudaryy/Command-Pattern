
public class TurnOffFlySwatter implements ElectronicFlySwatterCommand {
	
	ElectronicFlySwatter flyswatter;
	
	public TurnOffFlySwatter (ElectronicFlySwatter flyswatter)
	{
		this.flyswatter = flyswatter;
	}
	
	public void executeFlySwatter()
	{
		flyswatter.turnOffFlySwatter();
	}

}
