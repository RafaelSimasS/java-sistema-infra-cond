/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telacondominio;
import infracao.Infracao;
import infracao.ListaInfracoes;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author leafar
 */
public class frmRemoverInfracao extends javax.swing.JFrame {

    /**
     * Creates new form frmRemoverInfracao
     */
    public frmRemoverInfracao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        pnFormRemove6 = new javax.swing.JPanel();
        lblInfracao = new javax.swing.JLabel();
        cbInfracao = new javax.swing.JComboBox<>();
        btnRemoveInfracao = new javax.swing.JButton();
        lblRemoveInfracao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(714, 345));

        pnPrincipal.setBackground(new java.awt.Color(112, 188, 207));

        pnFormRemove6.setBackground(new java.awt.Color(112, 188, 207));

        lblInfracao.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblInfracao.setForeground(new java.awt.Color(255, 255, 255));
        lblInfracao.setText("Infração");

        btnRemoveInfracao.setText("Remover");
        btnRemoveInfracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveInfracaoActionPerformed(evt);
            }
        });

        lblRemoveInfracao.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblRemoveInfracao.setForeground(new java.awt.Color(255, 255, 255));
        lblRemoveInfracao.setText("Remover Infração");

        javax.swing.GroupLayout pnFormRemove6Layout = new javax.swing.GroupLayout(pnFormRemove6);
        pnFormRemove6.setLayout(pnFormRemove6Layout);
        pnFormRemove6Layout.setHorizontalGroup(
            pnFormRemove6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormRemove6Layout.createSequentialGroup()
                .addGroup(pnFormRemove6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormRemove6Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(pnFormRemove6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRemoveInfracao)
                            .addComponent(cbInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnFormRemove6Layout.createSequentialGroup()
                                .addComponent(lblInfracao)
                                .addGap(117, 117, 117))))
                    .addGroup(pnFormRemove6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblRemoveInfracao)))
                .addGap(93, 93, 93))
        );
        pnFormRemove6Layout.setVerticalGroup(
            pnFormRemove6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormRemove6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRemoveInfracao)
                .addGap(33, 33, 33)
                .addComponent(lblInfracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbInfracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnRemoveInfracao)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(pnFormRemove6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(180, 180, 180))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(pnFormRemove6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveInfracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveInfracaoActionPerformed
        // TODO add your handling code here:
        String nomeInfra = (String) cbInfracao.getSelectedItem();
        try{
            if(nomeInfra == null){
                JOptionPane.showMessageDialog(null, "Nenhuma infração foi selecionada.", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
        
            }else{
                int flag = JOptionPane.showConfirmDialog(null, "Deseja realmente remover a seguinte infração?\n"
                    + "Infração: "
                    +nomeInfra+".",
                    "Confirmação",JOptionPane.YES_NO_OPTION);
                if (flag == JOptionPane.YES_OPTION){
                    ListaInfracoes listaInfracoes = new ListaInfracoes();
                    boolean foiRemovido = listaInfracoes.removeInfracao(nomeInfra);
                    if(foiRemovido){
                        JOptionPane.showMessageDialog(null, "Infração removida!");
                        carregaCbBoxesRemoverInfracao();
                    }else{
                        JOptionPane.showMessageDialog(null, "Não foi possível remover a infração!");
                    }
                }else{
                    cbInfracao.requestFocus();
                }
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Nenhuma infração foi selecionada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveInfracaoActionPerformed
    public void carregaCbBoxesRemoverInfracao(){
        ListaInfracoes listaInfracoes = new ListaInfracoes();
        List<Infracao> infracoes = listaInfracoes.getInfracoes();
        
        DefaultComboBoxModel<String> comboBoxModelMoradores = new DefaultComboBoxModel<>();
        for (Infracao infracao : infracoes){
            String nomeInfra = infracao.getNomeInfracao();
            comboBoxModelMoradores.addElement(nomeInfra);
        }
        cbInfracao.setModel(comboBoxModelMoradores);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRemoverInfracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRemoverInfracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRemoverInfracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRemoverInfracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRemoverInfracao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemoveInfracao;
    private javax.swing.JComboBox<String> cbInfracao;
    private javax.swing.JLabel lblInfracao;
    private javax.swing.JLabel lblRemoveInfracao;
    private javax.swing.JPanel pnFormRemove6;
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
