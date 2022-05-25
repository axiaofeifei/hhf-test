package mybatispluscodegeneration.hhf.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/4/7 18:16
 */
public class DataSourceTest {
    @Autowired
    private DataSource dataSource;


    @Test
    void getConnetion() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
