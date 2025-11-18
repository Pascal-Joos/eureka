package com.netflix.eureka.registry.rule;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.eureka.lease.Lease;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This rule matches always and returns the current status of the instance.
 *
 * <p>Created by Nikos Michalakis on 7/13/16.
 */
public class AlwaysMatchInstanceStatusRule implements InstanceStatusOverrideRule {
  private static final Logger logger = LoggerFactory.getLogger(AlwaysMatchInstanceStatusRule.class);

  @Override
  public StatusOverrideResult apply(
      InstanceInfo instanceInfo,
      @Nullable Lease<InstanceInfo> existingLease,
      boolean isReplication) {
    logger.debug(
        "Returning the default instance status {} for instance {}",
        instanceInfo.getStatus(),
        instanceInfo.getId());
    return StatusOverrideResult.matchingStatus(instanceInfo.getStatus());
  }

  @Override
  public String toString() {
    return AlwaysMatchInstanceStatusRule.class.getName();
  }
}
