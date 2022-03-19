class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        double milesPerHour = (double)(kilometersPerHour/1.609);
        System.out.println(milesPerHour); 
        long milesPerHourCalc = Math.round(milesPerHour);
        System.out.println(milesPerHourCalc); 
        return milesPerHourCalc; 
    }
    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour == -1){
         System.out.println("Invalid Value");   
        }else{
        System.out.println(kilometersPerHour+"km/hr = "+milesPerHour+" Mi/hr");
        }
    }
    public static void main(String[] args) {
        printConversion(0.0);
    }
}