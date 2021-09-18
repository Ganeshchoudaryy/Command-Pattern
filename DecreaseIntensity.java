
public class DecreaseIntensity implements ElectronicFlySwatterCommand {
	
	ElectronicFlySwatter flyswatter;
	
	public DecreaseIntensity(ElectronicFlySwatter flyswatter)
	{
		this.flyswatter = flyswatter;
	}
	
	public void executeFlySwatter()
	{
		flyswatter.decreaseIntensity();
	}


}
