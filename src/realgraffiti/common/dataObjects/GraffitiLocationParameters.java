package realgraffiti.common.dataObjects;

import java.util.*;

import javax.jdo.annotations.*;

@PersistenceCapable
@EmbeddedOnly
public class GraffitiLocationParameters {

	
	@Persistent
	private Coordinates _coordinates;
	
	@Persistent
	private double _angle;
	
	@Persistent
	private List<Double> _siftDescriptors;
	
	public GraffitiLocationParameters(){
		_siftDescriptors = new ArrayList<Double>();
	}
	
	public GraffitiLocationParameters(Coordinates coordinates, double angle, List<Double> siftDescriptors){
		_coordinates = coordinates;
		_angle = angle;
		_siftDescriptors = siftDescriptors;
	}
	
	
	public String toString(){
		return _coordinates.toString();
	}

	public Coordinates getCoordinates() {
		return _coordinates;
	}

	public void setCoordinates(Coordinates _coordinates) {
		this._coordinates = _coordinates;
	}

	public double getAngle() {
		return _angle;
	}

	public void setAngle(double _angle) {
		this._angle = _angle;
	}

	public List<Double> getSiftDescriptors() {
		return _siftDescriptors;
	}

	public void setSiftDescriptors(List<Double> _siftDescriptors) {
		this._siftDescriptors = _siftDescriptors;
	}
}
