package com.mycompany.mavenproject1.views;

import com.mycompany.mavenproject1.DashboardAdmin;
import com.mycompany.mavenproject1.controllers.AppController;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class EditarUsuario extends javax.swing.JPanel {
    private String contraseña;
    private AppController appController;

    public void setAppController(AppController appController) {
        this.appController = appController;
    }

    // Método para establecer la contraseña
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public EditarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnIcon = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        fieldNombre = new javax.swing.JTextField();
        fieldApellido = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        fieldDni = new javax.swing.JTextField();
        boxSocio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fieldTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldFecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        returnIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnIconMouseEntered(evt);
            }
        });

        setPreferredSize(new java.awt.Dimension(926, 540));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(926, 540));

        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });
        fieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNombreKeyTyped(evt);
            }
        });

        fieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldApellidoActionPerformed(evt);
            }
        });
        fieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldApellidoKeyTyped(evt);
            }
        });

        fieldEmail.setEditable(false);

        fieldDni.setEditable(false);
        fieldDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldDniKeyTyped(evt);
            }
        });

        boxSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        boxSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSocioActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellido");

        fieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTelefonoActionPerformed(evt);
            }
        });
        fieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTelefonoKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha nacimiento");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Email");

        fieldFecha.setDateFormatString("yyyy-MM-dd");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Teléfono");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Socio");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Modificar datos usuario");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(68, 68, 68)
                        .addComponent(btnCancelar))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(529, Short.MAX_VALUE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(66, 66, 66)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(boxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(fieldFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldNombre)
                                    .addComponent(fieldApellido)
                                    .addComponent(fieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(491, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(fieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(fieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(boxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        Calendar calendar = Calendar.getInstance();
        Date fechaActual = calendar.getTime();

        // Establecer la fecha actual como el límite máximo para la selección
        fieldFecha.setMaxSelectableDate(fechaActual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void fieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNombreKeyTyped
        // Verificar si la tecla presionada es una letra o un carácter especial permitido
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != ' ' && c != '\'') {
            // Si no es una letra o un carácter especial permitido, consumir el evento para ignorarlo
            evt.consume();
        }    
    }//GEN-LAST:event_fieldNombreKeyTyped

    private void boxSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSocioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //El boton para añadir el usuario
        String nombre, apellido, dni, email, telef, socio;
        Date fecha;

        nombre = fieldNombre.getText();
        apellido = fieldApellido.getText();
        dni = fieldDni.getText();
        email = fieldEmail.getText();
        telef = fieldTelefono.getText();
        socio = boxSocio.getSelectedItem().toString();
        fecha = fieldFecha.getDate();

        // Verificar que los campos no estén vacíos
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || email.isEmpty() ||
            telef.isEmpty() || socio.isEmpty() || fecha == null) {
            if(fecha == null){
                JOptionPane.showMessageDialog(null, "Por favor, selecciona una fecha válida");
            }
            else{
            // Mostrar un mensaje indicando que todos los campos deben estar llenos
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            // Llamar a la función para añadir el usuario solo si todos los campos están llenos
            AppController appController = new AppController();
            appController.editarUsuario(nombre, apellido, dni, email, telef, socio, fecha, contraseña, this);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void fieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTelefonoActionPerformed

    private void fieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTelefonoKeyTyped
        // Obtener el texto actual en el campo de teléfono
        String telefono = fieldTelefono.getText();

        // Verificar si la tecla presionada es un número y si no excede la longitud de 9 caracteres
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || telefono.length() >= 9) {
            // Si no es un número o excede la longitud, consumir el evento para ignorarlo
            evt.consume();
        }
    }//GEN-LAST:event_fieldTelefonoKeyTyped

    private void fieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellidoActionPerformed

    private void returnIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnIconMouseEntered

    }//GEN-LAST:event_returnIconMouseEntered

    private void fieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldApellidoKeyTyped
        // Verificar si la tecla presionada es una letra o un carácter especial permitido
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != ' ' && c != '\'') {
            // Si no es una letra o un carácter especial permitido, consumir el evento para ignorarlo
            evt.consume();
        }
    }//GEN-LAST:event_fieldApellidoKeyTyped

    private void fieldDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldDniKeyTyped

    }//GEN-LAST:event_fieldDniKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        AppController controller = new AppController();
        controller.showJPanelController(new GestionUsuarios());
        
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JComboBox<String> boxSocio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    public javax.swing.JTextField fieldApellido;
    public javax.swing.JTextField fieldDni;
    public javax.swing.JTextField fieldEmail;
    public com.toedter.calendar.JDateChooser fieldFecha;
    public javax.swing.JTextField fieldNombre;
    public javax.swing.JTextField fieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel returnIcon;
    // End of variables declaration//GEN-END:variables
}
