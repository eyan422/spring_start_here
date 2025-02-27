package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());
        p.setName("Kiki");
        System.out.println(p.getName());

        String s = context.getBean("hello", String.class);

        System.out.println(s);

        String w = context.getBean("world", String.class);

        System.out.println(w);

        Integer n = context.getBean(Integer.class);

        System.out.println(n);
    }
}
