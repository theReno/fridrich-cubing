/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twttr.reno1148.fridrichscrambler;

import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author theReno
 */
public class PracticeFrame extends javax.swing.JInternalFrame {

    private final HashMap<Integer, String> OLL_BASE = new HashMap<Integer, String>(),
                                           PLL_BASE = new HashMap<Integer, String>();
    private HashMap<Integer, String> _ollPatterns = new HashMap<Integer, String>(),
                                     _pllPatterns = new HashMap<Integer, String>();
    private ArrayList<Integer> _selectedOlls, _selectedPlls;
    
    public PracticeFrame(ArrayList<Integer> selectedOlls, ArrayList<Integer> selectedPlls) {
        initComponents();
        pnlSolution.setVisible(false);
        initOllBase();
        initPllBase();
        _selectedOlls = selectedOlls;
        _selectedPlls = selectedPlls;
        for (int oll : selectedOlls) {
            _ollPatterns.put(oll, OLL_BASE.get(oll));
        }
        for (int pll : selectedPlls) {
            _pllPatterns.put(pll, PLL_BASE.get(pll));
        }
    }
    /**
     * Add all possible patterns that can be generated for OLL.
     */
    private void initOllBase() {
        OLL_BASE.put(1, "R U2 R2 U’ R2 U’ R2 U2 R");
        OLL_BASE.put(2, "R’ U’ R U’ R’ U R U’ R’ U2 R");
        OLL_BASE.put(3, "R U2 R’ U’ R U’ R");
        OLL_BASE.put(4, "R U R’ U R U2 R’");
        OLL_BASE.put(5, "R U2 R D R’ U2 R D’ R2");
        OLL_BASE.put(6, "R’ F’ L’ F R F’ L F U2");
        OLL_BASE.put(7, "R’ F’ L F R F’ L’ F");
        OLL_BASE.put(8, "F R’ F’ R U R2 B’ R’ B U’ R’");
        OLL_BASE.put(9, "R U2 R2 F R F’ U2 R’ F R F'");
        OLL_BASE.put(10, "L’ R B’ L U2 L’ B’ R B’ R2 L U’");
        OLL_BASE.put(11, "R L’ B R’ U2 R B L’ B L2 R’ U’");
        OLL_BASE.put(12, "R’ F’ U2 F2 U R U’ R’ F’ U2 R");
        OLL_BASE.put(13, "F R’ F’ R U2 R d’ R U’ R’ F’");
        OLL_BASE.put(14, "F R’ F’ R U2 F R’ F’ R U’ R U’ R’");
        OLL_BASE.put(15, "r’ R U R U R’ U’ M2 U R U’ r’");
        OLL_BASE.put(16, "F U R U’ R’ F’");
        OLL_BASE.put(17, "F R U’ R’ U’ R U R’ F’");
        OLL_BASE.put(18, "R U B’ R B R’ U’ R’");
        OLL_BASE.put(19, "B’ F R’ F’ R B U R U’ R’");
        OLL_BASE.put(20, "F R2 B’ R’ B R’ F’");
        OLL_BASE.put(21, "B’ R2 F R F’ R B");
        OLL_BASE.put(22, "M’ U R’ U2 R U R’ U R2 r’");
        OLL_BASE.put(23, "M U’ R U2 R’ U’ R U’ R2 r");
        OLL_BASE.put(24, "R’ U’ F U R U’ R’ F’ R");
        OLL_BASE.put(25, "L U F’ U’ L’ U L F L’");
        OLL_BASE.put(26, "B’ R B U2 R’ U’ R U’ R2 U2 R");
        OLL_BASE.put(27, "B’ R’ U’ R d’ R U R’ U R");
        OLL_BASE.put(28, "F R U R’ U’ R U R’ U’ F’");
        OLL_BASE.put(29, "L’ B’ L R’ U’ R U R’ U’ R U L’ B L");
        OLL_BASE.put(30, "L F R’ F R F2 L’");
        OLL_BASE.put(31, "R’ F’ L F’ L’ F2 R");
        OLL_BASE.put(32, "R B’ R’ U’ R d L d’ R'");
        OLL_BASE.put(33, "R’ F R U R’ d’ L’ d R");
        OLL_BASE.put(34, "F R U R’ U’ F’");
        OLL_BASE.put(35, "F’ L’ U’ L U F");
        OLL_BASE.put(36, "F U R U’ R’ U R U’ R’ F’");
        OLL_BASE.put(37, "F’ U’ L’ U L U’ L’ U L F");
        OLL_BASE.put(38, "R B’ R’ B U2 R2 F R F’ R");
        OLL_BASE.put(39, "B’ R B R’ (y’) d2 R2 B’ R’ B R'");
        OLL_BASE.put(40, "r’ U2 R U R’ U’ R U R’ U r");
        OLL_BASE.put(41, "r U2 R’ U’ R U R’ U’ R U’ r’");
        OLL_BASE.put(42, "F R’ F’ R U R U R’ U’ R U’ R’");
        OLL_BASE.put(43, "B’ R B R’ U’ R’ U’ R U R’ U R");
        OLL_BASE.put(44, "l U’ R’ F’ R U R’ (x y) R’ U R");
        OLL_BASE.put(45, "l’ U R B R’ U’ R (z x’) R U’ R’");
        OLL_BASE.put(46, "R’ U2 l U’ R U R’ l’ U2 R");
        OLL_BASE.put(47, "F R U’ R’ U R U R’ F’");
        OLL_BASE.put(48, "F U F’ R’ F R U’ R’ F’ R");
        OLL_BASE.put(49, "F’ U’ F L F’ L’ U L F L’");
        OLL_BASE.put(50, "L F L’ U R U’ R’ L F’ L’");
        OLL_BASE.put(51, "L’ B’ L U’ R’ U R L’ B L");
        OLL_BASE.put(52, "F R’ F’ R L’ U R U’ R’ L");
        OLL_BASE.put(53, "R U R’ U’ M’ U R U’ r’");
        OLL_BASE.put(54, "B2 R’ U R U’ R’ U’ R2 B R’ B");
        OLL_BASE.put(55, "l U’ l’ U’ R2 U R’ B R U’ R2");
        OLL_BASE.put(56, "F U R U R’ (y’) U’ R’ U2 R U R’");
        OLL_BASE.put(57, "B’ U’ R’ U’ R (y) U R U2 R’ U’ R");
    }
    /**
     * Add all possible patterns that can be generated for PLL.
     */
    private void initPllBase() {
        PLL_BASE.put(1, "R2 U R U R’ U’ R’ U’ R’ U R’");
        PLL_BASE.put(2, "R U’ R U R U R U’ R’ U’ R2");
        PLL_BASE.put(3, "R’ U’ R U’ R U R U’ R’ U R U R2 U’ R’ U2");
        PLL_BASE.put(4, "M2 U M2 U2 M2 U M2");
        PLL_BASE.put(5, "l’ U R’ D2 R U’ R’ D2 R2");
        PLL_BASE.put(6, "l’ R’ D2 R U R’ D2 R U’ R");
        PLL_BASE.put(7, "(x’) R U’ R’ D R U R’ u2 R’ U R D R’ U’ R");
        PLL_BASE.put(8, "R U’ R’ U’ R U R D R’ U’ R D’ R’ U2 R’ U’");
        PLL_BASE.put(9, "R’ U2 R U2 R’ F R U R’ U’ R’ F’ R2 U’");
        PLL_BASE.put(10, "R U R’ F’ R U R’ U’ R’ F R2 U’ R’ U’");
        PLL_BASE.put(11, "R’ U2 R U R’ U2 (z) U R’ D R U’");
        PLL_BASE.put(12, "R U’ R’ U l U F U’ R’ F’ R U’ R U R’ F l’");
        PLL_BASE.put(13, "R’ U R U’ R’ F’ U’ F R U R’ F l’ U’ l U’ R");
        PLL_BASE.put(14, "R2 u R’ U R’ U’ R u’ R2 b’ R b");
        PLL_BASE.put(15, "L2 u’ L U’ L U L’ u L2 (y’) R U’ R’");
        PLL_BASE.put(16, "R U R’ (y’) R2’ u’ R U’ R’ U R’ u R2");
        PLL_BASE.put(17, "L’ U’ L (y’) R2’ u R’ U R U’ R u’ R2");
        PLL_BASE.put(18, "R’ U2 R’ U’ (y) R’ F’ R2 U’ R’ U R’ F R U’ F");
        PLL_BASE.put(19, "R U R’ U’ R’ F R2 U’ R’ U’ R U R’ F’");
        PLL_BASE.put(20, "R’ U R’ U’ (y) R’ F’ R2 U’ R’ U R’ F R F");
        PLL_BASE.put(21, "F R U’ R’ U’ R U R’ F’ R U R’ U’ R’ F R F’");
    }
    /**
     * Re-populate the algorithms list once all the selected patterns have been
     * practiced
     * @param resetOlls {@code true} for reseting OLL list, {@code false} otherwise
     */
    private void resetList(boolean resetOlls) {
        if (resetOlls) {
            _ollPatterns.clear();
            for (int oll : _selectedOlls) {
                _ollPatterns.put(oll, OLL_BASE.get(oll));
            }
        } else {
            _pllPatterns.clear();
            for (int pll : _selectedPlls) {
                _pllPatterns.put(pll, PLL_BASE.get(pll));
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbAlgs = new javax.swing.JComboBox();
        btnScramble = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblScramAlg = new javax.swing.JLabel();
        btnSolution = new javax.swing.JButton();
        pnlSolution = new javax.swing.JPanel();
        lblSolution = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(450, 300));

        pnlBackground.setPreferredSize(new java.awt.Dimension(600, 200));

        jLabel1.setText("Algorithms to go over");

        cmbAlgs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OLL", "PLL" }));

        btnScramble.setText("Get me a scramble!");
        btnScramble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScrambleActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.BorderLayout());

        lblScramAlg.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        lblScramAlg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScramAlg.setText("-------------------------------------------");
        jPanel2.add(lblScramAlg, java.awt.BorderLayout.CENTER);

        btnSolution.setText("View solution");
        btnSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolutionActionPerformed(evt);
            }
        });

        pnlSolution.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlSolution.setLayout(new java.awt.BorderLayout());

        lblSolution.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlSolution.add(lblSolution, java.awt.BorderLayout.CENTER);

        btnReset.setText("Reset list");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSolution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(cmbAlgs, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnScramble)
                        .addContainerGap())
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnSolution)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addGap(149, 149, 149))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbAlgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnScramble))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolution)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSolution, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlBackground, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnScrambleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrambleActionPerformed
        List<Integer> keys = new ArrayList<Integer>();
        for (Map.Entry<Integer, String> entry : cmbAlgs.getSelectedIndex() == 0 ? _ollPatterns.entrySet() : _pllPatterns.entrySet()) {
            if (entry.getValue() != null) {
                keys.add(entry.getKey());
            }
        }
        if (!keys.isEmpty()) {
            Collections.shuffle(keys);
            String targetImageBasePath = cmbAlgs.getSelectedIndex() == 0 ? "ollalgs" : "pllalgs";
            lblScramAlg.setText(cmbAlgs.getSelectedIndex() == 0 ? _ollPatterns.remove(keys.get(0)) : _pllPatterns.remove(keys.get(0)));
            lblSolution.setIcon(new ImageIcon(getClass().getResource("/twttr/reno1148/fridrichscrambler/" + targetImageBasePath + "/" + keys.get(0) + ".png")));
            return;
        }
        JOptionPane.showMessageDialog(null, "Want some more practice? Reset the algorithm list", "Woah dude! You finish all the patterns...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnScrambleActionPerformed

    private void btnSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolutionActionPerformed
        pnlSolution.setVisible(btnSolution.getText().contains("View"));
        btnSolution.setText(btnSolution.getText().contains("View") ? "Hide solution" : "View solution");
    }//GEN-LAST:event_btnSolutionActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetList(cmbAlgs.getSelectedIndex() == 0);
        lblScramAlg.setText("--------------------------------");
        lblSolution.setIcon(null);
        JOptionPane.showMessageDialog(null, "Algorithms list was reseted!", "It's done body...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnScramble;
    private javax.swing.JButton btnSolution;
    private javax.swing.JComboBox cmbAlgs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblScramAlg;
    private javax.swing.JLabel lblSolution;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlSolution;
    // End of variables declaration//GEN-END:variables
}
