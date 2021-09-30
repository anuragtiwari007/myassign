package com.collection;

 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

 

/*
HashMap cannot contain duplicate keys.
HashMap allows multiple null values but only one null key.
HashMap is an unordered collection. ...
HashMap is not thread-safe. ...
A value can be retrieved only using the associated key.
HashMap stores only object references. ...
will be stored as Integer .*/

 


public class MapDemo {

 

    public static void main(String[] args) {

 

        Map<Integer, String> mapdemp = new HashMap<Integer, String>();

 

        mapdemp.put(1, "ankit");
        mapdemp.put(2, "ram");
        mapdemp.put(3, "tom");
        mapdemp.put(4, "ankit");
        mapdemp.put(null,null);

 

        // traversing map

 

        Iterator<Integer> itr = mapdemp.keySet().iterator();

 

        while (itr.hasNext()) {

 

            Integer keydemo = itr.next();

 

            String valuedemo = mapdemp.get(keydemo);

 

            System.out.println("key   " + keydemo + "values" + valuedemo);
        }

 

    }

 

}
 