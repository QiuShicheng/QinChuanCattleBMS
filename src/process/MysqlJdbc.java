package process;

import java.sql.*;
public class MysqlJdbc {
  public static void add(String filename,String BodyHeight,String WaistHeight ,String BodyLength ,String RumpLength ,String RumpWidth ,String HipHeight,String HipWidth) {
    try {
      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
      //Class.forName("org.gjt.mm.mysql.Driver");
     System.out.println("Success loading Mysql Driver!");
    }
    catch (Exception e) {
      System.out.print("Error loading Mysql Driver!");
      e.printStackTrace();
    }
    try {
      Connection connect = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/mysql","new","123456");
           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

      System.out.println("Success connect Mysql server!");
      Statement stmt = connect.createStatement();
      //ResultSet rs = stmt.executeQuery("INSERT  INTO userRR(name,password) VALUES(?,?)");
                                                              //user 为你表的名称
      String sql="INSERT  INTO BodyMeasurement( CattleId , BodyHeight,WaistHeight, BodyLength,RumpLength,RumpWidth, HipHeight, HipWidth) VALUES(?,?,?,?,?,?,?,?)";
      PreparedStatement ps=connect.prepareStatement(sql);
      
      ps.setString(1, filename);
      ps.setString(2, BodyHeight);
      ps.setString(3, WaistHeight);
      ps.setString(4, BodyLength);
      ps.setString(5, RumpLength);
      ps.setString(6, RumpWidth);
      ps.setString(7, HipHeight);
      ps.setString(8, HipWidth);
      
      ps.executeUpdate();
       connect.close();
       System.out.println("ok");
    }
    catch (Exception e) {
      System.out.print("get data error!");
      e.printStackTrace();
    }
    
  }
}