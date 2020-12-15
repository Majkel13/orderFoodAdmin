package com.example.orderfoodadmin.Common;

import com.example.orderfoodadmin.Model.User;

public class Common {

    public static User currentUser;

    public static final String  UPDATE = "Zmień status";
    public static final String  DELETE = "Usuń";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code)
    {
        if(code.equals("0"))
            return "W trakcie realizacji";
        else if(code.equals("1"))
            return "W drodze";
        else
            return "Dostarczony";
    }
}
