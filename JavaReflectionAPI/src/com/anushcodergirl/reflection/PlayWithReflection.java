package com.anushcodergirl.reflection;

public class PlayWithReflection{
    public static void main(String[] args){

        String personClassName = "com.anushcodergirl.reflection.model.Person";
        Class<?> personClass = Class.forName(personClass);

        System.out.println("Person class = " + personClass);

        Field[] fields = personClass.getFields();
        System.out.println("--Fields--");
        System.out.println(Array.toString(fields));

        Field[] declaredFields = personClass.getDeclaredFields();
        System.out.println("--Declared Fields--");
        System.out.println(Array.toString(declaredFields));

        System.out.println("--Methods--")
        Method[] methods = personClass.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }

        System.out.println("--Declared Methods--")
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for(Method method : declaredMethods){
            System.out.println(method);
        }

        System.out.println("--Static Declared Methods--")
        Arrays.stream(declaredMethods).filter(m -> Modifier.isStatic(m.getModifiers())).forEach(System.out::println);
    }
}