package cbj.lb;

import cbj.wc.DBUtil;

import java.sql.ResultSet;
import java.util.List;

public class LbRenmingTest {

    public static void main(String[] args) throws Exception {

        String  tableName="attr_template";
        String coluName="updateUser";
        String sql="select "+coluName+" from "+tableName;
        List<String> results = DBUtil.select(sql,coluName);
        for (String result : results) {
            System.out.println(result);
            System.out.println("update "+tableName +" set " +coluName +" = "+" where "+ coluName +"='"+result+"';");
        }
    }
}
