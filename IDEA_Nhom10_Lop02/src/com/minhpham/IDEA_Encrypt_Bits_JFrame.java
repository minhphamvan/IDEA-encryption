package com.minhpham;

import java.awt.Dimension;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;

/**
 *
 * @author Minh Pham
 */
public class IDEA_Encrypt_Bits_JFrame extends javax.swing.JFrame {

    private String quaTrinhMaHoaGiaiMa;

    public IDEA_Encrypt_Bits_JFrame() {
        initComponents();
        setTitle("GIẢI THUẬT MÃ HÓA IDEA: Encrypt bits");
        setLocationRelativeTo(null);

        quaTrinhMaHoaGiaiMa = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKhoaBiMat = new javax.swing.JTextField();
        checkboxSinhNgauNhien = new javax.swing.JCheckBox();
        btnTaoCacKhoaCon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCacKhoaCon = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtbanRo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtKhoaBiMat_MaHoa = new javax.swing.JTextField();
        btnMaHoa = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtBanMa = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtBanMa_GiaiMa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtKhoaBiMat_GiaiMa = new javax.swing.JTextField();
        btnGiaiMa = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtBanRo_GiaiMa = new javax.swing.JTextField();
        btnXemQuaTrinhMaHoaGiaiMa = new javax.swing.JButton();
        btnLamLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Khóa bí mật:");

        checkboxSinhNgauNhien.setText("Sinh ngẫu nhiên");

        btnTaoCacKhoaCon.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTaoCacKhoaCon.setText("1. Tạo các khóa con");
        btnTaoCacKhoaCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoCacKhoaConActionPerformed(evt);
            }
        });

        txtCacKhoaCon.setColumns(20);
        txtCacKhoaCon.setRows(5);
        jScrollPane1.setViewportView(txtCacKhoaCon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTaoCacKhoaCon)
                                .addContainerGap(116, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(checkboxSinhNgauNhien)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtKhoaBiMat))
                                .addGap(10, 10, 10))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKhoaBiMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkboxSinhNgauNhien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaoCacKhoaCon)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sinh khóa", jPanel1);

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Bản rõ:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Khóa bí mật:");

        btnMaHoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMaHoa.setText("2. Mã hóa");
        btnMaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("=> Bản mã:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtKhoaBiMat_MaHoa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBanMa)
                    .addComponent(txtbanRo, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(235, Short.MAX_VALUE)
                .addComponent(btnMaHoa)
                .addGap(162, 162, 162))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtbanRo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtKhoaBiMat_MaHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMaHoa)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanMa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Mã hóa", jPanel2);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Bản mã:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Khóa bí mật:");

        btnGiaiMa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGiaiMa.setText("3. Giải mã");
        btnGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMaActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("=> Bản rõ:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBanMa_GiaiMa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBanRo_GiaiMa)
                    .addComponent(txtKhoaBiMat_GiaiMa, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(btnGiaiMa)
                .addGap(155, 155, 155))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtBanMa_GiaiMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKhoaBiMat_GiaiMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGiaiMa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtBanRo_GiaiMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane3.addTab("Giải mã", jPanel3);

        btnXemQuaTrinhMaHoaGiaiMa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXemQuaTrinhMaHoaGiaiMa.setText("Xem quá trình mã hóa/giải mã");
        btnXemQuaTrinhMaHoaGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemQuaTrinhMaHoaGiaiMaActionPerformed(evt);
            }
        });

        btnLamLai.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLamLai.setText("Làm lại");
        btnLamLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnXemQuaTrinhMaHoaGiaiMa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamLai, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane2)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXemQuaTrinhMaHoaGiaiMa)
                            .addComponent(btnLamLai))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMaActionPerformed
        String banMa = txtBanMa_GiaiMa.getText();
        String key = txtKhoaBiMat_GiaiMa.getText();

        // Sinh các khóa con
        String[] subKey = generateSubKey(key);

        // Giải mã
        String banRo = decrypt(banMa, subKey);

        txtBanRo_GiaiMa.setText(banRo);
    }//GEN-LAST:event_btnGiaiMaActionPerformed

    private void btnMaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaActionPerformed
        this.quaTrinhMaHoaGiaiMa = "";

        // Kiểm tra bản rõ nhập vào
        String banRo = txtbanRo.getText();

        if (banRo.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập đầy đủ bản rõ và khóa bí mật !!");
            return;
        } else {
            for (int i = 0; i < banRo.length(); i++) {
                if (banRo.charAt(i) == '0' || banRo.charAt(i) == '1') {
                    continue;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Hãy nhập bản rõ dạng nhị phân !!");
                    return;
                }
            }
        }

        // Sinh các khóa con
        String key = txtKhoaBiMat_MaHoa.getText();
        String[] subKey = generateSubKey(key);

        // Mã hóa
        String banMa = encrypt(banRo, subKey);

        txtBanMa.setText(banMa);
        txtBanMa_GiaiMa.setText(banMa);
    }//GEN-LAST:event_btnMaHoaActionPerformed

    private void btnTaoCacKhoaConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoCacKhoaConActionPerformed
        String key;

        if (checkboxSinhNgauNhien.isSelected() == true) {
            txtKhoaBiMat.setText("11001000000000011001000000000010010110000000001100100000000000111110100000000100101100000000010101111000000001100100000");
            checkboxSinhNgauNhien.setSelected(false);
        } else {
            String khoaBiMat = txtKhoaBiMat.getText();

            if (khoaBiMat.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Hãy nhập khóa bí mật !!");
                return;
            } else {
                for (int i = 0; i < khoaBiMat.length(); i++) {
                    if (khoaBiMat.charAt(i) == '0' || khoaBiMat.charAt(i) == '1') {
                        continue;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Hãy nhập khóa bí mật dạng nhị phân !!");
                        return;
                    }
                }
            }
        }

        key = txtKhoaBiMat.getText();

        // Set khóa bí mật vào khung Mã hóa/Giải mã
        txtKhoaBiMat_MaHoa.setText(key);
        txtKhoaBiMat_GiaiMa.setText(key);

        String[] subKey = generateSubKey(key);

        String result = "";
        for (int i = 0; i < subKey.length; i++) {
            result += "subKey[" + i + "]:\t" + subKey[i];

            if (i != subKey.length - 1) {
                result += "\n";
            }
        }

        txtCacKhoaCon.setText(result);
    }//GEN-LAST:event_btnTaoCacKhoaConActionPerformed

    private void btnLamLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamLaiActionPerformed
        this.quaTrinhMaHoaGiaiMa = "";

        txtKhoaBiMat.setText("");
        checkboxSinhNgauNhien.setSelected(false);
        txtCacKhoaCon.setText("");

        txtbanRo.setText("");
        txtKhoaBiMat_MaHoa.setText("");
        txtBanMa.setText("");

        txtBanMa_GiaiMa.setText("");
        txtKhoaBiMat_GiaiMa.setText("");
        txtBanRo_GiaiMa.setText("");
    }//GEN-LAST:event_btnLamLaiActionPerformed

    private void btnXemQuaTrinhMaHoaGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemQuaTrinhMaHoaGiaiMaActionPerformed
        try {
            JTextPane jtp = new JTextPane();
            Document doc = jtp.getDocument();
            doc.insertString(doc.getLength(), quaTrinhMaHoaGiaiMa, new SimpleAttributeSet());

            JScrollPane jsp = new JScrollPane(jtp);
            jsp.setPreferredSize(new Dimension(650, 350));
            jsp.setBorder(null);

            JOptionPane.showMessageDialog(null, jsp, "Chi tiết quá trình mã hóa/giải mã", JOptionPane.INFORMATION_MESSAGE);
        } catch (BadLocationException ex) {
            Logger.getLogger(IDEA_Encrypt_Bits_JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXemQuaTrinhMaHoaGiaiMaActionPerformed

    // Dịch vòng
    private static String dichVong(String s) {
        if (s.length() < 128) {
            for (int i = s.length(); i < 128; i++) {
                s = "0" + s;
            }
        }

        String answer = "";

        for (int i = 25; i < 128; i++) {
            answer += s.charAt(i);
        }

        for (int i = 0; i < 25; i++) {
            answer = answer + s.charAt(i);
        }

        return answer;
    }

    // XOR
    private static String xor(String x, String y) {
        if (x.length() < 16) {
            for (int i = x.length(); i < 16; i++) {
                x = "0" + x;
            }
        }
        if (y.length() < 16) {
            for (int i = y.length(); i < 16; i++) {
                y = "0" + y;
            }
        }

        String answer = "";

        for (int i = 15; i >= 0; i--) {
            if (x.charAt(i) == y.charAt(i)) {
                answer = "0" + answer;
            } else {
                answer = "1" + answer;
            }
        }

        return answer;
    }

    // cộng modulo
    private static String mod_add(String x, String y) {
        if (x.length() < 16) {
            for (int i = x.length(); i < 16; i++) {
                x = "0" + x;
            }
        }
        if (y.length() < 16) {
            for (int i = y.length(); i < 16; i++) {
                y = "0" + y;
            }
        }

        long first = Long.parseLong(x, 2);
        long second = Long.parseLong(y, 2);
        long sum = (long) (first + second);

        long answer = (long) (sum % (Math.pow(2, 16)));

        String result = Long.toBinaryString(answer);

        if (result.length() < 16) {
            for (int i = result.length(); i < 16; i++) {
                result = '0' + result;
            }
        }

        return result;
    }

    // nhân modulo
    private static String mod_mul(String x, String y) {
        if (x.length() < 16) {
            for (int i = x.length(); i < 16; i++) {
                x = "0" + x;
            }
        }
        if (y.length() < 16) {
            for (int i = y.length(); i < 16; i++) {
                y = "0" + y;
            }
        }

        long first = Long.parseLong(x, 2);
        long second = Long.parseLong(y, 2);
        long mul = (long) first * second;

        long answer = (long) (mul % (Math.pow(2, 16) + 1));
        String result = Long.toBinaryString(answer);

        if (result.length() < 16) {
            for (int i = result.length(); i < 16; i++) {
                result = '0' + result;
            }
        }

        return result;
    }

    // Tạo 52 khóa con
    private String[] generateSubKey(String key) {
        if (key.length() < 128) {
            for (int i = key.length(); i < 128; i++) {
                key = "0" + key;
            }
        }

//        BigInteger bigInt1 = new BigInteger(key, 2);
//        String keyHex = bigInt1.toString(16);
//        System.out.println("Key: " + key + " - " + keyHex);
        
        String subKey[] = new String[52];
        int x, y;

        for (int j = 0; j < 6; j++) {
            x = 0;
            for (int i = 0; i < 8; i++) {
                subKey[i + (8 * j)] = key.substring(x, x + 16);
                x = x + 16;
            }

            key = dichVong(key);
        }

        subKey[48] = key.substring(0, 16);
        subKey[49] = key.substring(16, 32);
        subKey[50] = key.substring(32, 48);
        subKey[51] = key.substring(48, 64);

//        for (int i = 0; i < subKey.length; i++) {
//            System.out.println("subKey[" + i + "]:\t" + subKey[i] + "\t-\t" + Long.toHexString(Long.parseLong(subKey[i], 2)));
//        }
        return subKey;
    }

    // modulo 2^16
    private String add_inv(String x) {
        if (x.length() < 16) {
            for (int i = x.length(); i < 16; i++) {
                x = "0" + x;
            }
        }

        long val = Long.parseLong(x, 2);
        long MOD = (long) Math.pow(2, 16);

        if (val > MOD) {
            val = val % MOD;
        }

        val = MOD - val;

        String answer = Long.toBinaryString(val);

        if (answer.length() < 16) {
            for (int i = answer.length(); i < 16; i++) {
                answer = "0" + answer;
            }
        }

        return answer;
    }

    private String mul_inv(String x) {
        BigInteger n1 = new BigInteger(x, 2);
        long MOD = (long) Math.pow(2, 16) + 1;
        String m = MOD + "";

        BigInteger m1 = new BigInteger(m);
        n1 = n1.modInverse(m1);
        String ans = n1.toString(2);

        if (ans.length() < 16) {
            for (int i = ans.length(); i < 16; i++) {
                ans = "0" + ans;
            }
        }

        return ans;
    }

    //    private String mul_inv(String x) {
//        if (x.length() < 16) {
//            for (int i = x.length(); i < 16; i++) {
//                x = "0" + x;
//            }
//        }
//
//        long val = Long.parseLong(x, 2);
//        long MOD = (long) Math.pow(2, 16) + 1;
//
//        val = moduloNghichDao(val, MOD);
//        String result = Long.toBinaryString(val);
//
//        if (result.length() < 16) {
//            for (int i = result.length(); i < 16; i++) {
//                result = "0" + result;
//            }
//        }
//
//        return result;
//    }
//    
//    // Tính nghịch đảo modulo: x^-1 mod p
//    private long moduloNghichDao(long x, long soModulo) {
//        long kd = soModulo;
//        long r = 1, q, y0 = 0, y1 = 1, y = 0;
//
//        while (x != 0) {
//            r = soModulo % x;
//
//            if (r == 0) {
//                break;
//            } else {
//                q = soModulo / x;
//                y = y0 - y1 * q;
//                soModulo = x;
//                x = r;
//                y0 = y1;
//                y1 = y;
//            }
//        }
//
//        if (y >= 0) {
//            return y;
//        } else {
//            y = kd + y;
//            return y;
//        }
//    }
    // Mã hóa
    private String encrypt(String plainText, String[] subKey) {
        if (plainText.length() < 64) {
            for (int i = plainText.length(); i < 64; i++) {
                plainText = '0' + plainText;
            }
        }

//        System.out.println("Plaintext: " + plainText + " - " + Long.toHexString(Long.parseLong(plainText, 2)));
        this.quaTrinhMaHoaGiaiMa += "------------------------------------ MÃ HÓA ------------------------------------";
        this.quaTrinhMaHoaGiaiMa += "\nBản rõ:\t" + plainText + "\n";

        // Chia thành 4 khối bản rõ mỗi khối 16 bit
        String i[] = new String[4];
        i[0] = plainText.substring(0, 16);
        i[1] = plainText.substring(16, 32);
        i[2] = plainText.substring(32, 48);
        i[3] = plainText.substring(48, 64);

        String d[] = new String[15];

        for (int j = 0; j < 8; j++) {
//            System.out.println("Vòng thứ " + (j + 1) + ":");
//            System.out.println("i[0]: " + i[0] + " - " + Long.toHexString(Long.parseLong(i[0], 2)));
//            System.out.println("i[1]: " + i[1] + " - " + Long.toHexString(Long.parseLong(i[1], 2)));
//            System.out.println("i[2]: " + i[2] + " - " + Long.toHexString(Long.parseLong(i[2], 2)));
//            System.out.println("i[3]: " + i[3] + " - " + Long.toHexString(Long.parseLong(i[3], 2)));

            this.quaTrinhMaHoaGiaiMa += "\nVòng thứ " + (j + 1) + ":";
            this.quaTrinhMaHoaGiaiMa += "\n\ti[0]:   " + i[0];
            this.quaTrinhMaHoaGiaiMa += "\n\ti[1]:   " + i[1];
            this.quaTrinhMaHoaGiaiMa += "\n\ti[2]:   " + i[2];
            this.quaTrinhMaHoaGiaiMa += "\n\ti[3]:   " + i[3];

            d[1] = mod_mul(i[0], subKey[0 + (6 * j)]);
            d[2] = mod_add(i[1], subKey[1 + (6 * j)]);
            d[3] = mod_add(i[2], subKey[2 + (6 * j)]);
            d[4] = mod_mul(i[3], subKey[3 + (6 * j)]);

            d[5] = xor(d[1], d[3]);
            d[6] = xor(d[2], d[4]);

            d[7] = mod_mul(d[5], subKey[4 + (6 * j)]);
            d[8] = mod_add(d[6], d[7]);
            d[9] = mod_mul(d[8], subKey[5 + (6 * j)]);
            d[10] = mod_add(d[7], d[9]);

            d[11] = xor(d[1], d[9]);
            d[12] = xor(d[3], d[9]);
            d[13] = xor(d[2], d[10]);
            d[14] = xor(d[4], d[10]);

            i[0] = d[11];
            i[1] = d[12];
            i[2] = d[13];
            i[3] = d[14];
        }

        // Vòng thứ 9
//        System.out.println("Vòng thứ 9:");
//        System.out.println("i[0]: " + i[0] + " - " + Long.toHexString(Long.parseLong(i[0], 2)));
//        System.out.println("i[1]: " + i[1] + " - " + Long.toHexString(Long.parseLong(i[1], 2)));
//        System.out.println("i[2]: " + i[2] + " - " + Long.toHexString(Long.parseLong(i[2], 2)));
//        System.out.println("i[3]: " + i[3] + " - " + Long.toHexString(Long.parseLong(i[3], 2)));
        this.quaTrinhMaHoaGiaiMa += "\nVòng thứ 9:";
        this.quaTrinhMaHoaGiaiMa += "\n\ti[0]:   " + i[0];
        this.quaTrinhMaHoaGiaiMa += "\n\ti[1]:   " + i[1];
        this.quaTrinhMaHoaGiaiMa += "\n\ti[2]:   " + i[2];
        this.quaTrinhMaHoaGiaiMa += "\n\ti[3]:   " + i[3];

        d[1] = mod_mul(i[0], subKey[48]);
        d[2] = mod_add(i[2], subKey[49]);
        d[3] = mod_add(i[1], subKey[50]);
        d[4] = mod_mul(i[3], subKey[51]);

        for (int k = 1; k < 5; k++) {
            if (d[k].length() < 16) {
                for (int h = d[k].length(); h < 16; h++) {
                    d[k] = "0" + d[k];
                }
            }
        }

        String cipher = d[1] + d[2] + d[3] + d[4];
//        System.out.println("Ciphertext: " + cipher + " - " + Long.toHexString(Long.parseLong(cipher, 2)));
        this.quaTrinhMaHoaGiaiMa += "\n\n=> Bản mã:\t" + cipher;

        return cipher;
    }

    // Giải mã
    private String decrypt(String cipherText, String[] subKey) {
        String d[] = new String[15];

        if (cipherText.length() < 64) {
            for (int i = cipherText.length(); i < 64; i++) {
                cipherText = '0' + cipherText;
            }
        }

        String i[] = new String[4];
        d[1] = i[0] = cipherText.substring(0, 16);
        d[2] = i[1] = cipherText.substring(16, 32);
        d[3] = i[2] = cipherText.substring(32, 48);
        d[4] = i[3] = cipherText.substring(48, 64);

        for (int j = 1; j < 5; j++) {
            if (d[j].length() < 16) {
                for (int k = d[j].length(); k < 16; k++) {
                    d[j] = "0" + d[j];
                }
            }
        }

        String invk[] = new String[52];
        invk[0] = mul_inv(subKey[48]);
        invk[1] = add_inv(subKey[49]);
        invk[2] = add_inv(subKey[50]);
        invk[3] = mul_inv(subKey[51]);
        invk[4] = (subKey[46]);
        invk[5] = (subKey[47]);

        invk[6] = mul_inv(subKey[42]);
        invk[7] = add_inv(subKey[44]);
        invk[8] = add_inv(subKey[43]);
        invk[9] = mul_inv(subKey[45]);
        invk[10] = (subKey[40]);
        invk[11] = (subKey[41]);

        invk[12] = mul_inv(subKey[36]);
        invk[13] = add_inv(subKey[38]);
        invk[14] = add_inv(subKey[37]);
        invk[15] = mul_inv(subKey[39]);
        invk[16] = (subKey[34]);
        invk[17] = (subKey[35]);

        invk[18] = mul_inv(subKey[30]);
        invk[19] = add_inv(subKey[32]);
        invk[20] = add_inv(subKey[31]);
        invk[21] = mul_inv(subKey[33]);
        invk[22] = (subKey[28]);
        invk[23] = (subKey[29]);

        invk[24] = mul_inv(subKey[24]);
        invk[25] = add_inv(subKey[26]);
        invk[26] = add_inv(subKey[25]);
        invk[27] = mul_inv(subKey[27]);
        invk[28] = (subKey[22]);
        invk[29] = (subKey[23]);

        invk[30] = mul_inv(subKey[18]);
        invk[31] = add_inv(subKey[20]);
        invk[32] = add_inv(subKey[19]);
        invk[33] = mul_inv(subKey[21]);
        invk[34] = (subKey[16]);
        invk[35] = (subKey[17]);

        invk[36] = mul_inv(subKey[12]);
        invk[37] = add_inv(subKey[14]);
        invk[38] = add_inv(subKey[13]);
        invk[39] = mul_inv(subKey[15]);
        invk[40] = (subKey[10]);
        invk[41] = (subKey[11]);

        invk[42] = mul_inv(subKey[6]);
        invk[43] = add_inv(subKey[8]);
        invk[44] = add_inv(subKey[7]);
        invk[45] = mul_inv(subKey[9]);
        invk[46] = (subKey[4]);
        invk[47] = (subKey[5]);

        invk[48] = mul_inv(subKey[0]);
        invk[49] = add_inv(subKey[1]);
        invk[50] = add_inv(subKey[2]);
        invk[51] = mul_inv(subKey[3]);

        for (int j = 0; j < 8; j++) {
            d[1] = mod_mul(i[0], invk[0 + (6 * j)]);
            d[2] = mod_add(i[1], invk[1 + (6 * j)]);
            d[3] = mod_add(i[2], invk[2 + (6 * j)]);
            d[4] = mod_mul(i[3], invk[3 + (6 * j)]);

            d[5] = xor(d[1], d[3]);
            d[6] = xor(d[2], d[4]);

            d[7] = mod_mul(d[5], invk[4 + (6 * j)]);
            d[8] = mod_add(d[6], d[7]);
            d[9] = mod_mul(d[8], invk[5 + (6 * j)]);
            d[10] = mod_add(d[7], d[9]);

            d[11] = xor(d[1], d[9]);
            d[12] = xor(d[3], d[9]);
            d[13] = xor(d[2], d[10]);
            d[14] = xor(d[4], d[10]);

            i[0] = d[11];
            i[1] = d[12];
            i[2] = d[13];
            i[3] = d[14];
        }

        d[1] = mod_mul(i[0], invk[48]);
        d[2] = mod_add(i[2], invk[49]);
        d[3] = mod_add(i[1], invk[50]);
        d[4] = mod_mul(i[3], invk[51]);

        for (int k = 1; k < 5; k++) {
            if (d[k].length() < 16) {
                for (int h = d[k].length(); h < 16; h++) {
                    d[k] = '0' + d[k];
                }
            }
        }

        String decrypt = d[1] + d[2] + d[3] + d[4];
//        System.out.println("Decrypt: " + decrypt + " - " + Long.toHexString(Long.parseLong(decrypt, 2)));
        this.quaTrinhMaHoaGiaiMa += "\n\n------------------------------------ GIẢI MÃ ------------------------------------";
        this.quaTrinhMaHoaGiaiMa += "\n=> Decrypt:\t\t" + decrypt;
        this.quaTrinhMaHoaGiaiMa += "\nBản rõ ban đầu:\t" + txtbanRo.getText();

        return decrypt;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaiMa;
    private javax.swing.JButton btnLamLai;
    private javax.swing.JButton btnMaHoa;
    private javax.swing.JButton btnTaoCacKhoaCon;
    private javax.swing.JButton btnXemQuaTrinhMaHoaGiaiMa;
    private javax.swing.JCheckBox checkboxSinhNgauNhien;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField txtBanMa;
    private javax.swing.JTextField txtBanMa_GiaiMa;
    private javax.swing.JTextField txtBanRo_GiaiMa;
    private javax.swing.JTextArea txtCacKhoaCon;
    private javax.swing.JTextField txtKhoaBiMat;
    private javax.swing.JTextField txtKhoaBiMat_GiaiMa;
    private javax.swing.JTextField txtKhoaBiMat_MaHoa;
    private javax.swing.JTextField txtbanRo;
    // End of variables declaration//GEN-END:variables
}
