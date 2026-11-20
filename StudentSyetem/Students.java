package StudentSyetem;

public class Students {
    /**
     * Students 为实体对象，用来封装学生信息
     *
     * @author Administrator
     *
     */
        private String id;//学号
        private String name;
        private String classroom;
        private String majorWeb;
        private String majorJava;
        private String majorComputer;


        public Students() {//无参构造
            super();
        }
        public Students(String id,String name,String classroom,String majorWeb,String majorJava,String majorComputer) {//带参构造
            this.id=id;
            this.name=name;
            this.classroom=classroom;
            this.majorWeb=majorWeb;
            this.majorJava=majorJava;
            this.majorComputer=majorComputer;

        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id=id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name=name;
        }
    public String getClassroom() {
        return classroom;
    }
    public void setClassroom(String classroom) {
        this.classroom=classroom;
    }
    public String getMajorWeb() {
        return majorWeb;
    }
    public void setMajorWeb(String majorWeb) {
        this.majorWeb=majorWeb;
    }
    public String getMajorJava() {
        return majorJava;
    }
    public void setMajorJava(String majorJava) {
        this.majorJava=majorJava;
    }
    public String getMajorComputer() {
        return majorComputer;
    }
    public void setMajorComputer(String majorComputer) {
        this.majorComputer=majorComputer;
    }
}
