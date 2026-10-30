# Tookitaki build of json4s 4.0.7

This is json4s 4.0.7 (https://github.com/json4s/json4s, tag `v4.0.7`, Apache License 2.0, see `LICENSE`),
modified by Tookitaki:

- package `org.json4s` renamed to `com.tookitaki.shaded.org.json4s` (sources, build info, test filter), so it can sit
  next to the `org.json4s` 3.7.0-M11 that Apache Spark loads, without classpath conflicts;
- published as group `com.tookitaki.shaded.org.json4s`, version `4.0.7`, to Tookitaki's Artifactory (`tookitaki-releases`);
- jackson-databind dependency raised from 2.12.7 to 2.15.3 (CVE-2022-42003, CVE-2022-42004);
- MiMa binary-compatibility check disabled (no earlier release under the new group).

No other source change. It replaces the earlier Tookitaki build `com.tookitaki.json4s` 4.0.5-TT; 4.0.7 also fixes the
hash-collision DoS of json4s/json4s#553.

Build and publish (JVM modules, Scala 2.12 and 2.13):

    sbt "++2.12.18" publishJvm "++2.13.8" publishJvm
