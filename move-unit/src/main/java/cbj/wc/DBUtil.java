package cbj.wc;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public  class DBUtil {

    public static void save(String sql) throws Exception {
        DBHelper db = new DBHelper(sql);
        try {
            db.pst.execute(sql);

        } catch (Exception e) {
            throw e;
        } finally {
            db.close();
        }

    }

    public static ResultSet select(String sql) throws  Exception{
        DBHelper db = new DBHelper(sql);
        try {
            ResultSet resultSet =db.pst.executeQuery(sql);
            return resultSet;
        } catch (Exception e) {
            throw e;
        } finally {
            db.close();
        }
    }

    public static List<String> select(String sql,String colunName) throws  Exception{
        DBHelper db = new DBHelper(sql);
        List<String> result=new ArrayList<>();
        try {
            ResultSet resultSet =db.pst.executeQuery(sql);
            while (resultSet.next()){
                result.add(resultSet.getString(colunName));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            db.close();
        }
        return result;
    }
}
