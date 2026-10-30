# Tookitaki build of json4s 4.0.7

This is json4s 4.0.7 (https://github.com/json4s/json4s, tag `v4.0.7`, Apache License 2.0, see `LICENSE`),
modified by Tookitaki:

- package `org.json4s` renamed to `com.tookitaki.shaded.org.json4s` (sources, build info, test filter), so it can sit
  next to the `org.json4s` 3.7.0-M11 that Apache Spark loads, without classpath conflicts;
- published as group `com.tookitaki.shaded.org.json4s`, version `4.0.7-shaded`, to Tookitaki's Artifactory (`tookitaki-releases`);
- jackson-databind dependency raised from 2.12.7 to 2.15.3 (CVE-2022-42003, CVE-2022-42004);
- MiMa binary-compatibility check disabled (no earlier release under the new group).
- version suffix `-shaded` (earlier `-TT`): jar names (e.g. `json4s-core_2.13-4.0.7-shaded.jar`) must differ from upstream `org.json4s` 4.0.7, or a WAR
  holding both keeps only one file per name.

No other source change. It replaces the earlier Tookitaki build `com.tookitaki.json4s` 4.0.5-TT; 4.0.7 also fixes the
hash-collision DoS of json4s/json4s#553.

Combined jar (what FinCense uses): `com.tookitaki.shaded:org.json4s_<scala>:4.0.7-shaded`, i.e.
`org.json4s_2.12-4.0.7-shaded.jar` / `org.json4s_2.13-4.0.7-shaded.jar`, built by the `bundle` project from the 8 JVM
modules ast, core, scalap, xml, native-core, native, jackson-core, jackson (pom lists only jackson-databind 2.15.3,
paranamer 2.8, scala-xml 2.1.0):

    sbt "++2.12.18" bundle/publish "++2.13.8" bundle/publish

Per-module build (also published, group `com.tookitaki.shaded.org.json4s`):

    sbt "++2.12.18" publishJvm "++2.13.8" publishJvm
