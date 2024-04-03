
package Form;
import Entity.QueQuan;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;


public class QuanLiSinhVien extends javax.swing.JFrame {

    private DefaultComboBoxModel<QueQuan> model;
    private DefaultTableModel tbModel;       //Nhu kieu tao 1 ArrayList de luu tru doi tuong que quan

    public QuanLiSinhVien() throws SQLException, ClassNotFoundException {
        initComponents();
        loadQueQuan();
        
        initTable();
        loadTable();
    }

    private void loadQueQuan() {
        model = new DefaultComboBoxModel<>();//Khoi tao
        model.addElement(new QueQuan("vn", "Viet Nam"));//Gan thong tin cho doi tuong
        model.addElement(new QueQuan("jp", "Janpanese"));
        model.addElement(new QueQuan("Korea", "Han Quoc"));
        model.addElement(new QueQuan("China", "Trung Quoc"));
        cboQueQuan.setModel(model);//Du lieu trong combobox duoc thay moi

    }
    
    private void loadTable() throws SQLException, ClassNotFoundException{
        String sql="select * from sinhvien";
        try(
             Connection con=DBHelper.DBHelper.getConnect();
                PreparedStatement pr=con.prepareStatement(sql);
             ) {
            try(ResultSet rs=pr.executeQuery()){
                tbModel.setRowCount(0);
            
                while(rs.next()){
                    Object[] row=new Object[]{
                    rs.getInt("id"),
                    rs.getInt("Masv"),
                    rs.getString("HoTen"),
                    rs.getString("Lop"),
                    rs.getString("GioiTinh"),
                    rs.getString("QueQuan")
                };
                tbModel.addRow(row);
                
            }
                tbModel.fireTableDataChanged();          
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }
    private void initTable(){
        tbModel=new DefaultTableModel();
        tbModel.setColumnIdentifiers(new String[]{"ID","Masv","HoTen","Lop","GioiTinh","QueQuan"});
        
        tbList.setDefaultEditor(Object.class, null);
        tbList.setModel(tbModel);
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtID = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMSV = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHoTen = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtLop = new javax.swing.JTextPane();
        jTextField5 = new javax.swing.JTextField();
        cboQueQuan = new javax.swing.JComboBox<>();
        btNu = new javax.swing.JRadioButton();
        btNam = new javax.swing.JRadioButton();
        jTextField6 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setText("Id");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("MSV");

        jTextField3.setEditable(false);
        jTextField3.setText("HoTen");

        jTextField4.setEditable(false);
        jTextField4.setText("Lop");

        txtID.setEditable(false);
        jScrollPane1.setViewportView(txtID);

        jScrollPane2.setViewportView(txtMSV);

        jScrollPane3.setViewportView(txtHoTen);

        jScrollPane4.setViewportView(txtLop);

        jTextField5.setEditable(false);
        jTextField5.setText("QueQuan");

        btgGioiTinh.add(btNu);
        btNu.setText("Nu");

        btgGioiTinh.add(btNam);
        btNam.setSelected(true);
        btNam.setText("Nam");

        jTextField6.setEditable(false);
        jTextField6.setText("GioiTinh");

        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField5)
                    .addComponent(jTextField4)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNam)
                    .addComponent(btNu))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(46, 46, 46)
                .addComponent(btnUpdate)
                .addGap(44, 44, 44)
                .addComponent(btnSave)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cboQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btNu)
                                .addGap(66, 66, 66)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew)
                            .addComponent(btnDelete)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnSave))))
                .addContainerGap())
        );

        tbList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtHoTen.setText("");
        txtLop.setText("");
        txtMSV.setText("");
        txtID.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        //Update

        JFrame frame = new JFrame();//Hop thoai truoc khi update
        if (JOptionPane.showConfirmDialog(frame, "Ban co muon sua", "Xac nhan", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }
        String sql = "update sinhvien set masv=?,hoten=?,lop=?,gioitinh=?,quequan=?" + " where id = ?";

        try (
                Connection con = DBHelper.DBHelper.getConnect(); //Ket noi toi database
                 PreparedStatement pr = con.prepareStatement(sql);//Lay id
                ) {
            pr.setInt(1, Integer.parseInt(txtMSV.getText()));
            pr.setString(2, txtHoTen.getText());
            pr.setString(3, txtLop.getText());

            String gt = btNam.isSelected() ? "Nam" : "Nu";//Neu dung thi la Nam sai thi la Nu
            pr.setString(4, gt);

            QueQuan selected = (QueQuan) cboQueQuan.getSelectedItem();  //Chon que quan trong combobox
            pr.setString(5, selected.getName());         //Lay ten que quan .Neu muon lay id thi selected.getId();

            pr.setInt(6, Integer.parseInt(txtID.getText()));

            int rows = pr.executeUpdate();

            //Thong bao update
            JOptionPane.showMessageDialog(frame,
                    "Update moi thanh cong",
                    "Title ",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        //SAVE
        String sql = "insert into sinhvien(masv,hoten,lop,gioitinh,quequan)" + "values(?,?,?,?,?)";
        try (
                Connection con = DBHelper.DBHelper.getConnect(); //Ket noi toi database
                 PreparedStatement pr = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);//Lay id
                ) {

            pr.setInt(1, Integer.parseInt(txtMSV.getText()));
            pr.setString(2, txtHoTen.getText());
            pr.setString(3, txtLop.getText());
            //setGioiTinh
            String gt = btNam.isSelected() ? "Nam" : "Nu";
            pr.setString(4, gt);
//            pr.setBoolean(4, btNam.isSelected());
            //setQuequan          
            QueQuan selected = (QueQuan) cboQueQuan.getSelectedItem();  //Gan thong tin que quan vao combobox
            pr.setString(5, selected.getName());  //Lay ten que quan .Neu muon lay id thi selected.getId();
            //Thuc hien them moi du lieu         
            int rows = pr.executeUpdate();
            System.out.println("So dong vua them "+rows);
            //Thong bao them moi
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,
                    "Them moi thanh cong",
                    "Title ",
                    JOptionPane.INFORMATION_MESSAGE);

            ResultSet rs = pr.getGeneratedKeys();//Lay key
            if (rs.next()) {
                int id = rs.getInt(1);
                txtID.setText("" + id);
            }
           loadTable();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showInternalMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        //DELETE
        Frame frame = new JFrame();//Hop thoai truoc khi update
        if (JOptionPane.showConfirmDialog(frame, "Ban co muon xoa", "Xac nhan", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }
        String sql = "delete from sinhvien" + " where id = ?";

        try (
                Connection con = DBHelper.DBHelper.getConnect(); //Ket noi toi database
                 PreparedStatement pr = con.prepareStatement(sql);//Lay id
            ) {
         

            pr.setInt(1, Integer.parseInt(txtID.getText())); //Lay id muon xoa

            int rows = pr.executeUpdate();

            //Thong bao update
            JOptionPane.showMessageDialog(frame,
                    "Xoa moi thanh cong",
                    "Title ",
                    JOptionPane.INFORMATION_MESSAGE);
            loadTable();

        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
                           
                                                                                
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListMouseClicked
       if(evt.getClickCount()==2){
        int selectRow=tbList.getSelectedRow();
        if(selectRow>=1){
            txtID.setText(tbList.getValueAt(selectRow, 0).toString());
            txtMSV.setText(tbList.getValueAt(selectRow, 1).toString());
            txtHoTen.setText(tbList.getValueAt(selectRow, 2).toString());
            txtLop.setText(tbList.getValueAt(selectRow, 3).toString());
            
            Boolean isMale=tbList.getValueAt(selectRow, 4).toString().equals("Nam");
            btNam.setSelected(isMale);
            btNu.setSelected(!isMale);
            
           
            
            for(int i=0;i<cboQueQuan.getItemCount();i++){
                QueQuan item=cboQueQuan.getItemAt(i);
                String selectedID=tbList.getValueAt(selectRow,5 ).toString();
                if(selectedID.trim().equals(item.getId())){
                    cboQueQuan.setSelectedItem(item);
                    break;
                }
            }
            
        
        }
       }
        
        
        
    }//GEN-LAST:event_tbListMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        new QuanLiSinhVien().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(QuanLiSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(QuanLiSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btNam;
    private javax.swing.JRadioButton btNu;
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<QueQuan> cboQueQuan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tbList;
    private javax.swing.JTextPane txtHoTen;
    private javax.swing.JTextPane txtID;
    private javax.swing.JTextPane txtLop;
    private javax.swing.JTextPane txtMSV;
    // End of variables declaration//GEN-END:variables
}
