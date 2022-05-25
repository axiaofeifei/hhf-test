package mybatisplus.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import mybatisplus.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/4/7 12:48
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
