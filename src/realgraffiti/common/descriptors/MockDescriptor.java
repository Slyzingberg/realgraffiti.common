package realgraffiti.common.descriptors;

import javax.jdo.annotations.*;

@PersistenceCapable
public class MockDescriptor implements Descriptor{
	@Persistent
	private int x;
	
	public MockDescriptor(int x){
		this.x = x;
	}
	
	@Override
	public boolean compare(Descriptor descriptor){
		MockDescriptor mockDescriptor = (MockDescriptor)descriptor;
		return getX() == mockDescriptor.getX();	
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
}
