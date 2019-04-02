package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u71/5731/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, December 22, 2015 6:17:58 PM PST
*/


/** Server callback API, passed to Activator in active method.
    */
public final class ServerHolder implements org.omg.CORBA.portable.Streamable
{
  public Server value = null;

  public ServerHolder ()
  {
  }

  public ServerHolder (Server initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerHelper.type ();
  }

}
