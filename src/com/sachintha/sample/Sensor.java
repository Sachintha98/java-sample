package com.sachintha.sample;

public class Sensor {

   private String name;
   private Double reading;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Double getReading() {
      return reading;
   }

   public Sensor(String name, Double reading) {
      this.name = name;
      this.reading = reading;
   }

   public void setReading(Double reading) {
      this.reading = reading;

   }
}
