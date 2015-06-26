package com.amitdwivedie.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Amit Dwivedi
 *
 */
public class ComparatorExample {

    public static void main(String[] args) {
        UserInfo info1 = new UserInfo("Vikas", 27);
        UserInfo info2 = new UserInfo("Amit", 26);
        UserInfo info3 = new UserInfo("Salone", 29);
        UserInfo info4 = new UserInfo("Deepak", 22);
        UserInfo info5 = new UserInfo("Satish", 28);

        List<UserInfo> userInfos = new ArrayList<UserInfo>();
        userInfos.add(info1);
        userInfos.add(info2);
        userInfos.add(info3);
        userInfos.add(info4);
        userInfos.add(info5);

        System.out.println("User Info - " + userInfos);

        UserInfoSortByName userInfoSortByName = new UserInfoSortByName();
        Collections.sort(userInfos, userInfoSortByName);
        System.out.println("User Info Sort By Name- " + userInfos);

        UserInfoSortByAge userInfoSortByAge = new UserInfoSortByAge();
        Collections.sort(userInfos, userInfoSortByAge);
        System.out.println("User Info Sort By Age- " + userInfos);
    }
}

class UserInfo {

    private String name;
    private int age;

    public UserInfo() {
        // TODO Auto-generated constructor stub
    }

    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "UserInfo [name=" + name + ", age=" + age + "]";
    }

}

class UserInfoSortByName implements Comparator<UserInfo> {

    @Override
    public int compare(UserInfo o1, UserInfo o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class UserInfoSortByAge implements Comparator<UserInfo> {

    @Override
    public int compare(UserInfo o1, UserInfo o2) {
        return o1.getAge() - o2.getAge();
    }

}