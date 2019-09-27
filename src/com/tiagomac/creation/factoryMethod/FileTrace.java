package com.tiagomac.creation.factoryMethod;

public class FileTrace implements Trace {
    
    private java.io.PrintWriter pw;
    private boolean debug;
    public FileTrace() throws java.io.IOException {
          // a real FileTrace would need to obtain the filename somewhere
          // for the example I'll hardcode it
          pw = new java.io.PrintWriter( new java.io.FileWriter( "c:\trace.log" ) );
    }
    public void setDebug( boolean debug ) {
          this.debug = debug;
    }
    public void debug( String message ) {
          if( debug ) {  // only print if debug is true
                pw.println( "DEBUG: " + message );
                pw.flush();
          }
    }
    public void error( String message ) {
          // always print out errors
          pw.println( "ERROR: " + message );
          pw.flush();
    }
}
