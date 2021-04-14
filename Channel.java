package week9observer;

import java.util.ArrayList;

public class Channel implements Subject
{
	private ArrayList< Observer > observers;
	private String channelName;
	private String status;
	
	public Channel(
			String channelName
	)
	{
		super();
		this.setChannelName( channelName );
	}

	public String getStatus()
	{
		return this.status;
	}

	public void setStatus(
			String status
	)
	{
		this.status = status;
		this.notifyObservers();
	}

	@Override public void notifyObservers()
	{
		for( Observer o: this.observers )
			o.update( this.status );
	}

	@Override public void registerObserver(
			Observer o
	)
	{
		this.observers.add( o );
	}

	@Override public void removeObserver(
			Observer o
	)
	{
		this.observers.remove( o );
	}

	public String getChannelName()
	{
		return this.channelName;
	}

	public void setChannelName(
			String channelName
	)
	{
		this.channelName = channelName;
	}
}
