package text.Service;

import org.apache.ibatis.annotations.Param;
import text.Dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@autho  zhengruilong
 *@date 2019-08-31
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public  int registfindByName(String name){
       int num= userMapper.registfindByName(name);
        return num;
    }
    public  int registfindByEmail(String Email){
        int num=userMapper.registfindByEmail(Email);
        return num;
    }
}
