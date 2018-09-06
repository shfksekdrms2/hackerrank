package hackerrank.hackerrank.JAVA.Advanced.JavaSingletonPattern;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/*
 * https://www.hackerrank.com/challenges/java-singleton/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Java Singleton Pattern
 */
class Singleton{
    public static Singleton singleton = new Singleton();
    public String str = "Hello I am a singleton! Let me say hello world to you";
    
    private Singleton(){ };
    public static Singleton getSingleInstance(){
        return singleton;
    }
}
