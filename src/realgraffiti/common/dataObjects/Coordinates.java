package realgraffiti.common.dataObjects;

import javax.jdo.annotations.EmbeddedOnly;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
@EmbeddedOnly
public class Coordinates {
	@Persistent
	private int _latitude;
	@Persistent
	private int _longitude;
	
	public Coordinates(int _latitude, int _longitude) {
		this._latitude = _latitude;
		this._longitude = _longitude;
	}
	
	public int getLatitude() {
		return _latitude;
	}
	
	public void setLatitude(int _latitude) {
		this._latitude = _latitude;
	}
	
	public int getLongitude() {
		return _longitude;
	}
	
	public void setLongitude(int _longitude) {
		this._longitude = _longitude;
	}
	
	public String toString(){
		return "E" + _latitude +", N" + _longitude;
	}
}
