package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() 
    {
        String prop;
        prop = System.getProperty("java.specification.version");
        
        return (Double.parseDouble(prop));
    }

    public static void main(String[] args) 
    {
	  System.out.println (getVersion());
    }
}
