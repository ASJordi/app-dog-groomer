package dev.asjordi.view;

import dev.asjordi.model.Pet;
import dev.asjordi.service.IService;
import dev.asjordi.service.PetOwnerService;
import dev.asjordi.util.HibernateUtil;
import jakarta.persistence.EntityManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class ShowPets extends javax.swing.JFrame {
    
    private IService repo;
    private EntityManager em;

    /**
     * Creates new form ShowPets
     */
    public ShowPets() {
        this.em = HibernateUtil.getEntityManager();
        this.repo = new PetOwnerService(em);
        initComponents();
        loadData();
    }
    
    private void loadData() {
        
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columns = {"Id", "Pet's Name", "Breed", "Color", "Allergic", "Special Attention", "Notes", "Owner no.", "Owner's Name", "Owner's Phone", "Owner's Address"};
        tableModel.setColumnIdentifiers(columns);
        
        try {
            List<Pet> pets = repo.getAllPets();
            
            if (!pets.isEmpty()) {
                for (Pet p : pets) {
                    Object[] data = {p.getId(), p.getPetName(), p.getDogBreed(), p.getColor(), p.getAllergic(), p.getSpecialAttention(), p.getNotes(), p.getOwner().getId(), p.getOwner().getName(), p.getOwner().getPhone(), p.getOwner().getAddress()};
                    tableModel.addRow(data);
                }
            }
            
        } catch (Exception e) {}
        
        tablePets.setModel(tableModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jpTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePets = new javax.swing.JTable();
        jpButtons = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dog groomer | Pets");
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        jpMain.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Dog Groomer");

        jpTable.setBackground(new java.awt.Color(255, 255, 255));

        tablePets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Pet's Name", "Breed", "Color", "Allergic", "Special Attention", "Notes", "Owner no.", "Owner's Name", "Owner's Phone", "Owner's Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePets);
        if (tablePets.getColumnModel().getColumnCount() > 0) {
            tablePets.getColumnModel().getColumn(0).setResizable(false);
            tablePets.getColumnModel().getColumn(1).setResizable(false);
            tablePets.getColumnModel().getColumn(2).setResizable(false);
            tablePets.getColumnModel().getColumn(3).setResizable(false);
            tablePets.getColumnModel().getColumn(4).setResizable(false);
            tablePets.getColumnModel().getColumn(5).setResizable(false);
            tablePets.getColumnModel().getColumn(6).setResizable(false);
            tablePets.getColumnModel().getColumn(7).setResizable(false);
            tablePets.getColumnModel().getColumn(8).setResizable(false);
            tablePets.getColumnModel().getColumn(9).setResizable(false);
            tablePets.getColumnModel().getColumn(10).setResizable(false);
        }

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpButtonsLayout = new javax.swing.GroupLayout(jpButtons);
        jpButtons.setLayout(jpButtonsLayout);
        jpButtonsLayout.setHorizontalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpButtonsLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jpButtonsLayout.setVerticalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtonsLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpMainLayout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(title)
                .addGap(0, 529, Short.MAX_VALUE))
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tablePets.getRowCount() > 0 ) {
            if (tablePets.getSelectedRow() != -1) {
                int id = Integer.parseInt(String.valueOf(tablePets.getValueAt(tablePets.getSelectedRow(), 0)));
                
                if (JOptionPane.showConfirmDialog(rootPane, "Are you sure to continue?", "Pet Groomer", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    UpdatePet up = new UpdatePet(id);
                    this.setVisible(false);

                    up.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            setVisible(true);
                            loadData();
                        } 
                    });

                    up.setVisible(true);
                    up.setLocationRelativeTo(null);
                }
                
            } else JOptionPane.showMessageDialog(rootPane, "Please select a register", "Pet Groomer", JOptionPane.OK_OPTION);
        } else JOptionPane.showMessageDialog(rootPane, "Error, the table is empty", "Pet Groomer", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (tablePets.getRowCount() > 0 ) {
            if (tablePets.getSelectedRow() != -1) {
                int id = Integer.parseInt(String.valueOf(tablePets.getValueAt(tablePets.getSelectedRow(), 0)));
                
                if (JOptionPane.showConfirmDialog(rootPane, "Are you sure to continue?", "Pet Groomer", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    try {
                        repo.deletePet(id);
                        JOptionPane.showMessageDialog(rootPane, "Register removed correctly", "Pet Groomer", JOptionPane.INFORMATION_MESSAGE);
                        loadData();
                    } catch (Exception e) {}
                }
                
            } else JOptionPane.showMessageDialog(rootPane, "Please select a record", "Pet Groomer", JOptionPane.OK_OPTION);
        } else JOptionPane.showMessageDialog(rootPane, "Error, the table is empty", "Pet Groomer", JOptionPane.ERROR_MESSAGE);
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpButtons;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpTable;
    private javax.swing.JTable tablePets;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
