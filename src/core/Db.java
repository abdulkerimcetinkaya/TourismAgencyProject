package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    // Singleton tasarım deseni kullanılarak oluşturulmuş olan instance
    private static Db instance = null;
    // Veritabanı bağlantısı için kullanılan Connection nesnesi
    private Connection connection = null;
    // Veritabanı URL'si
    private final String DB_URL = "jdbc:postgresql://localhost:5432/turizmAgency";
    // Veritabanı kullanıcı adı
    private final String DB_USERNAME = "postgres";
    // Veritabanı şifresi
    private final String DB_PASS = "1234";

    //Database connection
    private Db() {
        try {
            this.connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASS);
        } catch (SQLException e) {
            Helper.showMsg("Veritabanı bağlantısı kurulamadı: " + e.getMessage());
            System.exit(1); // Kritik hata durumunda uygulamayı sonlandır
        }
    }
    // Veritabanı bağlantısını döndüren metod
    public Connection getConnection() {
        return this.connection;
    }

    // Singleton tasarım deseni gereği oluşturulmuş olan veya mevcut instance'ı döndüren metod
    public static Connection getInstance() {
        try {
            if (instance == null || instance.getConnection().isClosed()) {
                instance = new Db();
            }
        } catch (SQLException e) {
            Helper.showMsg("Veritabanı bağlantısı hatası: " + e.getMessage());
            System.exit(1); // Kritik hata durumunda uygulamayı sonlandır
        }
        return instance.getConnection();
    }
}
