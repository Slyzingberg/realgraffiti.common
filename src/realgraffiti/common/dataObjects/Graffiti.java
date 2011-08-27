package realgraffiti.common.dataObjects;
import javax.jdo.annotations.*;


@PersistenceCapable
public class Graffiti {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long _key;
	
	@Persistent
	private GraffitiLocationParameters _graffitiLocationParameters;
	
	@NotPersistent
	private byte[] _graffitiImageData;
	
	@NotPersistent
	private byte[] _wallImageData;

	
	public Graffiti(){}
	
	public Graffiti(GraffitiLocationParameters graffitiLocationParameters, String imageKey) {
		_graffitiLocationParameters = graffitiLocationParameters;
	}
	
	public Graffiti(GraffitiLocationParameters graffitiLocationParameters, byte[] imageData, byte[] wallImageData) {
		_graffitiLocationParameters = graffitiLocationParameters;
		_graffitiImageData = imageData;
		_wallImageData = wallImageData;
	}
	
	public Graffiti(GraffitiLocationParameters glp) {
		_graffitiLocationParameters = glp;
	}

	public GraffitiLocationParameters getLocationParameters() {
		return _graffitiLocationParameters;
	}

	public void setLocationParameters(GraffitiLocationParameters descriptorsVector) {
		this._graffitiLocationParameters = descriptorsVector;
	}

	public void setKey(Long key){
		_key = key;
	}
	
	public Long getKey() {
		return _key;
	}
	
	public byte[] getImageData() {
		return _graffitiImageData;
	}

	public void setImageData(byte[] imageData) {
		this._graffitiImageData = imageData;
	}
	
	public byte[] getWallImageData(){
		return _wallImageData;
	}
	
	public void setWallImageData(byte[] wallImageData){
		_wallImageData = wallImageData;
	}
	
	public String toString(){
		return getKey().toString();
	}
	
	public boolean equals(Graffiti other){
		return _key == other._key;
	}
}
