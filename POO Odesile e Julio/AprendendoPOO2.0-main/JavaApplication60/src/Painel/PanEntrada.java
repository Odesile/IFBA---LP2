/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Painel;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import ClassesObj.ControleAcesso;
import ClassesObj.Funcionario;

import java.awt.event.KeyEvent;

public class PanEntrada extends javax.swing.JFrame {
    // OBJ CRIADO PARA EXECUTAR AS FINÇÕES DE SALVAR E EXIBIR
     ControleAcesso CA = new ControleAcesso();
    public PanEntrada() {
        initComponents();
        setLocationRelativeTo(null); // CENTRALIZA O PAINEL
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        btnVerTudo = new javax.swing.JButton();
        txtVH = new javax.swing.JTextField();
        txtHT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 224, 203));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setBackground(new java.awt.Color(186, 168, 152));
        btnSair.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("NOME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 30));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setText("DATA DE ADMISSÃO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setText("VALOR HORA: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 30));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setText("HORAS TRABALHADAS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 30));

        txtNome.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 230, -1));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataKeyPressed(evt);
            }
        });
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 230, -1));

        btnVerTudo.setBackground(new java.awt.Color(186, 168, 152));
        btnVerTudo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnVerTudo.setText("VER TUDO");
        btnVerTudo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTudoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        txtVH.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVHActionPerformed(evt);
            }
        });
        txtVH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVHKeyPressed(evt);
            }
        });
        getContentPane().add(txtVH, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 230, -1));

        txtHT.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        getContentPane().add(txtHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 230, -1));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO  DE FUNCIONÁRIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(186, 168, 152));
        btnSalvar.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jPanel2.setBackground(new java.awt.Color(238, 224, 203));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 430, 520));

        jPanel1.setBackground(new java.awt.Color(131, 151, 136));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
          //CADASTRO DOS FUNCIONÁRIOS
        Funcionario funcionario = new  Funcionario();
        // NOME DO FUNCIONÁRIO
        String nome = txtNome.getText();
        funcionario.setNome(nome);
        
        // DATA DE ADMISSÃO
        String aux = txtData.getText(); // recebe a data do usuário
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = df.parse(aux); // converte o texto em data
            funcionario.setDataAdmissao(data);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data Inválida!");
            return; // interrompe a execução caso a data seja inválida
        }

        
        // VALOR HORA
        try {
            float vh = Float.parseFloat(txtVH.getText());
            funcionario.setValorHora(vh);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor hora inválido!");
            return;
        }

        
        // HORAS TRABALHADAS
        try {
            float ht = Float.parseFloat(txtHT.getText());
            funcionario.setHorasTrabalhadas(ht);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Horas trabalhadas inválidas!");
            return;
        }
        
        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Tempo de empresa: " + funcionario.calcularTempoEmpresa()+ " anos");
        System.out.println("Salário a receber: R$ " + String.format("%.2f", funcionario.calcularSalario()));
        
        if(CA.salvar(funcionario)){ // O OBJ CA CHAMA A FUNÇÃO SALVAR QUE RECEBE POR PARAMÊTRO O OBJ FUNCIONÁRIO QUE ACABOU DE SER CRIADO
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
            //LIPAR PAINEL DE CADASTRO
            txtNome.setText("");
            txtData.setText("");
            txtHT.setText("");
            txtVH.setText("");
            // O CURSOR VOLTA PARA O txtNome
            txtNome.requestFocus();            
        }else{
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário!");  
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVHActionPerformed

    private void btnVerTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTudoActionPerformed
        PanSaida ps = new PanSaida(CA);
        ps.setVisible(true);
        
        this.dispose(); // Fecha o painel e volta para o anterior
    }//GEN-LAST:event_btnVerTudoActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtData.requestFocus();

        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtVH.requestFocus();

        }
    }//GEN-LAST:event_txtDataKeyPressed

    private void txtVHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVHKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHT.requestFocus();

        }
    }//GEN-LAST:event_txtVHKeyPressed

    
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
            java.util.logging.Logger.getLogger(PanEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVerTudo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtVH;
    // End of variables declaration//GEN-END:variables
}
