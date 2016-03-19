package com.amitdwivedie.core.basic.collection;

class Student implements Comparable {
    int roll, age;
    String name;

    public Student(String n, int a, int r) {
        name = n;
        age = a;
        roll = r;
    }

    public String toString() {
        return name + ":" + age + ":" + roll; // if we are not override the
                                              // toString method then ref id's
                                              // of object inside the array are
                                              // printed
    }

    // duplicacy of obj is also take place so we must override the equals method

    public boolean equals(Object o) {

        System.out.println("equals");

        Student s = (Student) o;
        System.out.println(this.name);
        System.out.println(s.name);

        if ((this.name == s.name) && (this.age == s.age)
                && (this.roll == s.roll)) {
            return true;
        } else
            return false;
    }

    /*
     * public int compareTo(Object o) { Student st=(Student)o;
     * if(this.age<st.age) return -1; else if(this.age>st.age) return 1; else
     * return 0; }
     * 
     * public int compareTo(Object o) { Student st=(Student)o;
     * if(this.roll<st.roll) return -1; else if(this.roll>st.roll) return 1;
     * else return 0; }
     */
    public int compareTo(Object o) {
        Student st = (Student) o;

        if (this.name.compareTo(st.name) < 0)
            return -1;
        else if (this.name.compareTo(st.name) > 0)
            return 1;
        else
            return 0;
    }
}
