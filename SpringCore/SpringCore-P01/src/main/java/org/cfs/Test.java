package org.cfs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        System.out.println("-----------BeanFactory Started----------");
        //BeanFactory factory= new ClassPathXmlApplicationContext("Beans.xml");

        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("-------------Bean file loaded------------");

        System.out.println("sending request.......");
        System.out.println("---------first call-----------");
        Car car1=context.getBean(Car.class);

        System.out.println("---------first call-----------");
        Car car2=context.getBean(Car.class);
        //car.drive();

        System.out.println("same object ? "+(car1==car2));
    }
}
