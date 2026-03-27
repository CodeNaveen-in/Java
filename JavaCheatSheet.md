# ☕ Java Cheat Sheet

## 🧱 Basic Structure
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
````

## 🔤 Variables & Data Types

```java
int age = 25;
double price = 10.5;
char grade = 'A';
boolean isJavaFun = true;
String name = "John";
```

## 🔁 Control Flow

### If-Else

```java
if (age > 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

### Switch

```java
switch(day) {
    case 1: System.out.println("Monday"); break;
    default: System.out.println("Other day");
}
```

### Loops

```java
for (int i = 0; i < 5; i++) {}

while (x < 10) {}

do {
    x++;
} while (x < 5);
```

## 📦 Arrays

```java
int[] nums = {1, 2, 3};
System.out.println(nums[0]);
```

## 🧩 Methods

```java
static int add(int a, int b) {
    return a + b;
}
```

## 🧱 Classes & Objects

```java
class Car {
    String brand;
    int year;

    void drive() {
        System.out.println("Driving...");
    }
}

Car c = new Car();
c.brand = "Toyota";
c.drive();
```

## 🧬 Constructors

```java
class Car {
    String brand;

    Car(String b) {
        brand = b;
    }
}
```

## 🧱 Inheritance

```java
class Animal {
    void sound() {}
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

## 🔒 Access Modifiers

* `public` – accessible everywhere
* `private` – only within class
* `protected` – within package + subclasses
* default – package only

## 🧰 Collections

### ArrayList

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("A");
list.get(0);
```

### HashMap

```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.get("A");
```

## ⚠️ Exception Handling

```java
try {
    int x = 10 / 0;
} catch (Exception e) {
    e.printStackTrace();
} finally {
    System.out.println("Done");
}
```

## 🧵 Threads

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Running");
    }
}

new MyThread().start();
```

## 🧾 File I/O

```java
import java.io.File;

File file = new File("test.txt");
```

## 📌 Important Keywords

* `static` – class-level
* `final` – constant / no override
* `this` – current object
* `super` – parent class
* `new` – create object

## 🧠 Tips

* Java is **object-oriented**
* Everything runs inside classes
* Use `System.out.println()` for output in next line.
