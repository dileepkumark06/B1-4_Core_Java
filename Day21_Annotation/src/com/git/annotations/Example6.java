package com.git.annotations;

import java.lang.annotation.*;

@Inherited
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
 
@interface CustomAnnotation
{
    String value();
}
 
@CustomAnnotation(value = "Sky is limitless")
class Super {
}

public class Example6 extends Super {
 
    public static void main(String[] arg) throws Exception
    {
        System.out.println(new Example6().getClass().getAnnotation(CustomAnnotation.class));
        //System.out.println(new Super().getClass().getAnnotation(CustomAnnotation.class));
 
        @SuppressWarnings("rawtypes")
		Class obj = Super.class;
 
        printAnnotationState(obj);
    }

	private static void printAnnotationState(@SuppressWarnings("rawtypes") Class obj) 
	{
		
	}
}