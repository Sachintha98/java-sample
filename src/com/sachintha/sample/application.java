package com.sachintha.sample;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;
import sun.awt.geom.AreaOp;
import sun.management.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class application {
    public static void main(String[] args) {

//        List<String> students=new ArrayList<>();
//
//        students.add("Saman");
//        students.add("Kusal");
//        students.add("Sumanga");
//        students.add("Supun");
//        students.add("Thilina");
//        System.out.println(students);
//
//        List<String> filtereddata=students.stream()
//                .filter(s->s. length()>5)
//                .collect(Collectors.toList());(Collectors.toList());
//
//        System.out.println(filtereddata);


        List<Sensor> sensor = new ArrayList<>();
        com.sachintha.sample.Sensor sensor1=new com.sachintha.sample.Sensor("Living room",28.0);
        sensor.add(sensor1);

        com.sachintha.sample.Sensor sensor1=new com.sachintha.sample.Sensor("office room",28.0);
        sensor.add(sensor1);

        com.sachintha.sample.Sensor sensor1=new com.sachintha.sample.Sensor("bed room",28.0);
        sensor.add(sensor1);

        com.sachintha.sample.Sensor sensor1=new com.sachintha.sample.Sensor("kitchen room",28.0);
        sensor.add(sensor1);

        com.sachintha.sample.Sensor sensor1=new com.sachintha.sample.Sensor("bath room",28.0);
        sensor.add(sensor1);

        List<com.sachintha.sample.Sensor> hotsensors=sensor.stream()
                .filter(sensor -> sensor.)




    }


    }

