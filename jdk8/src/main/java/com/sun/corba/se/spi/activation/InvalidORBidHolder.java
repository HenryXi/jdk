package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/InvalidORBidHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u71/5731/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, December 22, 2015 6:17:58 PM PST
*/

public final class InvalidORBidHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidORBid value = null;

  public InvalidORBidHolder ()
  {
  }

  public InvalidORBidHolder (InvalidORBid initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidORBidHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidORBidHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidORBidHelper.type ();
  }

}
