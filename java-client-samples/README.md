
Cloudera Director Java Client Samples
-------------------------------------

This folder contains a a set of sample classes for common use cases.

You can run them from an IDE or via Maven like this:

    mvn compile exec:java -Dexec.mainClass="com.cloudera.director.samples.UsersSample" \
        -Dexec.args="--admin-username admin --admin-password --server \"http://localhost:7189\" list"

