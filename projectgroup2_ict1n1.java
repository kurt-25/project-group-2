package final_project;
import java.util.Scanner;
public class projectgroup2_ict1n1 {
	

		
			    
				private static final String CYAN = "\u001B[46m";
				private static final String BLACK = "\u001B[40m";
				private static final String PURPLE = "\u001B[45m";
				private static final String BLUE = "\u001B[44m";
				private static final String WHITE = "\u001B[47m";
				private static final String GREEN = "\u001B[42m";
				private static final String YELLOW = "\u001B[43m";
				private static final String RED = "\u001B[41m";
				private static final String RESET = "\u001B[0m";
				public static final String WHITE_TEXT = "\033[97m";  // White text color
			    public static final String CYAN_TEXT = "\033[96m";  // Cyan text color
			    public static final String BOLD = "\033[1m";  // Bold text
			    

			    
			  


			    // Display error message with red background
			    public static void showErrorMessage(String message) {
			        System.out.println(RED + WHITE_TEXT + BOLD + "ERROR: " + message + RESET);
			    }
				
				
				public static void main(String[] args) {
					 Scanner scanner = new Scanner(System.in);
				        boolean running = true;

				        
				        displayWelcomeMessage();
				        
				        displayLoadingAnimationFirst();
				        
				        
				        
				        
				        
				       
				        // Starting screen     
				        System.out.print(BOLD + "\u001B[32m\t\t\t\t\t\t                                    Starting\u001B[0m" + RESET);

				        // Loading animation with 3 dots
				        for (int i = 0; i < 3; i++) {
				            // Print a dot without a newline
				            System.out.print(BOLD + "\u001B[32m.\u001B[0m" + RESET);

				            // Pause for 1 second to simulate loading
				            try {
				                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
				            } catch (InterruptedException e) {
				                Thread.currentThread().interrupt();
				                System.out.println(BOLD + "\t\t\t\t\t\t                                    Loading interrupted!" + RESET);
				                return;
				            }
				        }

				        // Print a newline at the end for neat output
				        System.out.println();
				        System.out.println(BOLD + "\u001B[32m\t\t\t\t\t\t                                    Loading complete!\u001B[0m" + RESET);
				
				    

				      
		                
				
				
				      
				    		
				    		
				        try {
				            Thread.sleep(500);
				        } catch (InterruptedException e) {
				            Thread.currentThread().interrupt();
				        }
				        
				        
				        while (running) {
				            try {
				                displayMainMenu();
				                System.out.print(BLACK + "\u001B[32m\t\t                                   👉 Choose an option:  \u001B[0m" + RESET);

				                if (!scanner.hasNextInt()) {
				                    throw new IllegalArgumentException("Non-numeric input detected");
				                }

				                int choice = scanner.nextInt();

				                switch (choice) {
				                    case 1:
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t_________________________________________________________________\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t|_______________________________________________________________|\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ___________________________________________________________   \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||  \u001B[0m ");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                                                                              
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||            - Welcome to Basic Calculator -            ||\u001B[0m");                     
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                      
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");                    
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");
				                    	System.out.println("\t\t\t\t\t\t");
				                        basicCalculator(scanner);
				                        break;
				                    case 2:



				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t_________________________________________________________________\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t|_______________________________________________________________|\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ___________________________________________________________   \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||  \u001B[0m ");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                                                                              
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||      Welcome to Area and Circumference Calculator     ||\u001B[0m");                     
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                      
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");                    
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");                     
				                    	System.out.println("\t\t\t\t\t\t");
				                        areaAndCircumference(scanner);
				                        break;
				                    case 3:
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t_________________________________________________________________\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t|_______________________________________________________________|\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ___________________________________________________________   \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||  \u001B[0m ");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                                                                              
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||         Welcome to Area and Perimeter Calculator      ||\u001B[0m");                     
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                      
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");                    
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");
				                    	System.out.println("\t\t\t\t\t\t");
				                    	areaAndPerimeter(scanner);
				                        break;
				                    case 4:
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t_________________________________________________________________\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t|_______________________________________________________________|\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ___________________________________________________________   \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||  \u001B[0m ");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                                                                              
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||              Welcome to Unit Conversion               ||\u001B[0m");                     
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                      
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");                    
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");
				                    	System.out.println("\t\t\t\t\t\t");
				                    	conversion(scanner);
				                        break;
				                    case 5:
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");                                                                                
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t_________________________________________________________________\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t|_______________________________________________________________|\u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ___________________________________________________________   \u001B[0m");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||  \u001B[0m ");
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                                                                              
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||              Welcome to About Us section              ||\u001B[0m");                     
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||                                                       ||\u001B[0m");                      
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");                    
				                    	System.out.println("\u001B[32m\t\t\t\t\t\t   ||_______________________________________________________||\u001B[0m");
				                    	System.out.println("\t\t\t\t\t\t");
				                        displayAboutUs(scanner);
				                        break;
				                    case 6:        
				                    	// Goodbye message before asking if they are sure
				                    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			        System.out.println("\u001B[32m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                                                                                \u001B[0m");
				    			    	System.out.println(BLACK + BOLD +"\u001B[37m\t\t\t\t\t\t                                                                                                                                                                             \r\n"   
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				    			    			+ "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                               \r\n" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠏⠃⠀⠀⣀⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⠆⠀⠀⠀                       ⠀                                                                                                                                 \r\n"
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣶⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                               \r\n" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⡟⠀⠀⢀⡀⠀⠀⠀⠀⠀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                              \r\n" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⠷⠛⣫⣭⡉⠉⠲⣾⡿⠋⠉⣩⣭⣍⠛⢶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                            \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣿⠀⠀⠟⠧⠀⠸⣿⣿⣿⠀⠈⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                             \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠉⠋⠁⣠⣆⣀⣀⣠⣄⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                             \r"                 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⢈⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                              \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                            \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠈⠉⠛⠻⠿⢿⣿⡿⠟⠛⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                             \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠀⠀⠀                                                                                                                                                 \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠀⠀⠀                                                                                                                                                  ⠀\r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⡇⠀⠀            ⠀                                                                                                                                        \r"
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣿⠁⢃⠀                                                                                                                                                              ⠀⠀\r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⣿⣿⣿⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠻⠿⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⡇⢸⠀          ⠀                                                                                                                                                    \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⢸⣿⣿⡇⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣦⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⣀⣤⡄⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⢿⣷⢸⡀⠀                                                                                                                                                              ⠀\r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⣼⣿⣿⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⣠⣿⣿⣿⣿⠃⠀⣿⡏⡇⠀                                                                                                                                                                ⠀\r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⣿⣿⡇⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣀⣀⣤⣶⣿⣿⣿⠟⠁⠀⠀⠉⠁⡇⠀                                                                                                                                                               ⠀\r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⡿⠛⠃⠀⠀⠀⠀⠀⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⡇⠀                                                                                                                                                              ⠀\r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠉⠀⠀⠀⠀⠀⠀⡀⠀⡇⠀⠀                                                                                                                                                             \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡟⠛⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⡇⠀⠀                                                                                                                                                             \r"                 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⠀⠀⠀⢹⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⣷⠀⠀                                                                                                                                                              \r"             
				                                + "\u001B[33m\t\t\t\t\t\t⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⣿⠀⠀                                                                                                                                                                   \r"         
				                                + "\u001B[33m\t\t\t\t\t\t⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⢹⡄⠀                                                                                                                                                                                                                     \r"      
				                                + "\u001B[33m\t\t\t\t\t\t⢠⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⡀                                                                                                                                                                     \r"   
				                                + "\u001B[33m\t\t\t\t\t\t⢸⣿⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣣                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⣾⣿⠀⠀⢹⡀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⢀⣿                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⢿⢿⡄⠀⠀⠳⡀⠀⠀⠀⠀⠀⠀⠀⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⡄⠁⠀⣾⡟                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠸⡈⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡿⠁                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠑⢌⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠴⠞⠉⠀                                                                                                                                                                                                      ⠀\r"
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠃⠀⠀⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⢠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r"                  
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⣤⡴⠋⠀⢀⣠⢿⡇⠀⣀⠔⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⢸⣿⠀⠀⠀⠻⣀⣀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                      \r" 
				                                + "\u001B[33m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠢⠀⠸⠛⠓⠢⠄⠀⠉⠉⠁⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                      \u001B[0m");                
				                        System.out.println(BLACK + "\u001B[33m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                     \u001B[0m" + RESET);
				                        System.out.println(BLACK + "\u001B[33m\t\t\t\t\t\t                                                                                                                                                                                                                                                                ");
				            	        System.out.println(BLACK + "\u001B[33m\t\t\t\t\t\t            Thanks for using Calculator Console App!                                                                                                                                                                                                                                                                \u001B[0m");
				            	        System.out.println(BLACK + "\u001B[33m\t\t\t\t\t\t            ----------------------------------------                                                                                                                                                                                                                                                                \u001B[0m");
				            	        System.out.println(BLACK + "\u001B[33m\t\t\t\t\t\t                           Goodbye!                                                                                                                                                                                                                                                                \u001B[0m");
				            	        System.out.println(BLACK + "\u001B[33m\t\t\t\t\t\t                                                                                                                                                                                                                                                                \u001B[0m" + RESET);
				                        System.out.print("\n\u001B[33m\t\t\t\t\t\t             Are you sure you want to exit? (y/n):\u001B[0m");
				                        
				                        // Waiting for user input to decide exit or return to main menu
				                        String exitChoice = scanner.next();
				                        
				                        if (exitChoice.equalsIgnoreCase("y")) {
				                            // Calling closeCMD to clear the screen and exit
				                            closeCMD();
				                            running = false;
				                            System.out.println(BOLD + "\u001B[30m\t\t\t\t\t\tProgram has been closed.\u001B[0m" + RESET);
				                        } else if (exitChoice.equalsIgnoreCase("n")) {
				                            // Return to main menu
				                            System.out.println(BOLD + "\u001B[33m\t\t\t\t\t\tReturning to main menu...\u001B[0m" + RESET);
				                        } else {
				                            // Handle invalid input for exit choice
				                            System.out.println(BOLD + "\u001B[33m\t\t\t\t\t\tInvalid input! Returning to main menu...\u001B[0m" + RESET);
				                            
				                        }

				                        break;		                       
								default:
							        handleInvalidChoice(scanner);
							        

				                }
				            } catch (IllegalArgumentException e) {
				                handleInvalidChoice(scanner);
				                scanner.nextLine(); // Clear the invalid input
				            } catch (Exception e) {
				                handleInvalidChoice(scanner);
				                scanner.nextLine(); // Clear the invalid input
				            }
				            
				        }

				        scanner.close();
				    }
				
				

			    


					
				


				private static Object choice(Scanner scanner) {
					// TODO Auto-generated method stub
					return null;
				}


				private static void showError(String message) {
			        System.out.println(RED + BOLD + "                                                                                                                                                                                        ");
			        System.out.println(RED + BOLD + "                                                                                                                                                                                        ");
			        System.out.println(RED + BOLD + "                                                                                                                                                                                         ");
			        System.out.println(RED + BOLD + "                                                                                                                                                                                          ");
			        System.out.println(RED + BOLD + "                                                                                                                                                                                           ");
			        System.out.println(RED + BOLD + "                                                                                                                                                                                             ");
			        System.out.println(RED + BOLD + "                                                                                                                                                                                          ");
			        System.out.println(RED + BOLD + "                                                                                                                                                                                           ");
			        System.out.println(RED + BOLD + "                                                                                                                                                                                          ");
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ███████╗██████╗░██████╗░░█████╗░██████╗░                                                                                                                           "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗                                                                                                                           "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            █████╗░░██████╔╝██████╔╝██║░░██║██████╔╝                                                                                                                           "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ██╔══╝░░██╔══██╗██╔══██╗██║░░██║██╔══██╗                                                                                                                           "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ███████╗██║░░██║██║░░██║╚█████╔╝██║░░██║                                                                                                                           "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝                                                                                                                           "+ RESET);	        
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …………………▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            " + RESET); 
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ……………▄▄█▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓█▄▄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                       "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …………▄▀▀▓▒░░░░░░░░░░░░░░░░▒▓▓▀▄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                       "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………▄▀▓▒▒░░░░░░░░░░░░░░░░░░░▒▒▓▀▄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                      "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ……..█▓█▒░░░░░░░░░░░░░░░░░░░░░▒▓▒▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                    "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …..▌▓▀▒░░░░░░░░░░░░░░░░░░░░░░░░▒▀▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                 "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …..█▌▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░▒▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                          "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …▐█▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓█▌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                  "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …█▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ..█▐▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒█▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …█▓█▒░░░░░░░░░░░░░░░░░░░░░░░░░░░▒█▌▓█⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ..█▓▓█▒░░░░▒█▄▒▒░░░░░░░░░▒▒▄█▒░░░░▒█▓▓█⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ..█▓█▒░▒▒▒▒░░▀▀█▄▄░░░░░▄▄█▀▀░░▒▒▒▒░▒█▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            .██▌▒▓███▓█████▓▒▐▌░░▐▌▒▓████▓████▓▒▐██⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ..██▒▒▓███▓▓▓████▓▄░░░▄▓████▓▓▓███▓▒▒██⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ..█▓▒▒▓██████████▓▒░░░▒▓██████████▓▒▒▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ..█▓▒░▒▓███████▓▓▄▀░░▀▄▓▓███████▓▒░▒▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ….█▓▒░▒▒▓▓▓▓▄▄▄▀▒░░░░░▒▀▄▄▄▓▓▓▓▒▒░▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ……█▓▒░▒▒▒▒░░░░░░▒▒▒▒░░░░░░▒▒▒▒░▒▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………█▓▓▒▒▒░░██░░▒▓██▓▒░░██░░▒▒▒▓▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………▀██▓▓▓▒░░▀░▒▓████▓▒░▀░░▒▓▓▓██▀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………….░▀█▓▒▒░░░▓█▓▒▒▓█▓▒░░▒▒▓█▀░⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …………█░░██▓▓▒░░▒▒▒░▒▒▒░░▒▓▓██░░█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………….█▄░░▀█▓▒░░░░░░░░░░▒▓█▀░░▄█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …………..█▓█░░█▓▒▒▒░░░░░▒▒▒▓█░░█▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            …………….█▓█░░█▀█▓▓▓▓▓▓█▀░░█░█▓█▌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………………█▓▒▓█░░░░▀▀▀▀░░░░░█▓▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………………█▓▒▒▓█░░░░ ░░░░░░░█▓▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………………..█▓▒▓██▄█░░░▄░░▄██▓▒▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………………..█▓▒▒▓█▒█▀█▄█▀█▒█▓▒▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………………..█▓▓▒▒▓██▒▒██▒██▓▒▒▓█⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………………….█▓▓▒▒▓▀▀███▀▀▒▒▓▓█⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ……………………▀█▓▓▓▓▒▒▒▒▓▓▓▓█▀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            "+ RESET);
			        System.out.println(RED + BOLD + "\t\t\t\t\t            ………………………..▀▀██▓▓▓▓██▀⠀                                                                                                                                                            "+ RESET);

			    }

				private static void handleInvalidChoice(Scanner scanner) {
				    showError(BOLD + "\u001B[33m\t\t\t\t\t\t          Invalid choice or input.\u001B[0m" + RESET);
				    System.out.print(BOLD + "\u001B[33m\t\t\t\t\t\t          Do you want to go back to the main menu? (y/n): \u001B[0m" + RESET);
				    char response = scanner.next().toLowerCase().charAt(0);

				    if (response == 'y') {
				        System.out.println(BOLD + "\u001B[33m\t\t\t\t\t\t          Returning to the main menu...\u001B[0m" + RESET);
				    } else if (response == 'n') {
				        System.out.println(BOLD + "\u001B[33m\t\t\t\t\t\t          Exiting the program. Goodbye!\u001B[0m" + RESET);
				        System.exit(0); // Exit the program
				    } else {
				        System.out.println(BOLD + "\u001B[33m\t\t\t\t\t\t          Invalid input. Exiting the program by default. Goodbye!\u001B[0m" + RESET);
				        System.exit(0); // Exit the program by default for invalid inputs
				    }
				}
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    

				    private static void displayWelcomeMessage() {
				    	System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");

				        System.out.println("\t\t\t\t\t╔══════════════════════════════════════════════════╗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t║                                                  ║⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t║      🔢  WELCOME TO THE ULTIMATE CALCULATOR  🔢  ║⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t║                                                  ║⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t╠══════════════════════════════════════════════════╣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t║                                                  ║⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t║  🌟 Calculate Faster. 🚀 Calculate Smarter. 🌟   ║⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t║                                                  ║⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t╠══════════════════════════════════════════════════╣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t║         💻 Designed for Precision & Speed 💻     ║⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t║                                                  ║⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");
				        System.out.println("\t\t\t\t\t╚══════════════════════════════════════════════════╝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                            ");                                                                                                                                                                                                                          
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        System.out.println(BLACK + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                                                      ");
				        try {
				            Thread.sleep(5000 );
				        } catch (InterruptedException e) {
				            Thread.currentThread().interrupt();
				        }
				    }
			        
				    
				    private static void displayLoadingAnimationFirst() {
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				        System.out.println("\u001B[32m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                                               \u001B[0m");
				        System.out.println(BOLD + "\u001B[32m\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⣬⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠀⠈⢧⡀⠀⠀⠀⠀⠀⢠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠀⠀⠳⣄⠀⠀⠀⠀⠀⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠹⣧⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠏⠀⠀⠀⢠⣿⠀⠀⢀⣰⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠋⠀⠀⠀⠀⣴⠟⠁⠀⢰⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⢸⠁⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⣀⣀⣀⣀⣞⣀⣀⣀⠀⠘⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⡴⠶⠒⠒⠛⠋⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠙⠛⠒⠒⠶⠤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡶⠟⠋⠉⠁⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡀⠀⠀⠈⠉⠙⢲⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣧⣀⠀⢀⣠⣴⠶⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠲⢦⣄⡀⠀⢀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠈⠛⠷⢿⣯⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣬⡿⠾⠋⢹⣤⠶⠛⠉⠈⠉⠒⢄⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠉⠙⠛⠛⠶⠶⢦⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⡤⠤⠴⠖⠒⠚⠛⠉⠉⠀⠀⠀⠀⠀⣀⡤⢄⣀⠀⠀⠈⠄⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⠋⠁⠀⠀⠈⢳⠀⠀⠸⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⣧⠀⠀⡇\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⢀⡇⠀⢸⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⣸⠀⠀⣸⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠀⠀⠀⠀⠀⠀⢠⠇⠀⠀⡇⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠀⠀⠀⠀⠀⠈⢳⣤⣶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣦⡤⠞⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⡼⠀⠀⣸⠃⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡇⠀⠀⠀⠀⠀⠨⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⣻⠀⠀⠀⢀⣠⠞⠀⣠⠏⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡂⠀⠀⠀⠀⠀⠻⣿⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⡿⠇⠀⠀⠀⠀⠀⠀⠀⣿⢇⣄⡴⠛⠁⢀⡴⠋⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣄⠀⠀⠀⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠴⠋⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⢤⣤⡤⠞⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⢀⣠⡴⠶⠛⠉⠉⢹⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠻⠷⠶⣦⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⢀⣤⡶⠟⠉⠁⠀⠀⠀⠀⣀⣠⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⣄⣀⡀⠀⠀⠀⠈⠉⠛⠻⢶⣤⣀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⢀⣶⠟⠁⠀⠀⠀⠀⠀⣠⡴⠟⠋⠀⠀⠈⠛⢷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠈⠉⠛⠿⣦⠀⠀⠀⠀⠀⠀⠈⠙⣷⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⢸⣥⡅⠀⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠙⠻⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡴⠛⠁⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠇⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠻⣦⡀⠀⠀⠀⠀⠀⠈⠙⠷⣤⣄⡀⠀⠀⠀⠀⠀⠀⠉⠙⠓⠒⠒⠶⠶⠦⠤⠤⠖⠒⠒⠒⠋⠉⠀⠀⠀⠀⠀⢀⣠⣤⡴⠎⠀⠀⠀⠀⠀⠀⠀⢀⡴⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠈⠛⠶⣄⡀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠓⠶⠶⠶⠦⠤⣤⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⡤⠴⠶⠶⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⣀⣠⡶⠊⠀⠀⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠉⠛⠓⠦⠤⣄⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⣯⠷⠋⠉⠀⠀⠀⠀⠀\r\n"
				        		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠛⠛⠒⠒⠲⠦⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠤⠶⣖⠶⠿⠟⠏⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\u001B[0m" + RESET);
				    	System.out.println("\u001B[33m\t\t\t\t\t\t                                                         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                        \u001B[0m");
					       

				    }


				    
				    private static void displayMainMenu() {
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m"+ RESET);
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m"+ RESET);
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m"+ RESET);
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m"+ RESET);
				        System.out.println(BLACK + BOLD+"\u001B[35m                                                                                                                                                                                                                                                           \r\n"
								                 + "\t\t\t\t\t\t░█████╗░░█████╗░██╗░░░░░░█████╗░██╗░░░██╗██╗░░░░░░█████╗░████████╗░█████╗░██████╗░                                                                                                                                                                                                                                                           \r\n"
								                 + "\t\t\t\t\t\t██╔══██╗██╔══██╗██║░░░░░██╔══██╗██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗                                                                                                                                                                                                                                                           \r\n"
								                 + "\t\t\t\t\t\t██║░░╚═╝███████║██║░░░░░██║░░╚═╝██║░░░██║██║░░░░░███████║░░░██║░░░██║░░██║██████╔╝                                                                                                                                                                                                                                                           \r\n"
								                 + "\t\t\t\t\t\t██║░░██╗██╔══██║██║░░░░░██║░░██╗██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║░░██║██╔══██╗                                                                                                                                                                                                                                                           \r\n"
								                 + "\t\t\t\t\t\t╚█████╔╝██║░░██║███████╗╚█████╔╝╚██████╔╝███████╗██║░░██║░░░██║░░░╚█████╔╝██║░░██║                                                                                                                                                                                                                                                           \r\n"
								+                 "\t\t\t\t\t\t░╚════╝░╚═╝░░╚═╝╚══════╝░╚════╝░░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m"+ RESET);
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ╔════════════════════════════════════════════════════════════════════╗                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ║                                                                    ║                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ║                    Calculator Console App Menu                     ║                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ║                                                                    ║                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ╟────────────────────────────────────────────────────────────────────╢                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ║  1. Basic Calculator                                               ║                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ║  2. Area and Circumference                                         ║                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ║  3. Area and Perimeter                                             ║                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ║  4. Conversion                                                     ║                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ║  5. About Us                                                       ║                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ║  6. Exit                                                           ║                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + BOLD+"\u001B[32m\t\t                                         ╚════════════════════════════════════════════════════════════════════╝                                                                                                                                                                                                               \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
		                System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                             \u001B[0m" + RESET);		       
				    }
				    
				    
				    
				       
				    
				    
				    

				 
				    private static void basicCalculator(Scanner scanner) {
				        boolean continueCalculating = true;

				        while (continueCalculating) {
				            try {
				                System.out.print(BOLD + "\u001B[32m\t\t\t\t\t\t    - Enter first number: \u001B[0m" + RESET);
				                double num1 = scanner.nextDouble();
				                System.out.print(BOLD + "\u001B[32m\t\t\t\t\t\t    - Enter operator (+, -, *, /): \u001B[0m" + RESET);
				                char operator = scanner.next().charAt(0);
				                System.out.print(BOLD + "\u001B[32m\t\t\t\t\t\t    - Enter second number: \u001B[0m" + RESET);
				                double num2 = scanner.nextDouble();

				                switch (operator) {
				                    case '+':
				                        System.out.println(BOLD + "\u001B[32m\t\t\t\t\t\t     Result: \u001B[0m" + RESET + (num1 + num2));
				                        break;
				                    case '-':
				                        System.out.println(BOLD + "\u001B[32m\t\t\t\t\t\t     Result: \u001B[0m" + RESET + (num1 - num2));
				                        break;
				                    case '*':
				                        System.out.println(BOLD + "\u001B[32m\t\t\t\t\t\t     Result: \u001B[0m" + RESET + (num1 * num2));
				                        break;
				                    case '/':
				                        if (num2 != 0) {
				                            System.out.println(BOLD + "\u001B[32m\t\t\t\t\t\t     Result: \u001B[0m" + RESET + (num1 / num2));
				                        } else {
				                            System.out.println(BOLD + "\u001B[31m\t\t\t\t\t\t     Error: Division by zero.\u001B[0m" + RESET);
				                        }
				                        break;
				                    default:
				                    	
				                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
					                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
				                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
					                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
				                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
					                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
				                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
					                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
				                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
					                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
				                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
					                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
					                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣰⡶⠲⣦⣄⣀⣠⣴⠶⠚⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⡾⠿⠛⠛⠛⠛⠻⠿⢷⣶⣬⣷⡀⣠⡤⢤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡿⠛⠉⠁⠀⠀⠀⠀⢀⣠⠤⠤⠤⣌⡉⠛⢿⣿⣄⠀⠙⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  \r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⢁⣠⣤⣤⣀⠙⠆⠀⠉⠻⣷⣦⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⡟⠁⠈⣿⣷⡀⠀⠀⠀⠈⠻⣷⣦⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣶⣾⣿⣿⡇⠀⠀⠀⠀⠀⢹⣷⡀⠙⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⢿⣷⢀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⡿⠁⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣅⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣿⠃⠀⠀⣰⣿⠟⢿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣤⣤⣤⣄⠀⠀⠀⠀⢹⣿⠈⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢰⣿⠀⠀⢠⣿⣿⣶⣾⣿⡇⠀⠀⣀⣠⣴⣶⣾⠿⠟⠻⢿⣏⠉⠉⠉⠀⢹⣿⣆⠀⠀⠀⠀⣿⣆⣰⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢘⣿⠀⠀⠈⠙⠛⠻⠛⢋⣤⣶⠿⠛⣻⠉⢀⣴⣦⣀⣷⣄⣿⣷⡀⠀⠀⣸⣿⣿⡄⠀⠀⠀⢸⣿⣭⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⣇⠀⠀⠀⢀⣴⠾⠋⣹⣿⣄⣸⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣷⡀⢀⣿⣿⣿⣷⠀⠀⠀⠈⣿⡆⠈⣻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠘⣿⡄⠀⠀⠙⣿⡀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣷⣾⠋⠉⣿⣿⡇⠀⠀⠀⢿⣷⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⣀⣀⣀⣀⣀⠀⢻⣧⠀⠀⠀⠹⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠉⠁⠀⠀⢸⣿⡇⠀⠀⠀⢸⣷⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⣿⡉⠉⠉⠛⠿⣾⣿⡀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⣠⣦⠀⢸⣿⡇⠀⠀⠀⢸⣿⢀⣴⡿⠟⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠸⣷⡀⠀⠀⠀⠈⢿⡇⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠠⠀⠀⠀⠀⠀⢰⡟⠈⣷⣸⣿⠇⠀⠀⠀⢸⣿⣿⠏⠀⠀⢹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠙⣿⣄⠀⠀⠀⠘⣿⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⢸⣧⣄⣀⣀⣠⣼⡇⣀⣸⣿⡟⠀⠀⠀⠀⣿⣿⠃⠀⠀⠀⣼⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠈⠻⣷⣄⠀⢀⣿⠀⠀⠀⠀⣿⠛⢿⣿⡿⠻⣿⡟⠹⣶⡋⣙⣿⣿⣿⣿⠿⠟⠋⠁⠀⠀⠀⠀⠀⣸⣿⠃⠀⠀⠀⢰⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠈⠛⢷⣼⣿⠀⠀⠀⠘⠓⠲⠾⠿⠷⠶⠿⠷⠞⠛⠛⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⡿⠃⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⢀⣾⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣧⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⠀⠀⠀⠀⠀⣀⣤⠶⠶⠿⠷⠶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⢈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⢠⡾⠋⠁⠀⢀⣀⣠⣤⠤⠙⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠀⠀⠀⠀⢠⡟⠁⠀⠘⠛⠉⠉⠀⠀⠀⠀⠈⢿⡄⠀⠀⠀⢀⣠⣴⣶⠄⠀⠀⠀⠀⣸⣿⡤⠶⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣠⣾⢻⣿⠀⠀⠀⠀⢸⠁⠀⢀⣀⣀⣀⣀⣤⣤⡤⠤⠤⠸⣧⠀⠀⣠⣿⠟⠋⠁⠀⠀⠀⠀⠘⠿⠿⠿⢿⣶⣽⣦⣠⣴⠾⣦⠀⢀⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢠⡿⠁⢸⣿⠀⠀⠀⠀⢸⡈⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⢿⣧⣾⣥⣳⣄⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⠇⠀⣼⡏⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠰⠒⠒⠛⠛⠉⠉⣹⠀⣸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠿⠿⣶⣾⣯⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⡀⠀⣿⠇⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠤⠤⠖⠒⠚⠉⢹⣠⣿⡇⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣉⣉⣿⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
					                    		+ "\t\t\t\t\t\t⠀⠀⠀⣠⣴⠾⠇⠀⣿⠀⠀⠀⠀⠀⠀⢸⡇⠀⣠⡤⠤⠴⠒⠒⣃⣀⣀⣴⣿⣿⠋⠁⠀⠀⠀⠀⠀⢸⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣶⡶⠾⠟⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
					                    		+ "\t\t\t\t\t\t⢀⣠⣾⣋⣁⣠⣤⣴⣿⣶⣶⣶⣶⣶⣶⠾⠿⠿⣿⣿⠿⠿⠿⠿⠿⠿⠿⠿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣿⣿⠿⠷⠶⠶⠶⠶⠶⠾⠿⠟⠛⠛⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ▂▃▄▅▆▇█▓▒░!!!INVALID INPUT |||| KAGAT KA NGAYON!!!░▒▓█  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
					                    		                }
				            } catch (Exception e) {
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣰⡶⠲⣦⣄⣀⣠⣴⠶⠚⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⡾⠿⠛⠛⠛⠛⠻⠿⢷⣶⣬⣷⡀⣠⡤⢤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡿⠛⠉⠁⠀⠀⠀⠀⢀⣠⠤⠤⠤⣌⡉⠛⢿⣿⣄⠀⠙⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⢁⣠⣤⣤⣀⠙⠆⠀⠉⠻⣷⣦⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⡟⠁⠈⣿⣷⡀⠀⠀⠀⠈⠻⣷⣦⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣶⣾⣿⣿⡇⠀⠀⠀⠀⠀⢹⣷⡀⠙⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⢿⣷⢀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⡿⠁⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣅⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣿⠃⠀⠀⣰⣿⠟⢿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣤⣤⣤⣄⠀⠀⠀⠀⢹⣿⠈⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢰⣿⠀⠀⢠⣿⣿⣶⣾⣿⡇⠀⠀⣀⣠⣴⣶⣾⠿⠟⠻⢿⣏⠉⠉⠉⠀⢹⣿⣆⠀⠀⠀⠀⣿⣆⣰⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢘⣿⠀⠀⠈⠙⠛⠻⠛⢋⣤⣶⠿⠛⣻⠉⢀⣴⣦⣀⣷⣄⣿⣷⡀⠀⠀⣸⣿⣿⡄⠀⠀⠀⢸⣿⣭⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⣇⠀⠀⠀⢀⣴⠾⠋⣹⣿⣄⣸⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣷⡀⢀⣿⣿⣿⣷⠀⠀⠀⠈⣿⡆⠈⣻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠘⣿⡄⠀⠀⠙⣿⡀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣷⣾⠋⠉⣿⣿⡇⠀⠀⠀⢿⣷⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⣀⣀⣀⣀⣀⠀⢻⣧⠀⠀⠀⠹⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠉⠁⠀⠀⢸⣿⡇⠀⠀⠀⢸⣷⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⣿⡉⠉⠉⠛⠿⣾⣿⡀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⣠⣦⠀⢸⣿⡇⠀⠀⠀⢸⣿⢀⣴⡿⠟⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠸⣷⡀⠀⠀⠀⠈⢿⡇⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠠⠀⠀⠀⠀⠀⢰⡟⠈⣷⣸⣿⠇⠀⠀⠀⢸⣿⣿⠏⠀⠀⢹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠙⣿⣄⠀⠀⠀⠘⣿⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⢸⣧⣄⣀⣀⣠⣼⡇⣀⣸⣿⡟⠀⠀⠀⠀⣿⣿⠃⠀⠀⠀⣼⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠈⠻⣷⣄⠀⢀⣿⠀⠀⠀⠀⣿⠛⢿⣿⡿⠻⣿⡟⠹⣶⡋⣙⣿⣿⣿⣿⠿⠟⠋⠁⠀⠀⠀⠀⠀⣸⣿⠃⠀⠀⠀⢰⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠈⠛⢷⣼⣿⠀⠀⠀⠘⠓⠲⠾⠿⠷⠶⠿⠷⠞⠛⠛⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⡿⠃⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⢀⣾⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣧⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⠀⠀⠀⠀⠀⣀⣤⠶⠶⠿⠷⠶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⢈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⢠⡾⠋⠁⠀⢀⣀⣠⣤⠤⠙⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠀⠀⠀⠀⢠⡟⠁⠀⠘⠛⠉⠉⠀⠀⠀⠀⠈⢿⡄⠀⠀⠀⢀⣠⣴⣶⠄⠀⠀⠀⠀⣸⣿⡤⠶⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣠⣾⢻⣿⠀⠀⠀⠀⢸⠁⠀⢀⣀⣀⣀⣀⣤⣤⡤⠤⠤⠸⣧⠀⠀⣠⣿⠟⠋⠁⠀⠀⠀⠀⠘⠿⠿⠿⢿⣶⣽⣦⣠⣴⠾⣦⠀⢀⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢠⡿⠁⢸⣿⠀⠀⠀⠀⢸⡈⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⢿⣧⣾⣥⣳⣄⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⠇⠀⣼⡏⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠰⠒⠒⠛⠛⠉⠉⣹⠀⣸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠿⠿⣶⣾⣯⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⡀⠀⣿⠇⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠤⠤⠖⠒⠚⠉⢹⣠⣿⡇⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣉⣉⣿⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⣠⣴⠾⠇⠀⣿⠀⠀⠀⠀⠀⠀⢸⡇⠀⣠⡤⠤⠴⠒⠒⣃⣀⣀⣴⣿⣿⠋⠁⠀⠀⠀⠀⠀⢸⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣶⡶⠾⠟⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
			                    		+ "\t\t\t\t\t\t⢀⣠⣾⣋⣁⣠⣤⣴⣿⣶⣶⣶⣶⣶⣶⠾⠿⠿⣿⣿⠿⠿⠿⠿⠿⠿⠿⠿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣿⣿⠿⠷⠶⠶⠶⠶⠶⠾⠿⠟⠛⠛⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    
				            	System.out.println(BLACK + "\u001B[31m\t\t\t\t\t\t▂▃▄▅▆▇█▓▒░Invalid input. Please enter valid numbers.░▒▓█\u001B[0m" + RESET);
				                scanner.next(); // Clear invalid input
				            }
				            System.out.print(BOLD + "\u001B[33m\t\t\t\t\t\t     Do you want to perform another calculation? (y/n): \u001B[0m" + RESET);
				            char retry = scanner.next().toLowerCase().charAt(0);
				            if (retry == 'n') {
				                continueCalculating = false;
				            }
				        }

				        System.out.print(BOLD + "\u001B[33m\t\t\t\t\tReturning to the main menu\u001B[0m" + RESET);
				        for (int i = 0; i < 3; i++) {
				    		System.out.print(BOLD +"\u001B[33m.\u001B[0m"+ RESET);
				    		try {
				    			Thread.sleep(1000);
				    		} catch (InterruptedException e) {
				    	   	  Thread.currentThread().interrupt();
				    		}
				    	}
				    }


				    public static void areaAndCircumference(Scanner scanner) {
				        boolean continueCalculating = true;

				        while (continueCalculating) {
				            try {
				                System.out.print(BOLD +"\u001B[32m\t\t\t\t\t\t     - Enter radius: \u001B[0m"+ RESET);
				                double radius = scanner.nextDouble();

				                if (radius <= 0) {
				                    System.out.println(BOLD +"\u001B[31m\t\t\t\t\t     - Please enter a positive value for the radius.\u001B[0m"+ RESET);
				                    continue;
				                }

				                double area = Math.PI * Math.pow(radius, 2);
				                double circumference = 2 * Math.PI * radius;
				                System.out.println(BOLD +"\u001B[32m\t\t\t\t\t\t      Area: \u001B[0m"+ RESET + area);
				                System.out.println(BOLD +"\u001B[32m\t\t\t\t\t\t      Circumference: \u001B[0m"+ RESET + circumference);

				            } catch (Exception e) {
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣰⡶⠲⣦⣄⣀⣠⣴⠶⠚⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⡾⠿⠛⠛⠛⠛⠻⠿⢷⣶⣬⣷⡀⣠⡤⢤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡿⠛⠉⠁⠀⠀⠀⠀⢀⣠⠤⠤⠤⣌⡉⠛⢿⣿⣄⠀⠙⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⢁⣠⣤⣤⣀⠙⠆⠀⠉⠻⣷⣦⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⡟⠁⠈⣿⣷⡀⠀⠀⠀⠈⠻⣷⣦⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣶⣾⣿⣿⡇⠀⠀⠀⠀⠀⢹⣷⡀⠙⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⢿⣷⢀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⡿⠁⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣅⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣿⠃⠀⠀⣰⣿⠟⢿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣤⣤⣤⣄⠀⠀⠀⠀⢹⣿⠈⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢰⣿⠀⠀⢠⣿⣿⣶⣾⣿⡇⠀⠀⣀⣠⣴⣶⣾⠿⠟⠻⢿⣏⠉⠉⠉⠀⢹⣿⣆⠀⠀⠀⠀⣿⣆⣰⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢘⣿⠀⠀⠈⠙⠛⠻⠛⢋⣤⣶⠿⠛⣻⠉⢀⣴⣦⣀⣷⣄⣿⣷⡀⠀⠀⣸⣿⣿⡄⠀⠀⠀⢸⣿⣭⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⣇⠀⠀⠀⢀⣴⠾⠋⣹⣿⣄⣸⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣷⡀⢀⣿⣿⣿⣷⠀⠀⠀⠈⣿⡆⠈⣻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠘⣿⡄⠀⠀⠙⣿⡀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣷⣾⠋⠉⣿⣿⡇⠀⠀⠀⢿⣷⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⣀⣀⣀⣀⣀⠀⢻⣧⠀⠀⠀⠹⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠉⠁⠀⠀⢸⣿⡇⠀⠀⠀⢸⣷⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⣿⡉⠉⠉⠛⠿⣾⣿⡀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⣠⣦⠀⢸⣿⡇⠀⠀⠀⢸⣿⢀⣴⡿⠟⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠸⣷⡀⠀⠀⠀⠈⢿⡇⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠠⠀⠀⠀⠀⠀⢰⡟⠈⣷⣸⣿⠇⠀⠀⠀⢸⣿⣿⠏⠀⠀⢹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠙⣿⣄⠀⠀⠀⠘⣿⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⢸⣧⣄⣀⣀⣠⣼⡇⣀⣸⣿⡟⠀⠀⠀⠀⣿⣿⠃⠀⠀⠀⣼⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠈⠻⣷⣄⠀⢀⣿⠀⠀⠀⠀⣿⠛⢿⣿⡿⠻⣿⡟⠹⣶⡋⣙⣿⣿⣿⣿⠿⠟⠋⠁⠀⠀⠀⠀⠀⣸⣿⠃⠀⠀⠀⢰⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠈⠛⢷⣼⣿⠀⠀⠀⠘⠓⠲⠾⠿⠷⠶⠿⠷⠞⠛⠛⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⡿⠃⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⢀⣾⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣧⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⠀⠀⠀⠀⠀⣀⣤⠶⠶⠿⠷⠶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⢈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⢠⡾⠋⠁⠀⢀⣀⣠⣤⠤⠙⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠀⠀⠀⠀⢠⡟⠁⠀⠘⠛⠉⠉⠀⠀⠀⠀⠈⢿⡄⠀⠀⠀⢀⣠⣴⣶⠄⠀⠀⠀⠀⣸⣿⡤⠶⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣠⣾⢻⣿⠀⠀⠀⠀⢸⠁⠀⢀⣀⣀⣀⣀⣤⣤⡤⠤⠤⠸⣧⠀⠀⣠⣿⠟⠋⠁⠀⠀⠀⠀⠘⠿⠿⠿⢿⣶⣽⣦⣠⣴⠾⣦⠀⢀⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢠⡿⠁⢸⣿⠀⠀⠀⠀⢸⡈⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⢿⣧⣾⣥⣳⣄⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⠇⠀⣼⡏⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠰⠒⠒⠛⠛⠉⠉⣹⠀⣸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠿⠿⣶⣾⣯⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⡀⠀⣿⠇⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠤⠤⠖⠒⠚⠉⢹⣠⣿⡇⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣉⣉⣿⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⣠⣴⠾⠇⠀⣿⠀⠀⠀⠀⠀⠀⢸⡇⠀⣠⡤⠤⠴⠒⠒⣃⣀⣀⣴⣿⣿⠋⠁⠀⠀⠀⠀⠀⢸⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣶⡶⠾⠟⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
			                    		+ "\t\t\t\t\t\t⢀⣠⣾⣋⣁⣠⣤⣴⣿⣶⣶⣶⣶⣶⣶⠾⠿⠿⣿⣿⠿⠿⠿⠿⠿⠿⠿⠿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣿⣿⠿⠷⠶⠶⠶⠶⠶⠾⠿⠟⠛⠛⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    
				            	System.out.println(BLACK + "\u001B[31m\t\t\t\t\t\t▂▃▄▅▆▇█▓▒░Invalid input. Please enter valid numbers.░▒▓█\u001B[0m" + RESET);
				                scanner.next(); // Clear invalid input
				            }
				            System.out.print(BOLD + "\u001B[33m\t\t\t\t\t\t     Do you want to perform another calculation? (y/n): \u001B[0m" + RESET);
				            char retry = scanner.next().toLowerCase().charAt(0);
				            if (retry == 'n') {
				                continueCalculating = false;
				            }
				        }

				        System.out.print(BOLD + "\u001B[33m\t\t\t\t\tReturning to the main menu\u001B[0m" + RESET);
				        for (int i = 0; i < 3; i++) {
				    		System.out.print(BOLD +"\u001B[33m.\u001B[0m"+ RESET);
				    		try {
				    			Thread.sleep(1000);
				    		} catch (InterruptedException e) {
				    	   	  Thread.currentThread().interrupt();
				    		}
				    	}
				    }

				       
				        
				        

				    public static void areaAndPerimeter(Scanner scanner) {
				        boolean continueCalculating = true;

				        while (continueCalculating) {
				            try {
				                System.out.print(BOLD+"\u001B[32m\t\t\t\t\t\t    - Enter length: \u001B[0m");
				                double length = scanner.nextDouble();
				                
				                System.out.print(BOLD+"\u001B[32m\t\t\t\t\t\t    - Enter width: \u001B[0m");
				                double width = scanner.nextDouble();

				                if (length <= 0 || width <= 0) {
				                    System.out.println(BOLD+"\u001B[31m\t\t\t\t\t\t     Please enter positive values for length and width.\u001B[0m"+RESET);
				                    continue;
				                }

				                double area = length * width;
				                double perimeter = 2 * (length + width);
				                System.out.println(BOLD+"\u001B[32m\t\t\t\t\t\t      Area: \u001B[0m" + area);
				                System.out.println(BOLD+"\u001B[32m\t\t\t\t\t\t      Perimeter: \u001B[0m" + perimeter);

				            } catch (Exception e) {
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
			                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣰⡶⠲⣦⣄⣀⣠⣴⠶⠚⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⡾⠿⠛⠛⠛⠛⠻⠿⢷⣶⣬⣷⡀⣠⡤⢤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡿⠛⠉⠁⠀⠀⠀⠀⢀⣠⠤⠤⠤⣌⡉⠛⢿⣿⣄⠀⠙⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⢁⣠⣤⣤⣀⠙⠆⠀⠉⠻⣷⣦⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⡟⠁⠈⣿⣷⡀⠀⠀⠀⠈⠻⣷⣦⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣶⣾⣿⣿⡇⠀⠀⠀⠀⠀⢹⣷⡀⠙⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⢿⣷⢀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⡿⠁⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣅⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣿⠃⠀⠀⣰⣿⠟⢿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣤⣤⣤⣄⠀⠀⠀⠀⢹⣿⠈⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢰⣿⠀⠀⢠⣿⣿⣶⣾⣿⡇⠀⠀⣀⣠⣴⣶⣾⠿⠟⠻⢿⣏⠉⠉⠉⠀⢹⣿⣆⠀⠀⠀⠀⣿⣆⣰⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢘⣿⠀⠀⠈⠙⠛⠻⠛⢋⣤⣶⠿⠛⣻⠉⢀⣴⣦⣀⣷⣄⣿⣷⡀⠀⠀⣸⣿⣿⡄⠀⠀⠀⢸⣿⣭⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⣇⠀⠀⠀⢀⣴⠾⠋⣹⣿⣄⣸⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣷⡀⢀⣿⣿⣿⣷⠀⠀⠀⠈⣿⡆⠈⣻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠘⣿⡄⠀⠀⠙⣿⡀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣷⣾⠋⠉⣿⣿⡇⠀⠀⠀⢿⣷⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⣀⣀⣀⣀⣀⠀⢻⣧⠀⠀⠀⠹⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠉⠁⠀⠀⢸⣿⡇⠀⠀⠀⢸⣷⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⣿⡉⠉⠉⠛⠿⣾⣿⡀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⣠⣦⠀⢸⣿⡇⠀⠀⠀⢸⣿⢀⣴⡿⠟⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠸⣷⡀⠀⠀⠀⠈⢿⡇⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠠⠀⠀⠀⠀⠀⢰⡟⠈⣷⣸⣿⠇⠀⠀⠀⢸⣿⣿⠏⠀⠀⢹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠙⣿⣄⠀⠀⠀⠘⣿⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⢸⣧⣄⣀⣀⣠⣼⡇⣀⣸⣿⡟⠀⠀⠀⠀⣿⣿⠃⠀⠀⠀⣼⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠈⠻⣷⣄⠀⢀⣿⠀⠀⠀⠀⣿⠛⢿⣿⡿⠻⣿⡟⠹⣶⡋⣙⣿⣿⣿⣿⠿⠟⠋⠁⠀⠀⠀⠀⠀⣸⣿⠃⠀⠀⠀⢰⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠈⠛⢷⣼⣿⠀⠀⠀⠘⠓⠲⠾⠿⠷⠶⠿⠷⠞⠛⠛⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⡿⠃⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⢀⣾⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣧⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⠀⠀⠀⠀⠀⣀⣤⠶⠶⠿⠷⠶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⢈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⢠⡾⠋⠁⠀⢀⣀⣠⣤⠤⠙⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠀⠀⠀⠀⢠⡟⠁⠀⠘⠛⠉⠉⠀⠀⠀⠀⠈⢿⡄⠀⠀⠀⢀⣠⣴⣶⠄⠀⠀⠀⠀⣸⣿⡤⠶⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣠⣾⢻⣿⠀⠀⠀⠀⢸⠁⠀⢀⣀⣀⣀⣀⣤⣤⡤⠤⠤⠸⣧⠀⠀⣠⣿⠟⠋⠁⠀⠀⠀⠀⠘⠿⠿⠿⢿⣶⣽⣦⣠⣴⠾⣦⠀⢀⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢠⡿⠁⢸⣿⠀⠀⠀⠀⢸⡈⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⢿⣧⣾⣥⣳⣄⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⠇⠀⣼⡏⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠰⠒⠒⠛⠛⠉⠉⣹⠀⣸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠿⠿⣶⣾⣯⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⡀⠀⣿⠇⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠤⠤⠖⠒⠚⠉⢹⣠⣿⡇⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣉⣉⣿⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
			                    		+ "\t\t\t\t\t\t⠀⠀⠀⣠⣴⠾⠇⠀⣿⠀⠀⠀⠀⠀⠀⢸⡇⠀⣠⡤⠤⠴⠒⠒⣃⣀⣀⣴⣿⣿⠋⠁⠀⠀⠀⠀⠀⢸⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣶⡶⠾⠟⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
			                    		+ "\t\t\t\t\t\t⢀⣠⣾⣋⣁⣠⣤⣴⣿⣶⣶⣶⣶⣶⣶⠾⠿⠿⣿⣿⠿⠿⠿⠿⠿⠿⠿⠿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣿⣿⠿⠷⠶⠶⠶⠶⠶⠾⠿⠟⠛⠛⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    
				            	System.out.println(BLACK + "\u001B[31m\t\t\t\t\t\t▂▃▄▅▆▇█▓▒░Invalid input. Please enter valid numbers.░▒▓█\u001B[0m" + RESET);
				                scanner.next(); // Clear invalid input
				            }
				            System.out.print(BOLD + "\u001B[33m\t\t\t\t\t\t     Do you want to perform another calculation? (y/n): \u001B[0m" + RESET);
				            char retry = scanner.next().toLowerCase().charAt(0);
				            if (retry == 'n') {
				                continueCalculating = false;
				            }
				        }

				        System.out.print(BOLD + "\u001B[33m\t\t\t\t\tReturning to the main menu\u001B[0m" + RESET);
				        for (int i = 0; i < 3; i++) {
				    		System.out.print(BOLD +"\u001B[33m.\u001B[0m"+ RESET);
				    		try {
				    			Thread.sleep(1000);
				    		} catch (InterruptedException e) {
				    	   	  Thread.currentThread().interrupt();
				    		}
				    	}
				    }

				        



				private static void displayAboutUs(Scanner scanner) {
					boolean back = false;
			        while (!back) {
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m"+ RESET);
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m"+ RESET);
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m"+ RESET);
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");
				        System.out.println(BLACK + "\u001B[32m\t\t                                                                                                                                                                                                                                                           \u001B[0m");                                                                                                                                                                                                                                                           
				        System.out.println(BLACK + BOLD + "\u001B[32m\t\t\t\t\t\t                                                                                                                                                                                                                                                           "
								+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⢦⣄⠀⠀⢀⡼⠋⣼⣃⣶⡞⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           \r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣶⣤⡀⢠⣿⡆⠈⢷⡶⠋⠀⠐⣿⡿⠋⠀⣾⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡇⠸⡝⣿⣿⠏⠀⠀⠘⠁⠀⠀⠀⠁⠀⠀⠀⢛⣿⠏⢹⡀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⣿⣧⠀⠑⠙⠏⠀⠀⠀⠀⠀⠀⠀⠀⡴⠀⠀⠀⠂⠁⠀⣸⣷⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⢸⣧⠙⠻⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠀⠀⠀⠀⠀⠀⠠⠟⢸⡄⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⢿⠻⣧⡀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣇⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣧⠀⠙⠂⠀⠀⠀⠀⠘⢦⠀⠀⠀⠀⠀⠀⠀⣀⣴⠖⠋⠀⠈⠻⠛⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣼⣷⣄⠀⠀⠀⠀⠉⠢⡀⠓⠀⠀⠀⠀⢠⢞⡟⠁⠀⠀⠀⢀⣴⡾⠋⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⣼⠟⠋⢉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣠⡖⠀⠀⣰⣾⣭⣿⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠀⠀⠀⠛⣿⡿⠟⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠉⣀⣤⣾⣿⣿⣟⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀     ⢀⡦⢤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠓⠛⠳⣶⣶⣤⣤⣤⣀⣤⣤⣤⣤⣶⣶⣾⣿⣿⣿⣿⣧⣤⢿⡀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀     ⠸⣷⠀⢻⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣏⡆⣸⡇⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀⠀⠀     ⣠⡇⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣏⠈⢿⠿⣿⣿⣟⣻⣿⣿⠿⠿⢿⡿⠟⠋⢠⠟⣵⡏⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t⠀     ⢠⡾⠉⡇⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⡚⢧⡀⠉⠉⠉⠁⠙⠄⠀⠀⠀⠀⠀⢸⣿⡍⠁⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t     ⠀⣿⠃⠘⡇⠀⢸⡇⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣭⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣶⣤⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t     ⠀⣿⡇⠀⣇⠀⢸⣷⣤⣤⣴⠟⠁⣹⡄⠀⠀⠀⠀⠀⣤⣾⣿⣿⣿⣿⣷⣄⠀⠠⠤⢤⡴⠖⠉⢠⣾⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t     ⠀⣿⡇⠀⣿⣦⡼⠛⠀⡈⠻⣄⣸⣿⠁⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣈⣳⣦⣤⣤⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⡁⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t     ⣶⣿⠇⣠⠟⠉⣠⣤⣾⣿⣖⣿⣟⠃⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t     ⣿⣿⣸⡁⠖⠚⢉⣁⣀⡀⢻⣿⠃⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣷⣶⣿⣿⣿⣿⣿⣿⣿⣿⣯⣽⣿⣿⣿⣿⣿⠿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           \r\n"
								+ "\t\t\t\t\t\t     ⢻⣿⣿⡇⠀⠀⠀⢹⣭⠷⢄⣹⡇⠀⠀⠀⠀⠀⠀⠀⣸⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣯⣤⣌⡛⠓⠲⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           \r\n"
								+ "\t\t\t\t\t\t     ⠀⣿⣿⡇⠀⠀⠘⠉⢿⠞⠉⣿⣇⠀⠀⢀⣀⠤⠖⠋⢁⣀⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠈⠙⠲⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t     ⣠⣿⣿⣿⠀⠀⠀⠀⠸⡷⢀⣿⠿⠟⠙⠁⠀⢤⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣛⣻⣛⣛⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡄⠀⠈⠙⠓⠲⣤⣀                                                                                                                                                                                                                                                           ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "\t\t\t\t\t\t     ⡿⢿⣿⣿⠀⠀⠀⠀⡸⠁⣾⡁⠀⢀⣤⣶⣶⣶⣶⣿⣭⣭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣛⣭⣭⣥⣶⣶⣾⣿⣿⡷⠖⣀⣌⣻⡄⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀⠀\r\n"
								+ "\t\t\t\t\t\t     ⣇⡀⠙⢿⡀⠀⠀⢰⠁⢰⣿⣿⣦⣀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣟⣻⣿⣷⣿⣿⣿⣿⣯⣷⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀\r\n"
								+ "\t\t\t\t\t\t    ⣿⡅⢿⣶⣽⣶⣄⣈⣀⣼⣿⣿⣿⣿⣷⣤⡀⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⣛⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⡆⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀\r\n"
								+ "\t\t\t\t\t\t     ⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⡀⠈⠹⣿⣿⣿⣿⣿⣿⣿⠀⣼⣿⣿⣿⣿⣿⣿⣻⣿⣯⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⡇⠀⠀⠀⠀                                                                                                                                                                                                                                                           ⠀\r\n"
							   	+ "\t\t\t\t\t\t     ⣿⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠹⢿⣿⢹⡿⢿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣧⠀⠀⠀⠀⠀                                                                                                                                                                                                                                                           \u001B[0m");
				    System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                ------------------------------------------------                                                                                                                                                                                                                                                           "+ RESET);
				    System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                ----------------GROUP 2 MEMBERS-----------------                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001b[32m\t\t\t\t\t\t                                ------------------------------------------------                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |      Leader:    ILMEDO, TYRONE KURT E.       |                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |______________________________________________|                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |   Assistant: CATIMBANG, PATRICIA ISABEL E.   |                                                                                                                                                                                                                                                            "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |______________________________________________|                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |     Members:                                 |                                                                                                                                                                                                                                                                "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |             SUMILANG, JOHN JOSHUA            |                                                                                                                                                                                                                                                            "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |             ASUCENAS, EMMANUEL               |                                                                                                                                                                                                                                                             "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |             MACDON, JULIE ANNE               |                                                                                                                                                                                                                                                             "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |             MANABO, YURIE                    |                                                                                                                                                                                                                                                             "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |             GARING, DANIELLE LORENZ          |                                                                                                                                                                                                                                                             "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |             BAUTISTA, MARY GRACE             |                                                                                                                                                                                                                                                             "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |______________________________________________|                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |                                              |                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |             MGA CUTE NG PINAS                |                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |______________________________________________|                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |                                              |                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |      Press 0 to go back to the main menu     |                                                                                                                                                                                                                                                           "+ RESET);
			        System.out.println(BLACK + BOLD +  "\u001B[32m\t\t\t\t\t\t                                |______________________________________________|                                                                                                                                                                                                                                                           " + RESET);
			        int input = scanner.nextInt();
			        if (input == 0) {
			            back = true;  // Exit the About Us section
			        } else {
		            	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		            	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		            	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			            System.out.println(BLACK + BOLD +  "\u001B[31mInvalid input. Please press 0 to go back.\u001B[0m" + RESET);
			        }
			        
			    }
				}

				
				public static void conversion(Scanner scanner) {
			        boolean continueConverting = true;

			        while (continueConverting) {
			            try {
			                System.out.println(BOLD+"\u001B[32m\t\t\t\t\t   - 1. Cm to MM\u001B[0m");
			                System.out.println(BOLD+"\u001B[32m\t\t\t\t\t   - 2. Cm to M\u001B[0m");
			                System.out.print(BOLD+"\u001B[32m\t\t\t\t\t\t   - Choose an option: \u001B[0m"+RESET);
			                int choice = scanner.nextInt();

			                double cm;
			                switch (choice) {
			                    case 1:
			                        System.out.print(BOLD+"\u001B[32m\t\t\t\t\t\tEnter length in Cm: \u001B[0m");
			                        cm = scanner.nextDouble();
			                        System.out.println(BOLD+"\u001B[32m\t\t\t\t\t      Length in MM: \u001B[0m"+RESET + (cm * 10));
			                        break;
			                    case 2:
			                        System.out.print(BOLD+"\u001B[32m\t\t\t\t\t\t      Enter length in Cm: \u001B[0m");
			                        cm = scanner.nextDouble();
			                        System.out.println(BOLD+"\u001B[32m\t\t\t\t\t      Length in M: \u001B[0m"+RESET + (cm / 100));
			                        break;
			                    default:
			                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
			                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
			                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
			                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
			                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
			                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
				                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
				                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣰⡶⠲⣦⣄⣀⣠⣴⠶⠚⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⡾⠿⠛⠛⠛⠛⠻⠿⢷⣶⣬⣷⡀⣠⡤⢤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡿⠛⠉⠁⠀⠀⠀⠀⢀⣠⠤⠤⠤⣌⡉⠛⢿⣿⣄⠀⠙⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  \r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⢁⣠⣤⣤⣀⠙⠆⠀⠉⠻⣷⣦⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⡟⠁⠈⣿⣷⡀⠀⠀⠀⠈⠻⣷⣦⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣶⣾⣿⣿⡇⠀⠀⠀⠀⠀⢹⣷⡀⠙⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⢿⣷⢀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⡿⠁⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣅⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣿⠃⠀⠀⣰⣿⠟⢿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣤⣤⣤⣄⠀⠀⠀⠀⢹⣿⠈⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢰⣿⠀⠀⢠⣿⣿⣶⣾⣿⡇⠀⠀⣀⣠⣴⣶⣾⠿⠟⠻⢿⣏⠉⠉⠉⠀⢹⣿⣆⠀⠀⠀⠀⣿⣆⣰⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢘⣿⠀⠀⠈⠙⠛⠻⠛⢋⣤⣶⠿⠛⣻⠉⢀⣴⣦⣀⣷⣄⣿⣷⡀⠀⠀⣸⣿⣿⡄⠀⠀⠀⢸⣿⣭⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⣇⠀⠀⠀⢀⣴⠾⠋⣹⣿⣄⣸⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣷⡀⢀⣿⣿⣿⣷⠀⠀⠀⠈⣿⡆⠈⣻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠘⣿⡄⠀⠀⠙⣿⡀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣷⣾⠋⠉⣿⣿⡇⠀⠀⠀⢿⣷⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⣀⣀⣀⣀⣀⠀⢻⣧⠀⠀⠀⠹⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠉⠁⠀⠀⢸⣿⡇⠀⠀⠀⢸⣷⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⣿⡉⠉⠉⠛⠿⣾⣿⡀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⣠⣦⠀⢸⣿⡇⠀⠀⠀⢸⣿⢀⣴⡿⠟⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠸⣷⡀⠀⠀⠀⠈⢿⡇⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠠⠀⠀⠀⠀⠀⢰⡟⠈⣷⣸⣿⠇⠀⠀⠀⢸⣿⣿⠏⠀⠀⢹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠙⣿⣄⠀⠀⠀⠘⣿⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⢸⣧⣄⣀⣀⣠⣼⡇⣀⣸⣿⡟⠀⠀⠀⠀⣿⣿⠃⠀⠀⠀⣼⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠈⠻⣷⣄⠀⢀⣿⠀⠀⠀⠀⣿⠛⢿⣿⡿⠻⣿⡟⠹⣶⡋⣙⣿⣿⣿⣿⠿⠟⠋⠁⠀⠀⠀⠀⠀⣸⣿⠃⠀⠀⠀⢰⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠈⠛⢷⣼⣿⠀⠀⠀⠘⠓⠲⠾⠿⠷⠶⠿⠷⠞⠛⠛⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⡿⠃⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⢀⣾⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣧⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⠀⠀⠀⠀⠀⣀⣤⠶⠶⠿⠷⠶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⢈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⢠⡾⠋⠁⠀⢀⣀⣠⣤⠤⠙⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠀⠀⠀⠀⢠⡟⠁⠀⠘⠛⠉⠉⠀⠀⠀⠀⠈⢿⡄⠀⠀⠀⢀⣠⣴⣶⠄⠀⠀⠀⠀⣸⣿⡤⠶⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣠⣾⢻⣿⠀⠀⠀⠀⢸⠁⠀⢀⣀⣀⣀⣀⣤⣤⡤⠤⠤⠸⣧⠀⠀⣠⣿⠟⠋⠁⠀⠀⠀⠀⠘⠿⠿⠿⢿⣶⣽⣦⣠⣴⠾⣦⠀⢀⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢠⡿⠁⢸⣿⠀⠀⠀⠀⢸⡈⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⢿⣧⣾⣥⣳⣄⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⠇⠀⣼⡏⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠰⠒⠒⠛⠛⠉⠉⣹⠀⣸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠿⠿⣶⣾⣯⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⡀⠀⣿⠇⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠤⠤⠖⠒⠚⠉⢹⣠⣿⡇⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣉⣉⣿⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
				                    		+ "\t\t\t\t\t\t⠀⠀⠀⣠⣴⠾⠇⠀⣿⠀⠀⠀⠀⠀⠀⢸⡇⠀⣠⡤⠤⠴⠒⠒⣃⣀⣀⣴⣿⣿⠋⠁⠀⠀⠀⠀⠀⢸⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣶⡶⠾⠟⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
				                    		+ "\t\t\t\t\t\t⢀⣠⣾⣋⣁⣠⣤⣴⣿⣶⣶⣶⣶⣶⣶⠾⠿⠿⣿⣿⠿⠿⠿⠿⠿⠿⠿⠿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣿⣿⠿⠷⠶⠶⠶⠶⠶⠾⠿⠟⠛⠛⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
			                    
			                    	System.out.println("\u001B[33m\t\t▂▃▄▅▆▇█▓▒░Invalid option. Please select 1 or 2.░▒▓█\u001B[0m");
			                        continue;
			                }

			            } catch (Exception e) {
	                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
	                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
	                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
	                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
	                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
	                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
	                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
	                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
	                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
	                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
	                    	System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
	                        System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                                                     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                             \u001B[0m" + RESET);
		                    System.out.println(BLACK + BOLD +"\u001B[31m\t\t                 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣰⡶⠲⣦⣄⣀⣠⣴⠶⠚⠻⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⡾⠿⠛⠛⠛⠛⠻⠿⢷⣶⣬⣷⡀⣠⡤⢤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡿⠛⠉⠁⠀⠀⠀⠀⢀⣠⠤⠤⠤⣌⡉⠛⢿⣿⣄⠀⠙⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  \r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⢁⣠⣤⣤⣀⠙⠆⠀⠉⠻⣷⣦⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⡟⠁⠈⣿⣷⡀⠀⠀⠀⠈⠻⣷⣦⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⣴⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣶⣾⣿⣿⡇⠀⠀⠀⠀⠀⢹⣷⡀⠙⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⢿⣷⢀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⡿⠁⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣅⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣿⠃⠀⠀⣰⣿⠟⢿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣤⣤⣤⣄⠀⠀⠀⠀⢹⣿⠈⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                              ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢰⣿⠀⠀⢠⣿⣿⣶⣾⣿⡇⠀⠀⣀⣠⣴⣶⣾⠿⠟⠻⢿⣏⠉⠉⠉⠀⢹⣿⣆⠀⠀⠀⠀⣿⣆⣰⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⢘⣿⠀⠀⠈⠙⠛⠻⠛⢋⣤⣶⠿⠛⣻⠉⢀⣴⣦⣀⣷⣄⣿⣷⡀⠀⠀⣸⣿⣿⡄⠀⠀⠀⢸⣿⣭⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⣇⠀⠀⠀⢀⣴⠾⠋⣹⣿⣄⣸⣿⣧⣼⣿⣿⣿⣿⣿⣿⣿⣷⡀⢀⣿⣿⣿⣷⠀⠀⠀⠈⣿⡆⠈⣻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠘⣿⡄⠀⠀⠙⣿⡀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⣷⣾⠋⠉⣿⣿⡇⠀⠀⠀⢿⣷⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⣀⣀⣀⣀⣀⠀⢻⣧⠀⠀⠀⠹⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠉⠁⠀⠀⢸⣿⡇⠀⠀⠀⢸⣷⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⣿⡉⠉⠉⠛⠿⣾⣿⡀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⣠⣦⠀⢸⣿⡇⠀⠀⠀⢸⣿⢀⣴⡿⠟⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠸⣷⡀⠀⠀⠀⠈⢿⡇⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠠⠀⠀⠀⠀⠀⢰⡟⠈⣷⣸⣿⠇⠀⠀⠀⢸⣿⣿⠏⠀⠀⢹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠙⣿⣄⠀⠀⠀⠘⣿⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⢸⣧⣄⣀⣀⣠⣼⡇⣀⣸⣿⡟⠀⠀⠀⠀⣿⣿⠃⠀⠀⠀⣼⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠈⠻⣷⣄⠀⢀⣿⠀⠀⠀⠀⣿⠛⢿⣿⡿⠻⣿⡟⠹⣶⡋⣙⣿⣿⣿⣿⠿⠟⠋⠁⠀⠀⠀⠀⠀⣸⣿⠃⠀⠀⠀⢰⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠈⠛⢷⣼⣿⠀⠀⠀⠘⠓⠲⠾⠿⠷⠶⠿⠷⠞⠛⠛⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⡿⠃⠀⠀⠀⣰⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⢀⣾⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣧⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⠀⠀⠀⠀⠀⣀⣤⠶⠶⠿⠷⠶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⢈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⢠⡾⠋⠁⠀⢀⣀⣠⣤⠤⠙⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠀⠀⠀⠀⢠⡟⠁⠀⠘⠛⠉⠉⠀⠀⠀⠀⠈⢿⡄⠀⠀⠀⢀⣠⣴⣶⠄⠀⠀⠀⠀⣸⣿⡤⠶⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⠀⣠⣾⢻⣿⠀⠀⠀⠀⢸⠁⠀⢀⣀⣀⣀⣀⣤⣤⡤⠤⠤⠸⣧⠀⠀⣠⣿⠟⠋⠁⠀⠀⠀⠀⠘⠿⠿⠿⢿⣶⣽⣦⣠⣴⠾⣦⠀⢀⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢠⡿⠁⢸⣿⠀⠀⠀⠀⢸⡈⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⢿⣧⣾⣥⣳⣄⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀\r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⣸⠇⠀⣼⡏⠀⠀⠀⠀⠸⡇⠀⠀⠀⠀⠀⠰⠒⠒⠛⠛⠉⠉⣹⠀⣸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠿⠿⣶⣾⣯⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⠀⠀⢿⡀⠀⣿⠇⠀⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠤⠤⠖⠒⠚⠉⢹⣠⣿⡇⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣉⣉⣿⣿⣿⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
		                    		+ "\t\t\t\t\t\t⠀⠀⠀⣠⣴⠾⠇⠀⣿⠀⠀⠀⠀⠀⠀⢸⡇⠀⣠⡤⠤⠴⠒⠒⣃⣀⣀⣴⣿⣿⠋⠁⠀⠀⠀⠀⠀⢸⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣶⡶⠾⠟⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                \r\n"
		                    		+ "\t\t\t\t\t\t⢀⣠⣾⣋⣁⣠⣤⣴⣿⣶⣶⣶⣶⣶⣶⠾⠿⠿⣿⣿⠿⠿⠿⠿⠿⠿⠿⠿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣿⣿⠿⠷⠶⠶⠶⠶⠶⠾⠿⠟⠛⠛⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                                                                                                                                                              \u001B[0m" + RESET);
		                    
			            	System.out.println(BLACK + "\u001B[31m\t\t\t\t\t\t▂▃▄▅▆▇█▓▒░Invalid input. Please enter valid numbers.░▒▓█\u001B[0m" + RESET);
			                scanner.next(); // Clear invalid input
			            }
			            System.out.print(BOLD + "\u001B[33m\t\t\t\t\t\tDo you want to perform another calculation? (y/n): \u001B[0m" + RESET);
			            char retry = scanner.next().toLowerCase().charAt(0);
			            if (retry == 'n') {
			                continueConverting = false;
			            }
			        }

			        System.out.print(BOLD + "\u001B[33m\t\t\t\t\tReturning to the main menu\u001B[0m" + RESET);
			        for (int i = 0; i < 3; i++) {
			    		System.out.print(BOLD +"\u001B[33m.\u001B[0m"+ RESET);
			    		try {
			    			Thread.sleep(1000);
			    		} catch (InterruptedException e) {
			    	   	  Thread.currentThread().interrupt();
			    		}
			    	}
			    }
				
				private static void closeCMD() {
				    System.out.println("\u001B[33m\n\u001B[0m");
				    for (int i = 0; i < 1000; i++) {
				        System.out.println();
				    }
				    System.out.flush();
				}
		}


