package realgraffiti.common.dataObjects;

import java.util.Arrays;

import javax.jdo.annotations.EmbeddedOnly;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
/**
 * Orientation has 3 axis. The main one is the X
 * @author Rappoport
 *
 */

@PersistenceCapable
@EmbeddedOnly
public class Orientation {
	@Persistent
	private float[] _orientation;
	
	public Orientation(float[] orientation){
		_orientation = orientation;
	}
	public float[] get_orientation() {
		return _orientation;
	}

	public float get_Xorientation() {
		return _orientation[0];
	}
	public float get_Yorientation() {
		return _orientation[1];
	}
	public float get_Zorientation() {
		return _orientation[2];
	}
	public void set_orientation(float[] _orientation) {
		this._orientation = _orientation;
	}

	@Override
	public String toString() {
		return "Orientation [_orientation=" + Arrays.toString(_orientation)
				+ "]";
	}	
}
