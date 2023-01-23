# Getting a Class Instance

There are three patterns to get a Class instance:
- from an object
- from a known class
- from the name of a class



Pattern 1
```java
Class<?> class = "Hello".getClass();
```

Pattern 2
```java
Class<?> class = String.class();
```

Pattern 3
```java
Class<?> class = Class.forName("java.lang.String");
```