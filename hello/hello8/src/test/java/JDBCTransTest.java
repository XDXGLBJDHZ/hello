import org.junit.Test;
import data2.trans.JDBCTrans;
public class JDBCTransTest {
    @Test
    public void tsetTrans() throws Exception {
        JDBCTrans jdbcTrans=new JDBCTrans();
        jdbcTrans.trans();
    }
}
