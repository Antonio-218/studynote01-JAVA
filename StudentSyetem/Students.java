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
        private String age;
        private String major;//专业

        public Students() {//无参构造
            super();
        }
        public Students(String id,String name,String age,String major) {//带参构造
            this.id=id;
            this.name=name;
            this.age=age;
            this.major=major;
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
        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age=age;
        }
        public String getMajor() {
            return major;
        }
        public void setMajor(String major) {
            this.major=major;
        }
    }
