package view;

import conn.DatabaseConn;
import model.Siswa;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class NewClass extends JFrame {
    private JTextField txtNama = new JTextField();
    private JTextField txtKelas = new JTextField();
    private JButton btnSimpan = new JButton("Simpan");
    private JTable tabel = new JTable();
    private DefaultTableModel model;

    public NewClass() {
        setTitle("Manajemen Siswa");
        setSize(450, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNama = new JLabel("Nama:");
        JLabel lblKelas = new JLabel("Kelas:");

        lblNama.setBounds(20, 20, 100, 25);
        txtNama.setBounds(120, 20, 200, 25);
        lblKelas.setBounds(20, 55, 100, 25);
        txtKelas.setBounds(120, 55, 200, 25);
        btnSimpan.setBounds(120, 95, 100, 25);

        add(lblNama); add(txtNama);
        add(lblKelas); add(txtKelas);
        add(btnSimpan);

        model = new DefaultTableModel(new String[]{"ID", "Nama", "Kelas"}, 0);
        tabel.setModel(model);
        JScrollPane scrollPane = new JScrollPane(tabel);
        scrollPane.setBounds(20, 140, 390, 140);
        add(scrollPane);

        btnSimpan.addActionListener(e -> simpanData());
        tampilData();
    }

    private void simpanData() {
        try (Connection conn = DatabaseConn.getConnection()) {
            Siswa s = new Siswa(
                txtNama.getText(),
                txtKelas.getText()
            );

            String sql = "INSERT INTO siswa (nama, kelas) VALUES (?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, s.getNama());
            pst.setString(2, s.getKelas());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            tampilData();
            txtNama.setText("");
            txtKelas.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void tampilData() {
        model.setRowCount(0);
        try (Connection conn = DatabaseConn.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM siswa")) {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("kelas")
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}
