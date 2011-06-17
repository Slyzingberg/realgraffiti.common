package realgraffiti.common.data;

import java.util.Collection;
import realgraffiti.common.dto.GraffitiDto;
import realgraffiti.common.dto.GraffitiLocationParametersDto;


public interface RealGraffitiData {
	void addNewGraffitiDto(GraffitiDto GraffitiDto);
	Collection<GraffitiDto> getNearByGraffitiDto(GraffitiLocationParametersDto graffitiLocationParameters);
}
