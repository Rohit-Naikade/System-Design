public class User {
    int userId;
    String userName;
    String drivingLicense;

    public User(int userId, String userName, String drivingLicense){
        this.userId=userId;
        this.userName=userName;
        this.drivingLicense=drivingLicense;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                '}';
    }
}
