/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import model.Project;
import model.Task;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gpmrks
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController taskController;
    Project project;

    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        taskController = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTop = new javax.swing.JPanel();
        jLabelTopTitle = new javax.swing.JLabel();
        jLabelTopIcon = new javax.swing.JLabel();
        jPanelTaskForm = new javax.swing.JPanel();
        jLabelTaskName = new javax.swing.JLabel();
        jTextFieldTaskName = new javax.swing.JTextField();
        jLabelTaskDescription = new javax.swing.JLabel();
        jScrollPaneTaskDescription = new javax.swing.JScrollPane();
        jTextAreaTaskDescription = new javax.swing.JTextArea();
        jLabelDeadline = new javax.swing.JLabel();
        jLabelNotes = new javax.swing.JLabel();
        jScrollPaneNotes = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jButtonSaveTask = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jFormattedTextFieldDeadline = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTop.setBackground(new java.awt.Color(0, 153, 102));
        jPanelTop.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTopTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTopTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTopTitle.setText("  Tarefa");

        jLabelTopIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTopIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        jLabelTopIcon.setText("  ");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTopTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTopIcon)
                .addContainerGap())
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTopTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTopIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelTaskForm.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTaskForm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTaskName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTaskName.setText("Nome");

        jTextFieldTaskName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTaskName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTaskName.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTaskName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldTaskName.setSelectionColor(new java.awt.Color(102, 255, 102));

        jLabelTaskDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTaskDescription.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTaskDescription.setText("Descrição");

        jTextAreaTaskDescription.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaTaskDescription.setColumns(20);
        jTextAreaTaskDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaTaskDescription.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaTaskDescription.setRows(5);
        jTextAreaTaskDescription.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPaneTaskDescription.setViewportView(jTextAreaTaskDescription);

        jLabelDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDeadline.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDeadline.setText("Prazo");

        jLabelNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNotes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNotes.setText("Notas");

        jTextAreaNotes.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaNotes.setForeground(new java.awt.Color(0, 0, 0));
        jTextAreaNotes.setRows(5);
        jTextAreaNotes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPaneNotes.setViewportView(jTextAreaNotes);

        jButtonSaveTask.setText("Salvar");
        jButtonSaveTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveTaskMouseClicked(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });

        jFormattedTextFieldDeadline.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextFieldDeadline.setForeground(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        javax.swing.GroupLayout jPanelTaskFormLayout = new javax.swing.GroupLayout(jPanelTaskForm);
        jPanelTaskForm.setLayout(jPanelTaskFormLayout);
        jPanelTaskFormLayout.setHorizontalGroup(
            jPanelTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTaskDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTaskName)
                    .addComponent(jLabelTaskName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTaskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTaskFormLayout.createSequentialGroup()
                        .addGroup(jPanelTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNotes)
                            .addGroup(jPanelTaskFormLayout.createSequentialGroup()
                                .addComponent(jButtonSaveTask)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jFormattedTextFieldDeadline))
                .addContainerGap())
        );
        jPanelTaskFormLayout.setVerticalGroup(
            jPanelTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTaskName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTaskDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTaskFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveTask)
                    .addComponent(jButtonCancel))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTaskForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTaskForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jButtonSaveTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaveTaskMouseClicked

        Task task = new Task();

        try {
            task.setIdProject(13);
            task.setName(jTextFieldTaskName.getText());
            task.setDescription(jTextAreaTaskDescription.getText());
            task.setDeadline(LocalDate.parse(jFormattedTextFieldDeadline.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            task.setNotes(jTextAreaNotes.getText());
            task.setDone(false);
            task.setCreationDate(LocalDate.now());
            task.setModificationDate(LocalDate.now());
            taskController.save(task);
            JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

        this.dispose();


    }//GEN-LAST:event_jButtonSaveTaskMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSaveTask;
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadline;
    private javax.swing.JLabel jLabelDeadline;
    private javax.swing.JLabel jLabelNotes;
    private javax.swing.JLabel jLabelTaskDescription;
    private javax.swing.JLabel jLabelTaskName;
    private javax.swing.JLabel jLabelTopIcon;
    private javax.swing.JLabel jLabelTopTitle;
    private javax.swing.JPanel jPanelTaskForm;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPaneNotes;
    private javax.swing.JScrollPane jScrollPaneTaskDescription;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextArea jTextAreaTaskDescription;
    private javax.swing.JTextField jTextFieldTaskName;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }
}