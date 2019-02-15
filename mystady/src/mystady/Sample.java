package mystady;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {

	static {
		try{
            /*クラスローダによりJDBCドライバを読み込んでいることを示している。
            引数は、データベースにアクセスするためのJDBCドライバのクラス名である。*/

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBCドライバーをロードしました");

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		Connection con = null;

		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","1234");

			/*データベースの接続後に、sql文をデータベースに直接渡すのではなく、
            sqlコンテナの役割を果たすオブジェクトに渡すためのStatementオブジェクトを作成する。*/

			Statement st = con.	createStatement();



			String sqlStr = "SELECT * FROM tb1";







		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(con!=null){
				try{
					con.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}