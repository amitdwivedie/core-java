package com.amitdwivedie.core.basic.oops.Array;

/*

Explain the methods for accessing system properties about the Java virtual machine

The system properties are accessed by the method System.getProperties(). This method returns a Properties object.
By using the list() method of Properties, all the system properties can be viewed.
The following code snippet illustrates displaying the system properties.
*/
import java.util.Properties;

class PropertiesTest {
    public static void main(String g[]) {
        Properties props;
        props = System.getProperties();

        System.out.println(props);
        System.out.println("\n\n\n\n\n\n");
        props.list(System.out);
    }
}
