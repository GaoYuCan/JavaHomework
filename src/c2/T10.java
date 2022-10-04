package c2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T10 {

}


class Member {
    public static final int WOMAN = 0;
    public static final int MAN = 1;

    private String name;
    private int sex;
    private Date birthday;
    private String organization;
    private String jobTitle;

    public Member() {
    }

    public Member(String name, int sex, Date birthday, String organization, String jobTitle) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.organization = organization;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}

class Staff extends Member {
    private int salary;

    public Staff() {
    }

    public Staff(String name, int sex, Date birthday, String organization, String jobTitle, int salary) {
        super(name, sex, birthday, organization, jobTitle);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Student extends Member {
    private int grade;
    private int score;

    public Student() {
    }

    public Student(String name, int sex, Date birthday, String organization, String jobTitle, int grade, int score) {
        super(name, sex, birthday, organization, jobTitle);
        this.grade = grade;
        this.score = score;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class Teacher extends Staff {
    private List<String> courseList = new ArrayList<>(); // 所教授的课

    public Teacher() {
    }

    public Teacher(String name, int sex, Date birthday, String organization, String jobTitle, int salary, List<String> courseList) {
        super(name, sex, birthday, organization, jobTitle, salary);
        this.courseList = courseList;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(String course) {
        if (course == null) {
            return;
        }
        this.courseList.add(course);
    }
}

class Manager extends Staff {
    public static final int LEVEL_1 = 1;
    public static final int LEVEL_2 = 2;
    public static final int LEVEL_3 = 3;
    public static final int LEVEL_4 = 4;
    public static final int LEVEL_5 = 5;

    // 权限级别
    private int level;

    public Manager() {
    }

    public Manager(String name, int sex, Date birthday, String organization, String jobTitle, int salary, int level) {
        super(name, sex, birthday, organization, jobTitle, salary);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}