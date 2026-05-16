import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryDB {

    public void addTire(Tire tire) {
        String sql = "INSERT INTO tires (brand, size, price, quantity) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tire.getBrand());
            stmt.setString(2, tire.getSize());
            stmt.setDouble(3, tire.getPrice());
            stmt.setInt(4, tire.getQuantity());

            stmt.executeUpdate();

            System.out.println("Tire added!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Tire> getAllTires() {
        List<Tire> list = new ArrayList<>();

        String sql = "SELECT * FROM tires";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Tire(
                        rs.getString("brand"),
                        rs.getString("size"),
                        rs.getDouble("price"),
                        rs.getInt("quantity")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<Tire> searchByBrand(String brand) {
        List<Tire> list = new ArrayList<>();

        String sql = "SELECT * FROM tires WHERE brand LIKE ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + brand + "%");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                list.add(new Tire(
                        rs.getString("brand"),
                        rs.getString("size"),
                        rs.getDouble("price"),
                        rs.getInt("quantity")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}