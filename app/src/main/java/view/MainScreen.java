/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Andrei
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateTableTasks();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmptyList = new javax.swing.JPanel();
        EmptyListIcon = new javax.swing.JLabel();
        EmptyListTitle = new javax.swing.JLabel();
        EmptyListSubtitle = new javax.swing.JLabel();
        Toolbar = new javax.swing.JPanel();
        ToolbarTitle = new javax.swing.JLabel();
        Projects = new javax.swing.JPanel();
        ProjectsTitle = new javax.swing.JLabel();
        ProjectsAdd = new javax.swing.JLabel();
        Tasks = new javax.swing.JPanel();
        TasksTitle = new javax.swing.JLabel();
        TasksAdd = new javax.swing.JLabel();
        ProjectList = new javax.swing.JPanel();
        ProjectItem = new javax.swing.JScrollPane();
        ProjectItems = new javax.swing.JList<>();
        TaskList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTasks = new javax.swing.JTable();

        EmptyList.setBackground(new java.awt.Color(255, 255, 255));

        EmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        EmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmptyListTitle.setForeground(new java.awt.Color(0, 153, 102));
        EmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyListTitle.setText("Nenhuma tarefa cadastrada");

        EmptyListSubtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmptyListSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        EmptyListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyListSubtitle.setText("Clique no botão \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout EmptyListLayout = new javax.swing.GroupLayout(EmptyList);
        EmptyList.setLayout(EmptyListLayout);
        EmptyListLayout.setHorizontalGroup(
            EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmptyListSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        EmptyListLayout.setVerticalGroup(
            EmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmptyListLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(EmptyListIcon)
                .addGap(18, 18, 18)
                .addComponent(EmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmptyListSubtitle)
                .addGap(123, 123, 123))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 800));

        Toolbar.setBackground(new java.awt.Color(0, 153, 102));
        Toolbar.setPreferredSize(new java.awt.Dimension(800, 300));

        ToolbarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ToolbarTitle.setForeground(new java.awt.Color(255, 255, 255));
        ToolbarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        ToolbarTitle.setText(" Todo App");

        javax.swing.GroupLayout ToolbarLayout = new javax.swing.GroupLayout(Toolbar);
        Toolbar.setLayout(ToolbarLayout);
        ToolbarLayout.setHorizontalGroup(
            ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolbarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ToolbarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        ToolbarLayout.setVerticalGroup(
            ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolbarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ToolbarTitle)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Projects.setBackground(new java.awt.Color(255, 255, 255));
        Projects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ProjectsTitle.setForeground(new java.awt.Color(0, 153, 102));
        ProjectsTitle.setText("Projetos");

        ProjectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N

        javax.swing.GroupLayout ProjectsLayout = new javax.swing.GroupLayout(Projects);
        Projects.setLayout(ProjectsLayout);
        ProjectsLayout.setHorizontalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(ProjectsAdd)
                .addContainerGap())
        );
        ProjectsLayout.setVerticalGroup(
            ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(ProjectsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Tasks.setBackground(new java.awt.Color(255, 255, 255));
        Tasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TasksTitle.setForeground(new java.awt.Color(0, 153, 102));
        TasksTitle.setText("Tarefas");

        TasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N

        javax.swing.GroupLayout TasksLayout = new javax.swing.GroupLayout(Tasks);
        Tasks.setLayout(TasksLayout);
        TasksLayout.setHorizontalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TasksAdd)
                .addContainerGap())
        );
        TasksLayout.setVerticalGroup(
            TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(TasksAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ProjectList.setBackground(new java.awt.Color(255, 255, 255));
        ProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ProjectItem.setBackground(new java.awt.Color(255, 255, 255));

        ProjectItems.setBackground(new java.awt.Color(255, 255, 255));
        ProjectItems.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProjectItems.setForeground(new java.awt.Color(0, 0, 0));
        ProjectItems.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ProjectItems.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ProjectItems.setFixedCellHeight(50);
        ProjectItems.setSelectionBackground(new java.awt.Color(0, 153, 102));
        ProjectItem.setViewportView(ProjectItems);

        javax.swing.GroupLayout ProjectListLayout = new javax.swing.GroupLayout(ProjectList);
        ProjectList.setLayout(ProjectListLayout);
        ProjectListLayout.setHorizontalGroup(
            ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProjectItem)
                .addContainerGap())
        );
        ProjectListLayout.setVerticalGroup(
            ProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProjectItem)
        );

        TaskList.setBackground(new java.awt.Color(255, 255, 255));
        TaskList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TaskList.setForeground(new java.awt.Color(255, 255, 255));

        TableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        TableTasks.setRowHeight(50);
        TableTasks.setSelectionBackground(new java.awt.Color(0, 177, 116));
        TableTasks.setShowGrid(false);
        TableTasks.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(TableTasks);

        javax.swing.GroupLayout TaskListLayout = new javax.swing.GroupLayout(TaskList);
        TaskList.setLayout(TaskListLayout);
        TaskListLayout.setHorizontalGroup(
            TaskListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        TaskListLayout.setVerticalGroup(
            TaskListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TaskList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Projects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TaskList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmptyList;
    private javax.swing.JLabel EmptyListIcon;
    private javax.swing.JLabel EmptyListSubtitle;
    private javax.swing.JLabel EmptyListTitle;
    private javax.swing.JScrollPane ProjectItem;
    private javax.swing.JList<String> ProjectItems;
    private javax.swing.JPanel ProjectList;
    private javax.swing.JPanel Projects;
    private javax.swing.JLabel ProjectsAdd;
    private javax.swing.JLabel ProjectsTitle;
    private javax.swing.JTable TableTasks;
    private javax.swing.JPanel TaskList;
    private javax.swing.JPanel Tasks;
    private javax.swing.JLabel TasksAdd;
    private javax.swing.JLabel TasksTitle;
    private javax.swing.JPanel Toolbar;
    private javax.swing.JLabel ToolbarTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTasks() {
        
        // Customizando o header da table tarefas
        TableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        TableTasks.getTableHeader().setBackground(new Color(0,153,102));
        TableTasks.getTableHeader().setForeground(new Color(255,255,255));
        
        //Criando um sort automático para as colunas da table
        TableTasks.setAutoCreateRowSorter(true);
    }
}
