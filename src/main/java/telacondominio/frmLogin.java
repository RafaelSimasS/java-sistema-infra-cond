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
        
        Icon i = lblIcon.getIcon();
        ImageIcon icon = (ImageIcon) i;
        Image image = icon.getImage().getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH);
        lblIcon.setIcon(new ImageIcon(image));
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
        lblIcon = new javax.swing.JLabel();
        pnFormLogin = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        pnUserField = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        pnLabelUser = new javax.swing.JPanel();
        lblIconPerson = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        pnPasField = new javax.swing.JPanel();
        pnLabaelSenha = new javax.swing.JPanel();
        lblIconLock = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        pasSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VILLA INFRA");
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(748, 385));

        pnPrincipal.setBackground(new java.awt.Color(112, 188, 207));

        lblIcon.setBackground(new java.awt.Color(51, 51, 51));
        lblIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sparq\\OneDrive\\Documentos\\NetBeansProjects\\sistemaInfraLp\\src\\main\\resources\\iconNome.png")); // NOI18N

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
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        pnLabelUser.setBackground(new java.awt.Color(112, 188, 207));

        lblIconPerson.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sparq\\OneDrive\\Documentos\\NetBeansProjects\\sistemaInfraLp\\src\\main\\resources\\personIcon.png")); // NOI18N

        lblUsuario.setBackground(new java.awt.Color(153, 153, 153));
        lblUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário");
        lblUsuario.setAutoscrolls(true);

        lblLogin.setBackground(new java.awt.Color(153, 153, 153));
        lblLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");
        lblLogin.setAutoscrolls(true);

        javax.swing.GroupLayout pnLabelUserLayout = new javax.swing.GroupLayout(pnLabelUser);
        pnLabelUser.setLayout(pnLabelUserLayout);
        pnLabelUserLayout.setHorizontalGroup(
            pnLabelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLabelUserLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(pnLabelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin)
                    .addComponent(lblIconPerson))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(pnLabelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnLabelUserLayout.createSequentialGroup()
                    .addComponent(lblUsuario)
                    .addGap(0, 135, Short.MAX_VALUE)))
        );
        pnLabelUserLayout.setVerticalGroup(
            pnLabelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLabelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblIconPerson)
                .addContainerGap())
            .addGroup(pnLabelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLabelUserLayout.createSequentialGroup()
                    .addContainerGap(61, Short.MAX_VALUE)
                    .addComponent(lblUsuario)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout pnUserFieldLayout = new javax.swing.GroupLayout(pnUserField);
        pnUserField.setLayout(pnUserFieldLayout);
        pnUserFieldLayout.setHorizontalGroup(
            pnUserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario)
                    .addComponent(pnLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnUserFieldLayout.setVerticalGroup(
            pnUserFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUserFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario)
                .addContainerGap())
        );

        pnPasField.setBackground(new java.awt.Color(112, 188, 207));

        pnLabaelSenha.setBackground(new java.awt.Color(112, 188, 207));

        lblIconLock.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sparq\\OneDrive\\Documentos\\NetBeansProjects\\sistemaInfraLp\\src\\main\\resources\\lockIcon.png")); // NOI18N
        lblIconLock.setAutoscrolls(true);

        lblSenha.setBackground(new java.awt.Color(153, 153, 153));
        lblSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        lblSenha.setAutoscrolls(true);

        javax.swing.GroupLayout pnLabaelSenhaLayout = new javax.swing.GroupLayout(pnLabaelSenha);
        pnLabaelSenha.setLayout(pnLabaelSenhaLayout);
        pnLabaelSenhaLayout.setHorizontalGroup(
            pnLabaelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLabaelSenhaLayout.createSequentialGroup()
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIconLock)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnLabaelSenhaLayout.setVerticalGroup(
            pnLabaelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLabaelSenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnLabaelSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIconLock, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout pnPasFieldLayout = new javax.swing.GroupLayout(pnPasField);
        pnPasField.setLayout(pnPasFieldLayout);
        pnPasFieldLayout.setHorizontalGroup(
            pnPasFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPasFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPasFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pasSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addGroup(pnPasFieldLayout.createSequentialGroup()
                        .addComponent(pnLabaelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)))
                .addContainerGap())
        );
        pnPasFieldLayout.setVerticalGroup(
            pnPasFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPasFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLabaelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pasSenha)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnFormLoginLayout = new javax.swing.GroupLayout(pnFormLogin);
        pnFormLogin.setLayout(pnFormLoginLayout);
        pnFormLoginLayout.setHorizontalGroup(
            pnFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFormLoginLayout.setVerticalGroup(
            pnFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLoginLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(pnUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnPasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addComponent(pnFormLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnFormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        // TODO add your handling code here:
        if(txtUsuario.getText().equals("Nome de Usuário")){
            txtUsuario.setText(null);
            txtUsuario.requestFocus();
            removePlaceHolderStyle(txtUsuario);
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
        if(txtUsuario.getText().equals("") ||txtUsuario.getText().isEmpty()){
            addPlaceHolderStyle(txtUsuario);
            txtUsuario.setText("Nome de Usuário");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void pasSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pasSenhaFocusGained
        // TODO add your handling code here:
        if( new String(pasSenha.getPassword()).equals("Senha") ){
            pasSenha.setText(null);
            pasSenha.requestFocus();
            removePlaceHolderStyle(txtUsuario);
        }
    }//GEN-LAST:event_pasSenhaFocusGained

    private void pasSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pasSenhaFocusLost
        // TODO add your handling code here:
        if( new String(pasSenha.getPassword()).equals("") ||
                new String(pasSenha.getPassword()).isEmpty()){
            addPlaceHolderStyle(pasSenha);
            pasSenha.setText("Senha");
        }
    }//GEN-LAST:event_pasSenhaFocusLost

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
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIconLock;
    private javax.swing.JLabel lblIconPerson;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pasSenha;
    private javax.swing.JPanel pnFormLogin;
    private javax.swing.JPanel pnLabaelSenha;
    private javax.swing.JPanel pnLabelUser;
    private javax.swing.JPanel pnPasField;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnUserField;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
