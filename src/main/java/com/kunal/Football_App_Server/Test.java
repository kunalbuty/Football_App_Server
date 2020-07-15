package com.kunal.Football_App_Server;

public class Test {
    private final String loginMsg;
    private String uid;

    public Test(String token) {
        if(token==null || token=="") {
            loginMsg="failed login";
        }
        else {
            //check if given ID Token is valid
            AuthUser user = new AuthUser(token);
            uid = user.authorize();
            if (uid == null) {
                loginMsg = "failed login";
            } else {
                loginMsg = "login successful";
            }
        }
    }

    public String getLoginMsg() {
        return loginMsg;
    }

    public String getUid() {
        return uid;
    }

}
