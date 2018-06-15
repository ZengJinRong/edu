package fzu.edu.entiy;

/**
 * 课程实体类
 */
public class Course {
    private String id;          //课程号
    private String name;        //课程名
    private String address;     //上课地点
    private String teacher;     //任课教师
    private String weekday;     //上课日期（星期X）
    private String section;     //上课时间（第X节课）

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
