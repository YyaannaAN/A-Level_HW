package ua.nezhura.hw15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Task1 {
    public static void main(String[] args) throws Exception {
        A obj = createInstance();

        System.out.println("Initial values: " + obj.toString());

        setFieldValue(obj, "id", "456");
        setFieldValue(obj, "name", "B");

        System.out.println("Changed values: " + obj.toString());
    }

    public static void setFieldValue(A obj, String fieldName, String fieldValue) throws Exception {
        Field field = A.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, fieldValue);

    }

    private static A createInstance() throws Exception {

        Class<A> clazz = A.class;
        Constructor<A> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        return constructor.newInstance();
    }
}

class A {
    private String id = "123";
    private String name = "A";

    private A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

