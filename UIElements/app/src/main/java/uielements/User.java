package uielements;


    /**
    * คลาส User ใช้เก็บข้อมูลของผู้ใช้ 
    * ตัวเเปร ชื่อผู้ใช้
    *        รหัส
    */
public class User {
    private String username;
    private String password;
   
    /**
     * คอนสตรักเตอร์ สำหรับสร้างอ็อบเจกต์ของ User
     *
     * @param username ชื่อผู้ใช้
     * @param password รหัสผ่านของผู้ใช้
    */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
      
    }

    /**
     * @return ชื่อผู้ใช้
     */
    public String getUsername() { 
        return username; 
    }

    /**
     * @return รหัสผ่าน
     */
    public String getPassword() { 
        return password; 
    }

    

    
}
