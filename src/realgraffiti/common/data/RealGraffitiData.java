package realgraffiti.common.data;

import java.util.Collection;
import realgraffiti.common.dto.GraffitiDto;
import realgraffiti.common.dto.GraffitiLocationParametersDto;


public interface RealGraffitiData {
	boolean addNewGraffiti(GraffitiDto GraffitiDto);
	Collection<GraffitiDto> getNearByGraffiti(GraffitiLocationParametersDto graffitiLocationParameters);
	byte[] getGraffitiImage(Long graffitiKey);
}
