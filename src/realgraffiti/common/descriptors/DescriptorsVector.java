package realgraffiti.common.descriptors;

import java.util.*;

import javax.jdo.annotations.*;

@PersistenceCapable
public class DescriptorsVector {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    int key;
	
	@Persistent
	private List<Descriptor> descriptors;
	
	public DescriptorsVector(){
		descriptors = new ArrayList<Descriptor>();
	}
	
	public void add(int index, Descriptor descriptor){
		descriptors.add(index, descriptor);
	}
	
	public Descriptor get(int index){
		return descriptors.get(index);
	}
}
