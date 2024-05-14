package com.example.myapp.utils ; 
import jakarta.servlet.http.* ;

import com.example.myapp.data.*;
public class SessionUtils {
    public static void setSession(UserAuth userAuth , HttpServletRequest request) // pass the request , write the session
    {
        HttpSession session = request.getSession() ; 

        session.setAttribute("user_id", userAuth.user_id);
    }
    public static String readSession(String attribute,HttpServletRequest request)
    {
        HttpSession session = request.getSession() ; 
        return session.getAttribute(attribute).toString() ; 
    }
}