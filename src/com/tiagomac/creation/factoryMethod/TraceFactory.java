package com.tiagomac.creation.factoryMethod;

public class TraceFactory {
    public static Trace getTrace() {
          try {
                return new FileTrace();
          } catch ( java.io.IOException ex ) {
                Trace t = new SystemTrace();
                t.error( "could not instantiate FileTrace: " + ex.getMessage() );
                return t;
          }
    }
}