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
	private byte[] _imageData;

	public Graffiti(){
	
	}
	
	public Graffiti(GraffitiLocationParameters graffitiLocationParameters, String imageKey) {
		_graffitiLocationParameters = graffitiLocationParameters;
	}
	
	public Graffiti(GraffitiLocationParameters graffitiLocationParameters, byte[] imageData) {
		_graffitiLocationParameters = graffitiLocationParameters;
		_imageData = imageData;
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
		return _imageData;
	}

	public void setImageData(byte[] imageData) {
		this._imageData = imageData;
	}
	
	public String toString(){
		return getKey().toString();
	}
	
	public boolean equals(Graffiti other){
		return _key == other._key;
	}
}
