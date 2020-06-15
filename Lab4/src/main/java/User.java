public class User {
    private TransportType type= TransportType.Common;//default

    public TransportType getType(){
        return this.type;
    }

    public void setType(TransportType type){
        this.type= type;
    }
}
