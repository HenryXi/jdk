package org.omg.CORBA;

/**
* org/omg/CORBA/PolicyErrorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u71/5731/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Tuesday, December 22, 2015 6:17:58 PM PST
*/


/**
   * Thrown to indicate problems with parameter values passed to the
   * <code>ORB.create_policy</code> operation.  
   */
public final class PolicyErrorHolder implements org.omg.CORBA.portable.Streamable
{
  public PolicyError value = null;

  public PolicyErrorHolder ()
  {
  }

  public PolicyErrorHolder (PolicyError initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PolicyErrorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PolicyErrorHelper.write (o, value);
  }

  public TypeCode _type ()
  {
    return PolicyErrorHelper.type ();
  }

}
