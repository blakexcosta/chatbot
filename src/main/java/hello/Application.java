package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //test for the python code
        BuildingFactory factory = new BuildingFactory();
        //create a new object
        factory.create("Building A", "Main streett", "1");
        System.out.println();

        //run the spring application
        SpringApplication.run(Application.class, args);
    }

}