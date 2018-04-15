package net.sourceforge.javydreamercsw.plugin.core;

import javax.swing.JComponent;

/**
 * For this example, the components to be dynamically added to the GUI.
 *
 * @author Javier A. Ortiz Bultrón javier.ortiz.78@gmail.com
 */
public interface PCGenComponentInterface {

    /**
     * Component name for display purposes.
     *
     * @return Name
     */
    String getName();

    /**
     * Get the content to be displayed.
     *
     * @return content to be displayed.
     */
    JComponent getContent();
}
