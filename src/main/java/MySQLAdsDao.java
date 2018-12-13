import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    Config config = new Config();
    private Connection conn;

    public MySQLAdsDao(Config config) {

        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }

}

    @Override
    public List<Ad> all() {
    List<Ad> ads = new ArrayList<>();
    String selectQuery = "SELECT * FROM ads";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                ads.add(new Ad (
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        long insertId = 0;
        String insertQuery = String.format("INSERT INTO ads (id, user_id, title, description) VALUES (%d, %d, '%s', '%s')",
                ad.getId(),
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription());
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(insertQuery, stmt.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                insertId = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insertId;
    }

//    public static void main(String[] args) {
//        List<Ad> ads = new ArrayList<>();

//    }


}
