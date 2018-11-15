package edu.batis;

import java.math.BigDecimal;

public class Emp {
    int empNo;
    String empName;
    String job;

    public Emp(int empNo, String empName, String job) {
        this.empNo = empNo;
        this.empName = empName;
        this.job = job;
    }
    public Emp(BigDecimal empNo, String empName, String job) {
        //妈耶!,这里得类型转换
        this.empNo = Integer.parseInt(empNo.toString());
        this.empName = empName;
        this.job = job;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
