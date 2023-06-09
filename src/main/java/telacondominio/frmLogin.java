/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telacondominio;

import administacao.Adm;
import administacao.ListaAdministradores;
import infracao.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;


/**
 *
 * @author edjr
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    // cria uma variável do tipo Adm para criar um novo administrador
    private Adm adminPadrao;
    private Infracao infracaoPadrao;
    
    public frmLogin() {
        initComponents();
        addPlaceHolderStyle(txtUsuario);
        addPlaceHolderStyle(pasSenha);
        // CRIA INSTÂNCIA DA CLASSE ADM PARA CRIAR UM ADM PADRÃO
        adminPadrao = new Adm("a", "a");
        infracaoPadrao = new Infracao("Lixo em local inadequado", 2.30);
    }
    
    private void addPlaceHolderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.GRAY);
    }
    
    private void removePlaceHolderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
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
        pnFormLogin = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        pnUserField = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        pnPasField = new javax.swing.JPanel();
        pasSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFRAVILLA");
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(748, 385));

        pnPrincipal.setBackground(new java.awt.Color(112, 188, 207));

        pnFormLogin.setBackground(new java.awt.Color(112, 188, 207));

        btnConfirmar.setBackground(new java.awt.Color(0, 0, 102));
        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setAutoscrolls(true);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        pnUserField.setBackground(new java.awt.Color(112, 188, 207));

        txtUsuario.setText("Nome de Usuário");
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        lblLogin.setBackground(new java.awt.Color(153, 153, 153));
        lblLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");
        lblLogin.setAutoscrolls(true);

        lblUsuario.setBackground(new java.awt.Color(153, 153, 153));
        lblUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário");
        lblUsuario.setAutoscrolls(true);

        javax.swing.GroupLayout pnUserFieldLayout = new javax.swing.GroupLayout(pnUserField);
        pnUserField.setLayout(pnUserFieldLayout);
        pnUserFieldLayout.setHorizontalGroup(
            pnUserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario)
                    .addGroup(pnUserFieldLayout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnUserFieldLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lblLogin)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        pnUserFieldLayout.setVerticalGroup(
            pnUserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserFieldLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblLogin)
                .addGap(18, 18, 18)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario)
                .addContainerGap())
        );

        pnPasField.setBackground(new java.awt.Color(112, 188, 207));

        pasSenha.setText("Senha");
        pasSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 4, true));
        pasSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pasSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pasSenhaFocusLost(evt);
            }
        });

        lblSenha.setBackground(new java.awt.Color(153, 153, 153));
        lblSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        lblSenha.setAutoscrolls(true);

        javax.swing.GroupLayout pnPasFieldLayout = new javax.swing.GroupLayout(pnPasField);
        pnPasField.setLayout(pnPasFieldLayout);
        pnPasFieldLayout.setHorizontalGroup(
            pnPasFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPasFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPasFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addGroup(pnPasFieldLayout.createSequentialGroup()
                        .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnPasFieldLayout.setVerticalGroup(
            pnPasFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPasFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasSenha)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("InfraVilla");

        javax.swing.GroupLayout pnFormLoginLayout = new javax.swing.GroupLayout(pnFormLogin);
        pnFormLogin.setLayout(pnFormLoginLayout);
        pnFormLoginLayout.setHorizontalGroup(
            pnFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLoginLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59))
            .addGroup(pnFormLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFormLoginLayout.setVerticalGroup(
            pnFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(pnUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnPasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(pnFormLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(248, 248, 248))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(pnFormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pasSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pasSenhaFocusLost
        // TODO add your handling code here:
        if( new String(pasSenha.getPassword()).equals("") ||
            new String(pasSenha.getPassword()).isEmpty()){
            addPlaceHolderStyle(pasSenha);
            pasSenha.setText("Senha");
        }
    }//GEN-LAST:event_pasSenhaFocusLost

    private void pasSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pasSenhaFocusGained
        // TODO add your handling code here:
        if( new String(pasSenha.getPassword()).equals("Senha") ){
            pasSenha.setText(null);
            pasSenha.requestFocus();
            removePlaceHolderStyle(txtUsuario);
        }
    }//GEN-LAST:event_pasSenhaFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
        if(txtUsuario.getText().equals("") ||txtUsuario.getText().isEmpty()){
            addPlaceHolderStyle(txtUsuario);
            txtUsuario.setText("Nome de Usuário");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        // TODO add your handling code here:
        if(txtUsuario.getText().equals("Nome de Usuário")){
            txtUsuario.setText(null);
            txtUsuario.requestFocus();
            removePlaceHolderStyle(txtUsuario);
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        String usuarioDigitado = txtUsuario.getText();
        String senhaDigitada = new String(pasSenha.getPassword());
        if(!usuarioDigitado.equals("Nome de Usuário")){
            List<Adm> administradores = new ListaAdministradores().getAdministradores();
            boolean credenciaisCorretas = false;

            // itera sobre a lista de adms buscando algum que seja igual as credenciais informadas
            for (Adm administrador : administradores) {
                if (administrador.getUsuario().equals(usuarioDigitado) && administrador.getSenha().equals(senhaDigitada)) {
                    credenciaisCorretas = true;
                    break;
                }
            }
            if (credenciaisCorretas) {
                frmGeral frameGeral = new frmGeral();
                frameGeral.setVisible(true);

                this.dispose();
                // Credenciais corretas, faça algo aqui, por exemplo, abrir uma nova janela
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha incorreta", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                txtUsuario.setText("");
                pasSenha.setText("");
                txtUsuario.requestFocus();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou Senha incorreta", "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            // criar admin padrão
            ListaAdministradores listaAdministradores = new ListaAdministradores();
            listaAdministradores.adicionarAdministrador(new frmLogin().adminPadrao);
            
            ListaInfracoes listaInfracoes = new ListaInfracoes();
            listaInfracoes.adicionarInfracao(new frmLogin().infracaoPadrao);
            new frmLogin().setVisible(true);
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pasSenha;
    private javax.swing.JPanel pnFormLogin;
    private javax.swing.JPanel pnPasField;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnUserField;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
