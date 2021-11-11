import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

// This class has a list, producer (adds items to list
// and consumer (removes items).
// from open source geeksforgeeks with edit it ...
    public  class PC {

    // Create a list shared by producer and consumer
    // Size of list is 2.
    LinkedList<Vehicles> list = new LinkedList<>();
    int capacity = 2;

    // Function called by producer thread
    public void produce() throws InterruptedException {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <60000) { // one min of working
            synchronized (this) {
                // producer thread waits while list
                // is full
                while (list.size() == capacity)
                    wait();
                Vehicles _vehicleToAdd;
                Random rand = new Random();
                int rand_int1 = rand.nextInt(5); //random number to pick which car to make
                switch (rand_int1) {
                    case 0:
                        _vehicleToAdd = new ElectricMotocyle();
                        break;
                    case 1:
                        _vehicleToAdd = new Motocyle();
                        break;
                    case 2:
                        _vehicleToAdd = new Car();
                        break;
                    case 3:
                        _vehicleToAdd = new ElectricCar();
                        break;
                    case 4:
                        _vehicleToAdd = new Truck();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value of color: " + rand_int1);
                }
                // to insert the jobs in the list
                list.add(_vehicleToAdd);

                // notifies the consumer thread that
                // now it can start consuming
                notify();

                // makes the working of program easier
                // to  understand
                Thread.sleep(200);
            }
        }
        System.exit(0); // after 1 min the program will exit automatically
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                // consumer thread waits while list
                // is empty
                while (list.size() == 0)
                    wait();

                // to retrieve the ifrst job in the list
                System.out.println(list.removeFirst().getInfo());

                // Wake up producer thread
                notify();

                // and sleep
                Thread.sleep(200);
            }
        }
    }
}