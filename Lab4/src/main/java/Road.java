import java.util.ArrayList;

public class Road {
    protected ArrayList<Transport> transportList = new ArrayList();

    public int getCountOfHumans(){
        int result= 0;
        for (Transport item : this.transportList) {
            result+= item.getBusyPlaces();
        }
        return result;
    }
    public void addCarToRoad(Transport $item){
        this.transportList.add($item);
    }

    public void delCarToRoad(Transport $item){
        this.transportList.remove($item);
    }
}
