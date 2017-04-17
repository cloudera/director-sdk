
Cloudera Director Java Client Samples
-------------------------------------

This folder contains a a set of sample classes for common use cases.

You can run them from an IDE or via Maven like this:

    mvn compile exec:java -Dexec.mainClass="com.cloudera.director.samples.UsersSample" \
        -Dexec.args="--admin-username admin --admin-password --server \"http://localhost:7189\" list"

    OR

    mvn compile exec:java -Dexec.mainClass="com.cloudera.director.samples.CreateClustersSample" \
        -Dexec.args="--admin-username admin --admin-password --server \"http://localhost:7189\" --config cluster.ini"

    OR

    mvn compile exec:java -Dexec.mainClass="com.cloudera.director.samples.DispatchSample" \
        -Dexec.args="--admin-username admin --admin-password --server \"http://localhost:7189\" --config sandbox.sample.conf"

    OR

    mvn compile exec:java -Dexec.mainClass="com.cloudera.director.samples.ResizeClusterSample" \
        -Dexec.args="--admin-username admin --admin-password --server \"http://localhost:7189\" \
        --environment environmentName --deployment deploymentName --cluster clusterName --group workers --size 6"

    OR

    mvn compile exec:java -Dexec.mainClass="com.cloudera.director.samples.RepairClusterSample" \
        -Dexec.args="--admin-username admin --admin-password --server \"http://localhost:7189\" \
        --environment environmentName --deployment deploymentName --cluster clusterName --instanceId REPLACE-ME"
