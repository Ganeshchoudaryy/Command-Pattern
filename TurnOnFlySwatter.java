
public class TurnOnFlySwatter implements ElectronicFlySwatterCommand {
	
	ElectronicFlySwatter flyswatter;
	
	public TurnOnFlySwatter (ElectronicFlySwatter flyswatter)
	{
		this.flyswatter = flyswatter;
	}
	
	public void executeFlySwatter()
	{
		flyswatter.turnOnFlySwatter();
	}

}
