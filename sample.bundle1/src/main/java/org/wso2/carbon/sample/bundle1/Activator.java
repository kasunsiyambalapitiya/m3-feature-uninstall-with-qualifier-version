package org.wso2.carbon.sample.bundle1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kasun on 6/27/17.
 */
public class Activator implements BundleActivator {
    private static final Logger logger = LoggerFactory.getLogger("Activator.class");

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        logger.info("===== Activated the sample bundle 1 added from new samplefeature ==");

    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        logger.info("==== Deactivated sample bundle 1 added from new samplefeature ==");
    }
}
