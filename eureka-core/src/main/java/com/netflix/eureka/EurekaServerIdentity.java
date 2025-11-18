package com.netflix.eureka;

import com.netflix.appinfo.AbstractEurekaIdentity;
import javax.annotation.Nullable;

/** This class holds metadata information related to eureka server auth with peer eureka servers */
public class EurekaServerIdentity extends AbstractEurekaIdentity {
  public static final String DEFAULT_SERVER_NAME = "DefaultServer";

  private final String serverVersion = "1.0";
  @Nullable private final String id;

  public EurekaServerIdentity(@Nullable String id) {
    this.id = id;
  }

  @Override
  public String getName() {
    return DEFAULT_SERVER_NAME;
  }

  @Override
  public String getVersion() {
    return serverVersion;
  }

  @Nullable
  @Override
  public String getId() {
    return id;
  }
}
