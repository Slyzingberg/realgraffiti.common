package realgraffiti.common.dto;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

import javax.jdo.annotations.*;

@PersistenceCapable
@EmbeddedOnly
public class GraffitiLocationParametersDto {

	
	@Persistent
	private String _coordinates;
	
	@Persistent
	private double _angle;
	
	@Persistent
	private List<Double> _siftDescriptors;
	
	public GraffitiLocationParametersDto(){
		_siftDescriptors = new ArrayList<Double>();
	}
	
	public GraffitiLocationParametersDto(String coordinates, double angle, List<Double> siftDescriptors){
		_coordinates = coordinates;
		_angle = angle;
		_siftDescriptors = siftDescriptors;
	}
	
	public String toString(){
		return _coordinates;
	}
}
