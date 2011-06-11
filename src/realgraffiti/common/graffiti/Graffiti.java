package realgraffiti.common.graffiti;
import realgraffiti.common.descriptors.DescriptorsVector;


public class Graffiti {
	private DescriptorsVector descriptorsVector;
	private byte[][] image;
	
	public Graffiti(DescriptorsVector descriptorsVector, byte[][] image) {
		super();
		this.descriptorsVector = descriptorsVector;
		this.image = image;
	}
	
	public DescriptorsVector getDescriptorsVector() {
		return descriptorsVector;
	}

	public void setDescriptorsVector(DescriptorsVector descriptorsVector) {
		this.descriptorsVector = descriptorsVector;
	}

	public byte[][] getImage() {
		return image;
	}

	public void setImage(byte[][] image) {
		this.image = image;
	}
}
