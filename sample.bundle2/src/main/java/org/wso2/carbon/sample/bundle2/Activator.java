package org.wso2.carbon.sample.bundle2;

/**
 * Created by kasun on 6/27/17.
 */

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Add later
 */
public class Activator implements BundleActivator {
    private static final Logger logger = LoggerFactory.getLogger("Activator.class");

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        logger.info("============== Activated the sample bundle 2 from pax feature  =====");

    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        logger.info("============= Deactivated the sample bundle 2 from pax feature =====");
    }
}
