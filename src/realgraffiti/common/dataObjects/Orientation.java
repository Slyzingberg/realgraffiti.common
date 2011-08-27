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
	private float _Xorientation;
	@Persistent
	private float _Yorientation;
	@Persistent
	private float _Zorientation;
	
	public Orientation(float[] orientation){
		_Xorientation = orientation[0];
		_Yorientation = orientation[1];
		_Zorientation = orientation[2];
	}
	public float[] getOrientation() {
		return new float[]{_Xorientation, _Yorientation, _Zorientation};
	}

	public float getXorientation() {
		return _Xorientation;
	}
	public float getYorientation() {
		return _Yorientation;
	}
	public float get_Zorientation() {
		return _Zorientation;
	}

	@Override
	public String toString() {
		return "Orientation [_orientation=" + Arrays.toString(getOrientation())
				+ "]";
	}	
}
