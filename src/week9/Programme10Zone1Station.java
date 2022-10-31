package week9;
// Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme10Zone1Station {
    public static void main(String[] args) {
        Programme10Zone1Station obj = new Programme10Zone1Station();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please select station name from Given list: ");
        System.out.println("Tottenham court Road ,Westminister Station,Baker Street Station,OxfordCircus Station," +
                        "Piccadlly Circus Station,Barbican Station");
        String stationName=scanner.nextLine();
        obj.zone1StationName(stationName);
        scanner.close();
    }

    public void zone1StationName(String stationName) {
        String name;
        switch (stationName) {
            case "Tottenham court Road ":
                System.out.println("Central line and Northern line pass through above station");
                break;
            case "Westminister Station":
                System.out.println("Central line,District line and Jubilee line pass through above station");

                break;
            case "Baker Street Station":
                System.out.println("Jubilee line and Bakerloo line pass through above station");
                break;
            case "OxfordCircus Station":
                System.out.println("Central line,Victoria line and Bakerloo line pass through above station");
                break;
            case "Piccadlly Circus Station":
                System.out.println("Bakerloo line and Piccadlly line pass through above station");
                break;
            case "Barbican Station":
                System.out.println("Circle line, Hammersmith & City  line and Metropollitan line pass through above station");
            default:
                System.out.println("Invalid input");
        }

    }
}

