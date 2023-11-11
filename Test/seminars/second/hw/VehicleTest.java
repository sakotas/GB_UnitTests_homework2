package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testCarCreatedWithFourWheels() {
        Car car = new Car("Toyota", "Corolla", 2020);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleCreatedWithTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeedInTestDrive() {
        Car car = new Car("Ford", "Mustang", 2019);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedInTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2022);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarStopsAfterPark() {
        Car car = new Car("Honda", "Civic", 2018);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleStopsAfterPark() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}