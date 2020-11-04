import com.sun.deploy.security.SelectableSecurityManager;

public class PoliceStation {
       int maxWeight;
    int count = 0;
    public PoliceStation (int normalWeight){ //конструктор для создания полисмена
      this.maxWeight = normalWeight;              // присваивание maxWeight

    }
    public boolean weightCheck(Truck truck) {  // Метод checkTruck принимает на вход один параметр — объект грузовика Truck (создается объкт)
        if (truck.weight > maxWeight) {        // truck.weight - это вес truck from different class
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args){
            Truck maz = new Truck();
            maz.weight = 2000;
            Truck gaz = new Truck();
            gaz.weight = 1400;

            PoliceStation Policeman = new PoliceStation(1500);  // создаем объект


            boolean canmazGo = Policeman.weightCheck(maz);
            System.out.println(canmazGo);
            boolean cangazGo = Policeman.weightCheck(gaz);
          System.out.println(cangazGo);

    }

}

