package uielements;

import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;


/**
 * คลาส Database เก็บข้อมูลสำหรับการยืนยันบัญชี 
 */
public class Database {
    private static HashMap<String, User> users = new HashMap<>();
   

    
    /**
     * เมธอดสำหรับลงทะเบียนผู้ใช้ใหม่
     * @param username ชื่อผู้ใช้
     * @param password รหัสผ่าน
     * @return จริง หากลงทะเบียนสำเร็จ, เท็จ หากชื่อผู้ใช้ซ้ำ
     */
    public static boolean registerUser(String username, String password) {
        if (users.containsKey(username)) return false;
        users.put(username, new User(username, password));
        return true;
    }


    /**
     * เมธอดสำหรับตรวจสอบตัวตนของผู้ใช้
     * @param username ชื่อผู้ใช้
     * @param password รหัสผ่าน
     * @return User ถ้าข้อมูลถูกต้อง, null ถ้าไม่ถูกต้อง
     */
    public static User authenticate(String username, String password) {
        User user = users.get(username);
        return (user != null && user.getPassword().equals(password)) ? user : null;
    }

    
    
}
