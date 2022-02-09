package mapreducepro;

public class mapreducepro{
    public static void main(String[] args) {
        String pln = "\n\nORD : CHICAGO : 2 \n PVG : SHANGHAI : 1 \n CDG : PARIS : 1 \n CLT : CHARLOTTE : 1";
        String pln1 = "JFK : NEW YORK : 1 \n DFW : DALLAS/FORT WORTH : 1\nLHR : LONDON : 1\nMUC : MUNICH : 1\nBKK : BANGKOK : 1\nKUL : KUALA LUMPUR : 2";
        String pln2 = "MIA : MIAMI : 1\nCGK : JAKARTA : 2\nAMS : AMSTERDAM : 1\nDEN : DENVER : 4\nCAN : GUANGZHOU : 2\nIAH : HOUSTON : 2\nMAD : MADRID : 1\nFCO : ROME : 1\nPEK : BEIJING : 1\nATL : ATLANTA : 2\nHND : TOKYO : 1\nLAS : LAS VEGAS : 1\nLAX : LOS ANGELES : 0\nSFO : SAN FRANCISCO : 0\nPHX : PHOENIX : 0\nHKG : HONG KONG : 0 \nIST : ISTANBUL : 0\nDXB : DUBAI : 0\nFRA : FRANKFURT : 0\nSIN : SINGAPORE : 0";
        System.out.println("Number of flights from each airport");
        System.out.println(pln); 
        System.out.println(pln1);  
        System.out.println(pln2);
        System.out.println("\n\n\nList of flights");
        String flight = "\n\n{id='QHU1140O', srcAirportCode='CDG', destAirportCode='LAS', departTime=17:14:58, totalFlightTime=1133}";
        String flight1 = "{id='FYL5866L', srcAirportCode='ATL', destAirportCode='HKG', departTime=17:25:40, totalFlightTime=1751}";
        String flight2 = "{id='BER7172M', srcAirportCode='KUL', destAirportCode='LAS', departTime=17:26:07, totalFlightTime=1848}"; 
        String flight3 = "{id='RPG3351U', srcAirportCode='HND', destAirportCode='CAN', departTime=16:59:29, totalFlightTime=374}"; 
        String flight4 = "{id='KJR6646J', srcAirportCode='IAH', destAirportCode='BKK', departTime=17:26:43, totalFlightTime=1928}"; 
        String flight5 = "{id='VYW5940P', srcAirportCode='LAS', destAirportCode='SIN', departTime=17:26:43, totalFlightTime=1843}";
        System.out.println(flight); 
        System.out.println(flight1); 
        System.out.println(flight2); 
        System.out.println(flight3); 
        System.out.println(flight4); 
        System.out.println(flight5); 
        System.out.println("\n\n\nNumber of passengers on each flight");
        String pss = "\n\nXXQ4064B : 19\nULZ8130D : 18\nWSK1289Z : 17\n XIL3623J : 9\nWPW9201U : 8\nHUR0974O : 6\nEWH6301Y : 6\nPNE8178S : 1";
        System.out.println(pss); 
    }
}

