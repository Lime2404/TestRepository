public class TBridgeOfficer {
    int maxWeight;

    public TBridgeOfficer(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public boolean weightTruch(Truck truck) {  // в данном случае в метод надо передать объект
        if(truck.weight > maxWeight) {
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        Truck truck = new Truck();
        truck.weight = 1000;
        TBridgeOfficer dps = new TBridgeOfficer(1500);
        boolean canTruckGo = dps.weightTruch(truck);  // надо обязательно передать новый объект в метода который его ждет
        System.out.println("Ответ ДПС на вопрос можно ли двигаться дальше? -  "+ canTruckGo);
    }
}
