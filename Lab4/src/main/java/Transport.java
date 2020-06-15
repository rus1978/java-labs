import org.hamcrest.Matcher;

import java.util.ArrayList;

public abstract class Transport {
    private TransportType type;

    private ArrayList<User> userList = new ArrayList();

    private int minPlaces= 1;//как минимум водитель
    private int maxPlaces;
    private int busyPlaces= this.minPlaces;

    public TransportType getType(){
        return this.type;
    }

    protected void setType(TransportType type){
        this.type= type;
    }

    protected void setMaxPlaces(int maxPlaces) throws Exception {
        if (this.busyPlaces > maxPlaces )
            throw new Exception("Не выкидывать же тех, кто уже в машине");
        this.maxPlaces = maxPlaces;
    }

    public int getMaxPlaces() {
        return this.maxPlaces;
    }

    public int getBusyPlaces() {
        return this.busyPlaces;
    }

    public void setBusyPlaces(int count) {
        this.busyPlaces= count;
    }

    public void addUser(User user) throws Exception {
        if( this.getBusyPlaces() >= this.getMaxPlaces() )
            throw new Exception("Нет свободных мест");

        if( user.getType() != this.getType() && user.getType() != TransportType.Common )
            throw new Exception("Этот транспорт не подходит этому пользователю");

        userList.add(user);
        this.setBusyPlaces( userList.size() );
    }

    public void delUser(User user) throws Exception {
        if( userList.isEmpty() )
            throw new Exception("В машине и так никого нет");

        userList.remove(user);

        this.setBusyPlaces( userList.size() );
    }


    //@Override
    public Matcher<?> addUser(PoliceMan user) {
        return null;
    }

   //@Override
    public Matcher<?> delUser(PoliceMan user) {
        return null;
    }
}
