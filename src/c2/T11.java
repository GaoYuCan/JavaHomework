package c2;

public class T11 {

}

class Course {
    /**
     * weekday : 周几
     * startWeek : 开始的周
     * endWeek : 结束的周
     * extra : 附加信息默认为空
     * location : 上课地点
     * name : 课程名称
     * teacher : 老师姓名
     * length : 课程长度（几节课）
     * startTime : 开始时间（第几节开始）
     * term : 开课学期, 例如 2022-2023#1
     * courseId : 课程代码
     */
    private int weekday;
    private int startWeek;
    private int endWeek;
    private String extra;
    private String location;
    private String name;
    private String teacher;
    private int length;
    private int startTime;
    private String term;
    private String courseId;

    public Course() {
    }

    public Course(int weekday, int startWeek, int endWeek, String extra, String location, String name, String teacher, int length, int startTime, String term, String courseId) {
        this.weekday = weekday;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.extra = extra;
        this.location = location;
        this.name = name;
        this.teacher = teacher;
        this.length = length;
        this.startTime = startTime;
        this.term = term;
        this.courseId = courseId;
    }

    public int getWeekday() {
        return weekday;
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public int getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(int startWeek) {
        this.startWeek = startWeek;
    }

    public int getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(int endWeek) {
        this.endWeek = endWeek;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "weekday=" + weekday +
                ", startWeek=" + startWeek +
                ", endWeek=" + endWeek +
                ", extra='" + extra + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", length=" + length +
                ", startTime=" + startTime +
                ", term='" + term + '\'' +
                ", courseId='" + courseId + '\'' +
                '}';
    }
}
