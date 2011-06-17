package realgraffiti.common.dto;

import java.util.*;

import javax.jdo.annotations.*;

@PersistenceCapable
public class GraffitiLocationParametersDto {
	private String _coordinates;
	private double _angle;
	private Collection<Double> _siftDescriptors;
	
	public GraffitiLocationParametersDto(String coordinates, double angle, Collection<Double> siftDescriptors){
		_coordinates = coordinates;
		_angle = angle;
		_siftDescriptors = siftDescriptors;
	}
}
