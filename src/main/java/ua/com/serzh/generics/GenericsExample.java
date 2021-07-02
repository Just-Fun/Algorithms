package ua.com.serzh.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
//        List<?> vs List<Object>
        List<String> stringList = new ArrayList<>();

        List list0 = new ArrayList<>();
        list0.add("");
        list0 = stringList;
        list0.add("");

        List<?> list1 = new ArrayList<>();
//        list1.add("");  // can’t
        list1 = stringList;
//        list1.add("");  // can’t

        List<Object> list2 = new ArrayList<>();
//  list2 = strings1; // can’t
        list2.add(""); // but can add any object

        List<? extends Object> list3 = new ArrayList<>();
//        list3.add(""); // can’t
        list3 = stringList; // and now can
//        list3.add(""); // can’t

        Child[] childArray = new Child[2];
//        childArray = new Parent[2];// can’t
        childArray[0] = new Child();
//        childArray[1] = new Parent();// can’t

        Parent[] parentArray = new Parent[2];
        parentArray[0] = new Child();
        parentArray[1] = new Parent();
        parentArray = new Child[2];
        parentArray[0] = new Child();
        parentArray[1] = new Parent(); // ArrayStoreException - в рантайме

        List<Parent> parentList = new ArrayList<>();
        List<Child> childList = new ArrayList<>();

//        List<T extends Parent> list = new ArrayList<>(); ???

        List<? extends Parent> extendsParentList = new ArrayList<>();
//        extendsParentList.add(new Parent());// can’t
//        extendsParentList.add(new Child());// can’t
        extendsParentList = parentList;
        extendsParentList = childList;

        List<? super Child> superChildList = new ArrayList<>();
//        superChildList.add(new Parent());// can’t
        superChildList.add(new Child());
        superChildList = parentList;
        superChildList = childList;


    }

    public static <T extends Parent> void test(List<T> list) {
    }

    public void addShape(List<? extends Parent> shapes) {
    }

    public void addRectangle(List<? super Child> shapes) {
    }

    static class Parent {
    }

    static class Child extends Parent {
    }

}
