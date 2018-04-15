package net.sourceforge.javydreamercsw.plugin.core;

import java.util.HashMap;
import java.util.Map;

import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service = PCGenInterface.class)
public class DefaultPCGenInterface implements PCGenInterface
{

  private final Map<String, Object> context = new HashMap<>();

  @Override
  public Map<String, Object> getContext()
  {
    return context;
  }
}
