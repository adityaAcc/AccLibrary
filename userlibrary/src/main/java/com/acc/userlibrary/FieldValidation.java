package com.acc.userlibrary;

import android.app.Activity;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Aditya Chowta on 2/3/2017.
 */

public class FieldValidation {

    static int  passwordLenght = 8;

    public static void setPasswordLength(int length){
        passwordLenght = length;
    }


    public static boolean validateFields(Activity context, String email, String phone, String password, String conf_password){

        if(email.equals("") || phone.equals("") || password.equals("") || conf_password.equals("")){
            Toast.makeText(context,"Please enter the complete details.",Toast.LENGTH_SHORT).show();
        } else if (isEmailValid(email.toString()) == false){
            Toast.makeText(context,"Please enter valid email address.",Toast.LENGTH_SHORT).show();
        } else if(isValidMobile(phone.toString()) == false){
            Toast.makeText(context,"Please enter valid phone number.",Toast.LENGTH_SHORT).show();
        } else if(password.toString().length()<passwordLenght &&!isValidPassword(password.toString())){
            Toast.makeText(context,"Password should be minimum "+passwordLenght+" characters long and include Alphabets, Numbers and Special Characters.",Toast.LENGTH_LONG).show();
        } else if(!password.toString().equals(conf_password.toString())){
            Toast.makeText(context,"Your passwords do not match.",Toast.LENGTH_SHORT).show();
        } else {
            return true;
        }

        return false;
    }

    public static boolean isEmailValid(String email) {
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

    private static boolean isValidMobile(String phone2)
    {
        boolean check = false;
        if(!Pattern.matches("[a-zA-Z]+", phone2))
        {
            if(phone2.length() < 6 || phone2.length() > 13)
            {
                check = false;
            }
            else
            {
                check = true;
            }
        }
        else
        {
            check=false;
        }
        return check;
    }

    public static boolean isValidPassword(final String password) {

        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();

    }

}
