package org.wso2.carbon.sample.bundle3;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Add doc
 */
public class Activator implements BundleActivator {
    private static final Logger logger = LoggerFactory.getLogger("Activator.class");

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        logger.info("==== Activated the sample bundle 3 =========");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        logger.info("==== Deativated the sample bundle 3 =========");

    }
}
