
public class Sensor {
    String name;
    int betterylevel=0;
    void charge(){
        betterylevel=100;
        System.out.println("sensor fully charged");
    }
    
    public static void main(String[] args) {
        Sensor sensor=new Sensor();
        sensor.charge();
        System.out.println(sensor.betterylevel);
    }
}
