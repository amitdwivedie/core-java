package com.amitdwivedie.core.basic.socket;

import java.net.*;

class IpDemo {
    public static void main(String g[]) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            InetAddress ip1 = InetAddress.getByName("AmitDwivedi-PC");
            String ip3 = ip.getHostAddress();
            String ip4 = ip.getHostName();
            System.out.println(ip);
            System.out.println(ip1);
            System.out.println(ip3);
            System.out.println(ip4);
            System.out.println("Name of Laptop whose ip is :" + ip + ":"
                    + ip.getHostName());
            System.out.println("all name is :---------->");
            InetAddress ip2[] = InetAddress.getAllByName("AmitDwivedi-PC");
            for (int i = 0; i < ip2.length; i++) {
                System.out.println("Name is :--->" + ip2[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
