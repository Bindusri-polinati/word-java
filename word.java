import java.util.Scanner;

class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a word to print its pattern: ");
        String input = scanner.nextLine().toUpperCase(); 

       
        printWordPattern(input);

        scanner.close();
    }

    
    public static void printWordPattern(String word) {
        for (int r = 0; r < 7; r++) { 
            for (int i = 0; i < word.length(); i++) { 
                char letter = word.charAt(i);
                printLetterRow(letter, r); 
                System.out.print("   "); 
            }
            System.out.println(); 
        }
    }

    public static void printLetterRow(char letter, int row) {
        switch (letter) {
            case 'A':
                printARow(row);
                break;
            case 'B':
                printBRow(row);
                break;
			case 'C':
                printCRow(row);
                break;
			case 'D':
                printDRow(row);
                break;
			case 'E':
                printERow(row);
                break;
			case 'F':
                printFRow(row);
                break;
			case 'G':
                printGRow(row);
                break;
			case 'H':
                printHRow(row);
                break;
			
                
			case 'I':
                printIRow(row);
                break;
			case 'J':
                printJRow(row);
                break;
			case 'K':
                printKRow(row);
                break;
			case 'L':
                printLRow(row);
                break;
			case 'M':
                printMRow(row);
                break;
			case 'N':
                printNRow(row);
                break;
			case 'O':
                printORow(row);
                break;
			case 'P':
                printPRow(row);
                break;
			case 'Q':
                printQRow(row);
                break;
			case 'R':
                printRRow(row);
                break;
			case 'S':
                printSRow(row);
                break;
			case 'T':
                printTRow(row);
                break;
			case 'U':
                printURow(row);
                break;
			case 'V':
                printVRow(row);
                break;
			case 'W':
                printWRow(row);
                break;
			case 'X':
                printXRow(row);
                break;
			case 'Y':
                printYRow(row);
                break;
			case 'Z':
                printZRow(row);
                break;
            
            default:
                printBlankRow(); 
        }
    }

    
    public static void printARow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0 && (c == 1 || c == 2 || c == 3)) || 
                (r == 1 || r == 2) && (c == 0 || c == 4) || 
                (r == 3 && (c==0 ||c == 1 || c == 2 || c == 3 ||c==4 ||c==5)) || 
                (r > 3 && (c == 0 || c == 4)))              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printBRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r==3 ||r==6) && (c==0|| c == 1 || c == 2 || c == 3 ) ||
                (r == 1 || r==2||r==4|| r == 5) && (c == 0 || c == 4))         
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	
	public static void printCRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r==6) && ( c == 1 || c == 2 || c == 3) || 
                (r == 1|| r == 5) && (c==0 || c == 4) ||(r==2||r==3||r==4)&&(c==0) )
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	
	public static void printDRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r == 6) && (c==0||c==1||c==2||c==3 ) || 
                (r == 1|| r == 2|| r == 3|| r == 4 || r == 5) && (c == 0 ||c==4)) 
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	
	public static void printERow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r==6) && (c==0||c == 1 || c == 2 || c == 3 || c==4) || (r==3)&&(c==0||c==1||c==2||c==3)||
                ( r==1||r == 2|| r==4|| r == 5) && (c == 0)) 
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printFRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0) && (c==0|| c == 1 || c == 2 || c == 3 || c == 4 ) || (r==3)&&(c==0||c==1||c==2 ||c==3) ||
                (r == 1|| r == 2|| r == 4 || r == 5||r==6) && (c == 0))
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printGRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r==6) && (c == 1 || c == 2 || c == 3 ) || 
                (r == 1||r == 5) && (c == 0 || c==4) || (r==2)&&(c==0) ||
				(r == 3) && (c==0 || c==2|| c==3|| c==4)||(r==4)&&(c==0||c==2||c==4))     
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	
	public static void printHRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r==1||r == 2||r==4|| r == 5 || r==6) && ( c == 0 || c == 4) || (r == 3) && ( c==0||c == 1 || c == 2 || c == 3 ||c==4))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printIRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r==6) && (c==0||c == 1 || c == 2 || c == 3 || c == 4) || (r == 1|| r == 2|| r == 3|| r == 4 || r == 5) && (c == 2) )
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printJRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0) && (c == 1 || c == 2 || c == 3 || c == 4) || 
                (r == 1|| r == 2||r==3) && (c == 3)||
				(r == 4||r==5 )&&(c==0 || c==3)||
				(r == 6) && (c==1||c==2||c==3)) 
				 
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printKRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0 ||r==6)&& (c == 0  || c == 4) ||
                (r == 1|| r == 5) && (c == 0||c==3)||
				( r == 2|| r == 4)&&(c==0 || c==2)||
				(r==3)&&(c==0||c==1))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printLRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r !=6)&& (c == 0) || 
				( r == 6))   
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printMRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 2 && ( c == 2 ||  c == 4 || c == 0)) || 
                (r == 1) && (c != 2)||
				( r == 4|| r == 5|| r == 6||r==3||r==0)&&(c==0 || c==4))
				 
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printNRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0) && (c==0||c==4) ||
                (r == 1)&& (c == 0||c == 1||c == 4)||(r==2)&&(c==0||c==2||c==4)||(r==3)&&(c==0||c==3||c==4)||(r==4||r==5||r==6)&&(c==0||c==4))             
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printORow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r==6) && (c == 1 || c == 2 || c == 3) || 
                (r == 1|| r == 2|| r == 3|| r == 4 || r == 5) && (c == 0 ||c==4)) 
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printPRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r==3) &&  (c!=4) || 
				( r == 1|| r == 2) &&(c==0 || c==4)||
				(r==4||r==5||r==6) &&(c==0))
				 
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printQRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0 ||r==6)  && (c == 1 || c == 2 || c == 3) || 
                (r == 1|| r == 2|| r == 3) && (c == 0 ||c==4)||
				(r==4)&&(c==0||c==2 ||c==4)||
				(r==5)&&(c == 0 || c == 3 || c == 4  ))
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printRRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0||r==3) &&  (c==0|| c == 1 || c == 2 || c == 3 ) || 
				( r == 1|| r == 2||r==6) &&(c==0 || c==4)||
				(r==4)&&(c==0||c==2)||
				(r==5)&&(c==0||c==3))              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printTRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0 && (c == 1 || c == 2 || c == 3 || c == 4 || c == 0)) || 
                (r == 1|| r == 2|| r == 3|| r == 4 || r == 5||r==6) && (c == 2) )
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printURow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r==6) && (c == 1 || c == 2 || c == 3 ) || 
                (r == 0||r == 1|| r == 2|| r == 3|| r == 4 || r == 5) && (c == 0 || c==4) )
                              
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    public static void printSRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0 || r == 3 || r == 6) && (c == 1 || c == 2 || c == 3) || 
                (r == 1 || r == 5) && (c == 0 || c == 4) ||                   
                (r == 2 && c == 0) ||                                        
                (r == 4 && c == 4))                                          
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printVRow(int r) {
        for (int c = 0; c < 5; c++) {
            if (
                (r == 0||r == 1|| r == 2||r==3||r==4) && (c == 0||c==4)||
				(  r == 5)&&( c==1||c==3)||
				(r==6 && (c==2)))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printWRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0 ||r==1 || r==2||r==6)&& (c == 0 || c == 4) || 
				( r == 3|| r == 4)&&(c==0 || c==2 ||c==4) ||
				(r == 5)&&(c==0||c==1||c==3||c==4))                       
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printXRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0 ||r==1||r==5||r==6) && (c == 0 || c == 4 ) || 
                (r == 2|| r == 4) && (c == 1|| c==3)||
				( r == 3)&&(c==2))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printYRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r == 0 && ( c == 4 || c == 0)) || 
                (r == 1) && (c == 1|| c==3)||
				( r == 3|| r == 4 || r == 5|| r == 2||r==6)&&( c==2))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
	public static void printZRow(int r) {
        for (int c = 0; c < 5; c++) {
            if ((r==0||r==6)||(r == 1) && (c == 4) ||(r==2)&& (c == 3) || (r==3)&&(c == 2)|| (r==4)&&(c == 1)||(r==5)&&(c==0))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    
    public static void printBlankRow() {
        System.out.print("     "); 
    }
}
