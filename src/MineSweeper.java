/**
 * This is the class that will play the mine sweeper game
 *
 * @author <student>
 * @version 0
 *
 */

// @todo - write this class as needed
public class MineSweeper {

    //
    /**
     * Creates the appropriate MineField based upon the arguments given from
     * h=the main method.
     * 
     * @param args
     *            the arguments that are to be read from the main method
     * @return the appropriate MineField or error based upon the arguments
     */
    public static MineField createMineField(String[] args) {
        MineField minefield = new MineField();

        if (args == null) {
            System.out.println("Error no arguments");
            minefield = new MineField();  
            
        }
        try {
        if (args[0].contentEquals("-m")) {
            int row = Integer.parseInt(args[1]);
            int col = Integer.parseInt(args[2]);
            int mines = Integer.parseInt(args[3]);
            minefield = new MineField(row, col, mines);
        }
        
        else if (args[0].contentEquals("-l")) {
            MineFieldFileIO.readMineFile(args[1]);
            minefield = MineFieldFileIO.readMineSweeperGame(args[1]);
        }
        else if (args[0].contentEquals("-d")) {
            minefield = new MineField();
        }
        else if (args[0].contentEquals("-g")) {
            MineFieldFileIO.readMineSweeperGame(args[1]);
            minefield = MineFieldFileIO.readMineSweeperGame(args[1]);
        }
        else if (args[0].contentEquals("-h")) {
            printUsage();
            return null;
        }
        
        else {
            minefield = new MineField();
        }
        }
       
        catch (Exception e) {
            System.out.println("Exception caught invalid arguments");
            minefield = new MineField(); 
        }
        
        minefield.toString(); 
        return minefield;
    }

    /**
     * Prints out a help menu to help the player interact.
     */
    public static void printUsage() {
        System.out.println("Here is a help menu...");
        System.out.println("To run the program type javac MineSweeper the type java MineSweeper");
        System.out.println("-h creates a help message and quits");
        System.out.println("-m creates a MineField instance"
                + " with rows, cols, and mines.");
        System.out.println("-l load a saved minefield "
                + "from file and create a MineField instance");
        System.out.println("-d create a simple default game "
                + "using default constructor");
        System.out.println("-g loads an in progress game");
    }
    
    /**
     * Check win method to check win
     * 
     * @param mf a instance of minefield 
     * @return return true or false
     */
    public static boolean checkWin(MineField mf) {
        boolean win = true; 
        return win; 
        
    }

    /**
     * The game play will be handled in the main method
     * 
     * @param args
     *            - command line arguments
     */
    public static void main(String[] args) {
        printUsage();
        createMineField(args);
         
          

        // @todo - fix this
    }
}
