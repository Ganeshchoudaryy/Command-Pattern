
public class IncreaseIntensity implements ElectronicFlySwatterCommand {
	
	ElectronicFlySwatter flyswatter;
	
	public IncreaseIntensity(ElectronicFlySwatter flyswatter)
	{
		this.flyswatter = flyswatter;
	}
	
	public void executeFlySwatter()
	{
		flyswatter.increaseIntensity();
	}

}
