package realgraffiti.common.dataObjects;

import javax.jdo.annotations.EmbeddedOnly;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
@EmbeddedOnly
public class Coordinates {
	@Persistent
	private double _latitude;
	@Persistent
	private double _longitude;
	
	
	public Coordinates(double myLatitude, double myLongitude) {
		this._latitude = myLatitude;
		this._longitude = myLongitude;
	}
	
	public double getLatitude() {
		return _latitude;
	}
	
	public void setLatitude(int _latitude) {
		this._latitude = _latitude;
	}
	
	public double getLongitude() {
		return _longitude;
	}
	
	public void setLongitude(int _longitude) {
		this._longitude = _longitude;
	}
	
	public String toString(){
		return "E" + _latitude +", N" + _longitude;
	}
}
