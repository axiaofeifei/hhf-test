package mybatisplus.demo.pojo;

import lombok.Data;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/4/7 12:47
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
