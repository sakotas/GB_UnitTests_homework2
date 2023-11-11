package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    /*
    Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
    (используя оператор instanceof)
     */
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }
    /*
    Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    public void testCarCreatedWithFourWheels() {
        Car car = new Car("Toyota", "Corolla", 2020);
        assertEquals(4, car.getNumWheels());
    }
    /*
    Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    public void testMotorcycleCreatedWithTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }
    /*
    Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testCarSpeedInTestDrive() {
        Car car = new Car("Ford", "Mustang", 2019);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
    /*
    Проверить, что объект Motorcycle развивает скорость 75
    в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void testMotorcycleSpeedInTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2022);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }
    /*
    Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    машина останавливается (speed = 0).
     */
    @Test
    public void testCarStopsAfterPark() {
        Car car = new Car("Honda", "Civic", 2018);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
    /*
    - Проверить, что в режиме парковки (сначала testDrive, потом park,
    т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    public void testMotorcycleStopsAfterPark() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

}