package com.edu.pojo;


import com.edu.util.Constants;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @Auther:haha
 * @Date:2021/1/25 - 01 - 25 18:25
 * @Description:com.edu.pojo
 * @Version: 1.0
 */
public class User implements HttpSessionBindingListener {
    private int id;
    private String userName;
    private String password;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //user 放入session中（一个用户登陆了）会自动进入该方法
    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        Constants.USER_COUNT++;
    }


    //session失效（某个用户注销） 超时 手动 把某个属性移除 进入该方法
    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        Constants.USER_COUNT--;
    }
}
