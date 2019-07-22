public class Time {

    public static void convert(int minutes)
    {
        int hours  = minutes/60;
        int min = minutes % 60;
        System.out.printf(hours + " Hour%s " + min+ " Minute%s" , hours != 1 ?"s" : "", min != 1 ?"s" : "");
    }

    public static void main(String[] args){
        convert(122);
    }
}
