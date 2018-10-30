package edu.user;

public class UserServiceImpl implements  IUserService{

    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void AddNewUser() {
        dao.AddNewUser();
    }
}
