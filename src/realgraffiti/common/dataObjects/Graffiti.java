package realgraffiti.common.dataObjects;
import javax.jdo.annotations.*;


@PersistenceCapable
public class Graffiti {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long _key;
	
	@Persistent
	private GraffitiLocationParameters _graffitiLocationParameters;
	
	// blob id or something like that
	@NotPersistent
	private String _imageKey;

	@NotPersistent
	private byte[] _imageData;

	public Graffiti(){
	
	}
	
	public Graffiti(GraffitiLocationParameters graffitiLocationParameters, String imageKey) {
		_graffitiLocationParameters = graffitiLocationParameters;
		_imageKey = imageKey;
	}
	
	public Graffiti(GraffitiLocationParameters graffitiLocationParameters, String imageKey, byte[] imageData) {
		_graffitiLocationParameters = graffitiLocationParameters;
		_imageKey = imageKey;
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

	public String getImageKey() {
		return _imageKey;
	}

	public void setImage(String imageKey) {
		this._imageKey = imageKey;
	}

	public void setKey(Long key){
		_key = key;
	}
	
	public Long getKey() {
		return _key;
	}
	
	public byte[] get_imageData() {
		return _imageData;
	}

	public void set_imageData(byte[] _imageData) {
		this._imageData = _imageData;
	}
	
	public String toString(){
		return getKey().toString();
	}
}
