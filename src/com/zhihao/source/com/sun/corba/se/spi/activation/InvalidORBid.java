package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/InvalidORBid.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u251/737/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, March 12, 2020 6:33:10 AM UTC
*/

public final class InvalidORBid extends org.omg.CORBA.UserException
{

  public InvalidORBid ()
  {
    super(InvalidORBidHelper.id());
  } // ctor


  public InvalidORBid (String $reason)
  {
    super(InvalidORBidHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidORBid