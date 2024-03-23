/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package Nikisurance.ui;

import Nikisurance.util.DataGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + //
                "███╗   ██╗██╗██╗  ██╗██╗███████╗██╗   ██╗██████╗  █████╗ ███╗   ██╗ ██████╗███████╗\n" + //
                "████╗  ██║██║██║ ██╔╝██║██╔════╝██║   ██║██╔══██╗██╔══██╗████╗  ██║██╔════╝██╔════╝\n" + //
                "██╔██╗ ██║██║█████╔╝ ██║███████╗██║   ██║██████╔╝███████║██╔██╗ ██║██║     █████╗  \n" + //
                "██║╚██╗██║██║██╔═██╗ ██║╚════██║██║   ██║██╔══██╗██╔══██║██║╚██╗██║██║     ██╔══╝  \n" + //
                "██║ ╚████║██║██║  ██╗██║███████║╚██████╔╝██║  ██║██║  ██║██║ ╚████║╚██████╗███████╗\n" + //
                "╚═╝  ╚═══╝╚═╝╚═╝  ╚═╝╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝╚══════╝\n" + //
                "                                                                                   \n" + //
                "");

        System.out.println("Welcome to NikiSurance Insurance Claims Management System");
        System.out.println("--------------------------------------------------------");
        DataGenerator dataGenerator = new DataGenerator();
        dataGenerator.generateAndSaveData();
    }
}
