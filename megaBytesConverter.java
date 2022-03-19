public class megaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        int megaBytes = kiloBytes/1000;
        kiloBytes = kiloBytes%1000;
        System.out.println(megaBytes+" MB "+kiloBytes+" KB");
    }    
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
