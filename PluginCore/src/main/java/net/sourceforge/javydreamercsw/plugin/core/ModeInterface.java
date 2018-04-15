package net.sourceforge.javydreamercsw.plugin.core;

/**
 * This would be an example of a Mode being a plugin. Of course this assumes
 * that modes are completely self contained which is not the case right now.
 *
 * @author Javier A. Ortiz Bultrón javier.ortiz.78@gmail.com
 */
public interface ModeInterface {

    /**
     * Get mode name.
     *
     * @return mode name
     */
    String getName();

    /**
     * This will load the mode into the context. Of course this will need so
     */
    void loadMode();
}
