package org.whispersystems.curve25519;

public class J2meCurve25519Provider extends BaseJavaCurve25519Provider {

  protected J2meCurve25519Provider() {
    super(new BouncyCastleSha512Provider(), new NullSecureRandomProvider());
  }

//  @Override
  public boolean isNative() {
    return false;
  }
}
