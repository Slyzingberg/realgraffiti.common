package realgraffiti.common.dto;
import javax.jdo.annotations.*;


@PersistenceCapable
public class GraffitiDto {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long _key;
	
	@Persistent
	private GraffitiLocationParametersDto _GraffitiLocationParameters;
	
	// blob id or something like that
	@Persistent
	private String _imageKey;

	@NotPersistent
	private byte[] _imageData;

	public GraffitiDto(GraffitiLocationParametersDto graffitiLocationParameters, String imageKey) {
		_GraffitiLocationParameters = graffitiLocationParameters;
		_imageKey = imageKey;
	}
	
	public GraffitiDto(GraffitiLocationParametersDto graffitiLocationParameters, String imageKey, byte[] imageData) {
		_GraffitiLocationParameters = graffitiLocationParameters;
		_imageKey = imageKey;
		_imageData = imageData;
	}
	
	public GraffitiLocationParametersDto getDescriptorsVector() {
		return _GraffitiLocationParameters;
	}

	public void setDescriptorsVector(GraffitiLocationParametersDto descriptorsVector) {
		this._GraffitiLocationParameters = descriptorsVector;
	}

	public String getImageKey() {
		return _imageKey;
	}

	public void setImage(String imageKey) {
		this._imageKey = imageKey;
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
}
