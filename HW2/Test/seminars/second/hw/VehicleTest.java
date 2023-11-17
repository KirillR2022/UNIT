package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertTrue(car instanceof Vehicle, "Car should be an instance of Vehicle");
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertEquals(4, car.getNumWheels(), "Car should have 4 wheels");
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2022);
        assertEquals(2, motorcycle.getNumWheels(), "Motorcycle should have 2 wheels");
    }

    @Test
    public void testCarSpeedDuringTestDrive() {
        Car car = new Car("Toyota", "Camry", 2022);
        car.testDrive();
        assertEquals(60, car.getSpeed(), "Car should reach a speed of 60 during test drive");
    }

    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2022);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "Motorcycle should reach a speed of 75 during test drive");
    }

    @Test
    public void testCarStopsDuringPark() {
        Car car = new Car("Toyota", "Camry", 2022);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "Car should stop when parked");
    }

    @Test
    public void testMotorcycleStopsDuringPark() {
        Motorcycle motorcycle = new Motorcycle("Harley", "Davidson", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "Motorcycle should stop when parked");
    }

}