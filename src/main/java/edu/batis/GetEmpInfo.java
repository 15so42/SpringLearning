package edu.batis;

public interface GetEmpInfo {
    public Emp GetEmp(int id);
    public Emp AddEmp(Emp emp);
    public Emp UpdateEmp(Emp emp);
    public User DeleteUser(int id);
}
