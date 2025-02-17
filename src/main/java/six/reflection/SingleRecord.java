package six.reflection;

//Thread safe, cloning nije moguć, refleksija, serializacija
public enum SingleRecord {

    INSTANCE;

    public String getDesc(){
        return "This is a single record";
    }
}
