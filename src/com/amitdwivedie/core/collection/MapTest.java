package com.amitdwivedie.core.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Amit Dwivedi
 *
 */
public class MapTest {

    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("k1", new Dog("lucy"));
        map.put("k2", Pets.DOG);
        map.put(Pets.CAT, "Pet Cat Key");

        Dog dog = new Dog("tiger");
        map.put(dog, "Dog Key");
        map.put(new Cat(), "Cat key");
        System.out.println("Map - " + map);

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get(Pets.CAT));
        System.out.println(map.get(dog));
        //In Cat class hash and equals method is not implemented so object wont be found
        System.out.println(map.get(new Cat()));
        
        //By changing name hash code will change and dog object will not be found
        dog.setName("whi");
        System.out.println(map.get(dog));
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if ((object instanceof Dog)
                && (((Dog) object).getName().equals(this.name))) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        return name.length();
    }
}

class Cat {

}

enum Pets {
    DOG, CAT
}