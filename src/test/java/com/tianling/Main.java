package com.tianling;

import com.tianling.entities.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/2/28 15:09
 */
public class Main {
    public static void main(String[] args) {
        Class<User> userClass = User.class;
        String name = userClass.getName();
        System.out.println("name = " + name);

        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method.getName());
        }

        try {
            Method setId = userClass.getMethod("setId", Integer.class);
            Object invoke = setId.invoke(new User(), 1);
            System.out.println("setId = " + setId);
            System.out.println("invoke = " + invoke);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Field[] fields = userClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);

        }
    }
}
