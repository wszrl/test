package text.Dao;

import org.apache.ibatis.annotations.Param;


public interface UserMapper {
  int registfindByName(String name);
    int registfindByEmail(String Email);

}
