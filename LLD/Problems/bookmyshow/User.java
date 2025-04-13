public class User {
    String userName;
    String MobNo;

    public User(String userName, String mobNo) {
        this.userName = userName;
        MobNo = mobNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobNo() {
        return MobNo;
    }

    public void setMobNo(String mobNo) {
        MobNo = mobNo;
    }
}
