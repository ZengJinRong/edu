package fzu.edu.entiy;

/**
 * 学生实体类
 */
public class Student {
    private String id;          //学号/账号
    private String password;    //密码
    private String name;        //姓名
    private String major;       //专业

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
