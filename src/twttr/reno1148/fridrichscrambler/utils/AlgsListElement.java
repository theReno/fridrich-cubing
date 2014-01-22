/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twttr.reno1148.fridrichscrambler.utils;

import javax.swing.ImageIcon;

/**
 * Abstraction to show the user which algorithms are available for practice.
 * @author theReno
 */
public class AlgsListElement {
    
    private ImageIcon _pattern;
    private String _name;
    /**
     * Initialize a new element that is to be displayed in a list
     * @param pathToPattern Path to the package and file for the image
     * @param name A identifier for this algorithm
     */
    public AlgsListElement(String pathToPattern, String name) {
        _pattern = new ImageIcon(getClass().getResource(pathToPattern));
    }
    /**
     * @return The identifier for this algorithm
     */
    public String getName() {
        return _name;
    }
    /**
     * @return The image representing the pattern
     */
    public ImageIcon getPatter() {
        return _pattern;
    }
}
