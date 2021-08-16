package FileOnePractices;

import java.io.*;

import java.net.*;

    class ProgrammingToHpPrinter {
        public static void main (String argv[]) throws Exception
        {

            

            Socket printer=new Socket("172.16.0.88",9100);

            DataOutputStream outToServer = new DataOutputStream(printer.getOutputStream() );
            outToServer.writeBytes("You can make it in life");



            printer.close();
        }

}
