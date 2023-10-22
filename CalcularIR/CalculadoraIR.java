/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mycompany.calculatorir;
import javax.swing.JFrame;

public class CalculadoraIR extends javax.swing.JFrame {

    public CalculadoraIR() {
            initComponents();
            setTitle("Calculadora de IR");
            setSize(450, 250);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            String[] aliquotas = {"15%", "17%"};
            for (String aliquota : aliquotas) {
            ListaDeAliquotas.add(aliquota);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new java.awt.Label();
        TextResultado = new java.awt.Label();
        label3 = new java.awt.Label();
        BtnResetar = new javax.swing.JButton();
        ListaDeAliquotas = new java.awt.List();
        label1 = new java.awt.Label();
        CampoResultado = new javax.swing.JTextField();
        CampoValorContrato = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();
        Fundo.getAccessibleContext().setAccessibleDescription("");
        Fundo.getAccessibleContext().setAccessibleParent(Fundo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TextResultado.setText("Resultado");
        getContentPane().add(TextResultado);
        TextResultado.setBounds(40, 120, 58, 20);

        label3.setName(""); // NOI18N
        label3.setText("Aliquota");
        getContentPane().add(label3);
        label3.setBounds(250, 30, 47, 20);
        label3.getAccessibleContext().setAccessibleName("Alíquota");

        BtnResetar.setText("Resetar");
        BtnResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnResetar);
        BtnResetar.setBounds(350, 140, 80, 23);

        ListaDeAliquotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListaDeAliquotas.setName(""); // NOI18N
        ListaDeAliquotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDeAliquotasActionPerformed(evt);
            }
        });
        getContentPane().add(ListaDeAliquotas);
        ListaDeAliquotas.setBounds(250, 50, 57, 30);
        ListaDeAliquotas.getAccessibleContext().setAccessibleName("LIST");
        ListaDeAliquotas.getAccessibleContext().setAccessibleDescription("LIST");
        ListaDeAliquotas.getAccessibleContext().setAccessibleParent(ListaDeAliquotas);

        label1.setText("Valor do Contrato");
        getContentPane().add(label1);
        label1.setBounds(40, 30, 97, 20);

        CampoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(CampoResultado);
        CampoResultado.setBounds(40, 140, 140, 22);

        CampoValorContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoValorContratoActionPerformed(evt);
            }
        });
        getContentPane().add(CampoValorContrato);
        CampoValorContrato.setBounds(40, 55, 163, 22);

        BtnCalcular.setText("Calcular");
        BtnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCalcularMouseClicked(evt);
            }
        });
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCalcular);
        BtnCalcular.setBounds(240, 140, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoValorContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoValorContratoActionPerformed

    }//GEN-LAST:event_CampoValorContratoActionPerformed

    
    private void ListaDeAliquotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDeAliquotasActionPerformed

    }//GEN-LAST:event_ListaDeAliquotasActionPerformed

    private void CampoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoResultadoActionPerformed

    }//GEN-LAST:event_CampoResultadoActionPerformed

    private void BtnResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetarActionPerformed
        CampoValorContrato.setText(""); // Limpa o campo de valor do contrato
        CampoResultado.setText(""); // Limpa o campo de resultado
    }//GEN-LAST:event_BtnResetarActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
                String valorContratoTexto = CampoValorContrato.getText();
                // Remover as vírgulas dos valores
                valorContratoTexto = valorContratoTexto.replaceAll("[,]", "");

                CampoValorContrato.setText(valorContratoTexto);
                String aliquotaSelecionada = ListaDeAliquotas.getSelectedItem();

                if (valorContratoTexto.isEmpty()) {
                    CampoResultado.setText("Informe o valor do contrato");
                } else if (aliquotaSelecionada == null) {
                    CampoResultado.setText("Selecione uma alíquota");
                } else {
                    try {
                        double valorContrato = Double.parseDouble(valorContratoTexto);
                        double aliquota = Double.parseDouble(aliquotaSelecionada.replace("%", ""));
                        double resultado = (valorContrato * aliquota) / 100;
                        resultado = valorContrato - resultado;
                        CampoResultado.setText(String.format("%.2f", resultado));
                    } catch (NumberFormatException e) {
                        CampoResultado.setText("Valor do contrato inválido");
                    }
            }
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void BtnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCalcularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCalcularMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalculadoraIR().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnResetar;
    private javax.swing.JTextField CampoResultado;
    private javax.swing.JTextField CampoValorContrato;
    private java.awt.Label Fundo;
    private java.awt.List ListaDeAliquotas;
    private java.awt.Label TextResultado;
    private java.awt.Label label1;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
