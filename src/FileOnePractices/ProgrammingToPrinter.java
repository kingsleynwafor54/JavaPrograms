package FileOnePractices;

import java.io.*;

import java.net.*;

    class ProgrammingToHpPrinter {
        public static void main (String argv[]) throws Exception
        {

            //the default port number for desktop and mobile is 9100

            Socket printer=new Socket("172.16.0.88",9100);

            DataOutputStream outToServer = new DataOutputStream(printer.getOutputStream() );
            //The data being sent in the lines below illustrate CPCL  one can change the data for the corresponding
            //language being used (ZPL, EPL)

            outToServer.writeBytes("You can make it in life");



            printer.close();
        }

}
