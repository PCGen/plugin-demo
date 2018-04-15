package net.sourceforge.javydreamercsw.plugin.core;

import java.util.Map;

/**
 * This interface would expose methods from PCGen core so plugins can interact
 * with it.
 *
 * @author Javier A. Ortiz Bultrón javier.ortiz.78@gmail.com
 */
public interface PCGenInterface {

    /**
     * Just a simplification for example purposes.
     *
     * @return context
     */
    Map<String, Object> getContext();
}
