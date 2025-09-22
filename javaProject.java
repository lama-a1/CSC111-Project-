import java.util.Scanner;

public class javaProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         // Current date           
        int currentYear = 2024;
        int currentMonth = 10; 
        int currentDay = 10;

        // Booking variables
        String item1 = "Room with city view";
        double Profit1 = 0.0;
        String BookingInformation1 = "";
        int popular1 = 0;
        double Price1 = 3000.0;

        String item2 = "Suite room";
        double Profit2 = 0.0;
        String BookingInformation2 = "";
        int popular2 = 0;
        double Price2 = 5000.0;

        String item3 = "Room including breakfast"; 
        double Profit3 = 0.0;      
        String BookingInformation3 = ""; 
        int popular3 = 0;
        double Price3 = 2500.0;

        String item4 = "Standard room";
        double Profit4 = 0.0; 
        String BookingInformation4 = ""; 
        int popular4 = 0;
        double Price4 = 1800.0;

        // Welcome message
        System.out.println("Welcome to JAVA Hotel Booking Management");

        // Input year for bookings
        int bookingYear;
        do {
            System.out.println("Please enter booking year: ");
            bookingYear = scanner.nextInt();
            if (bookingYear < currentYear) {
                System.out.println("Invalid year! Please enter the current or future year.");
            }
        } while (bookingYear < currentYear);

        // Input month for bookings
        int bookingMonth;
        do {
            System.out.println("Enter booking month: ");
            bookingMonth = scanner.nextInt();
            if (bookingMonth < 1 || bookingMonth > 12) {
                System.out.println("Invalid month! Please enter a valid month between 1 and 12.");
            } else if (bookingYear == currentYear && bookingMonth < currentMonth) {
                System.out.println("Invalid month! Please enter a valid month from " + currentMonth + " to 12.");
            }
        } while ((bookingYear == currentYear && bookingMonth < currentMonth) || bookingMonth > 12 || bookingMonth < 1);

        // Main menu
        int mainChoice;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Manager Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
             mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1: // Manager menu
                    int managerChoice;
                    do{
                    System.out.println("\nManager Menu:");
                    System.out.println("1. Print all booking information");
                    System.out.println("2. Print booking information for a specific item");
                    System.out.println("3. Print overall profit");
                    System.out.println("4. Print profit for a specific item");
                    System.out.println("5. Return to Main Menu");
                    System.out.println("Enter your choice: ");
                    managerChoice = scanner.nextInt();

                    switch (managerChoice) {
                        case 1:
                            System.out.println("\nBooking information for all items:");
                            System.out.println(item1+ " : " + BookingInformation1 + " Price: "+ Price1 +" SR");
                            System.out.println(item2+ " : " + BookingInformation2 + " Price: "+ Price2 +" SR");
                            System.out.println(item3+ " : " + BookingInformation3 + " Price: "+ Price3 +" SR");
                            System.out.println(item4+ " : " + BookingInformation4 + " Price: "+ Price4 +" SR");
                            break;
                            
                        case 2: 
                        int specific;   
                                                                   
                            System.out.println("\nBooking information for a specific item:");
                            System.out.println("1. "+ item1);
                            System.out.println("2. "+ item2);
                            System.out.println("3. "+ item3);
                            System.out.println("4. "+ item4);                      
                            System.out.println("Enter your choice: ");
                            specific = scanner.nextInt();
                            
                            switch(specific){
                              case 1 : 
                                System.out.println(BookingInformation1 + " , Price: "+ Price1 +" SR");
                              break;
                              
                              case 2 : 
                                System.out.println(BookingInformation2 + " , Price: "+ Price2 +" SR");
                              break;
                              
                              case 3 : 
                                System.out.println(BookingInformation3 + " , Price: "+ Price3 +"SR");
                              break;
                              
                              case 4 : 
                                System.out.println(BookingInformation4 + " , Price: "+ Price4 +" SR");
                              break;
                              default:
                                System.out.println("Invalid input.");                           
                              
                              } 
                               break;


                        case 3:
                            double totalProfit = Profit1 + Profit2 + Profit3 + Profit4;
                            System.out.println("Overall profit in SR");
                            System.out.printf("Total Profit: %.2f SR\n", totalProfit);
                            break;
                     
                            
                        case 4:
                            int specificProfit;
                            
                            System.out.println("Profit for a specific item:");
                            System.out.println("1. "+ item1);
                            System.out.println("2. "+ item2);
                            System.out.println("3. "+ item3);
                            System.out.println("4. "+ item4);                      
                            System.out.println("Enter your choice: ");
                            specificProfit = scanner.nextInt();
                            
                            switch(specificProfit){
                              case 1 : 
                                System.out.printf("Profit is : %.2f SR\n",Profit1);
                              break;
                              
                              case 2 : 
                                System.out.printf("Profit is : %.2f SR\n",Profit2);
                              break;
                              
                              case 3 : 
                                System.out.printf("Profit is : %.2f SR\n",Profit3);
                              break;
                              
                              case 4 : 
                                System.out.printf("Profit is : %.2f SR\n",Profit4);
                              break;
                              
                              default:
                                System.out.println("Invalid choice.");
                                                         
                              } 
                             
                            break;
                            
                        case 5:
                             System.out.println("Returning to Main menu.");
                             
                            break;
                            
                            default:
                            System.out.println("Invalid choice.");
                            }
                           } while(managerChoice != 5); //to end Manager menu
                            
                        break;




                // Customer menu
                case 2: 
                    boolean booked = false;
                    int customerChoice;
                    int previousItemChoice = -1;
                    int itemChoice;
                    do {
                        System.out.println("\nCustomer Menu:");
                        System.out.println("1. Book a room");
                        System.out.println("2. Cancel a booking");
                        System.out.println("3. Show popular item");
                        System.out.println("4. Return to Main Menu");
                        System.out.println("Enter your choice: ");
                        customerChoice= scanner.nextInt();

                        switch (customerChoice) {
                            case 1:
                            itemChoice = 0;
                            if ( itemChoice == previousItemChoice) {
                                System.out.println("Sorry, you can't book the same item again. Please select a different item.");
                                break; 
                            }
                            // Display available items
                            System.out.println("\n Available Items:");
                            System.out.println("1. " + item1);
                            System.out.println("2. " + item2);
                            System.out.println("3. " + item3);
                            System.out.println("4. " + item4);
                            System.out.println("Select an item to book: ");
                            itemChoice = scanner.nextInt();
                            if (itemChoice>=5 || itemChoice<1) {
                                System.out.println("Invalid choice choose between 1-4");
                                break;
                            }
                                

                                // Get booking date
                                int day;
                                do {
                                  System.out.println("Enter day to book: ");
                                  day = scanner.nextInt();
                                  
                                  // Determine the maximum number of days in the month
                                  int maxDays;
                                  if (bookingMonth == 2) { // Check leap year for February
                                      maxDays = (bookingYear % 4 == 0 && bookingYear % 100 != 0) || (bookingYear % 400 == 0) ? 29 : 28;
                                  } else if (bookingMonth == 4 || bookingMonth == 6 || bookingMonth == 9 || bookingMonth == 11) { // April, June, September, November
                                      maxDays = 30;
                                  } else {
                                      maxDays = 31;
                                  }
                      
                                  // Check invalid
                                  if (bookingYear == currentYear && bookingMonth == currentMonth && day <= currentDay) {
                                      System.out.println("Invalid day! Please enter a day after " + currentDay + ".");
                                  }

                                  else if (day < 1 || day > maxDays) {
                                      System.out.println("Invalid day! Please enter a valid day between 1 and " + maxDays + ".");
                                  }
                                  // valid(exit)
                                  else {
                                      break;
                                  }
                              } while (true); // Keep asking until a valid day 
                              
                          String date;               
                          if(day < 10)
                             date = "0" + day + "-" + bookingMonth + "-"  +  bookingYear ;            
                           else
                              date = day + "-" + bookingMonth + "-"  + bookingYear ;
                              boolean reserved = false;
                              switch (itemChoice) {
                               case 1: 
                                    if (BookingInformation1.indexOf(date) != -1) 
                                        reserved = true;
                                    break;
                                case 2: 
                                    if (BookingInformation2.indexOf(date) != -1) 
                                        reserved = true;
                                    break;
                                case 3: 
                                    if (BookingInformation3.indexOf(date) != -1) 
                                        reserved = true;
                                    break;
                                case 4:
                                    if (BookingInformation4.indexOf(date) != -1) 
                                        reserved = true;
                                    break;
                            }
                            if (reserved) {
                                System.out.println("Sorry. This room is already booked on this date: " + date);
                                break; // Exit the customer switch
                            }
                          //Read customer ID   
                    String Id ;
                    boolean validId ;                 
                       do{
                        System.out.println("Enter your ID (10 digits): ");             
                               Id = scanner.next();
                      int  digitNum = 0;
                        for(int i = 0; i< Id.length(); i++)            
                      if (Id.charAt(i) >= '0' && Id.charAt(i) <= '9')
                        digitNum++;                       
                          if(digitNum == 10 && Id.length() == 10)                   
                            validId = true;
                          else {           
                          validId = false;
                          System.out.println("Invalid ID. You must enter 10 digits ");}
                                           } while(validId == false);



                                // Read customer name
                                System.out.println("Enter your name: ");
                                scanner.nextLine(); // Clean garbage
                                String customerName = scanner.nextLine();
                                

                                // Book the room based on selected item
                                switch (itemChoice) {
                                    case 1:
                                    BookingInformation1 += String.format("*%-10s, %s, %s\n", Id, customerName, date);
                                        Profit1 += Price1;
                                        popular1++;
                                        break;
                                    case 2:
                                        BookingInformation2 += String.format("*%-10s, %s, %s\n", Id, customerName, date);
                                        Profit2 += Price2;
                                        popular2++;
                                        break;
                                    case 3:
                                        BookingInformation3 += String.format("*%-10s, %s, %s\n", Id, customerName,date);
                                        Profit3 += Price3;
                                        popular3++;
                                        break;
                                    case 4:
                                        BookingInformation4 += String.format("*%-10s, %s, %s\n", Id, customerName, date);
                                        Profit4 += Price4;
                                        popular4++;
                                        break;
                                    default:
                                        System.out.println("Invalid choice.");
                                }

                                System.out.println("Booking is successful");
                                booked = true;
                                previousItemChoice = itemChoice; 
                                break;

                            case 2: // Cancel booking
                                System.out.println("Please enter day to cancel:");
                                int cancelDay = scanner.nextInt();

                                System.out.println("Enter ID:");
                                String cancelId = scanner.next();

                                String cancelDate = cancelDay + "-" + bookingMonth + "-" + bookingYear;

                                boolean cancel = false;

                                int location = BookingInformation1.indexOf(cancelDate);       
                                             if(location != -1){
                                          int s1 = 0;     
                                          for(int k = location ; k >= 0 ; k--){
                                      if(BookingInformation1.charAt(k) == '*'){                       
                                           s1 = k ;
                                        break;                        }
                                    }                    int s2 = BookingInformation1.indexOf('*' , location);
                                  if(s2 == -1)                     
                                   s2 = BookingInformation1.length();
                                   String temp = BookingInformation1.substring(s1, s2);
                                 if(temp.substring(1,11).equals(cancelId)){            
                                   BookingInformation1 = BookingInformation1.replace(temp, "");               
                                  Profit1 -= Price1 ;
                                 popular1-- ;              
                                 cancel = true ; }
                                 }//s2 location != -1                   
                                 location = BookingInformation2.indexOf(cancelDate);              
                                  if(location != -1){
                                  int s1 = 0;             
                                     for(int k = location ; k >=0 ; k--){
                                    if(BookingInformation2.charAt(k) == '*'){       
                                   s1 = k ;
                                    break;                   
                                        }
                                   }                    
                                   int s2 = BookingInformation2.indexOf('*' , location);
                                   if(s2 == -1)                     
                                    s2 = BookingInformation2.length();
                                    String temp = BookingInformation2.substring(s1, s2);
                                 if(temp.substring(1,11).equals(cancelId)){                  
                                    BookingInformation2 = BookingInformation2.replace(temp, "");                 
                                   Profit2 -= Price2 ;            
                                   popular2-- ;
                                 cancel = true ;                     }
                                 }//s2 location != -1                   
                                 location = BookingInformation3.indexOf(cancelDate);  
                                                   if(location != -1){
                                  int s1 = 0;           
                                           for(int k = location ; k >=0 ; k--){
                                    if(BookingInformation3.charAt(k) == '*'){                    
                                            s1 = k ;
                                      break;                       }

                                   }                   
                                  int s2 = BookingInformation3.indexOf('*' , location);
                                  if(s2 == -1)                    
                                    s2 = BookingInformation3.length();
                                    String temp = BookingInformation3.substring(s1, s2);
                                 if(temp.substring(1,11).equals(cancelId)){               
                                        BookingInformation3 = BookingInformation3.replace(temp, "");
                                 Profit3 -= Price3 ;
                                 popular3-- ;            
                                 cancel = true ;
                                  }                   }//s2 loc != -1
                                  location = BookingInformation4.indexOf(cancelDate);
                                  if(location != -1){           
                                  int s1 = 0;
                                  for(int k = location ; k >=0 ; k--){        
                                   if(BookingInformation4.charAt(k) == '*'){
                                    s1 = k ;                        break;
                                     }                     
                                     }
                                  int s2 = BookingInformation4.indexOf('*' , location);     
                                   if(s2 == -1)
                                    s2 = BookingInformation4.length();                      
                                    String temp = BookingInformation4.substring(s1, s2);                
                                    if(temp.substring(1,11).equals(cancelId)){
                                     BookingInformation4 = BookingInformation4.replace(temp, "");
                                     Profit4 -= Price4 ;
                                     popular4-- ;                   
                                     cancel = true ;
                                  }                  
                                   }//s2 loc != -1
                                                    
                                 if(cancel){              
                                           System.out.println("Your booking is successfully canceled!");
                                           booked = false; 
                                 }else {                  
                                       System.out.println("Booking not found.");
                                 }
                                break;

                                case 3: 
                                if (popular1 == 0 && popular2 == 0 && popular3 == 0 && popular4 == 0) {
                                    System.out.println("There are currently no bookings.");
                                    break;      
                                }
                            
                                // Find the max
                                int max = popular1;
                                if(popular2 > max)                       
                                    max = popular2;
                                if(popular3 > max)                       
                                    max = popular3;
                                if(popular4 > max)                     
                                    max = popular4;
                            
                                // Print max
                                System.out.println("The most popular room(s) : ");
                                boolean found = false; 
                            
                                if (max == popular1) {
                                    System.out.println(item1 + " , Number of booking(s) : " + popular1);
                                    found = true;
                                }
                                if (max == popular2) {
                                    System.out.println(item2+ " , Number of booking(s) : " + popular2);
                                    found = true;
                                }
                                if (max == popular3) {
                                    System.out.println(item3+ " , Number of booking(s) : " + popular3);
                                    found = true;
                                }
                                if (max == popular4) {
                                    System.out.println(item4+ " , Number of booking(s) : " + popular4);
                                    found = true;
                                }
                            
                                // If no max
                                if (!found) {
                                    System.out.println("No room matches the maximum popularity.");
                                }
                            
                                break;
                            

                            case 4:
                                System.out.println("Returning to Main Menu."); 
                                break;

                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (customerChoice !=4);
                    break;
                     // End customer menu
                           case 3:
                    System.out.println("successfully exited. Goodbye");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (mainChoice != 3); // End main menu
    }
} 
