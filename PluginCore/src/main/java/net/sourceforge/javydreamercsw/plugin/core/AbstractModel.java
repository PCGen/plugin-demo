/*
 * Abstract implementation to hold common code.
 */
package net.sourceforge.javydreamercsw.plugin.core;

import java.util.HashMap;
import java.util.Map;

import org.openide.util.Lookup;

public abstract class AbstractModel implements ModeInterface
{

  protected Map<String, Object> toLoad = new HashMap<>();

  @Override
  public void loadMode()
  {
    /**
     * This will find the class loaded with this interface.
     *
     * For this one is the first one loaded.
     *
     */
    PCGenInterface pcgen = Lookup.getDefault().lookup(PCGenInterface.class);
    //Normal check, but we can always define default implementations.
    if (pcgen != null)
    {
      toLoad.entrySet().forEach((entry) ->
      {
        pcgen.getContext().put(entry.getKey(), entry.getValue());
      });
    }
  }
}
