public class MyClass {
    String name;
    String surName;
    int age;
    String [] lessons;
    String food;

    public MyClass(String name, String surName, String[] lessons, String food){
        this.name=name;
        this.surName=surName;
        this.lessons=lessons;
        this.food=food;

    }

    public MyClass(String name, String surName, String food){
        this.name=name;
        this.surName=surName;
        this.food=food;
    }



    public MyClass(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", lessons='" + lessons + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}


