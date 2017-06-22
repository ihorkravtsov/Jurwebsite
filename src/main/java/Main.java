import java.sql.*;

/**
 * Created by User on 22.06.2017.
 */
public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/my_db";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        addMySQLToClassPath();
        createDbCodecsTable();
        addCodecs(0, "The Civil Code of Ukraine", "2003");
        addCodecs(1, "Civil Procedure Code of Ukraine", "2004");
        addCodecs(2, "Housing Code of Ukraine", "1983");
        addCodecs(3, "The Land Code of Ukraine", "2002");
        addCodecs(4, "The Family Code of Ukraine", "2002");
        addCodecs(5, "Forest Code of Ukraine", "1994");
        addCodecs(6, "The Criminal Code of Ukraine", "2001");
        addCodecs(7, "The Labor Code of Ukraine", "1971");
        addCodecs(8, "Code of Ukraine on Subsoil", "1994");
        addCodecs(9, "Water Code of Ukraine", "1995");
        addCodecs(10, "The Tax Code of Ukraine", "2010");
        addCodecs(11, "Code of Administrative Judicial Proceedings of Ukraine", "2005");
        addCodecs(12, "Code of Merchant Shipping of Ukraine", "1995");
        addCodecs(13, "The Code of Criminal Procedure of Ukraine", "2012");
        addCodecs(14, "The Economic Procedural Code of Ukraine", "1992");
        addCodecs(15, "The Economic Code of Ukraine", "2003");

        System.out.println("id");
        System.out.println("---------------------------");
        findCodecsById(1);
        System.out.println("CODECS_NAME");
        System.out.println("---------------------------");
        findCodecsByName("The Civil Code of Ukraine");
        System.out.println("CODECS_YEAR");
        System.out.println("---------------------------");
        findUserByCodecsByYear("2003");
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
    }

    private static void addMySQLToClassPath() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void createDbCodecsTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS dbuser("
                + "TABLE_ID INT(16) NOT NULL, "
                + "CODECS_NAME VARCHAR(40) NOT NULL, "
                + "CODECS_YEAR VARCHAR(40) NOT NULL, "
                + "PRIMARY KEY (TABLE_ID) "
                + ")";
        try (Connection dbConnection = getConnection();
             Statement statement = dbConnection.createStatement()) {
            // выполнить SQL запрос
            statement.execute(createTableSQL);
            System.out.println("Table \"dbuser\" is created!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addCodecs(int id, String name, String year) {
        try (Connection dbConnection = getConnection();
             PreparedStatement statement = dbConnection.prepareStatement("INSERT INTO dbuser" +
                     "(TABLE_ID, CODECS_NAME,CODECS_YEAR ) VALUES (?,?,?)");) {
            int i = 1;
            statement.setInt(i++, id);
            statement.setString(i++, name);
            statement.setString(i, year);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void findCodecsById(int id) {
        try (Connection dbConnection = getConnection();
             PreparedStatement statement = dbConnection.prepareStatement("SELECT * FROM dbuser WHERE TABLE_ID =?")) {
            int i = 1;
            statement.setInt(i, id);
            ResultSet resultSet = statement.executeQuery();
            printDataSet(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void findCodecsByName(String name) {
        try (Connection dbConnection = getConnection();
             PreparedStatement statement = dbConnection.prepareStatement("SELECT * FROM dbuser WHERE CODECS_NAME =?")) {
            int i = 1;
            statement.setString(i, name);
            ResultSet resultSet = statement.executeQuery();
            printDataSet(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void findUserByCodecsByYear(String year) {
        try (Connection dbConnection = getConnection();
             PreparedStatement statement = dbConnection.prepareStatement("SELECT * FROM dbuser WHERE CODECS_YEAR =?")) {
            int i = 1;
            statement.setString(i, year);
            ResultSet resultSet = statement.executeQuery();
            printDataSet(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printDataSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("TABLE_ID"));
            System.out.println(resultSet.getString("CODECS_NAME"));
            System.out.println(resultSet.getString("CODECS_YEAR"));
            System.out.println("//////////////////////////////////////////////////////");
        }
    }
}
