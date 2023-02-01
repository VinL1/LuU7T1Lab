import java.lang.reflect.Array;
import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot () {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car carToAdd) {
        inventory.add(carToAdd);
    }

    public boolean swap(int idx1, int idx2){
        if (idx1 < inventory.size() && idx2 < inventory.size()) {
            Car car1 = inventory.get(idx1);
            Car car2 = inventory.set(idx2, car1);
            inventory.set(idx1, car2);
            return true;
        }
        else {
            return false;
        }
    }
}
