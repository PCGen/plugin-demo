package net.sourceforge.javydreamercsw.mode;

import net.sourceforge.javydreamercsw.plugin.core.AbstractModel;
import net.sourceforge.javydreamercsw.plugin.core.ModeInterface;
import org.openide.util.lookup.ServiceProvider;

/**
 * ServiceProvider does the magic of registering on startup just by being on the
 * class path.
 *
 * @author Javier A. Ortiz Bultrón javier.ortiz.78@gmail.com
 */
@ServiceProvider(service = ModeInterface.class)
public final class DummyMode extends AbstractModel {

    /**
     * No parameter constructor is called when Service provider loads an entry
     * into the lookup, so it's a good place for initialization.
     */
    public DummyMode() {
        toLoad.put(getName(), getName());
    }

    @Override
    public String getName() {
        return "Dummy 1";
    }
}
