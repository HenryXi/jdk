package com.sun.corba.se.spi.activation.InitialNameServicePackage;

/**
* com/sun/corba/se/spi/activation/InitialNameServicePackage/NameAlreadyBoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u71/5731/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, December 22, 2015 6:17:58 PM PST
*/

public final class NameAlreadyBoundHolder implements org.omg.CORBA.portable.Streamable
{
  public NameAlreadyBound value = null;

  public NameAlreadyBoundHolder ()
  {
  }

  public NameAlreadyBoundHolder (NameAlreadyBound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NameAlreadyBoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NameAlreadyBoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NameAlreadyBoundHelper.type ();
  }

}