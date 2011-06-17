package realgraffiti.common.dto;
import javax.jdo.annotations.*;


@PersistenceCapable
public class GraffitiDto {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long key;
	
	@NotPersistent
	private GraffitiLocationParametersDto _GraffitiLocationParameters;
	
	// blob id or something like that
	@Persistent
	private String imageKey;
	
	public GraffitiDto(GraffitiLocationParametersDto graffitiLocationParameters, String imageKey) {
		this._GraffitiLocationParameters = graffitiLocationParameters;
		this.imageKey = imageKey;
	}
	
	public GraffitiLocationParametersDto getDescriptorsVector() {
		return _GraffitiLocationParameters;
	}

	public void setDescriptorsVector(GraffitiLocationParametersDto descriptorsVector) {
		this._GraffitiLocationParameters = descriptorsVector;
	}

	public String getImageKey() {
		return imageKey;
	}

	public void setImage(String imageKey) {
		this.imageKey = imageKey;
	}

	public Long getKey() {
		return key;
	}
}
