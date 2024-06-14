package chap11.ProgrammingTask06;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ProgrammingTask06 {
    public static void main(String[] args) {
        Map<String,String> animal = new HashMap<>();
        animal.put("호랑이","tiger");
        animal.put("표범","leopard");
        animal.put("사자","lion");

        System.out.print("변경 전 : {");
        animal.forEach((key,value)-> {
            if(key.equals("사자"))
            {
                System.out.print(key+"="+value);
            }else
            {
                System.out.print(key+"="+value+", ");
            }
        });
        System.out.println("}");

        animal.replaceAll((key,value)->value.toUpperCase());

        System.out.print("변경 후 : {");
        animal.forEach((key,value)-> {
            if(key.equals("사자"))
            {
                System.out.print(key+"="+value);
            }else
            {
                System.out.print(key+"="+value+", ");
            }
        });
        System.out.println("}");
    }
}
