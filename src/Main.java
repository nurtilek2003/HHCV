import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] lessons = new String[]{"java","english","advancedJava"};

        MyClass adilet=new MyClass("Adilet" ,"Egemberdiev",lessons," boso lagman");

        MyClass nurtilek=new MyClass(" Baisal", " Altynbek uluu"," samsy");

        
        System.out.println(adilet.name+" "+adilet.surName+" "+ Arrays.toString(adilet.lessons) +" "+" " +adilet.food+" "+adilet.food);

        System.out.println(nurtilek.name+" "+nurtilek.surName+" "+nurtilek.lessons);

        ;

    }
}