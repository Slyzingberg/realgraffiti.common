package realgraffiti.common.dataObjects;

import java.util.*;

import javax.jdo.annotations.*;

@PersistenceCapable
@EmbeddedOnly
public class GraffitiLocationParameters {

	
	@Persistent
	private Coordinates _coordinates;
	
	@Persistent
	private Orientation _orientation;
		
	public GraffitiLocationParameters(){
	}

	public GraffitiLocationParameters(Coordinates coordinates, Orientation oriantation){
		_coordinates = coordinates;
		_orientation = oriantation;
	}
	
	public GraffitiLocationParameters(GraffitiLocationParameters glp){
		if(glp.getCoordinates() != null){
			_coordinates = new Coordinates(glp.getCoordinates().getLatitude(),
					glp.getCoordinates().getLongitude());
		}
		
		if(glp.getOrientation() != null){
			_orientation = new Orientation(glp.getOrientation().getOrientation());
		}
	}
	
	public Orientation getOrientation() {
		return _orientation;
	}

	public void setOrientation(Orientation orientation) {
		this._orientation = orientation;
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
}
