/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import app.SocialNetwork;
import app.FachadaAplicacion;
import app.Company;
import app.User;
import app.Particular;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
/**
 *
 * @author alumnogreibd
 */
public class VOtherUser extends javax.swing.JDialog {

    private FachadaAplicacion fa;
    private User usuarioConsultar;
    
    /**
     * Creates new form VOtroUsuario
     */
    public VOtherUser(java.awt.Frame parent, boolean modal,FachadaAplicacion fa, User u) {
        super(parent, modal);
        BackgroundPanel panelFondo = new BackgroundPanel("/resources/background.png");
        setContentPane(panelFondo);
        initComponents();
        this.setLocationRelativeTo(null);
        this.fa = fa;
        cargarUsuarioActual(u);
        this.cargarFotoPerfil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGenero = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnFotoPerfil = new javax.swing.JButton();
        lblNickname = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNacimiento = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        btnTwitter = new javax.swing.JButton();
        btnFacebook = new javax.swing.JButton();
        btnGitHub = new javax.swing.JButton();
        btnLinkedin = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblBiografia = new javax.swing.JLabel();
        txtBiografia = new javax.swing.JTextField();
        btnInstagram = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtGenero.setEditable(false);
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backArrow.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnFotoPerfil.setContentAreaFilled(false);

        lblNickname.setText("Nombre de Usuario");

        lblNome.setText("Nombre");

        txtNome.setEditable(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblNacimiento.setText("Nacimiento");

        txtNacimiento.setEditable(false);

        lblGenero.setText("Género");

        btnTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/twitterLogo.png"))); // NOI18N
        btnTwitter.setContentAreaFilled(false);
        btnTwitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwitterActionPerformed(evt);
            }
        });

        btnFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/facebookLogo.png"))); // NOI18N
        btnFacebook.setContentAreaFilled(false);
        btnFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebookActionPerformed(evt);
            }
        });

        btnGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/githubLogo.png"))); // NOI18N
        btnGitHub.setContentAreaFilled(false);
        btnGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubActionPerformed(evt);
            }
        });

        btnLinkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/linkedinlogo.jpeg"))); // NOI18N
        btnLinkedin.setContentAreaFilled(false);
        btnLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkedinActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tinder.jpeg"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        lblEstado.setText("Estado Sentimental");

        txtEstado.setEditable(false);
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        jLabel10.setText("También estoy en...");

        lblBiografia.setText("Biografia");

        txtBiografia.setEditable(false);
        txtBiografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiografiaActionPerformed(evt);
            }
        });

        btnInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/instalogo.jpeg"))); // NOI18N
        btnInstagram.setContentAreaFilled(false);
        btnInstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstagramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBiografia)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblGenero)
                                    .addComponent(lblNacimiento))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(txtGenero)
                                    .addComponent(txtNacimiento)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnInstagram)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBiografia, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNome)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGenero)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNacimiento)
                            .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblBiografia)
                        .addGap(18, 18, 18)
                        .addComponent(txtBiografia)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 50, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTwitter)
                            .addComponent(btnLinkedin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFacebook)
                            .addComponent(btnGitHub)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnTwitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwitterActionPerformed
        // TODO add your handling code here:
        SocialNetwork red = this.fa.consultarRedSocial(usuarioConsultar.getId(),"twitter");
        if(red != null){
            String mensaje = "ID: " + red.getId_plataforma() + "\nURL: " + red.getUrl();
            JOptionPane.showMessageDialog(null,mensaje );
        }else{
            JOptionPane.showMessageDialog(null,"El usuario no está presente en esta red social");
        }
    }//GEN-LAST:event_btnTwitterActionPerformed

    private void btnFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebookActionPerformed
        // TODO add your handling code here:
        SocialNetwork red = this.fa.consultarRedSocial(usuarioConsultar.getId(),"facebook");
        if(red != null){
            String mensaje = "ID: " + red.getId_plataforma() + "\nURL: " + red.getUrl();
            JOptionPane.showMessageDialog(null,mensaje );
        }else{
            JOptionPane.showMessageDialog(null,"El usuario no está presente en esta red social");
        }
    }//GEN-LAST:event_btnFacebookActionPerformed

    private void btnGitHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitHubActionPerformed
        // TODO add your handling code here:
        SocialNetwork red = this.fa.consultarRedSocial(usuarioConsultar.getId(),"github");
        if(red != null){
            String mensaje = "ID: " + red.getId_plataforma() + "\nURL: " + red.getUrl();
            JOptionPane.showMessageDialog(null,mensaje );
        }else{
            JOptionPane.showMessageDialog(null,"El usuario no está presente en esta red social");
        }
    }//GEN-LAST:event_btnGitHubActionPerformed

    private void btnLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkedinActionPerformed
        // TODO add your handling code here:
        SocialNetwork red = this.fa.consultarRedSocial(usuarioConsultar.getId(),"linkedin");
        if(red != null){
            String mensaje = "ID: " + red.getId_plataforma() + "\nURL: " + red.getUrl();
            JOptionPane.showMessageDialog(null,mensaje );
        }else{
            JOptionPane.showMessageDialog(null,"El usuario no está presente en esta red social");
        }
    }//GEN-LAST:event_btnLinkedinActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        SocialNetwork red = this.fa.consultarRedSocial(usuarioConsultar.getId(),"tinder");
        if(red != null){
            String mensaje = "ID: " + red.getId_plataforma() + "\nURL: " + red.getUrl();
            JOptionPane.showMessageDialog(null,mensaje );
        }else{
            JOptionPane.showMessageDialog(null,"El usuario no está presente en esta red social");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtBiografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiografiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBiografiaActionPerformed

    private void btnInstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstagramActionPerformed
        // TODO add your handling code here:
        SocialNetwork red = this.fa.consultarRedSocial(usuarioConsultar.getId(),"instagram");
        if(red != null){
            String mensaje = "ID: " + red.getId_plataforma() + "\nURL: " + red.getUrl();
            JOptionPane.showMessageDialog(null,mensaje );
        }else{
            JOptionPane.showMessageDialog(null,"El usuario no está presente en esta red social");
        }
    }//GEN-LAST:event_btnInstagramActionPerformed

    private void cargarUsuarioActual(User u){
        this.lblNickname.setText(u.getId());
        this.txtNome.setText(u.getNome());
        this.txtBiografia.setText(u.getBiografia());
        this.usuarioConsultar=u;
        
        if(usuarioConsultar instanceof Particular){
            Particular p=(Particular)u;
            this.txtGenero.setText(p.getGenero());
            this.txtEstado.setText(p.getEstadoSentimental());
            this.txtNacimiento.setText(p.getFechaNacimiento());
        }
        else{
            Company emp=(Company)u;
            this.lblGenero.setText("CIF");
            this.txtGenero.setText(emp.getCif());
            this.lblEstado.setText("Direccion");
            this.txtEstado.setText(emp.getDireccion());
            this.lblNacimiento.setText("Pagina web");
            this.txtNacimiento.setText(emp.getWeb());            
        }
    }
    public void cargarFotoPerfil(){
        try{
            Image img = ImageIO.read(getClass().getResource(this.usuarioConsultar.getUrlFotoPerfil()));
            this.btnFotoPerfil.setIcon(new javax.swing.ImageIcon(img));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnFacebook;
    private javax.swing.JButton btnFotoPerfil;
    private javax.swing.JButton btnGitHub;
    private javax.swing.JButton btnInstagram;
    private javax.swing.JButton btnLinkedin;
    private javax.swing.JButton btnTwitter;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel lblBiografia;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtBiografia;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}