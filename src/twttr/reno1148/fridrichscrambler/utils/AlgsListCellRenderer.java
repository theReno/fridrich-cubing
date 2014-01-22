/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twttr.reno1148.fridrichscrambler.utils;

import java.awt.Component;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author theReno
 */
public class AlgsListCellRenderer extends DefaultListCellRenderer {

    private List<AlgsListElement> _algsList;
    
    public AlgsListCellRenderer(List<AlgsListElement> algs) {
        _algsList = algs;
    }
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = (JLabel)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        AlgsListElement current = (AlgsListElement)value;
        for (AlgsListElement el : _algsList) {
            if (el.getName().equals(current.getName())) {
                label.setText(el.getName());
                label.setIcon(el.getPatter());
                return label;
            }
        }
        return null;
    }
}
