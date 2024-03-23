package file_manager;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        Create_Directory = new javax.swing.JButton();
        Delete_File = new javax.swing.JButton();
        List_Files = new javax.swing.JButton();
        Delete_Directory = new javax.swing.JButton();
        Copy_Directory = new javax.swing.JButton();
        Move_file = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Move_directory = new javax.swing.JButton();
        Copy_file = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Create_File = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(575, 630));
        getContentPane().setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.SystemColor.controlLtHighlight);
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 616));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        title.setForeground(java.awt.SystemColor.desktop);
        title.setText("File Manager");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file_manager/home_icon.png"))); // NOI18N
        icon.setText("jLabel1");
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 132, -1));

        Create_Directory.setBackground(java.awt.SystemColor.desktop);
        Create_Directory.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Create_Directory.setForeground(java.awt.Color.white);
        Create_Directory.setText("Create Directory");
        Create_Directory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Create_Directory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Create_Directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_DirectoryActionPerformed(evt);
            }
        });
        jPanel1.add(Create_Directory, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 157, 37));

        Delete_File.setBackground(java.awt.SystemColor.desktop);
        Delete_File.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Delete_File.setForeground(java.awt.Color.white);
        Delete_File.setText("Delete File");
        Delete_File.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Delete_File.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_FileActionPerformed(evt);
            }
        });
        jPanel1.add(Delete_File, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 157, 37));

        List_Files.setBackground(java.awt.SystemColor.desktop);
        List_Files.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        List_Files.setForeground(java.awt.Color.white);
        List_Files.setText("List Files and Directories");
        List_Files.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        List_Files.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        List_Files.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                List_FilesActionPerformed(evt);
            }
        });
        jPanel1.add(List_Files, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 210, 37));

        Delete_Directory.setBackground(java.awt.SystemColor.desktop);
        Delete_Directory.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Delete_Directory.setForeground(java.awt.Color.white);
        Delete_Directory.setText("Delete Directory");
        Delete_Directory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Delete_Directory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_Directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_DirectoryActionPerformed(evt);
            }
        });
        jPanel1.add(Delete_Directory, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 157, 37));

        Copy_Directory.setBackground(java.awt.SystemColor.desktop);
        Copy_Directory.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Copy_Directory.setForeground(java.awt.Color.white);
        Copy_Directory.setText("Copy  Directory");
        Copy_Directory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Copy_Directory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Copy_Directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Copy_DirectoryActionPerformed(evt);
            }
        });
        jPanel1.add(Copy_Directory, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 157, 37));

        Move_file.setBackground(java.awt.SystemColor.desktop);
        Move_file.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Move_file.setForeground(java.awt.Color.white);
        Move_file.setText("Move File");
        Move_file.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Move_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Move_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Move_fileActionPerformed(evt);
            }
        });
        jPanel1.add(Move_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 157, 37));

        Exit.setBackground(java.awt.SystemColor.desktop);
        Exit.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Exit.setForeground(java.awt.Color.white);
        Exit.setText("EXIT");
        Exit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 50, 33));

        Move_directory.setBackground(java.awt.SystemColor.desktop);
        Move_directory.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Move_directory.setForeground(java.awt.Color.white);
        Move_directory.setText("Move Directory");
        Move_directory.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Move_directory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Move_directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Move_directoryActionPerformed(evt);
            }
        });
        jPanel1.add(Move_directory, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 157, 37));

        Copy_file.setBackground(java.awt.SystemColor.desktop);
        Copy_file.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Copy_file.setForeground(java.awt.Color.white);
        Copy_file.setText("Copy File");
        Copy_file.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Copy_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Copy_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Copy_fileActionPerformed(evt);
            }
        });
        jPanel1.add(Copy_file, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 157, 37));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 100));

        Create_File.setBackground(java.awt.SystemColor.desktop);
        Create_File.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Create_File.setForeground(java.awt.Color.white);
        Create_File.setText("Create File");
        Create_File.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Create_File.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Create_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_FileActionPerformed(evt);
            }
        });
        jPanel1.add(Create_File, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 157, 37));

        jPanel3.setBackground(java.awt.SystemColor.control);
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 430, 290));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Create_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_FileActionPerformed
        this.dispose();
        new CreateFile().setVisible(true);
    }//GEN-LAST:event_Create_FileActionPerformed

    private void Create_DirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_DirectoryActionPerformed
        this.dispose();
        new CreateDirectory().setVisible(true);
    }//GEN-LAST:event_Create_DirectoryActionPerformed

    private void Delete_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_FileActionPerformed
        this.dispose();
        new DeleteDirectory().setVisible(true);
    }//GEN-LAST:event_Delete_FileActionPerformed

    private void List_FilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_List_FilesActionPerformed
        this.dispose();
        new ListFile().setVisible(true);
    }//GEN-LAST:event_List_FilesActionPerformed

    private void Delete_DirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_DirectoryActionPerformed
        this.dispose();
        new DeleteDirectory().setVisible(true);
    }//GEN-LAST:event_Delete_DirectoryActionPerformed

    private void Copy_DirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Copy_DirectoryActionPerformed
        this.dispose();
        new CopyDirectory().setVisible(true);
    }//GEN-LAST:event_Copy_DirectoryActionPerformed

    private void Move_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Move_fileActionPerformed
       this.dispose();
       new MoveFile().setVisible(true);
    }//GEN-LAST:event_Move_fileActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       System.exit(0); 
    }//GEN-LAST:event_ExitActionPerformed

    private void Move_directoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Move_directoryActionPerformed
       this.dispose();
       new MoveDirectory().setVisible(true);
    }//GEN-LAST:event_Move_directoryActionPerformed

    private void Copy_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Copy_fileActionPerformed
       this.dispose();
       new CopyFile().setVisible(true);       
    }//GEN-LAST:event_Copy_fileActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Copy_Directory;
    private javax.swing.JButton Copy_file;
    private javax.swing.JButton Create_Directory;
    private javax.swing.JButton Create_File;
    private javax.swing.JButton Delete_Directory;
    private javax.swing.JButton Delete_File;
    private javax.swing.JButton Exit;
    private javax.swing.JButton List_Files;
    private javax.swing.JButton Move_directory;
    private javax.swing.JButton Move_file;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
