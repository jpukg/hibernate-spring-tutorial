# Hibernate Spring

## Overview

This is a tutorial application for [Hibernate](https://hibernate.org/) with [Spring IO Platform](https://spring.io/platform).

## Assignments

### Vehicle Entity

* Create an entity Vehicle
  * Auto-generated id (@GeneratedValue)
  * Vehicle identification number (VIN) (@Column)
  * Price: currency and amount (@Embedded)
  * Model (@Embedded)
    * Code (z.B. 5K12D5) (@Column)
    * Name (z.B. Golf Trendline 1,2 TSI) (@Column)
    * Type: LKW / PKW (@Enumerated)
* Create a VehicleService for loading and saving
* Create a Vehicle and save it
* Load the saved Vehicle

### Refactor Model to an Entity

* Change Model to an entity
* Add auto-generated id to Model
* "model_id" as foreign key in vehicle table
* Mapping of the relationship only from Vehicle to Model
