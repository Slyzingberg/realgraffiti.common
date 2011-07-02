package realgraffiti.common.dataObjects;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

import javax.jdo.annotations.*;

@PersistenceCapable
@EmbeddedOnly
public class GraffitiLocationParameters {

	
	@Persistent
	private String _coordinates;
	
	@Persistent
	private double _angle;
	
	@Persistent
	private List<Double> _siftDescriptors;
	
	public GraffitiLocationParameters(){
		_siftDescriptors = new ArrayList<Double>();
	}
	
	public GraffitiLocationParameters(String coordinates, double angle, List<Double> siftDescriptors){
		_coordinates = coordinates;
		_angle = angle;
		_siftDescriptors = siftDescriptors;
	}
	
	public String toString(){
		return _coordinates;
	}
}
