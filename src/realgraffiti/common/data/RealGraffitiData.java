package realgraffiti.common.data;

import java.util.Collection;

import realgraffiti.common.dataObjects.Graffiti;
import realgraffiti.common.dataObjects.GraffitiLocationParameters;


public interface RealGraffitiData {
	boolean addNewGraffiti(Graffiti graffiti);
	Collection<Graffiti> getNearByGraffiti(GraffitiLocationParameters graffitiLocationParameters);
	byte[] getGraffitiImage(Long graffitiKey);
	byte[] getGraffitiWallImage(Long graffitiKey);
}
