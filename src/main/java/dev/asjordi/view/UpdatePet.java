package dev.asjordi.view;

import dev.asjordi.model.Owner;
import dev.asjordi.model.Pet;
import dev.asjordi.service.IService;
import dev.asjordi.service.PetOwnerService;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class UpdatePet extends javax.swing.JFrame {

    IService repo;
    private Pet pet = null;
    
    public UpdatePet(Integer petId) {
        this.repo = new PetOwnerService();
        initComponents();
        loadPetData(petId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jpData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPetName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDogBreed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbAllergic = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbSpecialAttention = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtOwnerAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        txtOwnerPhone = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Pet");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jpMain.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Dog Groomer");

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setForeground(new java.awt.Color(255, 255, 255));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image.png"))); // NOI18N
        icon.setText("jLabel2");
        icon.setMaximumSize(new java.awt.Dimension(100, 100));
        icon.setMinimumSize(new java.awt.Dimension(100, 100));
        icon.setPreferredSize(new java.awt.Dimension(100, 100));

        jpData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Dog Name:");

        txtPetName.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        txtPetName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dog Breed:");

        txtDogBreed.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        txtDogBreed.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Color:");

        txtColor.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        txtColor.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Allergic:");

        cbAllergic.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        cbAllergic.setForeground(new java.awt.Color(0, 0, 0));
        cbAllergic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Special Attention:");

        cbSpecialAttention.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        cbSpecialAttention.setForeground(new java.awt.Color(0, 0, 0));
        cbSpecialAttention.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Owner's Name:");

        txtOwnerName.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        txtOwnerName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Owner's Address:");

        txtOwnerAddress.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        txtOwnerAddress.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Notes:");

        txtNotes.setColumns(20);
        txtNotes.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        txtNotes.setForeground(new java.awt.Color(0, 0, 0));
        txtNotes.setRows(5);
        jScrollPane1.setViewportView(txtNotes);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Owner's Phone:");

        txtOwnerPhone.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        txtOwnerPhone.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jpDataLayout = new javax.swing.GroupLayout(jpData);
        jpData.setLayout(jpDataLayout);
        jpDataLayout.setHorizontalGroup(
            jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpDataLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDataLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtOwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDataLayout.createSequentialGroup()
                        .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPetName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDogBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtColor)
                                .addComponent(cbAllergic, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtOwnerName)
                                .addComponent(cbSpecialAttention, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtOwnerAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpDataLayout.setVerticalGroup(
            jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDataLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDogBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbAllergic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cbSpecialAttention, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtOwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSave.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title)
                    .addComponent(jpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMainLayout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void loadPetData(Integer id) {
        try {
            this.pet = repo.getPetById(id);
            txtPetName.setText(pet.getPetName());
            txtDogBreed.setText(pet.getDogBreed());
            txtColor.setText(pet.getColor());
            cbAllergic.setSelectedIndex(pet.getAllergic() ? 0 : 1);
            cbSpecialAttention.setSelectedIndex(pet.getSpecialAttention() ? 0 : 1);
            txtNotes.setText(pet.getNotes());
            txtOwnerName.setText(pet.getOwner().getName());
            txtOwnerPhone.setText(pet.getOwner().getPhone());
            txtOwnerAddress.setText(pet.getOwner().getAddress());
            
        } catch (SQLException e) {}
    }
    
    private void clear() {
        txtPetName.setText("");
        txtDogBreed.setText("");
        txtColor.setText("");
        txtOwnerName.setText("");
        txtOwnerAddress.setText("");
        txtOwnerPhone.setText("");
        txtNotes.setText("");
        cbAllergic.setSelectedIndex(0);
        cbSpecialAttention.setSelectedIndex(0); 
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    
        String petName = txtPetName.getText();
        String dogBreed = txtDogBreed.getText();
        String color = txtColor.getText();
        Boolean allergic = cbAllergic.getSelectedItem().equals("Yes") ? true : false;
        Boolean specialAttention = cbSpecialAttention.getSelectedItem().equals("Yes") ? true : false;
        String notes = txtNotes.getText();     
        
        String ownerName = txtOwnerName.getText();
        String ownerPhone = txtOwnerPhone.getText();
        String ownerAddress = txtOwnerAddress.getText();
        
        if (!petName.isBlank() && !dogBreed.isBlank() && !color.isBlank() && !notes.isBlank() && !ownerName.isBlank() && !ownerPhone.isBlank() && !ownerAddress.isBlank()) {
               
            try {
                
                Owner o = new Owner(ownerName, ownerPhone, ownerAddress);
                Pet p = new Pet(petName, dogBreed, color, allergic, specialAttention, notes);
                p.setId(this.pet.getId());
                
                repo.addPetWithOwner(p, o);
                
                JOptionPane.showMessageDialog(rootPane, "Updated!", "Pet Groomer", JOptionPane.QUESTION_MESSAGE);
                this.dispose();
            } catch (Exception e) {}
            
        } else JOptionPane.showMessageDialog(rootPane, "Fill out the fields", "Pet Groomer", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnSaveActionPerformed
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbAllergic;
    private javax.swing.JComboBox<String> cbSpecialAttention;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpData;
    private javax.swing.JPanel jpMain;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDogBreed;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtOwnerAddress;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerPhone;
    private javax.swing.JTextField txtPetName;
    // End of variables declaration//GEN-END:variables
}
