package realgraffiti.common.descriptors;

import javax.jdo.annotations.*;

@PersistenceCapable
@Inheritance(strategy = InheritanceStrategy.SUBCLASS_TABLE)
public interface Descriptor {
	boolean compare(Descriptor descriptor);
}
