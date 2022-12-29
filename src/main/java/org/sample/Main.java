package org.sample;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;

public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        config.getUserCodeDeploymentConfig().setEnabled(true);
        Hazelcast.newHazelcastInstance(config);
    }
}