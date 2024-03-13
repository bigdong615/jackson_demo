package rock.dong.jucdemo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Demo_for_jackson {

    private String name;
    private int age;
    /**
     *
     * @return java.lang.String
     * @create 2024/1/31 13:19
     */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws IOException {

        //json to java object
        String json = "{\"name\":\"John\",\"age\":30}";

        ObjectMapper mapper = new ObjectMapper();
        Demo_for_jackson dog = mapper.readValue(json, Demo_for_jackson.class);

        System.out.println(dog.getName());  // Outputs "John"
        System.out.println(dog.getAge());   // Outputs "30"

        //java object to json
        Demo_for_jackson dog1 = new Demo_for_jackson();
        dog1.setName("John");
        dog1.setAge(30);

        ObjectMapper mapper1 = new ObjectMapper();
        String json1 = mapper1.writeValueAsString(dog1);

        System.out.println(json1);  // Outputs {"name":"John","age":30}

    }
}

