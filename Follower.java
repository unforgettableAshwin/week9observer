package week9observer;

public class Follower implements Observer
{
	public Follower(
			String followerName
	)
	{
		super();
		this.setFollowerName( followerName );
	}

	private String followerName;

	@Override public void update(
			String status
	)
	{
	}

	void play()
	{
	}

	public String getFollowerName()
	{
		return this.followerName;
	}

	public void setFollowerName(
			String followerName
	)
	{
		this.followerName = followerName;
	}
}
