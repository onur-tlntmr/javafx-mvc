package dal.dao;

public interface UserDAO {

    Boolean existUserByUsernameAndPassword(String username,String password);

}
